import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecione a operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();

            if (opcao == 5) {
                continuar = false;
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + calculadora.somar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + calculadora.subtrair(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + calculadora.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado: " + calculadora.dividir(num1, num2));
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.print("Deseja realizar outra operação? (s/n): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        scanner.close();
    }
}
