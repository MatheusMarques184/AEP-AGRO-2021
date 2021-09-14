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
    public static void ImprimirResposavel(Responsavel r) {
        System.out.println("\nRegistro Responsavel: " + r.getRegistro());
    }

    public static void main(String[] args) { // 02 12 2006

        Scanner menu = new Scanner(System.in);

        System.out.print("##--         Menu        --##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Produtor          |\n");
        System.out.print("| Opção 2 - Cooperativa       |\n");
        System.out.print("| Opção 3 - Responsavel       |\n");
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
                String senhaString = senha.nextLine();

                System.out.print("Email: ");
                Scanner email = new Scanner(System.in);
                String EMAIL = email.nextLine();

                System.out.print("Numero de telefone: ");
                Scanner num = new Scanner(System.in);
                String num1 = num.nextLine();

                Produtor p1 = new Produtor(nomeProdutor, CPF, DATA, senhaString, EMAIL, num1);
                System.out.print("\nCadastro realizado com sucesso\n");
                ImprimirProdutor(p1);
                break;

            case 2:
                System.out.print("Nome Cooperativa: ");
                Scanner nomeCooperativa = new Scanner(System.in);
                String nome = nomeCooperativa.nextLine();

                System.out.print("Senha: ");
                Scanner senhaCooperativa = new Scanner(System.in);
                String senhacoop = senhaCooperativa.nextLine();

                System.out.print("CNPJ: ");
                Scanner cnpjCooperativa = new Scanner(System.in);
                String cnpj = cnpjCooperativa.nextLine();

                Cooperativa coopUM = new Cooperativa(nome, senhacoop, cnpj);
                ImprimirCooperativa(coopUM);
                break;

            case 3:
                System.out.print("Nome responsavel: ");
                Scanner nomeResponsavel = new Scanner(System.in);
                String nResponsavel = nomeResponsavel.nextLine();
                System.out.print("Senha: ");
                Scanner senhaResponsavel = new Scanner(System.in);
                String sResponsavel = senhaResponsavel.nextLine();
                Responsavel res1 = new Responsavel(nResponsavel, sResponsavel);
                ImprimirResposavel(res1);
                break;

            case 4:
                menu.close();
                break;
            default:
                System.out.print("\nOpção Inválida!");
                break;
        }

    }

}
