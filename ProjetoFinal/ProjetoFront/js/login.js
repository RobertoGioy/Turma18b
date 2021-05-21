function fazerLogin() {
    let userTxt = document.getElementById("user").value
    let passwordTxt = document.getElementById("password").value

    // console.log(userTxt, passwordTxt)

    let user = { // objeto user
        email: userTxt,
        racf: userTxt,
        senha: passwordTxt
    }

    // mensagem a ser enviada ao Backend
    let msg = {
        method: 'POST',
        body: JSON.stringify(user), // transforma o objeto user em string para enviar
        headers: {
            'Content-type': 'application/json'
        }
    }

    fetch("http://localhost:8080/user/login", msg)
        .then(res => tratarRetorno(res)) // quando voltar a resposta do fetch...

}

function tratarRetorno(retorno) {
    if (retorno.status == 200) {
        retorno.json().then(res => acessoPermitido(res)) // extrai o objeto json de dentro do retoro 
    } else {
        document.getElementById("msgErro").innerHTML = "Falha no login"
    }
}

function acessoPermitido(user) {
    localStorage.setItem("userLogged", JSON.stringify(user))
    window.location = "interna.html" // vá para esta página
}