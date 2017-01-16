<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
<link href="<c:url value="/css/materialize.min.css"/>" rel="stylesheet" />
<link href="<c:url value="/css/icon.css"/>" rel="stylesheet" />
	<c:url var="url" value="/agenda/contato"></c:url>
</head>
<body>

	<div class="row">
		<form:form method="POST" servletRelativeAction="${url }" modelAttribute="contato" class="card col s6">
			<div class="row">
				<div class="input-field col s6">
					<i class="material-icons prefix">account_circle</i> 
					<form:input id="icon_prefix" type="text" class="validate" path="nome"/> 
					<label for="icon_prefix">Nome</label>
				</div>
			</div>
			<div class="row">
			    <div class="input-field col s6">
					<i class="material-icons prefix">phone</i> 
					<form:input id="icon_telephone" type="tel" class="validate" path="telefone"/> 
					<label for="icon_telephone">Telephone</label>
				</div>
			</div>
			<div class="row">
			    <div class="input-field col s6">
			        <i class="material-icons prefix">email</i>
                    <form:input id="email" type="email" class="validate" path="email"/>
                    <label for="email">Email</label>
                </div>
			</div>
			<div class="col s6">
			    <button class="waves-effect waves-light btn" type="submit">Salvar Contato</button>
			</div>
		</form:form>
	</div>

</body>
</html>