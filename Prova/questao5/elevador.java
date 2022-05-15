public class Elevador {
    import java.util.Scanner;

    public static void main(String[] args) {

        Elevador e = new Elevador(10, 6);
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do {

            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Adicionar pessoas ");
            System.out.println("2 - Remover pessoas   ");
            System.out.println("3 - Subir  ");
            System.out.println("4 - Descer ");

            opcao = (input.nextInt());

            switch (opcao) {
                case 0:
                    opcao = 0;
                    break;

                case 1:
                    System.out.println("Quantidade de pessoas que irão entrar no elevador: ");
                    e.entra(input.nextInt());
                    break;
                case 2:
                    System.out.println("Quantidade de pessoas que irão sair do elevador: ");
                    e.sai(input.nextInt());
                    break;
                case 3:
                    System.out.println("Informe qual o andar: ");
                    e.sobe(input.nextInt());
                    break;

                case 4:
                    System.out.println("Informe qual o andar: ");
                    e.desce(input.nextInt());
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

}
