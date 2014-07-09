<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<h2 class="sub-header">Etat des comptes<button type="button" class="btn btn-primary btn-sm pull-right" data-toggle="modal" data-target="#clotureModal">Clotûrer les comptes</button></h2>
			<!--Div that will hold the pie chart-->
			<div class="panel panel-default pull-left">
				<div class="panel-body">
					<div id="visualization"></div>
				</div>
			</div>
			<div class="col-md-5 well pull-right">
				<p>Balance</p>
				<ul class="list-group">
				  <li class="list-group-item">Gilles Van Eylen<span class="text-success pull-right">+120€</span></li>
				  <li class="list-group-item">Julie Dehon<span class="text-success pull-right">+120€</span></li>
				  <li class="list-group-item">Laetitia Brans<span class="text-info pull-right">0€</span></li>
				  <li class="list-group-item">Michaël De Keyser<span class="text-danger pull-right">-120€</span></li>
				  <li class="list-group-item">Danny Willem<span class="text-danger pull-right">-120€</span></li>
				</ul>
			</div>
			<div class="clearfix"></div>
			<h2 class="sub-header">Paiements pris en compte<button type="button" class="btn btn-default btn-sm pull-right" data-toggle="modal" data-target="#paiementPersoModal">Ajouter un paiement</button></h2>
			<div class="table-responsive">
				<table class="table table-striped">
				  <thead>
					<tr>
					  <th>Depuis le</th>
					  <th>A</th>
					  <th>Par</th>
					  <th>Quoi</th>
					  <th>Montant</th>
					  <th>Action</th>
					</tr>
				  </thead>
				  <tbody>
					<tr>
					  <td>18/04/2014</td>
					  <td>Gilles Van Eylen</td>
					  <td>Moi</td>
					  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
					  <td>120,12 €</td>
					  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
					<tr>
					  <td>18/04/2014</td>
					  <td>Gilles Van Eylen</td>
					  <td>Moi</td>
					  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
					  <td>120,12 €</td>
					  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
					<tr>
					  <td>18/04/2014</td>
					  <td>Moi</td>
					  <td>Gilles Van Eylen</td>
					  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
					  <td>120,12 €</td>
					  <td><button type="button" class="btn btn-success btn-sm">Valider</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
					<tr>
					  <td>18/04/2014</td>
					  <td>Gilles Van Eylen</td>
					  <td>Moi</td>
					  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
					  <td>120,12 €</td>
					  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
					<tr>
					  <td>18/04/2014</td>
					  <td>Gilles Van Eylen</td>
					  <td>Moi</td>
					  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
					  <td>120,12 €</td>
					  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
					<tr>
					  <td>18/04/2014</td>
					  <td>Gilles Van Eylen</td>
					  <td>Moi</td>
					  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
					  <td>120,12 €</td>
					  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
					<tr>
					  <td>18/04/2014</td>
					  <td>Gilles Van Eylen</td>
					  <td>Moi</td>
					  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
					  <td>120,12 €</td>
					  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
				  </tbody>
				</table>
			</div>
			<!-- Modal -->
			<div class="modal fade" id="paiementPersoModal" tabindex="-1" role="dialog" aria-labelledby="paiementPersoLabel" aria-hidden="true">
			  <div class="modal-dialog">
				<div class="modal-content">
				  <div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="paiementPersoLabel">Ajouter une opération</h4>
				  </div>
				  <div class="modal-body">
					<form role="form">
					  <div class="form-group">
					      <label for="selectOperationPerso">Colocataire payeur</label>
						  <div class="form-inline">
							  <select id="selectOperationPerso" class="form-control">
								  <option>Gilles Van Eylen</option>
								  <option>Julie Dehon</option>
								  <option>Laetitia Brans</option>
								  <option>Michaël De Keyser</option>
								  <option>Danny Willem</option>
							  </select>
							  <button type="button" class="btn btn-link">Moi</button>
						  </div>
					  </div>
					  <div class="form-group">
						<label for="inputOperationPerso">Montant</label>
						<input type="text" class="form-control" id="inputOperationPerso" placeholder="Utilisez une virgule pour séparer les unités des décimales">
					  </div>
					  <div class="form-group">
					      <label for="selectOperationPerso">Colocataire(s) concerné(s)</label>
						  <ul class="list-group">
							<li class="list-group-item">Gilles Van Eylen<button type="button" class="btn btn-badge btn-danger pull-right">-</button></li>
							<li class="list-group-item">Julie Dehon<button type="button" class="btn btn-badge btn-danger pull-right">-</button></li>
							<li class="list-group-item">Laetitia Brans<button type="button" class="btn btn-badge btn-danger pull-right">-</button></li>
							<li class="list-group-item">Michaël De Keyser<button type="button" class="btn btn-badge btn-danger pull-right">-</button></li>
							<li class="list-group-item">Danny Willem<button type="button" class="btn btn-badge btn-danger pull-right">-</button></li>
						  </ul>
						  <div class="form-inline">
							  <select id="selectOperationPerso" class="form-control">
								  <option>Gilles Van Eylen</option>
								  <option>Julie Dehon</option>
								  <option>Laetitia Brans</option>
								  <option>Michaël De Keyser</option>
								  <option>Danny Willem</option>
							  </select>
							  <button type="button" class="btn btn-badge btn-success">+</button>
						  </div>
					  </div>
					</form>
				  </div>
				  <div class="modal-footer">
					<button type="submit" class="btn btn-default">Ajouter et créer une autre opération</button>
					<button type="submit" class="btn btn-primary">Ajouter</button>
				  </div>
				</div>
			  </div>
			</div>