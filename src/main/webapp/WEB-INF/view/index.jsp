<!DOCTYPE HTML>
<html>
<head>
<title>Hotel Booking</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Hotel Booking</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/css/bootstrap.min.css">
<script src="/js/jquery-2.1.1.min.js"></script>
<script src="/js/jquery-ui.min.js" type="text/javascript"></script>

<script src="/js/bootstrap.min.js"></script>
<style type="text/css">
h2 {
	color: white;
}

label {
	padding-right: 5px;
}
</style>
<script type="text/javascript">
	$(document).ready(function(e) {

		$.ajax({
			type : "GET",
			url : '/tweets',
			dataType : 'json',
			success : function(json) {
				
				var $el = $("#tweets");
				var htmlContent='<div class="row">';
				$el.empty(); // remove old options
				$.each(json, function(value, key) {
					htmlContent+='<div class="panel panel-default"><div class="panel-heading">'+key.screenName+'</div>';
					htmlContent+='<div class="panel-body">'+key.content+'</div></div>'
										
				}); 
				htmlContent+='</div>';
				$el.html(htmlContent);
			}
		});

	});
</script>
</head>
<body background="/image/banner.jpg">
	<div class="container" style="width: 40%">
		<h2>Hotel booking Application</h2>
		<div class="panel panel-default">

			<div class="panel-body">
				<p>
					<a href="/bookings">Book a room </a>
				</p>
				<p>
					<a href="/viewrooms">View Lowest Priced Hotels </a>
				</p>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">Tweets - About Hotels</div>
			<div class="panel-body" id="tweets">
				
			</div>
		</div>
	</div>
	
	
</body>
</html>