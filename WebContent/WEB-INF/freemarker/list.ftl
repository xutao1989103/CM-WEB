<!DOCTYPE html>
<html lang="zh-CN">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 101 Template</title>
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
   <h1>用户列表页面</h1>
  
    <div class="panel panel-primary">
    <div class="panel-heading">
                 用户列表面板
    </div>
    
    <div class="panel-body">
       <table class="table table-hover">  
  <caption>用户列表</caption>  
  <thead>  
    <tr>  
      <th>用户名</th>  
      <th>密码</th>
      <th>状态</th>
      <th>查看</th>
      <th>删除</th>         
    </tr>  
  </thead>  
  <tbody>  
    <#list list as obj>
       <tr>  
         <td>${obj.username!}</td>  
         <td>${obj.password!}</td>  
         <td>${obj.status!}</td>  
         <td><a href="detail/${obj.accountId!}">查看</a></td> 
          <td><a href="delete/${obj.accountId!}">删除</a></td> 
       </tr>  
    </#list>
    
  </tbody>  
    </table>  
    </div>
    
    <ul class="pager">
  <li class="previous"><a href="#">&larr; Older</a></li>
  <li class="next"><a href="#">Newer &rarr;</a></li>
</ul>
    
    <div class="panel-footer"><a href="index">返回</a></div>
    </div>
  </div>


  
</body>
</html>
