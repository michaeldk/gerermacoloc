<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:if test="${not empty exception}">
	<div class="alert alert-danger">
		${exception}
	</div>
</c:if>
<c:choose>
	<c:when test="${empty colocation}">
		<h2 class="sub-header">Créer une colocation</h2>
		<form:form role="form" id="createColocForm" method="post" modelAttribute="newColoc">
			<form:errors path="*" cssClass="alert alert-danger" element="div"/>
			<div class="form-group">
				<label for="name">Nom de la colocation</label>
				<form:input path="name" type="text" class="form-control" id="name" placeholder="Entrez le nom de votre colocation"/>
			</div>
			<div class="form-group">
				<label for="emailColoc">Email de la coloc</label>
				<form:input path="emailColoc" type="text" class="form-control" id="emailColoc" placeholder="Optionnel (mais utile!)"/>
			</div>
			<div class="form-group">
				<label for="address">Adresse</label>
				<form:input path="address" type="text" class="form-control" id="address" placeholder="Optionnel"/>
			</div>
			<div class="form-group">
				<label for="nameProprio">Nom du proprio</label>
				<form:input path="nameProprio" type="text" class="form-control" id="nameProprio" placeholder="Optionnel"/>
			</div>
			<div class="form-group">
				<label for="emailProprio">Email du proprio</label>
				<form:input path="emailProprio" type="text" class="form-control" id="emailProprio" placeholder="Optionnel"/>
			</div>
			<div class="form-group">
				<label for="addressProprio">Adresse du proprio</label>
				<form:input path="addressProprio" type="text" class="form-control" id="addressProprio" placeholder="Optionnel"/>
			</div>
			<button type="submit" class="btn btn-primary">Ajouter</button>
		</form:form>
	</c:when>
	<c:otherwise>
		<div class="panel panel-default">
			<div class="panel-body">
				<ul class="media-list">
			  		<li class="media">
						<a class="pull-left" href="#">
				 			<img class="media-object" src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI2NCIgaGVpZ2h0PSI2NCI+PHJlY3Qgd2lkdGg9IjY0IiBoZWlnaHQ9IjY0IiBmaWxsPSIjZWVlIj48L3JlY3Q+PHRleHQgdGV4dC1hbmNob3I9Im1pZGRsZSIgeD0iMzIiIHk9IjMyIiBzdHlsZT0iZmlsbDojYWFhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjEycHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+NjR4NjQ8L3RleHQ+PC9zdmc+" alt="...">
						</a>
						<div class="media-body">
							<textarea class="form-control" rows="3" placeholder="Poster sur le mur... Utilisez (MAJ+Entrer) pour passer à la ligne, (Entrer) pour poster."></textarea>
						</div>
			  		</li>
				</ul>
		  	</div>
		</div>
		<c:forEach var="message" items="${messages}">
			<div class="panel panel-default">
		  		<div class="panel-body">
					<ul class="media-list">
			 			<li class="media">
							<a class="pull-left" href="#">
				  				<img class="media-object" src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI2NCIgaGVpZ2h0PSI2NCI+PHJlY3Qgd2lkdGg9IjY0IiBoZWlnaHQ9IjY0IiBmaWxsPSIjZWVlIj48L3JlY3Q+PHRleHQgdGV4dC1hbmNob3I9Im1pZGRsZSIgeD0iMzIiIHk9IjMyIiBzdHlsZT0iZmlsbDojYWFhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjEycHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+NjR4NjQ8L3RleHQ+PC9zdmc+" alt="...">
							</a>
							<div class="media-body">
				  				<h4 class="media-heading"><span class="dark-blue">${message.author}</span> <span class="eighty-font-size">le ${message.date}</span> <span class="pull-right eighty-font-size blue post-views">vu par ${message.messageSeenBy.size}</span></h4>
				  				<p class="media-text">${message.content}</p>
				  				<c:forEach var="comment" items="${message.comments}">
					  				<div class="media">
										<a class="pull-left" href="#">
						  					<img class="media-object" src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI2NCIgaGVpZ2h0PSI2NCI+PHJlY3Qgd2lkdGg9IjY0IiBoZWlnaHQ9IjY0IiBmaWxsPSIjZWVlIj48L3JlY3Q+PHRleHQgdGV4dC1hbmNob3I9Im1pZGRsZSIgeD0iMzIiIHk9IjMyIiBzdHlsZT0iZmlsbDojYWFhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjEycHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+NjR4NjQ8L3RleHQ+PC9zdmc+" alt="...">
										</a>
										<div class="media-body">
						  					<h4 class="media-heading"><span class="dark-blue">${comment.author}</span> <span class="eighty-font-size">le ${comment.date}</span></h4>
						  					<p class="media-text">${comment.content}</p>
										</div>
					  				</div>
				  				</c:forEach>
								<div class="media-body">
									<textarea class="form-control" rows="3" placeholder="Poster un commentaire... Utilisez (MAJ+Entrer) pour passer à la ligne, (Entrer) pour poster."></textarea>
								</div>
							</div>
			  			</li>
					</ul>
		  		</div>
			</div>
		</c:forEach>
	</c:otherwise>
</c:choose>