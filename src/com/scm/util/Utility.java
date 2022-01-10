package com.scm.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Utility {
	public static List<Integer> getListFromCommaSeparated(
			String commaSeparatedString) {

		List<Integer> list = null;
		StringTokenizer st = null;

		if (commaSeparatedString == null) {
			return null;
		}

		st = new StringTokenizer(commaSeparatedString, ",");
		list = new ArrayList<Integer>();

		while (st.hasMoreTokens()) {
			if (st != null && !st.equals("")) {
				list.add(Integer.valueOf(st.nextToken().trim()));
			}
		}

		return list;

	}
	
	public static String generateRandomShortString(int length) {
		char[] pw = new char[length];
		int c = 'A';
		int r1 = 0;
		for (int i = 0; i < length; i++) {
			r1 = (int) (Math.random() * 3);
			switch (r1) {
			case 0:
				c = '0' + (int) (Math.random() * 10);
				break;
			case 1:
				c = 'a' + (int) (Math.random() * 26);
				break;
			case 2:
				c = 'A' + (int) (Math.random() * 26);
				break;
			}
			pw[i] = (char) c;
		}
		return new String(pw);
	}
	
	public static String getWeekEnding(String selectedDate) {
		Date weekEnd = null;
		String weekEndStr = "";
		try {
			// Get calendar set to current date and time
			Calendar c = Calendar.getInstance();
			DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			// Get calendar set to current date and time
			DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
			DateFormat weekEndFormat = new SimpleDateFormat("dd/MM/yyyy");
			if (selectedDate != null && !selectedDate.equals("")) {
				c.setTime(format.parse(selectedDate));
			}

			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				c.add(Calendar.DATE, -1);
			}
			// Set the calendar to Friday of the current week
			c.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);

			// Print dates of the current week starting on Monday
			// DateFormat df = new SimpleDateFormat("EEEE dd/MM/yyyy");
			weekEnd = weekEndFormat.parse(weekEndFormat.format(c.getTime()));
			weekEndStr = f.format(weekEnd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return weekEndStr;
	}
	
	public static void getMonths(int year, Map<String, Integer> monthMap) {
		String[] shortMonths = new DateFormatSymbols().getShortMonths();
		int i = 0;
		int noOfWorkingDays = 0;
		Calendar c = new GregorianCalendar();
		c.set(Calendar.YEAR, year);
		for (String shortMonth : shortMonths) {
			if (shortMonth != null && !shortMonth.equals("")) {
				noOfWorkingDays = 0;
				c.set(Calendar.MONTH, i);
				c.set(Calendar.DAY_OF_MONTH, 1);
				i++;
				int days = c.getActualMaximum(Calendar.DAY_OF_MONTH);
				for (int j = 1; j <= days; j++) {
					c.set(Calendar.DAY_OF_MONTH, j);
					if (!(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || c
							.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)) {
						noOfWorkingDays++;
					}
				}

				monthMap.put(shortMonth, noOfWorkingDays);
			}
		}
	}
	
	public static String getStringFromInputStream(InputStream is) {
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		
		String line;
		try {
			if(is != null) {
				br = new BufferedReader(new InputStreamReader(is));
				while((line = br.readLine()) != null) {
					sb.append(line);
				}
			}
		} catch(Throwable th) {
			th.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				}catch(IOException ex) {
					ex.printStackTrace();
				}
			}
		}
		
		return sb.toString();
	}
}

