<html>
<head>
   <!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
   
   <script type="text/javascript">
  $(document).ready(function(){
  $("p").click(function(){
  $(this).hide();
  });
});
</script>
</head>
<body>
<div>
<div class="panel panel-success">
  <div class="panel-heading">首页</div>
  <div class="panel-body">
      <ul class="nav nav-tabs" role="tablist">
        <li role="presentation" class="active"><a href="/CM-WEB/account/index">Home</a></li>
        <li role="presentation"><a href="/CM-WEB/account/freemarker">All</a></li>
      </ul>

  		<h3>MyBatis 3 整合  Spring 3</h3>
    	<a href="add">新增用户</a><br/>
    	<a href="detail/1">查询</a><br/>
    	<a href="list">所有</a><br/>

  </div>
  <div class="panel-footer">Panel footer</div>
</div>
</div>
</body>
</html>