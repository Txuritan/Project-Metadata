jQuery(document).ready(function() {
	jQuery.ajax({
		url: "header.html"
		,dataType: "html"
	}).done(function(result){
		jQuery("#navigation").html(result);
	});
});