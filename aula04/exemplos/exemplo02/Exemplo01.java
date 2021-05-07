import java.util.ArrayList;

public class Exemplo01 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Valor " + lista.get(i) + " no índice " + i);
        }

        for (Integer item : lista) { // para cada item da lista faça
            System.out.println("Item " + item);
        }
    }
}
