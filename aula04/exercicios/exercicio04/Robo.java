package exercicio04;

public class Robo {
    private int eixoX, eixoY;
    private final int LIMITE;
    private final int LIMITE_PLANO = 100;
    private final int LIMITE_DEFAULT = 10;
  
    public Robo(int eixoX, int eixoY, int LIMITE) {
        this.LIMITE = ((LIMITE > 0 && LIMITE < LIMITE_PLANO) ? LIMITE_PLANO : LIMITE_DEFAULT);

        if ( eixoX > -LIMITE && eixoX < LIMITE) {
            this.eixoX = eixoX;
        }
        if (eixoY > -LIMITE && eixoY < LIMITE) {
            this.eixoY = eixoY;
        }
     }

    public void exibir () {
        System.out.printf("%d : %d\n", this.eixoX, this.eixoY);
    }

    public void mover (char direcao) {

        switch (direcao) {
            case 'N': moverNorte();
            case 'S': moverSul();
            case 'L': moverLeste();
            case 'O': moverOeste();
            default:
                break;
        }
    } 

    private void moverNorte () {
        if (this.eixoY > -LIMITE) {
            this.eixoY++;
        }
    }

    private void moverSul () {
        if (this.eixoY > -LIMITE) {
            this.eixoY--;
        }
    }

    private void moverLeste () {
        if (this.eixoX  < LIMITE) {
            this.eixoX++;
        }
    }

    private void moverOeste () {
        if (this.eixoX > -LIMITE) {
            this.eixoX--;
        }
    }
}
