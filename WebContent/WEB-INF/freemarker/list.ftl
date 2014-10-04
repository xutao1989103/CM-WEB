<!DOCTYPE html>
<html lang="zh-CN">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 101 Template</title>
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
   <h1>�û��б�ҳ��</h1>
  
    <div class="panel panel-primary">
    <div class="panel-heading">
                 �û��б����
    </div>
    
    <div class="panel-body">
       <table class="table table-hover">  
  <caption>�û��б�</caption>  
  <thead>  
    <tr>  
      <th>�û���</th>  
      <th>����</th>
      <th>״̬</th>
      <th>�鿴</th>
      <th>ɾ��</th>         
    </tr>  
  </thead>  
  <tbody>  
    <#list list as obj>
       <tr>  
         <td>${obj.username!}</td>  
         <td>${obj.password!}</td>  
         <td>${obj.status!}</td>  
         <td><a href="detail/${obj.accountId!}">�鿴</a></td> 
          <td><a href="delete/${obj.accountId!}">ɾ��</a></td> 
       </tr>  
    </#list>
    
  </tbody>  
    </table>  
    </div>
    
    <ul class="pager">
  <li class="previous"><a href="#">&larr; Older</a></li>
  <li class="next"><a href="#">Newer &rarr;</a></li>
</ul>
    
    <div class="panel-footer"><a href="index">����</a></div>
    </div>
  </div>


  
</body>
</html>
