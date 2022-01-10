$(function() {
    $('#btnFilterDisplay').click(function(evt) {
        if ($(document.body).hasClass('hide-sidebar')) {
            $(this).val("Show Filters");
        } else {
            $(this).val("Hide Filters");
        }
    });
});
