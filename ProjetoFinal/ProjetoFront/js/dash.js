function logout() {
    localStorage.removeItem("userLogged")
    window.location = "index.html"
}

function voltar() {
    window.location = "interna.html"
}