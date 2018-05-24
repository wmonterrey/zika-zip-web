var EnterForm = function () {
    var bloquearUI = function (mensaje) {
        var loc = window.location;
        var pathName = loc.pathname.substring(0, loc.pathname.indexOf('/', 1) + 1);
        var mess = '<img src=' + pathName + 'resources/img/ajax-loading.gif>' + mensaje;
        $.blockUI({ message: mess,
            css: {
                border: 'none',
                padding: '15px',
                backgroundColor: '#000',
                '-webkit-border-radius': '10px',
                '-moz-border-radius': '10px',
                opacity: .5,
                color: '#fff'
            },
            baseZ: 1051 // para que se muestre bien en los modales
        });
    };

    var desbloquearUI = function () {
        setTimeout($.unblockUI, 500);
    };
    return {
        //main function to initiate the module
        init: function (parametros) {

            var form1 = $('#download-form');
            var error1 = $('.alert-danger', form1);

            form1.validate({
                errorElement: 'span', //default input error message container
                errorClass: 'help-block', // default input error message class
                focusInvalid: false, // do not focus the last invalid input
                ignore: "",
                rules: {
                    pregnantId: {
                        required: true,
                        pattern: /^07[0-9][0-9][0-9][0-9][0-3][A-Y]$/
                    },
                    deliveryDate: {
                        required: true
                    },
                    numBirth: {
                        required: true
                    },
                    rbConsent: {
                        required: true
                    }

                },
                invalidHandler: function (event, validator) { //display error alert on form submit
                    error1.show();
                    App.scrollTo(error1, -200);
                },

                highlight: function (element) { // hightlight error inputs
                    $(element)
                        .closest('.form-group').addClass('has-error'); // set error class to the control group
                },

                unhighlight: function (element) { // revert the change done by hightlight
                    $(element)
                        .closest('.form-group').removeClass('has-error'); // set error class to the control group
                },

                success: function (label) {
                    label
                        .closest('.form-group').removeClass('has-error'); // set success class to the control group
                },

                submitHandler: function (form) {
                    error1.hide();
                    save();
                }
            });


            function save() {
                bloquearUI("Guardando registro");
                var saveObj = {};
                saveObj['id'] = $('#pregnantId').val();
                saveObj['deliveryDate'] = $('#deliveryDate').val();
                saveObj['numBirth'] = $('#numBirth').val();
                saveObj['consent'] = $('#rbConsent').val();
                $.ajax(
                    {
                        url: parametros.saveInfantUrl,
                        type: 'POST',
                        dataType: 'json',
                        data: JSON.stringify(saveObj),
                        contentType: 'application/json',
                        mimeType: 'application/json',
                        success: function (data) {
                            if (data.error.length > 0) {
                                toastr.error(data.mensaje);
                            } else {
                                $('#pregnantId').val('');
                                $('#deliveryDate').val('');
                                $('#numBirth').val('');
                                $('#rbConsent').val('');
                                toastr.success(data.mensaje);
                            }
                            desbloquearUI();
                        },
                        error: function (jqXHR) {
                            desbloquearUI();
                        }
                    });

            }


        }
    };

}();