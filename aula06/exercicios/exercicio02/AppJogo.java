public class AppJogo {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("Palmeiras", "São Paulo");
        Placar p3 = new Placar("Palmeiras", "São Paulo", 0, 3);

        System.out.println(p1.exibirPlacar());
        System.out.println(p2.exibirPlacar());
        System.out.println(p3.exibirPlacar());
    }
}
