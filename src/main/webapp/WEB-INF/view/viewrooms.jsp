<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>

<title>View Hotels</title>
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
</head>
<body background="/image/banner.jpg">
	<div class="container">
		<h2>Hotel booking Application</h2>
		<div class="panel panel-default">
			<div class="panel-heading">View Lowest Priced Hotels</div>
			<div class="panel-body">
				<form:form method="POST" action="/view/search" commandName="booking">
					<table>

						<tr>
							<td><form:label path="cityID"> Search By City &nbsp;&nbsp;&nbsp; </form:label></td>
							<td><form:select path="cityID" class="form-control"
									style="margin: 5px 0px 5px 0px;width:150px;">
									<form:options items="${cities}" />
								</form:select></td>
						</tr>
						<tr>
							<td><form:label path="sortBy"> Sort By &nbsp;&nbsp;&nbsp; </form:label></td>
							<td><form:select path="sortBy" class="form-control"
									style="margin: 5px 0px 5px 0px;width:150px;">
									<form:option value="1">Tariff Per Day</form:option>
									<form:option value="2">Hotel Name</form:option>
									<form:option value="3">Rating</form:option>
								</form:select></td>
						</tr>
						<tr>
							<td></td>
							<td><div style="margin-left: 0px;">
									<a class="btn btn-danger" href="/">Cancel</a> <input
										type="submit" value="Search" class="btn btn-primary"
										style="margin-left: 5px; width: 70px;" />
								</div></td>
						</tr>
					</table>
				</form:form>
			</div>
		</div>

		<c:if test="${!empty hotels}">

			<div class="row">
				<c:forEach items="${hotels}" var="hotel">

					<div class="col-md-4">
						<div class="thumbnail">
							<img src="${hotel.hotelImgPath}" alt="${hotel.hotelName}"
								class="img-rounded" width="304" height="236">
							<div class="caption">
								<p>
									Hotel Name : ${hotel.hotelName} <br /> No Of Rooms
									:${hotel.noOfRooms} <br /> Tariff Per Day :
									${hotel.tariffPerDay} <br /> Rating : ${hotel.rating} / 5
								</p>
							</div>
						</div>
					</div>


				</c:forEach>
			</div>
		</c:if>
	</div>
</body>
</html>