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

      <div class="row demo-row">
        <div class="col-xs-12">
          <nav class="navbar navbar-inverse navbar-embossed" role="navigation">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-01">
                <span class="sr-only">Toggle navigation</span>
              </button>
              <a class="navbar-brand" href="index">首页</a>
            </div>
            <div class="collapse navbar-collapse" id="navbar-collapse-01">
              <ul class="nav navbar-nav navbar-left">
                <li><a href="#home">Home<span class="navbar-unread">1</span></a></li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">Messages <b class="caret"></b></a>
                  <span class="dropdown-arrow"></span>
                  <ul class="dropdown-menu">
                    <li><a href="#">Action</a></li>
                    <li><a href="#">Another action</a></li>
                    <li><a href="#">Something else here</a></li>
                    <li class="divider"></li>
                    <li><a href="#">Separated link</a></li>
                  </ul>
                </li>
                <li><a href="list">About Us</a></li>
                <li><a href="#fakelink">你好！<#if acc??>${acc.username!}</a><#else><a href="login">请登陆</a></a></#if></li>
                <li><a href="#fakelink">退出</a></li>
                
                
               </ul>
               <form class="navbar-form navbar-right" action="#" role="search">
                <div class="form-group">
                  <div class="input-group">
                    <input class="form-control" id="navbarInput-01" type="search" placeholder="Search">
                    <span class="input-group-btn">
                      <button type="submit" class="btn">搜索</button>
                    </span>
                  </div>
                </div>
              </form>
            </div><!-- /.navbar-collapse -->
          </nav><!-- /navbar -->
        </div>
      </div> <!-- /row -->


<div class="tab-content">
    
<div class="tab-pane active" id="home">
  <div class="panel-body">     
    	<a href="add">新增用户</a><br/>
    	<a href="detail/1">查询</a><br/>
    	<a href="list">所有</a><br/>

  </div>
</div>
    

<div class="tab-pane" id="profile"> 
  <div class="tabbable tabs-left" id="tabs-460995"> 
     <ul id="mytab1" class="nav nav-tabs">
       <li class="active"><a href="#home1" data-toggle="tab">首页</a></li>
       <li><a href="#profile1" data-toggle="tab">介绍</a></li>
    </ul>
    <div class="tab-pane active" id="home1"> aaaa</div>
    <div class="tab-pane" id="profile1">bbbb</div>
  </div>
</div>    
    <div class="tab-pane" id="messages">333</div>
    <div class="tab-pane" id="settings">444.</div>
</div>

</body>
</html>