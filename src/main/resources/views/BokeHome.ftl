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
	    <h3 class="text-center">
	        欢迎XXX
	    </h3>
	</div>
	<div class="panel-body">
	<div class="container" style="width: 1010px">
	    <div class="row">
	    <div class="col-md-4">
	        <div class="panel panel-default">
	            <div class="panel-heading">
			        <button class="btn btn-default btn-sm" data-toggle="modal" data-target="#myModal">
		        	创建新标签
		            </button>
		        </div>
		        <div class="panel-body pre-scrollable">
				<table class="table table-striped">
				  <TR align="center">
					<TD width="150"><b>ID</b></TD>
					<TD width="150"><b>标签</b></TD>
				  </TR>
				  <#if labelList??>
				  <#list labelList as label>
				  <TR align="center" id="${label.id_l}">
				    <TD>${label.id_l}</TD>
				    <TD>${label.tagname}</TD>
				  </TR>
				  </#list>
				  </#if>
				</table>
				 <p>${msg!}</p>
		        <!-- 模态框（Modal） -->
		        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		        	<div class="modal-dialog">
		        		<div class="modal-content">
		        			<div class="modal-header">
		        				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
		        					&times;
		        				</button>
		        				<h4 class="modal-title" id="myModalLabel">
		        					标签内容
		        				</h4>
		        			</div>
		        			<div class="modal-body">
		        			<!--form class="form-horizontal" role="form" action="selectTagName.htm" method="post"-->
		        			<input type="text" name="tagname" id="tagname" required
		   	 				onmouseover="this.focus();" class="form-control" value="${(label.tagneme)!}"/>
		        			<div class="modal-footer">
	        				    <button type="button" class="btn btn-default" data-dismiss="modal" id="closeButton">关闭</button>
	        				    <button class="btn btn-primary" onclick="addLabel()">提交标签</button>
	        			    </div>
		        			<!--/form-->
		        			</div>
		        		</div>
		        	</div>
		        </div>
		        </div>
	        </div>
	    </div>
	    <div class="col-md-8">
        <div class="panel panel-default">
            <div class="panel-heading">
		        <h3 class="panel-title">博客</h3>
	        </div>
	        <div class="panel-body">
	            
	        </div>
        </div>
    </div>
	    </div>
	</div>
</div>
</div>
</body>
</html>
<script>
function addLabel() {
	$.post("addLabel.json", {
		tagname : $("#tagname").val()
	}, function(data, status) {
		if(data=="-1") {
			alert("标签已存在");
		} else {
			$("table").append('<TR align="center" id="'+data+'"><TD>'+data+'</TD><TD>'+$("#tagname").val()+'</TD></TR>');
			$("#closeButton").click();
		}
	});
}
</script>
