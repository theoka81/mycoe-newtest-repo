package com.scm.ws.impl;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.scm.util.Utility;

@Component
public class CsdApiLoggingInterceptor implements ClientHttpRequestInterceptor{
	
	protected Logger logger = LogManager.getLogger("SCMCORE");
	
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd MM yyyy HH:mm:ss,SSS aa zzz");
	
	ObjectMapper mapper = new ObjectMapper();
	
	private static Map<Integer, Date> requestedTimeMap = new HashMap<Integer, Date>();
	
	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException{
		clientRequest(request);
		ClientHttpResponse response = execution.execute(request, body);
		try {
			String requestStr = new String(body, "UTF-8");
			InputStream is = null;
			
			if(logger.isInfoEnabled()) {
				logger.debug("\n[REQUEST INFORMATION]:: RequestedTime: "
						+DATE_FORMAT.format(requestedTimeMap.get(Integer.valueOf(request.hashCode())))
						+"\n"
						+"HttpMethod: "
						+request.getMethod()
						+", ReuestURI: "
						+request.getURI()
						+"\n"
						+"HeaderInfo: "
						+request.getHeaders()
						+"\n"
						+"requestPayload: "
						+requestStr
						+"\n"
						+"[RESPONSE INFORMATION]:: ResponseTime: "
						+DATE_FORMAT.format(new Date())
						+"\n"
						+"HttpStatuscode: "
						+response.getStatusCode()
						+", HTTPSStatusInfo: "
						+response.getStatusText()
						+"\n"
						+"HeaderInfo: "
						+response.getHeaders()
						+"\n"
						+"ResponseData: "
						+(is != null ? Utility.getStringFromInputStream(is): response.getBody())
						+"\n***********************************************************\n");
				requestedTimeMap.remove(Integer.valueOf(request.hashCode()));
			}
					
			
		} catch(Throwable th) {
			logger.error("Error in writing request and response: ", th);
		}
		return response;
	}
	
	private void clientRequest(HttpRequest request) {
		try {
			requestedTimeMap.put(Integer.valueOf(request.hashCode()), new Date());
		} catch(Throwable th) {
			logger.error("Error in writing request: ", th);
		}
	}

}
