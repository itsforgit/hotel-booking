<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<title>Hotel Booking</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="/css/bootstrap.min.css">
<script src="/js/jquery-2.1.1.min.js"></script>
<script src="/js/jquery-ui.min.js" type="text/javascript"></script>
<link href="/css/jquery-ui.min.css" rel="Stylesheet" type="text/css" />

<script src="/js/moment.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/bootbox.min.js"></script>

<script type="text/javascript">
	$(function() {
		$("#checkInDate").datepicker({
			numberOfMonths : 2,
			minDate : 0,
			onSelect : function(selected) {
				var dt = new Date(selected);
				dt.setDate(dt.getDate() + 1);
				$("#checkOutDate").datepicker("option", "minDate", dt);
			}
		});
		$("#checkOutDate").datepicker({
			numberOfMonths : 2,
			minDate : 0,
			onSelect : function(selected) {
				var dt = new Date(selected);
				dt.setDate(dt.getDate() - 1);
				$("#checkInDate").datepicker("option", "maxDate", dt);
			}
		});
	});

	$(document).on(
			"change",
			'#cityID',
			function(e) {
				var cityId = $(this).val();

				$.ajax({
					type : "GET",
					data : {
						cityId : cityId
					},
					url : '/hotelByCity',
					dataType : 'json',
					success : function(json) {

						var $el = $("#hotelID");
						$el.empty(); // remove old options
						$.each(json, function(value, key) {
							$el.append($("<option></option>").attr("value",
									key[0]).text(key[1]));
						});

					}
				});

			});
</script>
<style type="text/css">
h2 {
	color: white;
}

label {
	padding-right: 5px;
	padding-left: 15px;
}
</style>
</head>
<body background="/image/banner.jpg">

	<div class="container" style="width: 70%;">

		<h2>Hotel booking Application</h2>
		<div class="panel panel-default">
			<div class="panel-heading">Book a room</div>
			<div class="panel-body">
				<form:form method="POST" action="/booking/book"
					commandName="booking">

					<table>
						<tr>
							<td><form:label path="customerName">Name</form:label></td>
							<td><form:input path="customerName" class="form-control"
									style="margin: 5px 0px 5px 0px;" /> <form:errors
									path="customerName" style="color: red;"></form:errors></td>
							<td><form:label path="emailID">Email ID</form:label></td>
							<td><form:input path="emailID" class="form-control"
									style="margin: 5px 0px 5px 0px;" /> <form:errors
									path="emailID" style="color: red;"></form:errors></td>
						</tr>
						<tr>
							<td><form:label path="checkInDate">Check In Date</form:label></td>
							<td>
								<div class="row">
									<div class='col-sm-6'>
										<div class="form-group">
											<div class='input-group date'>
												<form:input path="checkInDate" id="checkInDate"
													class="form-control" style="width:213px" />
												<span class="input-group-addon"> <span
													class="glyphicon glyphicon-calendar"></span>
												</span>

											</div>
										</div>
									</div>
								</div> <form:errors path="checkInDate" style="color: red;"></form:errors>
							</td>
							<td><form:label path="checkOutDate">Check out Date</form:label></td>

							<td>
								<div class="row">
									<div class='col-sm-6'>
										<div class="form-group">
											<div class='input-group date'>
												<form:input path="checkOutDate" id="checkOutDate"
													class="form-control" style="width:213px" />
												<span class="input-group-addon"> <span
													class="glyphicon glyphicon-calendar"></span>
												</span>
											</div>
										</div>
									</div>
								</div> <form:errors path="checkOutDate" style="color: red;"></form:errors>
							</td>
						</tr>
						<tr>
							<td><form:label path="cityID">City</form:label></td>
							<td><form:select path="cityID" id="cityID"
									class="form-control" style="margin: 5px 0px 5px 0px;">
									<form:option value="">--select--</form:option>
									<form:options items="${cities}" />
								</form:select> <form:errors path="cityID" style="color: red;"></form:errors></td>
							<td><form:label path="hotelID">Hotel</form:label></td>
							<td><form:select path="hotelID" class="form-control"
									style="margin: 5px 0px 5px 0px;">
									<form:option value="">--select--</form:option>
								</form:select> <form:errors path="hotelID" style="color: red;"></form:errors></td>
						</tr>
						<tr>
							<td><form:label path="adults">Adults</form:label></td>
							<td><form:input path="adults" class="form-control"
									style="margin: 5px 0px 5px 0px;" /> <form:errors path="adults"
									style="color:red;"></form:errors></td>
							<td><form:label path="children">Children</form:label></td>
							<td><form:input path="children" class="form-control"
									style="margin: 5px 0px 5px 0px;" /> <form:errors
									path="children" style="color:red;"></form:errors></td>
						</tr>
						<tr>
							<td><form:label path="noOfRooms">Rooms</form:label></td>
							<td><form:input path="noOfRooms" class="form-control"
									style="margin: 5px 0px 5px 0px;" /> <form:errors
									path="noOfRooms" style="color:red;"></form:errors></td>
							<td></td>
							<td><div style="margin-left: 108px;">
									<a class="btn btn-danger" href="/">Cancel</a> <input
										type="submit" value="Pay" class="btn btn-success"
										style="margin-left: 5px; width: 60px;" />
								</div></td>
						</tr>
						
					</table>
				</form:form>
			</div>
		</div>
	</div>
	<c:if test="${!empty bookingID}">
		<script type="text/javascript">
			bootbox
					.alert("Successfully booked your room. Please note the Booking Number : ${bookingID} <br/> Total Amount :${totalAmt}");
		</script>
	</c:if>
</body>
</html>