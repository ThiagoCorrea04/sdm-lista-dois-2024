import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            System.out.print("Digite seu peso(kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Digite sua altura (em metros): ");
            double altura = scanner.nextDouble();

            IMC imc = new IMC(peso, altura);

            double resultadoIMC = imc.calcularIMC();
            System.out.println("Seu IMC é: " + resultadoIMC);
            System.out.println("Classificação: " + imc.classificarIMC());


            System.out.print("Deseja calcular novamente? (s/n): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
