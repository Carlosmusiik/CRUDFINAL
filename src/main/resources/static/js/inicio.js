function entrar() {

	var c = 12345;
	var u = "SENA";

	if(document.form1.contraseña.value==12345 && document.form1.usuario.value =="SENA"){


		alert ("Bienvenido");
		window.location="principal.html"
	}

	else{

		alert ("Ingrese los datos correctos");

	}
}