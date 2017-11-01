var procAgenda = function () {
	
	return {
        //main function to initiate the module
        init: function (parametros) {
        	//var pageContent = $('.page-content');
            
            var form1 = $('#add-agenda-form');
            var error1 = $('.alert-danger', form1);
            var success1 = $('.alert-success', form1);
          // alert(parametros.beginningTime);
            $.validator.addMethod('horariolaboral', function(value, element) {                     	
                return !(moment(value, 'h:mm a').isBefore(parametros.beginningTime) ||
                		moment(value, 'h:mm a').isAfter(parametros.endTime))
            }, parametros.invalidTimeMessage);
            
            
            form1.validate({
                errorElement: 'span', //default input error message container
                errorClass: 'help-block', // default input error message class
                focusInvalid: false, // do not focus the last invalid input
                ignore: "",
                rules: {
                	 recordid: {
                         required: true,
                         minlength: 8,
                         maxlength: 8
                     },
                	//tipoAgenda: {
                    //    required: true
                    //},
                    diarydate: {
                    	required: true,
                    	date: true
                      
                    },
                    timepicker: {
                        required: true,
                        horariolaboral: true
                       
                    },
                    tipoCita: {
                        required: true
                    },
                    providerName: {
                        required: true
                    },
                    
                   
                    unidadSalud: {
                        required: true
                    },
                    tipoespecialidad: {
                        required: true
                    },
                    autorizaSms: {
                        required: false
                    },
                    smsNumber: {
                        required: false,
                        maxlength: 20
                    },
                    observacion: {
                        required: false,
                        maxlength: 250
                    }
                    
                },

                invalidHandler: function (event, validator) { //display error alert on form submit              
                    success1.hide();
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
                	
                    success1.show();
                    error1.hide();
                    processAgenda();
                }
            });
            
       
            
            function processAgenda()
        	{
            	App.blockUI();
             //	alert(form1.serialize());
            
        	    $.post( parametros.saveCitaUrl
        	            , form1.serialize()
        	            , function( data )
        	            {
        	    			cita = JSON.parse(data);
        	    			if (cita.id === undefined) {
        	    				data = data.replace(/u0027/g,"");
        	    				toastr.options = {
        	    						  "closeButton": true,
        	    						  "onclick": null,
        	    						  "showDuration": "300",
        	    						  "hideDuration": "1000",
        	    						  "timeOut": 0,
        	    						  "extendedTimeOut": 0,
        	    						  "tapToDismiss": false
        	    						};
        	    				toastr["error"](data, "Error!!");      						
        					}
        					else{
        					//	$('#centerName').prop( "disabled", true );
        						$('#guardar').prop( "disabled", true );
        						toastr.success(parametros.successmessage,cita.name);
        						window.setTimeout(function(){
        	    			        window.location.href = parametros.agendaUrl;
        	    			    }, 1500);
        					}
        	    			App.unblockUI();
        	            }
        	            , 'text' )
        		  		.fail(function(XMLHttpRequest, textStatus, errorThrown) {
        		    		alert( "error:" + errorThrown);
        		    		App.unblockUI();
        		  		});
        	    
        	    
        	}
            
            
            $(document).on('keypress','form input',function(event)
    		{                
    		    event.stopImmediatePropagation();
    		    if( event.which == 13 )
    		    {
    		        event.preventDefault();
    		        var $input = $('form input');
    		        if( $(this).is( $input.last() ) )
    		        {
    		            //Time to submit the form!!!!
    		            //alert( 'Hooray .....' );
    		        }
    		        else
    		        {
    		            $input.eq( $input.index( this ) + 1 ).focus();
    		        }
    		    }
    		});
        }
    };

}();

var procesarAsistencia = function () {
	
	return {
        //main function to initiate the module
        init: function (parametros) {
        	//var pageContent = $('.page-content');
            
            var error1 = $('.alert-danger');
            var success1 = $('.alert-success');            
            
           
    	    $.post(parametros.saveCitaUrl
    	            , { citaid: parametros.citaid, estado : !parametros.estado}
    	            , function( data )
    	            {
    	    			respuesta = JSON.parse(data);
    	    			if (respuesta.succeed == false) {
    	    				data = data.replace(/u0027/g,"");
    	    				toastr.options = {
    	    						  "closeButton": true,
    	    						  "onclick": null,
    	    						  "showDuration": "300",
    	    						  "hideDuration": "1000",
    	    						  "timeOut": 0,
    	    						  "extendedTimeOut": 0,
    	    						  "tapToDismiss": false
    	    						};
    	    				toastr["error"](data, "Error!!");      						
    					}
    					else{
    				
    						toastr.success(parametros.successmessage,'');
    						
    						
    						parametros.oSwitch.bootstrapSwitch('state', !parametros.estado , true);
    					}
    	    			App.unblockUI();
    	            }
    	            , 'text' )
    		  		.fail(function(XMLHttpRequest, textStatus, errorThrown) {
    		    		alert( "error:" + errorThrown);
    		    		App.unblockUI();
    		  			});// Fin post           
           
        	}
    	};

}();