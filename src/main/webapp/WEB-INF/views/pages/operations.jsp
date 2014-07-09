<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<h2 class="sub-header">Je dois <span class="deactivated-header">Je ne dois plus</span><button type="button" class="btn btn-default btn-sm pull-right" data-toggle="modal" data-target="#operationPersoModal">Ajouter une opération</button></h2>
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
			<div class="modal fade" id="operationPersoModal" tabindex="-1" role="dialog" aria-labelledby="operationPersoLabel" aria-hidden="true">
			  <div class="modal-dialog">
				<div class="modal-content">
				  <div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="operationPersoLabel">Ajouter une opération</h4>
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
			<h2 class="sub-header">La coloc doit <span class="deactivated-header">La coloc ne doit plus</span><button type="button" class="btn btn-default btn-sm pull-right">Ajouter une opération</button></h2>
			<div class="table-responsive">
				<table class="table table-striped">
				  <thead>
					<tr>
					  <th>Depuis le</th>
					  <th>A</th>
					  <th>Quoi</th>
					  <th>Montant</th>
					  <th>Action</th>
					</tr>
				  </thead>
				  <tbody>
					<tr>
					  <td>18/04/2014</td>
					  <td>Lampiris</td>
					  <td>Facture juin</td>
					  <td>102,00 €</td>
					  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
					<tr>
					  <td>18/04/2014</td>
					  <td>Lampiris</td>
					  <td>Facture juin</td>
					  <td>102,00 €</td>
					  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
					<tr>
					  <td>18/04/2014</td>
					  <td>Lampiris</td>
					  <td>Facture juin</td>
					  <td>102,00 €</td>
					  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
					<tr>
					  <td>18/04/2014</td>
					  <td>Lampiris</td>
					  <td>Facture juin</td>
					  <td>102,00 €</td>
					  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
					<tr>
					  <td>18/04/2014</td>
					  <td>Lampiris</td>
					  <td>Facture juin</td>
					  <td>102,00 €</td>
					  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
					<tr>
					  <td>18/04/2014</td>
					  <td>Lampiris</td>
					  <td>Facture juin</td>
					  <td>102,00 €</td>
					  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
					<tr>
					  <td>18/04/2014</td>
					  <td>Lampiris</td>
					  <td>Facture juin</td>
					  <td>102,00 €</td>
					  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button><button type="button" class="btn btn-danger btn-sm">Supprimer</button></td>
					</tr>
				  </tbody>
				</table>
			</div>