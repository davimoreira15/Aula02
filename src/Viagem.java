import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        double velocidade, tempo, distancia, kmLitro;
        double consumo;

        System.out.println("Digite a velocidade do seu veiculo: ");
        velocidade = entrada.nextDouble();
        System.out.println("Digite o tempo: ");
        tempo = entrada.nextDouble();
        System.out.println("Digite o km/L: ");
        kmLitro = entrada.nextDouble();
        distancia = velocidade * tempo;
        consumo = distancia/kmLitro;
        System.out.println("O Consumo médio é: " + consumo);

    }
}
