<html>
<head>
   <!-- �� Bootstrap ���� CSS �ļ� -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css">

<!-- ��ѡ��Bootstrap�����ļ���һ�㲻�����룩 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

<!-- jQuery�ļ��������bootstrap.min.js ֮ǰ���� -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

<!-- ���µ� Bootstrap ���� JavaScript �ļ� -->
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
   
<script type="text/javascript">
  $(document).ready(function(){
    $('#back').click(function(){
      location.href='index';   
    });
    $('#save').click(function(){
       $(this).button('saving');//ִ�еȴ�״̬�л�����
       var name=$('#username').val();
       var word=$('#password').val();
       var sex=$('#sex-select').val();
       var email=$('#email').val();
       var phone=$('#phone').val();
       var account={username:name,password:word,sex:sex,email:email,phone:phone};
       remote('POST','addAccount',account,
       function(data){
          alert("����ɹ���");
       },
       function(data){
          alert("����ɹ���");
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
  <div class="panel-heading">�����û�</div>
  <div class="panel-body">
  
 <div class="row">
  <div class="col-md-4">
    <div class="input-group">
      <span class="input-group-addon">�û�����</span>
      <input type="text" id="username" class="form-control">
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
 </div><!-- /.row -->
 
  <div class="row">
  <div class="col-md-4">
    <div class="input-group">
      <span class="input-group-addon">���룺 </span>
      <input type="text" id="password" class="form-control">
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
 </div><!-- /.row -->
 
  <div class="row">
  <div class="col-md-4">
    <div class="input-group">
      <span class="input-group-addon">�Ա� </span>
       <select id="sex-select" class="form-control">
         <option value="1">��</option>
         <option value="2">Ů</option>
       </select>
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
 </div><!-- /.row -->
 
  <div class="row">
  <div class="col-md-4">
    <div class="input-group">
      <span class="input-group-addon">���䣺 </span>
      <input type="email" id="email" class="form-control" placeholder="Enter email">
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
 </div><!-- /.row -->
 
  <div class="row">
  <div class="col-md-4">
    <div class="input-group">
      <span class="input-group-addon">�绰�� </span>
      <input type="text" id="phone" class="form-control">
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
 </div><!-- /.row -->
 
  <div class="row">
    <div class="input-group">
      <span class="input-group-addon">ͷ�� </span>
      <input type="file" id="photo" class="form-control" onchange="setImage(this)">
      <img id="image" name="image" src="" />
    </div>
 </div><!-- /.row -->

 

  <button type="button" id="back" class="btn btn-primary btn-lg">����</button>
  <button type="button" id="save"  class="btn btn-primary btn-lg">ȷ��</button>

 
 
  </div>
  <div class="panel-footer">Panel footer</div>
</div>
</body>
</html>