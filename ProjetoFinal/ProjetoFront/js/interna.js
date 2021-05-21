function validaLogin() {
    let userTxt = localStorage.getItem("userLogged")

    if (!userTxt) {
        window.location = "index.html"
    }

    const user = JSON.parse(userTxt)

    // document.getElementById("user").innerHTML = user.nome + " <b>( " + user.cpf + " )</b>"
    // document.getElementById("user").innerHTML = user.nome + ' <b>( ' + user.cpf + ' )</b>'
    document.getElementById("user").innerHTML = `${user.nome} <b>( ${user.racf} )</b>`

    listarAgentes();
}

function logout() {
    localStorage.removeItem("userLogged")
    window.location = "index.html"
}

function listarAgentes() {
    fetch("http://localhost:8080/agente/all")
        .then(res => tratarRetorno(res))
}

function listarAgentesTop10() {
    fetch("http://localhost:8080/agente/top10")
        .then(res => tratarRetorno(res))
}

function tratarRetorno(resposta) {
    if (resposta.status == 200) {
        resposta.json().then(res => exibirAgentes(res))

    }
}
function exibirAgentes(listarAgentes) {
    let selecao = `<option value=""></option>`;


    for (let index = 0; index < listarAgentes.length; index++) {
        selecao = selecao + ` <option value="${listarAgentes[index].id}">${listarAgentes[index].nome}</option> `

    }

    document.getElementById("agente").innerHTML = selecao


}
