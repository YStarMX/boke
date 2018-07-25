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
	
<!DOCTYPE html>
<body>
<div class="container">
<div class="panel panel-primary">
	<div class="panel-heading">
	    <h3 class="panel-title">
	        博客系统
	    </h3>
	</div>
	<div class="panel-body">
<form action="UserLogin.htm" method="post" class="form-horizontal">
<div class="form-group">
	<label for="id" class="col-sm-offset-3 col-sm-2 control-label">Name:</label>
	<div class="col-sm-3">
	<input type="text" name="name" id="name" size="20" maxlength="20" required
		   	 				onmouseover="this.focus();" class="form-control" value="${(user.name)!}"/><br>
	</div>
</div>
<div class="form-group">
	<label for="id" class="col-sm-offset-3 col-sm-2 control-label">Password:</label>
	<div class="col-sm-3">
	<input type="text" name="password" id="password" size="20" maxlength="20" required
		   	 				onmouseover="this.focus();" class="form-control" value="${(user.password)!}"/><br>
	</div>
</div>
<div class="form-group">
<div style="text-align:center">
	<input type="submit" value="登陆" class="btn btn-primary"/>
	<A href="toAddUser.htm" class="btn btn-primary">注册</A>
	<p>${msg!}</p>
</div>
</div>
</form>
</div>
</div>
</div>
</body>
</html>
