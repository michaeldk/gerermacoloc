<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<p class="bg-primary info-p">La tâche xxx a été ajoutée<button type="button" class="close pull-right" aria-hidden="true">&times;</button></p>
		  <h2 class="sub-header">Les tâches <span class="deactivated-header">Tâches effectuées</span><button type="button" class="btn btn-default btn-sm pull-right" data-toggle="modal" data-target="#taskModal">Ajouter une tâche</button></h2>
          <div class="table-responsive">
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
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-testets et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Personne</td>
                  <td><button type="button" class="btn btn-success btn-sm">Prendre</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Personne</td>
                  <td><button type="button" class="btn btn-success btn-sm">Prendre</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
                </tr>
                <tr>
                  <td>18/04/2014</td>
                  <td>Vider le lave-vaisselle et nettoyer la cuisine</td><td>Gilles Van Eylen</td>
                  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
                </tr>
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
						<label for="inputOperationPerso">Intitulé de la tâche</label>
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
						  <label for="selectOperationPerso">Date limite</label>
						  <div class='input-group date' id='datetimepicker2'>
							<input type='text' class="form-control" />
							<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span>
					      </div>
						</div>
						<div class="form-group">
						  <label for="selectOperationPerso">Colocataire assigné</label>
						  <div class="form-inline">
							<select id="selectOperationPerso" class="form-control">
							  <option>Personne</option>
							  <option>Gilles Van Eylen</option>
							  <option>Julie Dehon</option>
							  <option>Laetitia Brans</option>
							  <option>Michaël De Keyser</option>
							  <option>Danny Willem</option>
							</select>
							<button type="button" class="btn btn-link">Moi</button>
							<button type="button" class="btn btn-link">Personne</button>
						  </div>
						</div>
					  </div>
					  <div id="recurrentTask" style="display: none;">
						<div class="form-group">
						  <label for="selectTaskRecurrence">Changement</label>
						  <div class="form-inline">
							<select id="selectTaskRecurrence" class="form-control">
							  <option>Chaque jour</option>
							  <option>Chaque semaine</option>
							  <option>Chaque mois</option>
							  <option>Chaque trimestre</option>
							  <option>Chaque semestre</option>
							  <option>Chaque année</option>
							</select>
						  </div>
						</div>
						<div class="form-group">
							  <label for="">Colocataire(s) par tour</label>
							  <ul class="list-group" id="list-tour-1">
								<li class="list-group-item list-group-item-info">Tour<button type="button" class="btn btn-badge btn-danger pull-right list-remove">-</button></li>
								<li class="list-group-item" data-user-id="1">Gilles Van Eylen<button type="button" class="btn btn-badge btn-danger pull-right list-remove-user" data-tour="1">-</button></li>
								<li class="list-group-item" data-user-id="2">Julie Dehon<button type="button" class="btn btn-badge btn-danger pull-right list-remove-user" data-tour="1">-</button></li>
							  </ul>
							  <div class="form-inline">
								  <select class="form-control" id="select-tour-1">
									<option value="3">Laetitia Brans</option>
									<option value="4">Michaël De Keyser</option>
									<option value="5">Danny Willem</option>
								  </select>
								  <button type="button" id="btn-list-add-user-1" class="btn btn-badge btn-success list-add-user" data-tour="1">+</button>
							  </div>
						  </div>
						  <div class="form-group">
							  <ul class="list-group" id="list-tour-2">
								<li class="list-group-item list-group-item-info">Tour<button type="button" class="btn btn-badge btn-danger pull-right list-remove">-</button></li>
								<li class="list-group-item" data-user-id="3">Laetitia Brans<button type="button" class="btn btn-badge btn-danger pull-right list-remove-user" data-tour="2">-</button></li>
								<li class="list-group-item" data-user-id="4">Michaël De Keyser<button type="button" class="btn btn-badge btn-danger pull-right list-remove-user" data-tour="2">-</button></li>
							  </ul>
							  <div class="form-inline">
								  <select class="form-control" id="select-tour-2">
									<option value="1">Gilles Van Eylen</option>
									<option value="2">Julie Dehon</option>
									<option value="5">Danny Willem</option>
								  </select>
								  <button type="button" id="btn-list-add-user-2" class="btn btn-badge btn-success list-add-user" data-tour="2">+</button>
							  </div>
						  </div>
						  <div class="form-group">
							<button type="button" class="btn btn-success add-tour">Ajouter un tour</button>
							<select class="form-control hide" id="dummy-select">
							  <option value="1">Gilles Van Eylen</option>
							  <option value="2">Julie Dehon</option>
							  <option value="3">Laetitia Brans</option>
							  <option value="4">Michaël De Keyser</option>
							  <option value="5">Danny Willem</option>
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