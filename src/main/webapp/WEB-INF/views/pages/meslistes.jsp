<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
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
							<button type="submit" class="btn btn-primary">Créer</submit>
						</form>
					</div>
				</div>
			  </div>
			  <div class="panel panel-default">
				<div class="panel-heading">
				  <h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
					  Collapsible Group Item #1
					</a>
					<div class=".btn-group-sm pull-right">
						<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target="#list-1-modal">Ajouter un objet</button>
						<button type="button" class="btn btn-danger btn-sm">Supprimer la liste</button>
					</div>
					<div class="clearfix"></div>
				  </h4>
				</div>
				<div class="table-responsive panel-collapse collapse in" id="collapseOne">
					<table class="table table-striped">
					  <thead>
						<tr>
						  <th>Date</th>
						  <th>Description</th>
						  <th>Action</th>
						</tr>
					  </thead>
					  <tbody>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
					  </tbody>
					</table>
				</div>
				<!-- Modal -->
				<div class="modal fade" id="list-1-modal" tabindex="-1" role="dialog" aria-labelledby="list-1-label" aria-hidden="true">
				  <div class="modal-dialog">
					<div class="modal-content">
					  <div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="list-1-label">Ajouter un achat de coloc</h4>
					  </div>
					  <div class="modal-body">
						<form role="form">
						  <div class="form-group">
							<label for="input-list-1">Il ne faut pas que j'oublie</label>
							<input type="text" class="form-control" id="input-list-1" placeholder="Ceci">
						  </div>
						  <button type="submit" class="btn btn-primary">Ajouter</button>
						</form>
					  </div>
					</div>
				  </div>
				</div>
			  </div>
			  
			  <div class="panel panel-default">
				<div class="panel-heading">
				  <h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
					  Collapsible Group Item #2
					</a>
					<div class=".btn-group-sm pull-right">
						<button type="button" class="btn btn-default btn-sm">Ajouter un objet</button>
						<button type="button" class="btn btn-danger btn-sm">Supprimer la liste</button>
					</div>
					<div class="clearfix"></div>
				  </h4>
				</div>
				<div class="table-responsive panel-collapse collapse" id="collapseTwo">
					<table class="table table-striped">
					  <thead>
						<tr>
						  <th>Date</th>
						  <th>Description</th>
						  <th>Action</th>
						</tr>
					  </thead>
					  <tbody>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
					  </tbody>
					</table>
				</div>
			  </div>
			  <div class="panel panel-default">
				<div class="panel-heading">
				  <h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion" href="#collapseThree">
					  Collapsible Group Item #3
					</a>
					<div class=".btn-group-sm pull-right">
						<button type="button" class="btn btn-default btn-sm">Ajouter un objet</button>
						<button type="button" class="btn btn-danger btn-sm">Supprimer la liste</button>
					</div>
					<div class="clearfix"></div>
				  </h4>
				</div>
				<div class="table-responsive panel-collapse collapse" id="collapseThree">
					<table class="table table-striped">
					  <thead>
						<tr>
						  <th>Date</th>
						  <th>Description</th>
						  <th>Action</th>
						</tr>
					  </thead>
					  <tbody>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
						<tr>
						  <td>18/04/2014</td>
						  <td>Vider le lave-vaisselle et nettoyer la cuisine</td>
						  <td><button type="button" class="btn btn-default btn-sm">C'est fait!</button></td>
						</tr>
					  </tbody>
					</table>
				</div>
			  </div>
			</div>