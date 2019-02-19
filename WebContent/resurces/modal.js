$(document)
		.ready(
				function() {

					// SUBMIT FORM
					$("#myform").submit(function(event) {
						// Prevent the form from submitting via the browser.
						event.preventDefault();

						ajaxPost();
					});

					function ajaxPost() {

						// PREPARE FORM DATA
						var formData = {
							email : $("#email").val(),
							password : $("#password").val()
						}
						

						// DO POST
						$
								.ajax({
									type : "POST",
									contentType : "application/json",
									url : "logindata/login",
									data : JSON.stringify(formData),
									dataType : 'json',
									success : function(result) {
										if (result.status == "Done") {
											$("#postResultDiv")
													.html(
															"<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>"
																	+ "Post Successfully! <br>"
																	+ "---> Customer's Info: FirstName = "
																	+ result.data.email
																	+ " ,LastName = "
																	+ result.data.password
																	+ "</p>");
										} else {
											$("#postResultDiv").html(
													"<strong>Error</strong>");
											$('#myModal').modal('show');
										}
										console.log(result);
									},
									error : function(e) {
										alert("Error!")
										console.log("ERROR: ", e);
									}
								});

						// Reset FormData after Posting
						resetData();

					}

					function resetData() {
						$("#email").val("");
						$("#password").val("");
					}
				})