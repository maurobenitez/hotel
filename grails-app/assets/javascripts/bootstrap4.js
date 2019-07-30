// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better
// to create separate JavaScript files as needed.
//
//= require aos
//= require bootstrap-datepicker.min
//= require bootstrap.min
//= require jquery-3.3.1.min
//= require jquery.countdown.min
//= require jquery.magnific-popup.min
//= require jquery-migrate-3.0.1.min
//= require jquery.stellar.min
//= require jquery-ui
//= require main
//= require mediaelement-and-player.min
//= require owl.carousel.min
//= require popper.min
//= require_tree .
//= require_self



if (typeof jQuery !== 'undefined') {
    (function($) {
        $(document).ajaxStart(function() {
            $('#spinner').fadeIn();
        }).ajaxStop(function() {
            $('#spinner').fadeOut();
        });
    })(jQuery);
}
