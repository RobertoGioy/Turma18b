import java.util.HashMap;

public class Exemplo03 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();

        hash.put(1, "um");
        hash.put(2, "dois");
        hash.put(3, "tres");
        hash.put(4, "quatro");
        System.out.println("Key = 3: " + hash.get(3));
    }
}
