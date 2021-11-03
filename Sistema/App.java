package Sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void ImprimirProdutor(CadastroProdutor p) {

        System.out.println("\nProdutor: " + p.getNome());
        System.out.println("CPF " + p.getCpf() + " - Celular " + p.getNumeroCelular() + " - Data nascimento "
                + p.getData() + " - Email " + p.getEmail());
    }

    public static void ImprimirCooperativa(CadastroCooperativa c) {
        System.out.println("\nCooperativa: " + c.getNomeCooperativa());
        System.out.println("CNPJ " + c.getCNPJ());
    }

    public static void ImprimirResposavel(LoginResponsavel r) {
        System.out.println("\nRegistro Responsavel: " + r.getRegistro());
    }

    // ----------------------------------------------------------------------------------
    public static void RealizarCadastroProdutor(CadastroProdutor cadastro, Scanner menu) {
        System.out.print("Nome produtor: ");
        Scanner sc = new Scanner(System.in);
        String nomeProdutor = sc.nextLine();
        cadastro.setNome(nomeProdutor);

        System.out.print("Cpf: ");
        Scanner cpf = new Scanner(System.in);
        String CPF = cpf.nextLine();
        cadastro.setCpf(CPF);

        System.out.print("Data sem espaço: ");
        Scanner data = new Scanner(System.in);
        String DATA = data.nextLine();
        cadastro.setData(DATA);

        System.out.print("Senha: ");
        Scanner senha = new Scanner(System.in);
        String senhaString = senha.nextLine();
        cadastro.setSenha(senhaString);

        System.out.print("Email: ");
        Scanner email = new Scanner(System.in);
        String EMAIL = email.nextLine();
        cadastro.setEmail(EMAIL);

        System.out.print("Numero de telefone: ");
        Scanner num = new Scanner(System.in);
        String num1 = num.nextLine();
        cadastro.setNumeroCelular(num1);
    }

    private static void RealizarCadastroCooperativa(CadastroCooperativa cadastro, Scanner menu) {
        System.out.print("Nome Cooperativa: ");
        Scanner nomeCooperativa = new Scanner(System.in);
        String nome = nomeCooperativa.nextLine();
        cadastro.setNomeCooperativa(nome);

        System.out.print("Senha: ");
        Scanner senhaCooperativa = new Scanner(System.in);
        String senha = senhaCooperativa.nextLine();
        cadastro.setSenha(senha);

        System.out.print("CNPJ: ");
        Scanner cnpjCooperativa = new Scanner(System.in);
        String cnpj = cnpjCooperativa.nextLine();
        cadastro.setCNPJ(cnpj);

    }

    public static void RealizarLoginProdutor(CadastroProdutor cadastro, Scanner menu, Login loginGeral) {
        System.out.print("Nome produtor: ");
        Scanner sc = new Scanner(System.in);
        String nomeProdutor = sc.nextLine();
        loginGeral.setNome(nomeProdutor);
        System.out.print("Senha: ");
        Scanner senha = new Scanner(System.in);
        String senhaString = senha.nextLine();
        loginGeral.setSenha(senhaString);

        if ((loginGeral.getNome().equals(cadastro.getNome()) && (loginGeral.getSenha().equals(cadastro.getSenha())))
                || (loginGeral.getNome().equals("usuario")) && (loginGeral.getSenha().equals("1234567"))) {
            System.out.println("Login valido");
            // fazer o resto
        } else {
            System.out.println("Login invalido");
        }
    }

    private static void RealizarLoginCooperativa(CadastroCooperativa cadastro, Scanner menu, Login loginGeral) {
        System.out.print("Nome Cooperativa: ");
        Scanner nomeCooperativa = new Scanner(System.in);
        String nome = nomeCooperativa.nextLine();
        loginGeral.setNome(nome);
        System.out.print("Senha: ");
        Scanner senhaCooperativa = new Scanner(System.in);
        String senhacoop = senhaCooperativa.nextLine();
        loginGeral.setSenha(senhacoop);

        if ((loginGeral.getNome().equals(cadastro.getNomeCooperativa())
                && (loginGeral.getSenha().equals(cadastro.getSenha())))
                || (loginGeral.getNome().equals("usuario")) && (loginGeral.getSenha().equals("1234567"))) {
            System.out.println("Login valido");
            // fazer o resto
        } else {
            System.out.println("Login invalido");
        }
    }

    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        CadastroProdutor cadastroP = new CadastroProdutor();
        CadastroCooperativa cadastroC = new CadastroCooperativa();
        Login loginGeral = new Login();
        Produtor produtor = new Produtor();
        Cooperativa cooperativa = new Cooperativa();
        Demanda demanda = new Demanda();
        List<Demanda> listaDemanda = new ArrayList<>();

        int opcao = 0;
        do {
            // System.out.flush();
            System.out.print("##--         Menu        --##\n\n");
            System.out.print("|-------------------------------|\n");
            System.out.print("| Opção 1 - Cadastro Produtor   |\n");
            System.out.print("| Opção 2 - Cadastro Cooperativa|\n");
            System.out.print("| Opção 3 - Login    Responsavel|\n");
            System.out.print("| Opção 4 - Login    Produtor   |\n");
            System.out.print("| Opção 5 - Login    Cooperativa|\n");
            System.out.print("| Opção 6 - Sair                |\n");
            System.out.print("|-------------------------------|\n");
            System.out.print("Digite uma opção: ");
            opcao = menu.nextInt();

            switch (opcao) {
            case 1:
                RealizarCadastroProdutor(cadastroP, menu);
                ImprimirProdutor(cadastroP);

                System.out.print("\nCadastro realizado com sucesso\n");
                break;

            case 2:

                RealizarCadastroCooperativa(cadastroC, menu);
                ImprimirCooperativa(cadastroC);
                System.out.print("\nCadastro realizado com sucesso\n");

                break;
            case 3:// mudar
                System.out.print("Nome responsavel: ");
                Scanner nomeResponsavel = new Scanner(System.in);
                String nResponsavel = nomeResponsavel.nextLine();
                System.out.print("Senha: ");
                Scanner senhaResponsavel = new Scanner(System.in);
                String sResponsavel = senhaResponsavel.nextLine();
                LoginResponsavel loginR = new LoginResponsavel(nResponsavel, sResponsavel);
                System.out.print("\nLogin realizado com sucesso\n");
                ImprimirResposavel(loginR);
                break;

            case 4:
                // LoginProdutor
                RealizarLoginProdutor(cadastroP, menu, loginGeral);
                break;
            case 5:
                // LoginCooperativa
                RealizarLoginCooperativa(cadastroC, menu, loginGeral);

                System.out.println("Informe demanda: ");
                Scanner nomeDemanda = new Scanner(System.in);
                String dem = nomeDemanda.nextLine();
                demanda.setDemanda(dem);

                System.out.println("Quantidade demanda: ");
                Scanner quantidadeDemanda = new Scanner(System.in);
                String qDem = quantidadeDemanda.nextLine();
                demanda.setQdemanda(qDem);

                listaDemanda.add(demanda);
                for (Demanda demanda2 : listaDemanda) {
                    System.out.println("Demanda: " + demanda2.getDemanda());
                }

                break;
            case 6:
                menu.close();
                break;
            default:
                System.out.print("\nOpção Inválida!");
                break;
            }
        } while (opcao != 4);
    }
}
