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
  $("p").click(function(){
  $(this).hide();
  });
});
</script>
</head>
<body>
<div>
<div class="panel panel-success">
  <div class="panel-heading">��ҳ</div>
  <div class="panel-body">
      <ul class="nav nav-tabs" role="tablist">
        <li role="presentation" class="active"><a href="/CM-WEB/account/index">Home</a></li>
        <li role="presentation"><a href="/CM-WEB/account/freemarker">All</a></li>
      </ul>

  		<h3>MyBatis 3 ����  Spring 3</h3>
    	<a href="add">�����û�</a><br/>
    	<a href="detail/1">��ѯ</a><br/>
    	<a href="list">����</a><br/>

  </div>
  <div class="panel-footer">Panel footer</div>
</div>
</div>
</body>
</html>