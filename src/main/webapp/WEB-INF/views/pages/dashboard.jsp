<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2 class="sub-header">Mes tâches <span class="deactivated-header">Tâches effectuées</span><button type="button" class="btn btn-default btn-sm pull-right">Ajouter une tâche</button></h2>
<div class="table-responsive" id="tasks-todo">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Date</th>
				<th>Description</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty tasks or tasks.size() eq 0}">
				<tr>
					<td colspan="3" style="text-align: center;">Vous n'avez aucune tâche pour l'instant</td>
				</tr>
 			</c:if>
			<c:if test="${tasks.size() gt 0}">
				<c:forEach var="task" items="${tasks}">
					<c:if test="${not task.done}">
						<tr>
							<td>${task.date}</td>
							<td>${task.name}</td>
							<td>
								<button type="button" class="btn btn-default btn-sm btn-task-done" data-task-id="${task.id}">C'est fait!</button>
								<c:if test="${task.creator.id eq user.id and not task.recurrent}">
									<button type="button" class="btn btn-danger btn-sm btn-task-delete" data-task-id="${task.id}">Supprimer</button>
								</c:if>
							</td>
						</tr>
					</c:if>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</div>
<div class="table-responsive hidden" id="tasks-done">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Date</th>
				<th>Description</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty tasks or tasks.size() eq 0}">
				<tr>
					<td colspan="3" style="text-align: center;">Vous n'avez aucune tâche pour l'instant</td>
				</tr>
 			</c:if>
			<c:if test="${tasks.size() gt 0}">
				<c:forEach var="task" items="${tasks}">
					<c:if test="${task.done}">
						<tr>
							<td>${task.date}</td>
							<td>${task.name}</td>
							<td>
								<button type="button" class="btn btn-default btn-sm btn-task-undo" data-task-id="${task.id}">C'est pas fait!</button>
								<c:if test="${task.creator.id eq user.id and not task.recurrent}">
									<button type="button" class="btn btn-danger btn-sm btn-task-delete" data-task-id="${task.id}">Supprimer</button>
								</c:if>
							</td>
						</tr>
					</c:if>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</div>
<h2 class="sub-header">Je dois <span class="deactivated-header">On me doit</span>
	<c:choose>
		<c:when test="${operationsBalance lt 0}">
			<span class="pull-right ninety-font-size red">- ${operationsBalance} €</span>
		</c:when>
		<c:otherwise>
			<span class="pull-right ninety-font-size green">+ ${operationsBalance} €</span>
		</c:otherwise>
	</c:choose>
</h2>
<div class="table-responsive" id="operations-owing">
	<table class="table table-striped">
    	<thead>
			<tr>
				<th>Montant</th>
				<th>À</th>
				<th>Depuis le</th>
				<th>Pour</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty operations or operations.size() eq 0}">
				<tr>
					<td colspan="5" style="text-align: center;">Vous n'avez aucune opération pour l'instant</td>
				</tr>
			</c:if>
			<c:if test="${operations.size() gt 0}">
				<c:forEach var="operation" items="${operations}">
					<c:if test="${operation.roommateOwing.id eq user.id and not operation.done}">
						<tr>
							<td>${operation.amount} €</td>
							<td>${operation.name}</td>
							<td>
								<button type="button" class="btn btn-default btn-sm btn-operation-done" data-operation-id="${operation.id}">C'est fait!</button>
							</td>
						</tr>
					</c:if>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</div>
<div class="table-responsive hidden" id="operations-owed">
	<table class="table table-striped">
    	<thead>
			<tr>
				<th>Montant</th>
				<th>À</th>
				<th>Depuis le</th>
				<th>Pour</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${operations.size() eq 0}">
				<tr>
					<td colspan="5" style="text-align: center;">Vous n'avez aucune opération pour l'instant</td>
				</tr>
			</c:if>
			<c:if test="${operations.size() gt 0}">
				<c:forEach var="operation" items="${operations}">
					<c:if test="${operation.roommateOwed.id eq user.id and not operation.done}">
						<tr>
							<td>${operation.amount} €</td>
							<td>${operation.name}</td>
							<td>
								<button type="button" class="btn btn-default btn-sm btn-operation-ping" data-operation-id="${operation.id}">Ping</button>
							</td>
						</tr>
					</c:if>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</div>
<h2 class="sub-header">Achats à faire <span class="deactivated-header">Achats faits</span><button type="button" class="btn btn-default btn-sm pull-right">Ajouter un achat</button></h2>
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