package Sistema;

import java.util.Scanner;

public class App {
    public static void ImprimirProdutor(Produtor p) {

        System.out.println("\nProdutor: " + p.getNome());
        System.out.println("CPF " + p.getCpf() + " - Celular " + p.getNumeroCelular() + " - Data nascimento "
                + p.getData() + " - Email " + p.getEmail());
    }

    public static void ImprimirCooperativa(Cooperativa c) {
        System.out.println("\nCooperativa: " + c.getNomeCooperativa());
        System.out.println("CNPJ " + c.getCNPJ());
    }

    public static void main(String[] args) { // 02 12 2006

        Scanner menu = new Scanner(System.in);

        System.out.print("##--         Menu        --##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Produtor          |\n");
        System.out.print("| Opção 2 - Responsavel       |\n");
        System.out.print("| Opção 3 - Cooperativa       |\n");
        System.out.print("| Opção 4 - Sair              |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = menu.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Nome produtor: ");
                Scanner sc = new Scanner(System.in);
                String nomeProdutor = sc.nextLine();

                System.out.print("Cpf: ");
                Scanner cpf = new Scanner(System.in);
                String CPF = cpf.nextLine();

                System.out.print("Data sem espaço: ");
                Scanner data = new Scanner(System.in);
                String DATA = data.nextLine();

                System.out.print("Senha: ");
                Scanner senha = new Scanner(System.in);
                String senha2 = senha.nextLine();

                System.out.print("Confirme a senha: ");
                Scanner confirmaSenha = new Scanner(System.in);
                String CONFSENHA = confirmaSenha.nextLine();

                System.out.print("Email: ");
                Scanner email = new Scanner(System.in);
                String EMAIL = email.nextLine();

                System.out.print("Numero de telefone: ");
                Scanner num = new Scanner(System.in);
                String num1 = num.nextLine();


                
                Produtor p1 = new Produtor(nomeProdutor, CPF, DATA, senha2, CONFSENHA, EMAIL, num1);
                ImprimirProdutor(p1);
                break;

            case 2:
                System.out.print("\nOpção Clientes Selecionado\n");
                break;

            case 3:
                System.out.print("\nOpção Produtos Selecionado\n");
                break;

            default:
                System.out.print("\nOpção Inválida!");
                break;

            case 4:
                System.out.print("\nAté logo!");
                menu.close();
        }

        Cooperativa coopUM = new Cooperativa("Cocamar", "123456", "123456", "12345678911111");

        // ImprimirCooperativa(coopUM);

    }

}
