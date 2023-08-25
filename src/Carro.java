import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String placa;
        int ano;

        System.out.println("Digite a placa: ");
        placa = entrada.nextLine();
        System.out.println("Digite o ano: ");
        ano = entrada.nextInt();

        if (ano <= 2010)
            System.out.println("Carro velho");
        else if (ano <= 2022)
            System.out.println("Carro Semi Novo");
        else if (ano == 2023)
            System.out.println("Carro novo");
        else
            System.out.println("Inválido");

        placa = placa.toUpperCase();

        for (int i = 0; i < placa.length(); i++) {

            if (placa.charAt(i) == 'A' || placa.charAt(i) == 'E' || placa.charAt(i) == 'I'
                    || placa.charAt(i) == 'O' || placa.charAt(i) == 'U') {
               placa = placa.replace(placa.charAt(i), '*');
            }
        }
        System.out.println("Placa alterada " + placa);

    }
}
