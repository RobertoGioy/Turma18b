package exercicio01;

public class Veiculo {
    private String modelo, marca;
    private float consumo;

    public Veiculo (String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void exibirDados () {
        System.out.println("Modelo do veículo: " + modelo);
        System.out.println("Fabricante do veículo: " + marca);
    }

    public void calculaConsumo (float km, float litros) {
        this.consumo = km / litros;
    }

    public float getConsumo () {
        return this.consumo;
    }

}
