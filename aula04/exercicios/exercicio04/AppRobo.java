package exercicio04;

public class AppRobo {
    public static void main(String[] args) {
        Robo meuRobo = new Robo(20, 20, 40);

        meuRobo.mover('N');
        meuRobo.exibir();
        meuRobo.mover('N');
        meuRobo.exibir();
        //meuRobo.mover('L');
        //meuRobo.exibir();
    }
}
