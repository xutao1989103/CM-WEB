<!DOCTYPE html>
<html>
<head>
	<title>Bootstrap In Practice - Landing Page Example</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<!-- Bootstrap -->
	<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
	<link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet" />

	
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

	<style>

		/* http://css-tricks.com/perfect-full-page-background-image/ */
		html {
			-webkit-background-size: cover;
			-moz-background-size: cover;
			-o-background-size: cover;
			background-size: cover;
		}

		body {
			padding-top: 20px;
			font-size: 16px;
			font-family: "Open Sans",serif;
			background: transparent;
		}

		h1 {
			font-family: "Abel", Arial, sans-serif;
			font-weight: 400;
			font-size: 40px;
		}

		/* Override B3 .panel adding a subtly transparent background */
		.panel {
			background-color: rgba(255, 255, 255, 0.9);
		}

		.margin-base-vertical {
			margin: 40px 0;
		}

	</style>
<script type="text/javascript">
  $(document).ready(function(){
    $('#login').click(function(){
       var name=$('#name').val();
       var word=$('#word').val();
       var account={username:name,password:word};
       remote("GET","accountLogin",account,
        function(data,textStatus){
           if(data.code==200){
              top.location.href='/CM-WEB/account/index';
           }else{
              alert('用户名不存在！');
           }     
        },
        function(data,errorInfo,e){
           alert(data.responseText);   
        }); 
        return false;
    });
    
    $('#register').click(function(){
        location.href='/CM-WEB/account/add';  
        return false;       
    });
 });
  
    function remote(_type,_url,_data,_success,_error){
     $.ajax({
       type:_type,
       url:_url,
       data:_data,
       async: false,
       dataType:"json",
       success:_success,
       error:_error  
     });
  }
</script>

</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3 panel panel-default">

				<h1 class="margin-base-vertical">Have you ever seen the rain?</h1>

				<p>
					Someone told me long ago there's a calm before the storm. I know, It's been comin for some time.
				</p>
				<p>
					When it's over, so they say, it'll rain a sunny day. I know,	Shinin down like water.
				</p>

				<p>
					I want to know, have you ever seen the rain?
				</p>

				<form class="margin-base-vertical">
					<p class="input-group">
						<span class="input-group-addon">用户名：</span>
						<input type="text" class="form-control input-lg" id="name" placeholder="username" />
					</p>
					<p class="input-group">
						<span class="input-group-addon">密&nbsp;&nbsp;码：</span>
						<input type="text" class="form-control input-lg" id="word" placeholder="password" />
					</p>
					<p class="text-center">
						<button type="submit" class="btn btn-success btn-lg" id="login">Login</button>
						<button type="button" class="btn btn-success btn-lg" id="register">Register</button>
					</p>
					</span>
				</form>

			</div><!-- //main content -->
		</div><!-- //row -->
	</div> <!-- //container -->

</body>
</html>