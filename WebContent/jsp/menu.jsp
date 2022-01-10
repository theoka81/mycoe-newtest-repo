<%@page import="com.scm.keys.UserCodeIdKeys"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script>
	function loadIndexPage(action, statusId, configId) {
		document.getElementById("menuStatusId").value = statusId;
		document.getElementById("menuConfigId").value = configId;
		document.getElementById("menuFormId").method = "POST";
		document.getElementById("menuFormId").action = action;
		$("#menuFormId").submit();
	}

	function loadWorkFlowIndexPage(action, transactionTypeId) {
		document.getElementById("menuTransactionTypeId").value = transactionTypeId;
		document.getElementById("menuFormId").method = "POST";
		document.getElementById("menuFormId").action = action;
		$("#menuFormId").submit();
	}
</script>
<form id="menuFormId">
	<s:hidden name="menuStatusId" id="menuStatusId" theme="simple" />
	<s:hidden name="menuConfigId" id="menuConfigId" theme="simple" />
	<s:hidden name="menuTransactionTypeId" id="menuTransactionTypeId"
		theme="simple" />
</form>
<s:if
	test="#session['SESSION_USER_ROLE'] != null && #session['SESSION_USER_ROLE'] eq 'Supplier'">
	<ul class="nav navbar-nav navbar-left">
		<li class="active"><a class="page-scroll" href="../Home/home">Home</a></li>

		<li class="top-level-menu"><a href="#" class="dropdown-toggle"
			data-toggle="dropdown">Supplier</a>
			<ul class="dropdown-menu">
				<li><a href="https://secure.csd.gov.za/">CSD Login</a></li>
				<li><a href="../Suppliers/Details">Supplier Registration</a></li>

				<li><a href="../SupplierCompliantHeader/Details">Create
						Complaint</a></li>

				<li><a href="../SupplierEnquiryHeader/Details">Create
						Enquiry</a></li>
			</ul></li>
	</ul>
</s:if>
<s:else>
	<ul class="nav navbar-nav navbar-left">
		<li class="active"><a class="page-scroll" href="../">Home</a></li>


		<li class="top-level-menu"><a href="#" class="dropdown-toggle"
			data-toggle="dropdown">Suppliers</a>
			<ul class="dropdown-menu">
				<li class="dropdown-header"><b>Pending Suppliers</b></li>
				<li><a href="javascript:void(0)" onclick="loadIndexPage('../Suppliers/Index', '<%=UserCodeIdKeys.SupplierStatusPending%>', '-1')">Supplier Registration</a></li>
				<li class="divider"></li>
				<li class="dropdown-header"><b>Approved Suppliers</b></li>
				<li><a href="javascript:void(0)" onclick="loadIndexPage('../Suppliers/Index', '<%=UserCodeIdKeys.SupplierStatusActive%>', '-1')">Supplier Administration</a></li>
				<li class="divider"></li>
				<li class="dropdown-header"><b>Reports</b></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fSupplier_Document_Details_Report&rs:Command=Render">Document
						Management</a></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fSupplier_Details&rs:Command=Render">Supplier
						Analysis</a></li>
				<li class="divider"></li>
				<li class="dropdown-header"><b>Workflow</b></li>
				<li><a href="javascript:void(0)" onclick="loadWorkFlowIndexPage('../Workflow/Index', '<%=UserCodeIdKeys.TransactionType_Vendor%>')">Supplier Master Workflow</a></li>

			</ul></li>

		<li class="top-level-menu"><a href="#" class="dropdown-toggle"
			data-toggle="dropdown">Commodities</a>
			<ul class="dropdown-menu">
				<li class="dropdown-header"><b>Commodity Templates</b></li>
				<li><a href="../Inventory/SpecIndex">Commodity Specification</a>></li>
				<li class="divider"></li>
				<li class="dropdown-header"><b>Commodity Identification</b></li>
				<li><a href="../Inventory/IdenIndex">Commodity Identification</a></li>
				<li class="divider"></li>
				<li class="dropdown-header"><b>Reports</b></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fStock_by_Category_Report&rs:Command=Render">Stock
						By Category</a></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fCommodity_Analysis_Report&rs:Command=Render">Commodity
						Analysis</a></li>

				<li class="divider"></li>
				<li class="dropdown-header"><b>Workflow</b></li>
				<li> <a href="javascript:void(0)" onclick="loadWorkFlowIndexPage('../Workflow/Index', '<%=UserCodeIdKeys.TransactionType_InventoryStock%>')">Commodities Workflow </a></li>
				<li class="divider"></li>
				<li class="dropdown-header"><b>Warehouse Details</b></li>
				<li><a href="../WarehouseDetails">Warehouse</a></li>
			</ul></li>

		<li class="top-level-menu"><a href="#" class="dropdown-toggle"
			data-toggle="dropdown">Contracts</a>
			<ul class="dropdown-menu">
				<li class="dropdown-header"><b>Contract Creation (New
						Contracts)</b></li>
				<li><a  href="javascript:void(0)" onclick="loadIndexPage('../Contract/Index', '<%=UserCodeIdKeys.ContractStatusPending%>', '-1')">Contract Creation</a></li>
				<li class="divider"></li>
				<li class="dropdown-header"><b>Existing (Approved
						Contracts)</b></li>
				<li><a  href="javascript:void(0)" onclick="loadIndexPage('../Contract/Index', '<%=UserCodeIdKeys.ContractStatusActive%>', '-1')">Amend Contract</a></li>
				<li class="divider"></li>
				<li class="dropdown-header"><b>Clauses</b></li>
				<li><a href="../Clauses">Clause Creation</a></li>
				<li class="divider"></li>
				<li class="dropdown-header"><b>Reports</b></li>
				<li><a href="../">Document Management</a></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fContracts_Report&rs:Command=Render">Contract
						Analysis</a></li>
				<li class="divider"></li>
				<li class="dropdown-header"><b>Workflow</b></li>
				<li><a href="javascript:void(0)" onclick="loadWorkFlowIndexPage('../Workflow/Index', '<%=UserCodeIdKeys.TransactionType_ContractStock%>')">Contract Master Workflow </a></li>
			</ul></li>

		<li class="top-level-menu"><a href="#" class="dropdown-toggle"
			data-toggle="dropdown">Analysis</a>
			<ul class="dropdown-menu">

				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fCommodity_Analysis_Report&rs:Command=Render">Commodity
						Analysis</a></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fStock_by_Category_Report&rs:Command=Render">Stock
						By Category</a></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fContracts_Report&rs:Command=Render">Contract
						Analysis</a></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fAudit_Contracts_Report&rs:Command=Render">Contract
						Audits</a></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fAudit_Commodity_Report&rs:Command=Render">Commodity
						Audits</a></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fSupplier_Report_Changes&rs:Command=Render">Supplier
						Audits</a></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fDashboard&rs:Command=Render">Report
						Dashboard</a></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fSupplier_Report&rs:Command=Render">Supplier
						Master</a></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fSupplier_Details&rs:Command=Render">Supplier
						Analysis</a></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fCommodity_Custom_Report&rs:Command=Render">Commodity
						Customized Report</a></li>
				<li><a target="_blank"
					href="http://10.1.2.230:85/ProBudget_ReportServer/Pages/ReportViewer.aspx?%2fSCM_Reports%2fContracts_Custom_Report&rs:Command=Render">Contract
						Customized Report</a></li>



			</ul></li>


		<li class="top-level-menu"><a href="#" class="dropdown-toggle"
			data-toggle="dropdown">System</a>
			<ul class="dropdown-menu">
				<li><a href="../RoleRelationships">Role Relationships</a></li>
				<li><a href="../Address/Index">Addresses</a></li>
				<li><a href="../ContactDetails">Contact Details</a></li>
				<li><a href="../Locations">Locations</a></li>
				<li><a href="../OrganisationalStructures">Org Structure</a></li>
				<li><a href="../SystemUsers/Index">User Management</a></li>
			</ul></li>

		<li><a href="../Home/Help" target="_blank">Help</a></li>

	</ul>
</s:else>