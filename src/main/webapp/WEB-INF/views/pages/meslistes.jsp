<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<div class="panel-group" id="accordion">
	<div class="panel panel-default">
		<div class="panel-heading">
			<h4 class="panel-title">
				<a data-toggle="collapse" data-parent="#accordion" href="#collapseZero">
					Nouvelle liste
				</a>
			</h4>
		</div>
		<div class="panel-collapse collapse" id="collapseZero">
			<div class="panel-body">
				<form role="form">
					<div class="form-group">
						<label for="new-list-name">Nom</label>
						<input type="text" class="form-control" id="new-list-name" placeholder="Entrer un nom">
					</div>
					<button type="submit" class="btn btn-primary" id="btn-create-list">Créer</button>
				</form>
			</div>
		</div>
	</div>
	<div class="panel panel-default">
		<div class="panel-heading">
			<h4 class="panel-title">
				<a data-toggle="collapse" data-parent="#accordion" href="#collapse-${tobuylist.id}">
					${tobuylist.name}
				</a>
				<div class="btn-group-sm pull-right">
					<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target="#list-${tobuylist.id}-modal">Ajouter un objet</button>
					<button type="button" class="btn btn-danger btn-sm" data-list-id="${tobuylist.id}">Supprimer la liste</button>
				</div>
				<div class="clearfix"></div>
			</h4>
		</div>
		<div class="table-responsive panel-collapse collapse in" id="collapse-${tobuylist.id}">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Depuis le</th>
						<th>Quoi</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:choose>
						<c:when test="${empty tobuylist}">
							<tr>
								<td colspan="3" style="text-align: center;">Vous n'avez pas de liste d'achats à faire. Ceci est un bug.</td>
							</tr>
						</c:when>
						<c:when test="${not empty tobuylist and tobuylist.getNbrTodoItems() eq 0}">
							<tr>
								<td colspan="3" style="text-align: center;">Vous n'avez pas d'élément dans cette liste.</td>
							</tr>
						</c:when>
						<c:otherwise>
							<c:forEach var="listobject" items="${tobuylist.list}">
								<c:if test="${not listobject.done}">
									<tr>
										<td>${listobject.dateCreated}</td>
										<td>${listobject.value}</td>
										<td><button type="button" class="btn btn-default btn-sm btn-listobject-done" data-listobject-id="${listobject.id}">C'est fait!</button>
											<button type="button" class="btn btn-danger btn-sm btn-listobject-delete" data-listobject-id="${listobject.id}">Supprimer</button></td>
									</tr>
								</c:if>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
		</div>
		<!-- Modal -->
		<div class="modal fade" id="list-${tobuylist.id}-modal" tabindex="-1" role="dialog" aria-labelledby="list-${tobuylist.id}-label" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="list-${tobuylist.id}-label">Ajouter un achat de coloc</h4>
					</div>
					<div class="modal-body">
						<form role="form">
							<div class="form-group">
								<label for="input-list-${tobuylist.id}">Il faut acheter</label>
								<input type="text" class="form-control" id="input-list-${tobuylist.id}" placeholder="Ceci">
							</div>
							<button type="submit" class="btn btn-primary" data-list-id="${tobuylist.id}">Ajouter</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<c:if test="${listes.size() gt 0}">
		<c:forEach var="list" items="listes">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion" href="#collapse-${list.id}">
							${list.name}
						</a>
						<div class="btn-group-sm pull-right">
							<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target="#list-${list.id}-modal">Ajouter un objet</button>
							<button type="button" class="btn btn-danger btn-sm" data-list-id="${list.id}">Supprimer la liste</button>
						</div>
						<div class="clearfix"></div>
					</h4>
				</div>
				<div class="table-responsive panel-collapse collapse in" id="collapse-${list.id}">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>Depuis le</th>
								<th>Quoi</th>
								<th>Action</th>
							</tr>
						</thead>
						<tbody>
							<c:choose>
								<c:when test="${list.getNbrTodoItems() eq 0}">
									<tr>
										<td colspan="3" style="text-align: center;">Vous n'avez pas d'élément dans cette liste.</td>
									</tr>
								</c:when>
								<c:otherwise>
									<c:forEach var="listobject" items="${list.list}">
										<c:if test="${not listobject.done}">
											<tr>
												<td>${listobject.dateCreated}</td>
												<td>${listobject.value}</td>
												<td><button type="button" class="btn btn-default btn-sm btn-listobject-done" data-listobject-id="${listobject.id}">C'est fait!</button>
													<button type="button" class="btn btn-danger btn-sm btn-listobject-delete" data-listobject-id="${listobject.id}">Supprimer</button></td>
											</tr>
										</c:if>
									</c:forEach>
								</c:otherwise>
							</c:choose>
						</tbody>
					</table>
				</div>
				<!-- Modal -->
				<div class="modal fade" id="list-${list.id}-modal" tabindex="-1" role="dialog" aria-labelledby="list-${list.id}-label" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="list-${list.id}-label">Ajouter un élément à la liste ${list.name}</h4>
							</div>
							<div class="modal-body">
								<form role="form">
									<div class="form-group">
										<label for="input-list-${list.id}">Il ne faut pas que j'oublie</label>
										<input type="text" class="form-control" id="input-list-${list.id}" placeholder="Ceci">
									</div>
									<button type="submit" class="btn btn-primary btn-add-to-list" data-list-id="${list.id}">Ajouter</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</c:forEach>
	</c:if>
</div>