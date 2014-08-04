<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2 class="sub-header">Achats persos à faire <span class="deactivated-header">Achats persos faits</span><button type="button" class="btn btn-default btn-sm pull-right" data-toggle="modal" data-target="#achatPersoModal">Ajouter un achat</button></h2>
<div class="table-responsive" id="tobuylist-todo">
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
<div class="table-responsive hidden" id="tobuylist-done">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Fait le</th>
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
				<c:when test="${not empty tobuylist and tobuylist.getNbrDoneItems() eq 0}">
					<tr>
						<td colspan="3" style="text-align: center;">Vous n'avez pas d'élément dans cette liste.</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="listobject" items="${tobuylist.list}">
						<c:if test="${listobject.done}">
							<tr>
								<td>${listobject.dateDone}</td>
								<td>${listobject.value}</td>
								<td><button type="button" class="btn btn-default btn-sm btn-listobject-undo" data-listobject-id="${listobject.id}">C'est pas fait!</button>
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
<div class="modal fade" id="achatPersoModal" tabindex="-1" role="dialog" aria-labelledby="achatPersoLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="achatPersoLabel">Ajouter un achat perso</h4>
			</div>
			<div class="modal-body">
				<form role="form">
					<div class="form-group">
						<label for="inputAchatPerso">Il me faut</label> <input type="text" class="form-control" id="inputAchatPerso" placeholder="Ceci">
					</div>
					<button type="submit" class="btn btn-primary">Ajouter</button>
				</form>
			</div>
		</div>
	</div>
</div>
<h2 class="sub-header">Achats coloc à faire <span class="deactivated-header">Achats coloc faits</span><button type="button" class="btn btn-default btn-sm pull-right" data-toggle="modal" data-target="#achatColocModal">Ajouter un achat</button></h2>
<div class="table-responsive" id="colocationList-todo">
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
				<c:when test="${empty colocationList}">
					<tr>
						<td colspan="3" style="text-align: center;">Vous n'avez pas de liste d'achats à faire. Ceci est un bug.</td>
					</tr>
				</c:when>
				<c:when test="${not empty colocationList and colocationList.getNbrTodoItems() eq 0}">
					<tr>
						<td colspan="3" style="text-align: center;">Vous n'avez pas d'élément dans cette liste.</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="listobject" items="${colocationList.list}">
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
<div class="table-responsive hidden" id="colocationList-done">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Fait le</th>
				<th>Quoi</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${empty colocationList}">
					<tr>
						<td colspan="3" style="text-align: center;">Vous n'avez pas de liste d'achats à faire. Ceci est un bug.</td>
					</tr>
				</c:when>
				<c:when test="${not empty colocationList and colocationList.getNbrDoneItems() eq 0}">
					<tr>
						<td colspan="3" style="text-align: center;">Vous n'avez pas d'élément dans cette liste.</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="listobject" items="${colocationList.list}">
						<c:if test="${listobject.done}">
							<tr>
								<td>${listobject.dateDone}</td>
								<td>${listobject.value}</td>
								<td><button type="button" class="btn btn-default btn-sm btn-listobject-undo" data-listobject-id="${listobject.id}">C'est pas fait!</button>
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
<div class="modal fade" id="achatColocModal" tabindex="-1" role="dialog" aria-labelledby="achatColocLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="achatColocLabel">Ajouter un achat de coloc</h4>
			</div>
			<div class="modal-body">
				<form role="form">
					<div class="form-group">
						<label for="inputAchatColoc">Il nous faut</label> <input type="text" class="form-control" id="inputAchatColoc" placeholder="Ceci">
					</div>
					<button type="submit" class="btn btn-primary">Ajouter</button>
				</form>
			</div>
		</div>
	</div>
</div>
<script src="js/colocation.js"></script>