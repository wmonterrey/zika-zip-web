var Export = function () {

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
                    codigoInicio: {required: function () {
                        return $('#codigoFin').val().length > 0;
                    }},
                    codigoFin: {required: function () {
                        return $('#codigoInicio').val().length > 0;
                    }},
                    zpform: {
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
                    getForm();
                }
            });

            function getForm() {
                console.log("decargar");
                var form = $('#zpform option:selected').val();
                var urlForm = "";
                if (form == 'Zp00'){
                    urlForm = parametros.getZp00;
                }
                if (form == 'Zp01AD'){
                    urlForm = parametros.getZp01AD;
                }
                if (form == 'Zp01E'){
                    urlForm = parametros.getZp01E;
                }
                if (form == 'Zp01FK'){
                    urlForm = parametros.getZp01FK;
                }
                if (form == 'Zp02'){
                    urlForm = parametros.getZp02;
                }
                if (form == 'Zp03'){
                    urlForm = parametros.getZp03;
                }
                if (form == 'Zp04AD'){
                    urlForm = parametros.getZp04AD;
                }
                if (form == 'Zp04E'){
                    urlForm = parametros.getZp04E;
                }
                if (form == 'Zp04FH'){
                    urlForm = parametros.getZp04FH;
                }
                if (form == 'Zp05'){
                    urlForm = parametros.getZp05;
                }
                if (form == 'Zp06'){
                    urlForm = parametros.getZp06;
                }
                if (form == 'Zp08'){
                    urlForm = parametros.getZp08;
                }

                var iframe = document.createElement('iframe');
                iframe.id = "IFRAMEID";
                iframe.style.display = 'none';
                document.body.appendChild(iframe);
                iframe.src = urlForm+"?codigoInicio="+$("#codigoInicio").val()+"&codigoFin="+$("#codigoFin").val();
                iframe.addEventListener("load", function () {
                    console.log("FILE LOAD DONE.. Download should start now");
                });
            }

        }
    };

}();