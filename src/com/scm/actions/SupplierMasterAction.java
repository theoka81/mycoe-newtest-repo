package com.scm.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SuppliersBean;

@Controller("supplierMasterAction")
@Scope("prototype")
public class SupplierMasterAction extends SCMAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6402907660493973555L;

	private Integer rows = 0;
	private Integer page = 0;
	private String sord;
	private String sidx;

	private String searchField;
	private String searchString;

	private Integer totalrows;
	private String searchOper;
	private String oper;
	private Integer total = 0;
	private Integer records = 0;
	private boolean loadonce = false;
	
	private List<SuppliersBean> data = new ArrayList<SuppliersBean>();
    private Integer draw=0, recordsTotal=1, recordsFiltered = 0, length = 0, start=0;
    private String error_custom;    

	@SkipValidation
	public String execute() {
		
		return SUCCESS;
	}
	
	@SkipValidation
	public String goLoadSuppliers()
	{
		logger.debug("In goLoadSuppliers...");
		recordsTotal = 100;        
        recordsFiltered = recordsTotal;            
        logger.info("New JSON request");
        //print all parameters from the action context
        HttpParameters map = ActionContext.getContext().getParameters();
        for (String entry : map.keySet()){
            String key = entry;
            Parameter value = map.get(entry);
            System.out.println("key:"+ key +" value: " + value.getValue());            
        }        
        //gets the order from the datatable
        Parameter order = null;
        if(map.get("order[0][dir]")!=null){
            order =    map.get("order[0][dir]");
        }        
        //The arrayList will be turned into
        data = new ArrayList<SuppliersBean>();
        //creates a mock DAO
        int auxStart = 0, accu =1;
        if(order!= null && order.getValue().indexOf("asc")>-1){
            auxStart = start;
        } else {
            auxStart = recordsTotal-start;
            accu=-1;
        }        
        for(int i = 0; i<length; i++){
        	SuppliersBean rv = new SuppliersBean();
            rv.setLegalName("KGWEBO STRAT (PTY) LTD" + auxStart);
            rv.setSupplierXref1("Surname" + auxStart);
            rv.setSupplierRefNo(10000+auxStart+"");
            rv.setSaCompanyNumber(auxStart+"");
            rv.setStatus("Active");
            auxStart+=accu;
            data.add(rv);
        }
        //sends an random error to the JSON
        if((Math.random()*10>9)){
            error_custom = "Random Error test";
        }
		return SUCCESS;
	}
	
	private Pagination getPaginationObject() {
		Pagination pagination = new Pagination();
		int to = (rows * page);
		int from = to - rows;
		pagination.setOffset(from);
		pagination.setSize(to);
		return pagination;
	}

	private SearchSortContainer getSearchSortBean() {
		SearchSortContainer searchSortBean = new SearchSortContainer();
		searchSortBean.setSearchValue(searchString);
		searchSortBean.setSidx(sidx);
		searchSortBean.setSord(sord);
		return searchSortBean;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getSearchField() {
		return searchField;
	}

	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public Integer getTotalrows() {
		return totalrows;
	}

	public void setTotalrows(Integer totalrows) {
		this.totalrows = totalrows;
	}

	public String getSearchOper() {
		return searchOper;
	}

	public void setSearchOper(String searchOper) {
		this.searchOper = searchOper;
	}

	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	public boolean isLoadonce() {
		return loadonce;
	}

	public void setLoadonce(boolean loadonce) {
		this.loadonce = loadonce;
	}

	public List<SuppliersBean> getData() {
		return data;
	}

	public void setData(List<SuppliersBean> data) {
		this.data = data;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public Integer getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(Integer recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public Integer getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(Integer recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public String getError_custom() {
		return error_custom;
	}

	public void setError_custom(String error_custom) {
		this.error_custom = error_custom;
	}

}
