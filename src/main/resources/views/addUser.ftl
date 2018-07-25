<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<div class="container">
<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">注册用户</h3>
	</div>
	<div class="panel-body">
		<form class="form-horizontal" role="form" action="selectName.htm" method="post">
			<div class="form-group">
				<label class="col-sm-3 control-label">name</label>
				<div class="col-sm-6">
					<input class="form-control" type="text" name="name"" required="required" maxlength="50">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">Password</label>
				<div class="col-sm-6">
					<input class="form-control" type="text" name="Password"" required="required" maxlength="100">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-3 col-sm-6">
					<input type="submit" value="保存信息"
						class="btn btn-primary">
					<p>${error!}</p>
				</div>
			</div>
		</form>
	</div>
</div>
</div>