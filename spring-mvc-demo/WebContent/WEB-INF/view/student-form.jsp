<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCKTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		<br>
		<br> 
		Last name: <form:input path="lastName" />
		<br>
		<br>
		Country:
		<form:select path="country">
			<option style="display: none;"></option>

			<!-- <form:option value="Türkiye" label="Türkiye" />
			<form:option value="Italy" label="Italy" />
			<form:option value="Germany" label="Germany" />
			<form:option value="Spain" label="Spain" />
			-->

			<form:options items="${student.countryOptions}" />
		</form:select>
		<br>
		<br>
		Favorite Language: 
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		Golang <form:radiobutton path="favoriteLanguage" value="Golang" />
		Python <form:radiobutton path="favoriteLanguage" value="Python" />
		<br>
		<br>
		Operating System: 
		Windows <form:checkbox path="operatingSystem" value="Windows" />
		Linux <form:checkbox path="operatingSystem" value="Linux" />
		Mac OS <form:checkbox path="operatingSystem" value="Mac OS" />
		<br>
		<br>
		<input type="submit" values="Submit">
	</form:form>
</body>

</html>