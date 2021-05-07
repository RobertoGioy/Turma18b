package exercicio02;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setRelogio(hora, minuto, segundo);
    }

    private void setRelogio (int hora, int minuto, int segundo) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
        if (segundo >=0 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    public void getHora () {
        System.out.printf("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}
