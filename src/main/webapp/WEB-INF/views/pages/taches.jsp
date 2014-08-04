<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page pageEncoding="UTF-8"%>
<p class="bg-primary info-p">La tâche xxx a été ajoutée<button type="button" class="close pull-right" aria-hidden="true">&times;</button></p>
<h2 class="sub-header">Les tâches <span class="deactivated-header">Tâches effectuées</span><button type="button" class="btn btn-default btn-sm pull-right" data-toggle="modal" data-target="#taskModal">Ajouter une tâche</button></h2>
<div class="table-responsive" id="tasks-todo">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Date</th>
				<th>Description</th>
				<th>Responsable</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty tasks or tasks.size() eq 0}">
				<tr>
					<td colspan="4" style="text-align: center;">Vous n'avez aucune tâche pour l'instant</td>
				</tr>
 			</c:if>
			<c:if test="${tasks.size() gt 0}">
				<c:forEach var="task" items="${tasks}">
					<c:if test="${not task.done}">
						<tr>
							<td>${task.date}</td>
							<td>${task.name}</td>
							<td>
								<c:if test="${not empty task.currentTaskOrder}">
									<c:forEach var="i" begin="0" end="${task.currentTaskOrder.doers.size()-1}">
										${roommate}
										<c:if test="${i+1 < task.currentTaskOrder.doers.size()-1}">, </c:if>
									</c:forEach>
								</c:if>
							</td>
							<td>
								<c:if test="${not empty task.currentTaskOrder and task.currentTaskOrder.doers.contains(user)}">
									<button type="button" class="btn btn-default btn-sm btn-task-done" data-task-id="${task.id}">C'est fait!</button>
								</c:if>
								<c:if test="${task.creator.id eq user.id}">
									<button type="button" class="btn btn-danger btn-sm btn-task-delete" data-task-id="${task.id}">Modifier</button>
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
					<td colspan="4" style="text-align: center;">Vous n'avez aucune tâche pour l'instant</td>
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
<!-- Modal -->
<div class="modal fade" id="taskModal" tabindex="-1" role="dialog" aria-labelledby="taskModal" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="taskModal">Ajouter une tâche</h4>
			</div>
			<div class="modal-body">
				<form role="form">
					<div class="form-group">
						<label for="inputTaskName">Intitulé de la tâche</label>
						<input type="text" class="form-control" id="inputOperationPerso" placeholder="Exemple: Vider le lave-vaisselle">
		  			</div>
					<div class="radio">
						<label>
							<input type="radio" name="optionsRadios" id="radioTaskSimple" value="option1" checked>
								Tâche simple &mdash; Un coloc'
						</label>
					</div>
					<div class="radio">
						<label>
							<input type="radio" name="optionsRadios" id="radioTaskRecurrente" value="option2">
								Tâche récurrente &mdash; Plusieurs colocataires à tour de rôle
						</label>
					</div>
		  			<div id="simpleTask">
						<div class="form-group">
							<label for="deadline">Date limite</label>
							<div class='input-group date' id='datetimepicker2'>
								<input type="text" class="form-control" id="deadline"/>
								<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
		      				</div>
						</div>
						<div class="checkbox">
							<label>
								<input type="checkbox" name="privateTask" id="privateTask"> Tâche perso &mdash; Seulement visible par vous
							</label>
						</div>
						<div class="form-group">
			  				<label for="selectTaskResponsable">Colocataire assigné</label>
			  				<div class="form-inline">
								<select id="selectTaskResponsable" class="form-control">
									<option>Personne</option>
									<c:forEach var="roommate" items="${roommates}">
										<c:choose>
											<c:when test="${roommate.id eq user.id}">
												<option id="moi" value="${roommate.id}">${roommate}</option>
											</c:when>
											<c:otherwise>
												<option value="${roommate.id}">${roommate}</option>
											</c:otherwise>
										</c:choose>
									</c:forEach>
								</select>
								<button type="button" class="btn btn-link btn-task-me">Moi</button>
								<button type="button" class="btn btn-link">Personne</button>
							</div>
						</div>
					</div>
					<div id="recurrentTask" style="display: none;">
						<div class="form-group">
			  				<label for="selectTaskRecurrence">Changement</label>
		  					<div class="form-inline">
								<select id="selectTaskRecurrence" class="form-control">
									<option value="DAILY">Chaque jour</option>
									<option value="WEEKLY">Chaque semaine</option>
									<option value="MONTHLY">Chaque mois</option>
									<option value="QUARTERLY">Chaque trimestre</option>
									<option value="BIANNUALY">Chaque semestre</option>
									<option value="YEARLY">Chaque année</option>
								</select>
							</div>
						</div>
						<div class="form-group"> 
				  			<label for="">Colocataire(s) par tour</label>
			  				<ul class="list-group" id="list-tour-1">
								<li class="list-group-item list-group-item-info">Tour<button type="button" class="btn btn-badge btn-danger pull-right list-remove">-</button></li>
			 				</ul>
				  			<div class="form-inline">
								<select class="form-control" id="select-tour-1">
									<c:forEach var="roommate" items="${roommates}">
										<option value="${roommate.id}">${roommate}</option>
									</c:forEach>
								</select>
								<button type="button" id="btn-list-add-user-1" class="btn btn-badge btn-success list-add-user" data-tour="1">+</button>
							</div>
						</div>
						<div class="form-group">
							<button type="button" class="btn btn-success add-tour">Ajouter un tour</button>
							<select class="form-control hide" id="dummy-select">
								<c:forEach var="roommate" items="${roommates}">
									<option value="${roommate.id}">${roommate}</option>
								</c:forEach>
							</select>
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="submit" class="btn btn-default">Ajouter et recommencer</button>
				<button type="submit" class="btn btn-primary">Ajouter</button>
			</div>
		</div>
	</div>
</div>
<script src="resources/js/jquery-ui-1.10.4.custom.min.js"></script>
<script src="resources/js/moment.js"></script>
<script src="resources/js/bootstrap-datetimepicker.js"></script>
<script src="resources/js/locales/bootstrap-datetimepicker.fr.js"></script>
<script type="text/javascript" src="resources/js/colocation.js"></script>
<script type="text/javascript">
	$(function () {
		$('#datetimepicker2').datetimepicker({
			language: 'fr'
		});
	});
	
	$(function () {
		$('input[name=optionsRadios]:radio').change(function () {
			var radioTaskSimple = $('#radioTaskSimple');
			if (radioTaskSimple.is(':checked')) {
				$('#recurrentTask').hide();
				$('#simpleTask').show();
			} else {
				$('#simpleTask').hide();
				$('#recurrentTask').show();
			}
		});
	});
</script>