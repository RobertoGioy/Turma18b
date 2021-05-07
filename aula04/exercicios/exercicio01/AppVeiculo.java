package exercicio01;

/**
 * AppVeiculo
 */
public class AppVeiculo {

    public static void main(String[] args) {
        String modelo, marca;
        float kmRodado, litrosCombustivel, consumo;

        modelo = "Fat Boy";
        marca = "harley Davidson";
        kmRodado = 20;
        litrosCombustivel = 2;

        Veiculo vehicle = new Veiculo(modelo, marca);
        vehicle.exibirDados();
        vehicle.calculaConsumo(kmRodado, litrosCombustivel);
        consumo = vehicle.getConsumo();
        
        System.out.println("O consumo do veículo " + modelo + " - " + marca + " é " + consumo);
    }
}