jQuery ->
  $('#loginForm').validate
    rules:
      loginPassword:
        minlength: 4,
        required: true
      loginEmail:
        required: true
        email: true
    highlight: (label) ->
      $(label).closest('.control-group').addClass('error').removeClass('success')
    success: (label) ->
      label.text('OK').addClass('valid')
        .closest('.control-group').addClass('success').removeClass('error')

