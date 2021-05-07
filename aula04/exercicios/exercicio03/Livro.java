package exercicio03;

public class Livro {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Livro (String titulo, String autor, int totalPaginas, int paginaAtual) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
    }

    public void avancarPagina () {
        if (this.paginaAtual < this.totalPaginas) {
            this.paginaAtual++;
         }
         System.out.println("Avançando para a página " + this.paginaAtual);
    }

    public void retrocederPagina () {
        if (paginaAtual > 0) {
            paginaAtual--;
         }
         System.out.println("Retrocedendo para a página " + this.paginaAtual);
    }

    public void irParaPagina (int pagina) {
        if (pagina > 0 && pagina <= this.totalPaginas) {
            this.paginaAtual = pagina;
        }  
        System.out.println("Direcionando para a página " + this.paginaAtual);      
     }

    public int exibirPagina () {
        return this.paginaAtual;
    }

    public void mostrarCapa () {
        System.out.println("Título do Livro: " + this.titulo);
        System.out.println("Autor do Livro: " + this.autor);
        System.out.println("Total de páginas: " + this.totalPaginas);
    }

    
}
