import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma ação para " + nome + ":");
            System.out.println("1. Acordar");
            System.out.println("2. Andar");
            System.out.println("3. Comer");
            System.out.println("4. Dormir");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    pessoa.acordar();
                    break;
                case 2:
                    pessoa.andar();
                    break;
                case 3:
                    pessoa.comer();
                    break;
                case 4:
                    pessoa.dormir();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
