<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="col-sm-3 col-md-2 sidebar">
  <ul class="nav nav-sidebar">
    <li class="active"><a href="<c:url value="/dashboard"/>">Vue d'ensemble</a></li>
    <li><a href="<c:url value="/coloc"/>">Colocation</a></li>
    <li><a href="<c:url value="/meslistes"/>">Mes listes</a></li>
  </ul>
  <ul class="nav nav-sidebar">
    <li><a href="<c:url value="/taches"/>">Tâches</a></li>
    <li><a href="<c:url value="/achatsafaire"/>">Achats à faire</a></li>
    <li><a href="<c:url value="/operations"/>">Opérations</a></li>
    <li><a href="<c:url value="/paiements"/>">Etat des comptes</a></li>
  </ul>
</div>