<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Login Page</title>
</head>
<body>
	<form:form commandName="person" action="personform" method="POST">
		<div class="form-group row">
			<form:label path="name" class="col-xs-2 col-form-label">Name</form:label>
			<div class="col-xs-10">
				<form:input path="name" class="form-control" />
			</div>
		</div>
		<div class="form-group row">
			<form:label class="col-xs-2 col-form-label" path="address">Address</form:label>
			<div class="col-xs-10">
				<form:input class="form-control" path="address" />
			</div>
		</div>
		<div id="form-row">
			<div>
				<input type="submit" value="Submit" />
			</div>
		</div>
	</form:form>
</body>
</html>