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
  <div class="panel-heading">${userInfo.username!}</div>
  <div class="panel-body">
    <div class="row">
  <div class="col-lg-6">
    <div class="input-group">
      <span class="input-group-addon">
        <input type="text" value="用戶名：" readOnly>
      </span>
      <input type="text" id="username" class="form-control" value=${userInfo.username!}>
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
  <div class="col-lg-6">
    <div class="input-group">
      <span class="input-group-addon">
        <input type="text"  value="密码：" readOnly>
      </span>
      <input type="text" id="password" class="form-control" value=${userInfo.password!}>
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
 </div><!-- /.row -->
  </div>
  <div class="panel-footer"><a href="../index">返回</a></div>
</div>
</div>
</body>
</html>