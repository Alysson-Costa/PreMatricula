function onSignIn(response) {
    var perfil = response.getBasicProfile();
    var userID = perfil.getId();
    var userName = perfil.getName();
    var userEmail = perfil.getEmail();
    var userPicture = perfil.getImageUrl();

    document.getElementById('user-photo').src = userPicture;
    document.getElementById('user-name').innerText = userName;
    document.getElementById('user-email').innerText = userEmail;

    // Recebendo o TOKEN que será usado nas requisições à API:
    var gToken = response.getAuthResponse().id_token;
    console.log("Token: " + gToken);
    console.log("User ID: " + userID);
    console.log("Nome: " + userName);
    console.log("Email: " + userEmail);


  };