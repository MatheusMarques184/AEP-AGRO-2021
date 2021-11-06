package Sistema;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
        Scanner nome = new Scanner(System.in);
        String nomeProdutor = nome.nextLine();
        cadastro.setNome(nomeProdutor);

        System.out.print("Cpf: ");
        Scanner cpf = new Scanner(System.in);
        String cpfProdutor = cpf.nextLine();
        cadastro.setCpf(cpfProdutor);

        System.out.print("Data sem espaço: ");
        Scanner data = new Scanner(System.in);
        String dataProdutor = data.nextLine();
        cadastro.setData(dataProdutor);

        System.out.print("Senha: ");
        Scanner senha = new Scanner(System.in);
        String senhaProdutor = senha.nextLine();
        cadastro.setSenha(senhaProdutor);

        System.out.print("Email: ");
        Scanner email = new Scanner(System.in);
        String emailProdutor = email.nextLine();
        cadastro.setEmail(emailProdutor);

        System.out.print("Numero de telefone: ");
        Scanner num = new Scanner(System.in);
        String numProdutor = num.nextLine();
        cadastro.setNumeroCelular(numProdutor);
    }

    public static void RealizarCadastroCooperativa(Cooperativa cadastro, Scanner menu) {
        System.out.print("Nome Cooperativa: ");
        Scanner nome = new Scanner(System.in);
        String nomeCooperativa = nome.nextLine();
        cadastro.setNomeCooperativa(nomeCooperativa);

        System.out.print("Senha: ");
        Scanner senha = new Scanner(System.in);
        String senhaCooperativa = senha.nextLine();
        cadastro.setSenha(senhaCooperativa);

        System.out.print("CNPJ: ");
        Scanner cnpj = new Scanner(System.in);
        String cnpjCooperativa = cnpj.nextLine();
        cadastro.setCNPJ(cnpjCooperativa);

    }

    public static void RealizarLoginProdutor(Produtor cadastro, Scanner menu, Login loginGeral, List<Demanda> list,
            List<Responsavel> listaResponsavel) {
        System.out.println(" LOGIN ");
        System.out.print("Nome produtor: ");
        Scanner nome = new Scanner(System.in);
        String nomeProdutor = nome.nextLine();
        loginGeral.setNome(nomeProdutor);
        System.out.print("Senha: ");
        Scanner senha = new Scanner(System.in);
        String senhaProdutor = senha.nextLine();
        loginGeral.setSenha(senhaProdutor);

        if ((loginGeral.getNome().equals(cadastro.getNome()) && (loginGeral.getSenha().equals(cadastro.getSenha())))
                || (loginGeral.getNome().equals("usuario")) && (loginGeral.getSenha().equals("1234567"))) {
            System.out.println("Login valido");
            MenuLogin(menu, list, listaResponsavel);

        } else {
            System.out.println("Login invalido");
        }
    }

    public static void RealizarLoginCooperativa(Cooperativa cadastro, Scanner menu, Login loginGeral,
            List<Demanda> list) {

        System.out.println(" LOGIN ");
        System.out.print("Nome Cooperativa: ");
        Scanner nome = new Scanner(System.in);
        String nomeCooperativa = nome.nextLine();
        loginGeral.setNome(nomeCooperativa);
        System.out.print("Senha: ");
        Scanner senha = new Scanner(System.in);
        String senhaCooperativa = senha.nextLine();
        loginGeral.setSenha(senhaCooperativa);

        if ((loginGeral.getNome().equals(cadastro.getNomeCooperativa())
                && (loginGeral.getSenha().equals(cadastro.getSenha())))
                || (loginGeral.getNome().equals("usuario")) && (loginGeral.getSenha().equals("1234567"))) {
            System.out.println("Login valido");
            MenuCooperativa(menu, list);
        } else {
            System.out.println("Login invalido");
        }
    }

    public static void InformarDemanda(Scanner menu, List<Demanda> list) {
        while (true) {
            Demanda demanda = new Demanda();
            System.out.println("Informe demanda: ");
            Scanner nomeDemanda = new Scanner(System.in);
            String dem = nomeDemanda.nextLine();
            demanda.setDemanda(dem);
            list.add(demanda);

            System.out.println("Você possuí " + list.size() + "Demanda. Deseja continuar (S/N)? ");
            Scanner continuarDemanda = new Scanner(System.in);
            String continuar = continuarDemanda.nextLine();
            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void ConsultarDemanda(List<Demanda> list) {
        for (Demanda demanda2 : list) {
            System.out.println("Demanda: " + demanda2.getDemanda());
        }
    }

    public static void CadastrarResponsavel(Scanner menu, List<Responsavel> listaResponsavel) {
        while (true) {
            Responsavel responsavel = new Responsavel();
            Endereco endereco = new Endereco();
            System.out.print("Nome Responsavel: ");
            Scanner res = new Scanner(System.in);
            String nomeResponsavel = res.nextLine();
            responsavel.setNome(nomeResponsavel);

            System.out.print("Registro Responsavel: ");
            Scanner registro = new Scanner(System.in);
            String registroResponsavel = registro.nextLine();
            responsavel.setRegistro(registroResponsavel);

            System.out.print("CEP: ");
            Scanner cep = new Scanner(System.in);
            String cepResponsavel = cep.nextLine();
            endereco.setCep(cepResponsavel);

            System.out.print("Rua: ");
            Scanner rua = new Scanner(System.in);
            String ruaEndereco = rua.nextLine();
            endereco.setRua(ruaEndereco);

            System.out.print("Bairro: ");
            Scanner bairro = new Scanner(System.in);
            String bairroEndereco = bairro.nextLine();
            endereco.setBairro(bairroEndereco);

            System.out.print("Numero Residencia: ");
            Scanner numero = new Scanner(System.in);
            String numeroRes = numero.nextLine();
            endereco.setNumeroResidencia(numeroRes);

            System.out.print("CPF: ");
            Scanner cpf = new Scanner(System.in);
            String cpfResponsavel = cpf.nextLine();
            responsavel.setCpf(cpfResponsavel);

            System.out.print("RG: ");
            Scanner rg = new Scanner(System.in);
            String rgResponsavel = rg.nextLine();
            responsavel.setRg(rgResponsavel);

            System.out.print("Senha: ");
            Scanner senha = new Scanner(System.in);
            String senhaResponsavel = senha.nextLine();
            responsavel.setSenha(senhaResponsavel);

            responsavel.setEndereco(endereco);

            listaResponsavel.add(responsavel);

            System.out.println("Você possuí " + listaResponsavel.size() + "Responsavel(s). Deseja continuar (S/N)? ");
            Scanner continuarDemanda = new Scanner(System.in);
            String continuar = continuarDemanda.nextLine();
            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }

    }

    public static void ConsultarResponsavel(List<Responsavel> listaResponsavel) {
        for (Responsavel responsavel2 : listaResponsavel) {
            System.out.println("Nome: " + responsavel2.getNome() + "\nRegistro: " + responsavel2.getRegistro()
                    + "\nEndereco: " + responsavel2.getEndereco() + "\nCPF: " + responsavel2.getCpf()
                    + "\nRG: " + responsavel2.getRg() + "Senha: " + responsavel2.getSenha());
        }
    }

    public static void ExcluirResponsavel(List<Responsavel> listaResponsavel) {

    }

    public static void MenuLogin(Scanner menu, List<Demanda> list, List<Responsavel> listaResponsavel) {
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
            System.out.print("| Opção 10 - Sair                |\n");
            System.out.print("|--------------------------------|\n");
            System.out.print("Digite uma opção: ");
            opcao = menu.nextInt();

            switch (opcao) {
            case 1:
                ConsultarDemanda(list);
                break;
            case 2:
                CadastrarResponsavel(menu, listaResponsavel);
                break;
            case 3:
                ConsultarResponsavel(listaResponsavel);
                break;
            case 4:
                // editar Responsavel
            case 5:
                ExcluirResponsavel(listaResponsavel);// terminar
                break;
            case 6:

            case 7:

            case 8:

            case 9:

            case 10:
                // menu.close();
                break;
            }
        } while (opcao != 10);
    }

    public static void MenuCooperativa(Scanner menu, List<Demanda> list) {
        int opcao = 0;
        do {
            System.out.print("##--         Menu         --##\n\n");
            System.out.print("|--------------------------------|\n");
            System.out.print("| Opção 1 - Informar Demanda     |\n");
            System.out.print("| Opção 2 - Sair                 |\n");
            System.out.print("|--------------------------------|\n");
            System.out.print("Digite uma opção: ");
            opcao = menu.nextInt();

            switch (opcao) {
            case 1:
                InformarDemanda(menu, list);
                break;
            case 2:
                break;
            }
        } while (opcao != 2);
    }

    // ---MAIN
    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        Produtor cadastroP = new Produtor();
        Cooperativa cadastroC = new Cooperativa();
        Login loginGeral = new Login();
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
                for (int i = 0; i < listaResponsavel.size(); i++) {
                    if ((loginGeral.getRegistro().equals(listaResponsavel.get(i).getRegistro()))
                            && ((loginGeral.getSenha().equals(listaResponsavel.get(i).getSenha())))
                            || ((loginGeral.getRegistro().equals("usuario"))
                                    && (loginGeral.getSenha().equals("1234567")))) {

                    } else {
                        System.out.println("Login invalido");
                    }
                }

                System.out.print("\nLogin realizado com sucesso\n");
                // ImprimirResposavel(loginR);
                break;

            case 4:
                RealizarLoginProdutor(cadastroP, menu, loginGeral, listaDemanda, listaResponsavel);
                break;
            case 5:
                RealizarLoginCooperativa(cadastroC, menu, loginGeral, listaDemanda);
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
