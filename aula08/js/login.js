function fazerLogin() {
    let userTxt = document.getElementById("user").value
    let pwdTxt = document.getElementById("password").value
    
    let user = { // objeto user
        email: userTxt,
        cpf: userTxt,
        senha: pwdTxt
    }

    // mensagem enviada ao backend
    let msg = {
        method: 'POST',
        body: JSON.stringify(user), // transforma objeto user em string para enviar
        headers: {
            'Content-type': 'application/json'
        }
    }

    fetch("http://localhost:8080/user/login", msg).then( res => tratarRetorno(res) )
}

function tratarRetorno (retorno) {
    if(retorno.status == 200) {
        retorno.json().then(res => acessoPermitido(res))
    } else {
        document.getElementById("msgError").innerHTML = "falha no login"
    }
}

function acessoPermitido(user) {
    localStorage.setItem("userLogged", JSON.stringify(user))
    window.location = "interna.html"
}