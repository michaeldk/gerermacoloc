<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span></button>
			<a class="navbar-brand" href="#"><span class="glyphicon glyphicon-home"></span> Gérer Ma Coloc</a>
		</div>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
			
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">Notifications <span class="badge">${unreadNotifications}</span> <b class="caret"></b></a>
					<c:if test="${notifications.size() gt 0}">
						<ul class="dropdown-menu">
							<c:forEach var="notification" items="notifications">
								<c:choose>
									<c:when test="${not notification.seen}">
										<li class="notification_unread">
									</c:when>
									<c:otherwise>
										<li>
									</c:otherwise>
								</c:choose>
								<c:choose>
									<c:when test="${notification.type == 'TASK'}">
										<a href="<c:url value="/taches"/>">notification.text</a>
									</c:when>
									<c:when test="${notification.type == 'PAYMENT'}">
										<a href="<c:url value="/operations"/>">notification.text</a>
									</c:when>
									<c:when test="${notification.type == 'PING'}">
										<a href="<c:url value="/taches"/>">notification.text</a>
									</c:when>
									<c:when test="${notification.type == 'CLOTURE'}">
										<a href="<c:url value="/paiements"/>">notification.text</a>
									</c:when>
									<c:when test="${notification.type == 'TODOBUY_DONE'}">
										<a href="<c:url value="/achatsafaire"/>">notification.text</a>
									</c:when>
									<c:when test="${notification.type == 'MESSAGE_WALL'}">
										<a href="<c:url value="/coloc"/>">notification.text</a>
									</c:when>
									<c:otherwise>
										<a href="#">notification.text</a>
									</c:otherwise>
								</c:choose>
								</li>
							</c:forEach>
						</ul>
				  </c:if>
				</li>
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">Messages <span class="badge">0</span> <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">Julie annonce t'avoir payé 26€</a></li>
						<li><a href="#">Danny a accepté ton paiement de 100€</a></li>
						<li><a href="#">Julie et Laetitia ont signalé une de tes tâches!</a></li>
					</ul>
				</li>
	            <li><a href="#">Paramètres</a></li>
	            <li><a href="#">Déconnexion</a></li>
	            <li><a href="#">Aide</a></li>
			</ul>
		</div>
	</div>
</div>