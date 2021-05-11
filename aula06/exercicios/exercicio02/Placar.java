public class Placar {
    private String timeA, timeB;
    private int golTimeA, golTimeB;

    public Placar () {
        this("Time da casa", "Visitante", 0, 0);
    }

    public Placar (String timeA, String timeB) {
        this(timeA, timeB, 0, 0);       
    }

    public Placar (String timeA, String timeB, int golTimeA, int golTimeB) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.golTimeA = golTimeA;
        this.golTimeB = golTimeB;
    }

    public String exibirPlacar () {
        return timeA + " " + golTimeA + " x " + golTimeB + " " + timeB;
    }
}
