package Sistema;

import java.util.ArrayList;
import java.util.List;
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

    /*
     * public static void ImprimirResposavel(LoginResponsavel r) {
     * System.out.println("\nRegistro Responsavel: " + r.getRegistro()); }
     */

    // ----------------------------------------------------------------------------------
    public static void RealizarCadastroProdutor(Produtor cadastro, Scanner menu) {
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

    public static void RealizarCadastroCooperativa(Cooperativa cadastro, Scanner menu) {
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

    public static void RealizarLoginProdutor(Produtor cadastro, Scanner menu, Login loginGeral, List<Demanda> list) {
        System.out.println(" LOGIN ");
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
            MenuLogin(menu, list);

        } else {
            System.out.println("Login invalido");
        }
    }

    public static void RealizarLoginCooperativa(Cooperativa cadastro, Scanner menu, Login loginGeral, Demanda demanda,
            List<Demanda> list) {

        System.out.println(" LOGIN ");
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
            MenuCooperativa(demanda, menu, list);
        } else {
            System.out.println("Login invalido");
        }
    }

    public static void InformarDemanda(Demanda demanda, Scanner menu, List<Demanda> list) {
        // Fazer Loop para poder colocar mais de uma demanda
        System.out.println("Informe demanda: ");
        Scanner nomeDemanda = new Scanner(System.in);
        String dem = nomeDemanda.nextLine();

        demanda.setDemanda(dem);
        System.out.println("Quantidade demanda: ");
        Scanner quantidadeDemanda = new Scanner(System.in);
        String qDem = quantidadeDemanda.nextLine();
        demanda.setQdemanda(qDem);
        list.add(demanda);
        System.out.println("foi");
    }

    public static void ConsultarDemanda(List<Demanda> list) {
        for (Demanda demanda2 : list) {
            System.out.println("Demanda: " + demanda2.getDemanda() + "\nQuantidade Demanda: " + demanda2.getQdemanda());
        }
    }

    public static void MenuLogin(Scanner menu, List<Demanda> list) {
        int opcao = 0;
        do {
            System.out.print("##--         Menu         --##\n\n");
            System.out.print("|--------------------------------|\n");
            System.out.print("| Opção 1 - Consultar Demanda    |\n");
            System.out.print("| Opção 2 - Criar     Responsavel|\n");
            System.out.print("| Opção 3 - Consultar Responsavel|\n");
            System.out.print("| Opção 4 - Editar    Responsavel|\n");
            System.out.print("| Opção 5 - Excluir   Responsavel|\n");
            System.out.print("| Opção 6 - Criar     Lote       |\n");
            System.out.print("| Opção 7 - Consultar Lote       |\n");
            System.out.print("| Opção 8 - Editar    Lote       |\n");
            System.out.print("| Opção 9 - Excluir   Lote       |\n");
            System.out.print("| Opção 10 - Sair                 |\n");
            System.out.print("|--------------------------------|\n");
            System.out.print("Digite uma opção: ");
            opcao = menu.nextInt();

            switch (opcao) {
            case 1:
                ConsultarDemanda(list);
                break;
            case 2:

            case 3:

            case 4:

            case 5:

            case 6:
                
            case 7:

            case 8:

            case 9:

            case 10:
            //menu.close();
            break;
            }
        } while (opcao != 6);
    }

    public static void MenuCooperativa(Demanda demanda,Scanner menu, List<Demanda> list) {
        int opcao = 0;
        do {
            System.out.print("##--         Menu         --##\n\n");
            System.out.print("|--------------------------------|\n");
            System.out.print("| Opção 1 - informar Demanda    |\n");
            System.out.print("| Opção 2 - Sair                 |\n");
            System.out.print("|--------------------------------|\n");
            System.out.print("Digite uma opção: ");
            opcao = menu.nextInt();

            switch (opcao) {
            case 1:
                InformarDemanda(demanda, menu, list);
                break;
            case 2:
            
            }
        }while(opcao != 2);
    }

    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        Produtor cadastroP = new Produtor();
        Cooperativa cadastroC = new Cooperativa();
        Responsavel responsavel = new Responsavel();
        Login loginGeral = new Login();
        Demanda demanda = new Demanda();
        List<Demanda> listaDemanda = new ArrayList<>();
        List<Responsavel> listaResponsavel = new ArrayList<>();

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
            case 3:
                System.out.print("Registro responsavel: ");
                Scanner registroResponsavel = new Scanner(System.in);
                String rResponsavel = registroResponsavel.nextLine();
                loginGeral.setRegistro(rResponsavel);

                System.out.print("Senha: ");
                Scanner senhaResponsavel = new Scanner(System.in);
                String sResponsavel = senhaResponsavel.nextLine();
                loginGeral.setSenha(sResponsavel);

                System.out.print("\nLogin realizado com sucesso\n");
                // ImprimirResposavel(loginR);
                break;

            case 4:
                RealizarLoginProdutor(cadastroP, menu, loginGeral, listaDemanda);
                break;
            case 5:
                RealizarLoginCooperativa(cadastroC, menu, loginGeral, demanda, listaDemanda);
                break;
            case 6:
                menu.close();
                break;
            default:
                System.out.print("\nOpção Inválida!");
                break;
            }
        } while (opcao != 6);
    }

}
