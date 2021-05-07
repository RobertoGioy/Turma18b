import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();

        lista.add(new Pessoa("Gioy", 47));
        lista.add(new Pessoa("Gloria", 55));
        lista.add(new Pessoa("Maria", 22));

       for (Pessoa pessoa : lista) {
            pessoa.apresentar();  
       }
    }
}
