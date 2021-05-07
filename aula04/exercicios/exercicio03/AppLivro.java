package exercicio03;

public class AppLivro {
    public static void main(String[] args) {
        Livro livro = new Livro ("Hamelet", "Gioy", 500, 200);
    
        livro.mostrarCapa();
        
        livro.avancarPagina();
        livro.exibirPagina();
               
        livro.irParaPagina(400);
        livro.exibirPagina();

        livro.retrocederPagina();
        livro.exibirPagina();
       
    }
}
