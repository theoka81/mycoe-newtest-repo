<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<style>
.dual-list .list-group {
	margin-top: 8px;
}

.list-left li, .list-right li {
	cursor: pointer;
}

.list-arrows {
	padding-top: 100px;
}

.list-arrows button {
	margin-bottom: 20px;
}
</style>
</head>
<div class="container">
	<br />
	<div class="row">

		<div class="dual-list list-left col-md-5">
			<div class="well">
				<div class="row">
					<div class="col-lg-10">
						<div class="input-group">
							<span class="input-group-addon glyphicon glyphicon-search"
								style="top: 0px;"></span> <input type="text"
								name="SearchDualList" class="form-control" placeholder="search" />
						</div>
					</div>
					<div class="col-md-2">
						<div class="btn-group">
							<a class="btn btn-default selector" title="select all"><i
								class="glyphicon glyphicon-unchecked"></i></a>
						</div>
					</div>
				</div>
				<ul class="list-group">
					<s:iterator value="contractDetailsViewModel.clauses">
						<li class="list-group-item" id='<s:property value="%{id}"/>'
							data-toggle="tooltip"
							title='<s:property value="%{clauseDescription}"/>'><s:property
								value="%{clauseTitle}" /></li>
					</s:iterator>
				</ul>
			</div>
		</div>

		<div class="list-arrows col-md-1 text-center">
			<button class="btn btn-default btn-sm move-left" type="button">
				<span class="glyphicon glyphicon-chevron-left"></span>
			</button>

			<button class="btn btn-default btn-sm move-right" type="button">
				<span class="glyphicon glyphicon-chevron-right"></span>
			</button>
		</div>

		<div class="dual-list list-right col-md-5">
			<div class="well">
				<div class="row">
					<div class="col-md-2">
						<div class="btn-group">
							<a class="btn btn-default selector" title="select all"><i
								class="glyphicon glyphicon-unchecked"></i></a>
						</div>
					</div>
					<div class="col-lg-10">
						<div class="input-group">
							<input type="text" name="SearchDualList" class="form-control"
								placeholder="search" /> <span
								class="input-group-addon glyphicon glyphicon-search"
								style="top: 0px;"></span>
						</div>
					</div>
				</div>
				<s:if test="contractDetailsViewModel.contractClauses != null">
					<ul class="list-group">
						<s:iterator value="contractDetailsViewModel.contractClauses">
							<li class="list-group-item" id='<s:property value="%{id}"/>'
								data-toggle="tooltip"
								title='<s:property value="%{clauseDescription}"/>'><s:property
									value="%{clauseTitle}" /></li>
						</s:iterator>
					</ul>
				</s:if>
			</div>
		</div>

	</div>
</div>