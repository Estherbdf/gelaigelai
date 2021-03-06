<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'poem.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Walk Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- //for-mobile-apps -->
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/style1.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/component.css" rel="stylesheet" type="text/css"  />
    <!-- js -->
    <script src="js/jquery-1.11.1.min.js"></script>
    <!-- //js -->

    <!-- start-smoth-scrolling -->
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>
    <script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
    </script>
    <script src="js/audiojs/audio.min.js"></script>
    <script type="text/javascript">
    audiojs.events.ready(function() {
    var as = audiojs.createAll();
  });
    </script>
   <!-- start-smoth-scrolling -->
  </head>
  
  <body class="cbp-spmenu-push">
    <!-- banner -->
	<div class="banner1">
		<div class="container">
			<div class="header">
				<div class="header-left">
					<form>
						<input type="text" value="Search Here..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search Here...';}" required="">
						<input type="submit" value="" >
						<div class="clearfix"> </div>
					</form>
				</div>
				<div class="header-left1">
					<h1><a href="index.html">gelaigelai</a></h1>
				</div>
				<!-- #push_sidebar -->
				<div class="top-nav">
					 <nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-right" id="cbp-spmenu-s2">
						<h3>Menu</h3>
						<ul>
							<li><a href="index.html"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>主页</a></li>
							<li><a href="about.html"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>关于我们</a></li>
							<li><a href="poem.html"><span class="glyphicon glyphicon-cog" aria-hidden="true"></span>诗歌</a></li>
							<li><a href="poet.html"><span class="glyphicon glyphicon-picture" aria-hidden="true"></span>诗人</a></li>
							<li><a href="poetics.html"><span class="glyphicon glyphicon-text-size" aria-hidden="true"></span>诗学</a></li>
							<li><a href="news.html"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>诗讯</a></li>
						</ul>
					</nav>
					 <div class="main buttonset">	
					<!-- Class "cbp-spmenu-open" gets applied to menu and "cbp-spmenu-push-toleft" or "cbp-spmenu-push-toright" to the body -->
						<button id="showRightPush"><img src="images/menu.png" alt=""/></button>
					</div>
				<!-- Classie - class helper functions by @desandro https://github.com/desandro/classie -->
						<script src="js/classie.js"></script>
						<script>
							var menuRight = document.getElementById( 'cbp-spmenu-s2' ),
							showRightPush = document.getElementById( 'showRightPush' ),
							body = document.body;

							showRightPush.onclick = function() {
								classie.toggle( this, 'active' );
								classie.toggle( body, 'cbp-spmenu-push-toleft' );
								classie.toggle( menuRight, 'cbp-spmenu-open' );
								disableOther( 'showRightPush' );
							};

							function disableOther( button ) {
								if( button !== 'showRightPush' ) {
									classie.toggle( showRightPush, 'disabled' );
								}
							}
						</script>
						<!-- /script-for-menu -->
				</div>
				<!-- /#push_sidebar -->
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //banner -->
<!-- single -->
	<div class="single">
		<div class="container">
			<div class="col-md-4 single-right">
				<div class="blog-right1">
					
					<div class="categories">
						<h3>Categories</h3>
						<ul>
							<li><a href="old.html">古诗</a></li>
							<li><a href="modern.html">现代诗</a></li>
							<li><a href="poem.html">原创诗</a></li>
						</ul>
					</div>
					<div class="categories categories-mid">
						<!-- <h3>Archives</h3>
						<ul>
							<li><a href="#">May 20,2009</a></li>
							<li><a href="#">July 31,2010</a></li>
							<li><a href="#">January 20,2012</a></li>
							<li><a href="#">November 2,2012</a></li>
							<li><a href="#">December 25,2014</a></li>
							<li><a href="#">January 14,2015</a></li>
						</ul> -->
					</div>
					<div class="related-posts">
						<h3>猜你喜欢</h3>
						<div class="related-post">
							<div class="related-post-left">
								<a href="single.html"><img src="images/3_.jpg" alt=" " class="img-responsive" /></a>
							</div>
							<div class="related-post-right">
								<h4><a href="single.html">诗歌1</a></h4>
								<p>Aliquam dapibus tincidunt metus. 
									<span>Praesent justo dolor, lobortis.</span>
								</p>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="related-post">
							<div class="related-post-left">
								<a href="single.html"><img src="images/4_.jpg" alt=" " class="img-responsive" /></a>
							</div>
							<div class="related-post-right">
								<h4><a href="single.html">诗歌2</a></h4>
								<p>Aliquam dapibus tincidunt metus. 
									<span>Praesent justo dolor, lobortis.</span>
								</p>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="related-post">
							<div class="related-post-left">
								<a href="single.html"><img src="images/5.jpg" alt=" " class="img-responsive" /></a>
							</div>
							<div class="related-post-right">
								<h4><a href="single.html">诗歌3</a></h4>
								<p>Aliquam dapibus tincidunt metus. 
									<span>Praesent justo dolor, lobortis.</span>
								</p>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="related-post">
							<div class="related-post-left">
								<a href="single.html"><img src="images/6.jpg" alt=" " class="img-responsive" /></a>
							</div>
							<div class="related-post-right">
								<h4><a href="single.html">诗歌4</a></h4>
								<p>Aliquam dapibus tincidunt metus. 
									<span>Praesent justo dolor, lobortis.</span>
								</p>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-8 single-left">
				<div class="comments">
					<ul>
						<li><span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>25th March 2016</li>&nbsp;&nbsp;&nbsp;&nbsp;
						<li><span class="glyphicon glyphicon-user" aria-hidden="true"></span><a href="bai.html">Doris</a></li>
						
					</ul>
				</div>
				<audio src="#" preload="auto" ></audio>
				<br/>
				<br/>
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				<div class="single-left1">
				${poeminfo.pinfo }
				</div>
				
				
				
				
				
				
				
				<div class="admin">
					<div class="admin-left">
						<img src="images/3.png" alt=" " class="img-responsive" />
					</div>
					<!-- <div class="admin-right">
						<ul>
							<li><a href="#">James</a> <i>|</i></li>
							<li><a href="#">Reply</a></li>
						</ul>
						<p>Every pleasure is to be welcomed and 
							every pain avoided. But in certain circumstances and owing to 
							the claims of duty or the obligations of business 
							it will frequently occur.</p>
					</div> -->
					<div class="clearfix"> </div>
				</div>
				<div class="comments-admin">
					<h4>3 Comments</h4>
					<div class="comments-admin-grids">
						<div class="comments-admin-grid">
							<div class="comments-admin-grid-left">
								<img src="images/3.png" alt=" " class="img-responsive" />
							</div>
							<div class="comments-admin-grid-right">
								<p>In a free hour, when our power of 
									choice is untrammelled and when nothing prevents our being able 
									to do what we like best, every pleasure is to be welcomed and 
									every pain avoided. But in certain circumstances and owing to 
									the claims of duty or the obligations of business 
									it will frequently occur.</p>
								<div class="reply">
									<a href="#">Reply</a>
								</div>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="comments-admin-grid">
							<div class="comments-admin-grid-left">
								<img src="images/4.png" alt=" " class="img-responsive" />
							</div>
							<div class="comments-admin-grid-right">
								<p>In a free hour, when our power of 
									choice is untrammelled and when nothing prevents our being able 
									to do what we like best, every pleasure is to be welcomed and 
									every pain avoided. But in certain circumstances and owing to 
									the claims of duty or the obligations of business 
									it will frequently occur.</p>
								<div class="reply">
									<a href="#">Reply</a>
								</div>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="comments-admin-grid">
							<div class="comments-admin-grid-left">
								<img src="images/5.png" alt=" " class="img-responsive" />
							</div>
							<div class="comments-admin-grid-right">
								<p>In a free hour, when our power of 
									choice is untrammelled and when nothing prevents our being able 
									to do what we like best, every pleasure is to be welcomed and 
									every pain avoided. But in certain circumstances and owing to 
									the claims of duty or the obligations of business 
									it will frequently occur.</p>
								<div class="reply">
									<a href="#">Reply</a>
								</div>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
			</div>
			<div class="clearfix"></div>
			<div class="leave-a-comment">
				<h3>Leave your comment here</h3> 
				<form>
					<input type="text" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}" required="">
					<input type="email" value="Email..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email...';}" required="">
					<input type="text" value="Phone Number" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Phone Number';}" required="">
					<textarea type="text" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Type Your Comment here...';}" required="">Type Your Comment here...</textarea>
					<input type="submit" value="Add Comment">
				</form>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->
  </body>
</html>
