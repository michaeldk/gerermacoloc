$(document).ready(function () {
	$('.post-views').popover({
		placement: 'left',
		content: 'test',
		trigger: 'hover'
	});

	$('#recurrentTask').on('click', '.list-add-user', function () {
		var tour = $(this).attr('data-tour');
		var selectedOption = $('#select-tour-'+tour).find(":selected");
		var colocName = selectedOption.text();
		var colocId = selectedOption.val();
		$('#list-tour-'+tour).append('<li class="list-group-item" data-user-id="'+colocId+'">'+colocName+'<button type="button" class="btn btn-badge btn-danger pull-right list-remove-user" data-tour="'+tour+'">-</button></li>');
		selectedOption.remove();
		if ($('#select-tour-'+tour+' option').length == 0) {
			$(this).hide();
			$('#select-tour-'+tour).hide();
		}
	});
	
	$('#recurrentTask').on('click', '.list-remove-user', function () {
		var tour = $(this).attr('data-tour');
		var colocName = $(this).parent().text();
		colocName = colocName.substring(0, colocName.length-1);
		var colocId = $(this).parent().attr('data-user-id');
		var select = $('#select-tour-'+tour);
		select.append('<option value="'+colocId+'">'+colocName+'</option>');
		$(this).parent().remove();
		$('#btn-list-add-user-'+tour).show();
		select.show();
	});
	
	$('#recurrentTask').on('click', '.list-remove', function () {
		$(this).parent().parent().parent().remove();
	});
	var nbrTours = 2;
	$('.add-tour').click(function () {
		nbrTours++;
		var newSelect = $('#dummy-select').clone();
		newSelect.attr('id', 'select-tour-'+nbrTours);
		newSelect.removeClass('hide');
		var div = $('<div class="form-group"></div>');
		div.append('<ul class="list-group" id="list-tour-'+nbrTours+'"><li class="list-group-item list-group-item-info">Tour<button type="button" class="btn btn-badge btn-danger pull-right list-remove">-</button></li></ul>');
		var innerDiv = $('<div class="form-inline"></div>');
		innerDiv.append(newSelect);
		innerDiv.append(' <button type="button" id="btn-list-add-user-'+nbrTours+'" class="btn btn-badge btn-success list-add-user" data-tour="'+nbrTours+'">+</button>');
		div.append(innerDiv);
		$(this).parent().before(div);
	});
});