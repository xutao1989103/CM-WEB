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
    $('#back').click(function(){
      location.href='index';   
    });
    $('#save').click(function(){
       $(this).button('saving');//执行等待状态切换操作
       var name=$('#username').val();
       var word=$('#password').val();
       var sex=$('#sex-select').val();
       var email=$('#email').val();
       var phone=$('#phone').val();
       var account={username:name,password:word,sex:sex,email:email,phone:phone};
       remote('POST','addAccount',account,
       function(data){
          alert("保存成功！");
       },
       function(data){
          alert("保存成功！");
       });
       
        location.href='list';   
    });
 });
  
  function remote(_type,_url,_data,_sucess,_error){
     $.ajax({
       type:_type,
       url:_url,
       data:_data,
       dataType: "json",
       success:_sucess,
       error:_error
       
     });
  }
  
  function setImage(obj){
    image.src = obj.value;
  }
</script>
</head>
<body>
<div class="panel panel-primary">
  <div class="panel-heading">新增用户</div>
  <div class="panel-body">
  
 <div class="row">
  <div class="col-md-4">
    <div class="input-group">
      <span class="input-group-addon">用户名：</span>
      <input type="text" id="username" class="form-control">
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
 </div><!-- /.row -->
 
  <div class="row">
  <div class="col-md-4">
    <div class="input-group">
      <span class="input-group-addon">密码： </span>
      <input type="text" id="password" class="form-control">
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
 </div><!-- /.row -->
 
  <div class="row">
  <div class="col-md-4">
    <div class="input-group">
      <span class="input-group-addon">性别： </span>
       <select id="sex-select" class="form-control">
         <option value="1">男</option>
         <option value="2">女</option>
       </select>
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
 </div><!-- /.row -->
 
  <div class="row">
  <div class="col-md-4">
    <div class="input-group">
      <span class="input-group-addon">邮箱： </span>
      <input type="email" id="email" class="form-control" placeholder="Enter email">
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
 </div><!-- /.row -->
 
  <div class="row">
  <div class="col-md-4">
    <div class="input-group">
      <span class="input-group-addon">电话： </span>
      <input type="text" id="phone" class="form-control">
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
 </div><!-- /.row -->
 
  <div class="row">
    <div class="input-group">
      <span class="input-group-addon">头像： </span>
      <input type="file" id="photo" class="form-control" onchange="setImage(this)">
      <img id="image" name="image" src="" />
    </div>
 </div><!-- /.row -->

 

  <button type="button" id="back" class="btn btn-primary btn-lg">返回</button>
  <button type="button" id="save"  class="btn btn-primary btn-lg">确认</button>

 
 
  </div>
  <div class="panel-footer">Panel footer</div>
</div>
</body>
</html>