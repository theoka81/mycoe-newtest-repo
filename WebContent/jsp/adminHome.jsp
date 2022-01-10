<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
	<jsp:include page="mainHeader.jsp"></jsp:include>

	<s:form theme="simple">

		<!-- Main view -->
		<div id="wrapper">

			<div class="body-content">
				<div class="divider">&nbsp;</div>

				<s:if
					test="(#session['SESSION_BACK_OFFICE_USER'] != null && #session['SESSION_BACK_OFFICE_USER'] eq 'true') || (#session['SESSION_SUPER_ADMIN_CLERK_USER'] != null && #session['SESSION_SUPER_ADMIN_CLERK_USER'] eq 'true')">
					<jsp:include page="coreBackOfficeDashBoard.jsp"></jsp:include>
				</s:if>

				<s:if
					test="(#session['SESSION_SUPPLIER_USER'] == null || (#session['SESSION_SUPPLIER_USER'] != null && #session['SESSION_SUPPLIER_USER'] neq 'true'))">
					<jsp:include page="dashboard.jsp"></jsp:include>
				</s:if>
				
				<s:if
					test="(#session['SESSION_SUPER_ADMIN'] != null && #session['SESSION_SUPER_ADMIN'] eq 'true')">
					<jsp:include page="dynamicDashboard.jsp"></jsp:include>
				</s:if>
			</div>


			<div class="space-30">&nbsp;</div>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

			<jsp:include page="footer.jsp"></jsp:include>
	</s:form>

</body>
</html>