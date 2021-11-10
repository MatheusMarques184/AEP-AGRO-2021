package Sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void RealizarCadastroProdutor(Produtor cadastro, Scanner menu) {
        System.out.print("Nome produtor: ");
        Scanner nome = new Scanner(System.in);
        String nomeProdutor = nome.nextLine();
        cadastro.setNome(nomeProdutor);

        System.out.print("Cpf: "); // int
        Scanner cpf = new Scanner(System.in);
        String cpfProdutor = cpf.nextLine();
        cadastro.setCpf(cpfProdutor);

        System.out.print("Data sem espaço: ");
        Scanner data = new Scanner(System.in);
        String dataProdutor = data.nextLine();
        cadastro.setData(dataProdutor);

        System.out.print("Senha: "); // int
        Scanner senha = new Scanner(System.in);
        String senhaProdutor = senha.nextLine();
        cadastro.setSenha(senhaProdutor);

        System.out.print("Email: ");
        Scanner email = new Scanner(System.in);
        String emailProdutor = email.nextLine();
        cadastro.setEmail(emailProdutor);

        System.out.print("Numero de telefone: "); // int
        Scanner num = new Scanner(System.in);
        String numProdutor = num.nextLine();
        cadastro.setNumeroCelular(numProdutor);

        System.out.print("\nCadastro realizado com sucesso\n");
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
        // int cnpjCooperativaInteiro = Integer.parseInt(cnpjCooperativa);
        cadastro.setCNPJ(cnpjCooperativa);

        System.out.print("\nCadastro realizado com sucesso\n");

    }

    public static void RealizarLoginResponsavel(Login loginGeral, List<Responsavel> listaResponsavel) {
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
                    || ((loginGeral.getRegistro().equals("usuario")) && (loginGeral.getSenha().equals("1234567")))) {

            } else {
                System.out.println("Login invalido");
            }
        }

        System.out.print("\nLogin realizado com sucesso\n");
    }

    public static void RealizarLoginProdutor(Produtor cadastro, Scanner menu, Login loginGeral, List<Demanda> list,
            List<Responsavel> listaResponsavel, List<Lote> listaLote) {
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
            MenuLogin(menu, list, listaResponsavel, listaLote);

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

            System.out.println("Informe quantidade: ");
            Scanner quantidade = new Scanner(System.in);
            String qDemanda = quantidade.nextLine();
            demanda.setqDemanda(qDemanda);

            list.add(demanda);

            System.out.println("Você possuí " + list.size() + " Demanda. Deseja continuar (S/N)? ");
            Scanner continuarDemanda = new Scanner(System.in);
            String continuar = continuarDemanda.nextLine();
            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void ConsultarDemanda(List<Demanda> list) {
        for (Demanda demanda2 : list) {
            System.out.println("Demanda: " + demanda2.getDemanda() + "\nQuantidade: " + demanda2.getqDemanda());
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
                    + "\nCep: " + responsavel2.getEndereco().getCep() + "\nNumero Residencia: "
                    + responsavel2.getEndereco().getNumeroResidencia() + "\nBairro: "
                    + responsavel2.getEndereco().getBairro() + "\nRua: " + responsavel2.getEndereco().getRua()
                    + "\nCPF: " + responsavel2.getCpf() + "\nRG: " + responsavel2.getRg() + "\nSenha: "
                    + responsavel2.getSenha());
        }

    }

    public static void EditarResponsavel(List<Responsavel> listaResponsavel) {
        System.out.println("Nada aqui");
    }

    public static void ExcluirResponsavel(List<Responsavel> listaResponsavel, Scanner menu) {
        for (Responsavel responsavel : listaResponsavel) {
            System.out.println("\nResponsaveis: " + responsavel.getNome());
        }

        for (int i = 0; i < listaResponsavel.size(); i++) {
            System.out.print("Nome: ");
            Scanner nome = new Scanner(System.in);
            String nomeRes = nome.nextLine();
            Responsavel r = listaResponsavel.get(i);
            if (r.getNome().equals(nomeRes)) {
                listaResponsavel.remove(r);
                break;
            }
        }
        System.out.println("Removido");

    }

    private static void CadastrarLote(List<Lote> listaLote) {
        while (true) {
            Lote lote = new Lote();
            Cultura cultura = new Cultura();
            Adubo adubo = new Adubo();
            Agrotoxico agrotoxico = new Agrotoxico();

            Random random = new Random();
            int numero = random.nextInt() * 100;

            System.out.println("Id Lote: " + numero);
            lote.setIdLote(numero);

            // lote
            System.out.print("Resgistro de Responsavel pelo Lote: ");
            Scanner registro = new Scanner(System.in);
            String resgistroResponsavel = registro.nextLine();
            lote.setRegistroResponsavel(resgistroResponsavel);

            System.out.print("Tamanho do lote em hectar: ");
            Scanner hectar = new Scanner(System.in);
            String hectarLote = hectar.nextLine();
            lote.setHectare(hectarLote);

            // cultura
            System.out.print("Tipo Cultura: "); // milho
            Scanner tipo = new Scanner(System.in);
            String tipoCultura = tipo.nextLine();
            cultura.setTipoCultura(tipoCultura);

            System.out.print("Ciclo de plantio em meses: "); // 3 meses ou dias
            Scanner ciclo = new Scanner(System.in);
            String cicloCultura = ciclo.nextLine();
            cultura.setCicloPlantio(cicloCultura);

            System.out.print("Tempo de descanso do solo: ");
            Scanner descanso = new Scanner(System.in);
            String descansoSolo = descanso.nextLine();
            cultura.setDescansoPosPlantio(descansoSolo);

            System.out.print("Espaçamento dos sulgos em metros: ");
            Scanner espacamento = new Scanner(System.in);
            String espacamentoSulgo = espacamento.nextLine();
            double espacamentoSulgoInteiro = Double.parseDouble(espacamentoSulgo);
            cultura.setEspacamentoSulgo(espacamentoSulgoInteiro);

            // adubo
            System.out.print("Marca do Adubo: ");
            Scanner marca = new Scanner(System.in);
            String marcaAdubo = marca.nextLine();
            adubo.setMarcaAdubo(marcaAdubo);

            System.out.print("Tipo do Adubo: ");
            Scanner tipoA = new Scanner(System.in);
            String tipoAdubo = tipoA.nextLine();
            adubo.setTipoAdubo(tipoAdubo);

            System.out.print("Duração do Adubo: ");
            Scanner duracao = new Scanner(System.in);
            String duracaoAdubo = duracao.nextLine();
            adubo.setDuracaoAdubo(duracaoAdubo);

            System.out.print("Quantidade de Adubo por Hectar: ");
            Scanner quantAdubo = new Scanner(System.in);
            String quantAduboHectar = quantAdubo.nextLine();
            double quantAduboHectarInteiro = Double.parseDouble(quantAduboHectar);
            adubo.setQuantidadeAduboPorHectar(quantAduboHectarInteiro);

            System.out.print("Tipo do agrotoxico: ");
            Scanner tipoAgro = new Scanner(System.in);
            String tipoAgrotoxico = tipoAgro.nextLine();
            agrotoxico.setTipoAgrotoxico(tipoAgrotoxico);

            System.out.print("Vazão do pulverisador em L/min: ");
            Scanner vazao = new Scanner(System.in);
            String vazaoPulverizador = vazao.nextLine();
            double vazaoPulverizadorReal = Double.parseDouble(vazaoPulverizador);
            agrotoxico.setVazaoPulverizador(vazaoPulverizadorReal);

            System.out.print("Tempo para pulverisar em min/ha: ");
            Scanner tempoPulverizar = new Scanner(System.in);
            String tempoPulverizarString = tempoPulverizar.nextLine();
            double tempoParaPulverizar = Double.parseDouble(tempoPulverizarString);
            agrotoxico.setTempoParaPulverizar(tempoParaPulverizar);

            cultura.setAgrotoxico(agrotoxico);
            cultura.setAdubo(adubo);
            lote.setCultura(cultura);
            listaLote.add(lote);

            System.out.println("Você possuí " + listaLote.size() + "Lote(s). Deseja continuar (S/N)? ");
            Scanner continuarDemanda = new Scanner(System.in);
            String continuar = continuarDemanda.nextLine();
            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }

    }

    // antes plantar semente tem que adubar
    /*
     * Volume de calda gasto será obtido multiplicando-se a vazão do pulverizador
     * (15,38 litros/min) pelo tempo que se gasta para a pulverização (9,52 min/ha).
     * Volume consumido/ha = 15,38x9,52 = 146,46 litros/ha.
     */
    public static void ConsultarLote(List<Lote> listaLote) { // fazer gerenciamento do adubo junto ao ciclo de plantio e
                                                             // o tamanho da plantação -> preguiça
        for (Lote lote : listaLote) {
            System.out.println("Id-Lote: " + lote.getIdLote() + "\nRegistro responsavel por Lote: "
                    + lote.getRegistroResponsavel() + "\nTamanho do Lote em hectar: " + lote.getHectare()
                    + "\nCultura: " + lote.getCultura().getTipoCultura() + "\nCiclo plantio: "
                    + lote.getCultura().getCicloPlantio() + "\nTempo de descanso do solo pos plantio: "
                    + lote.getCultura().getDescansoPosPlantio() + "\nMarca adubo utilizado: "
                    + lote.getCultura().getAdubo().getMarcaAdubo() + "\nTipo adubo: "
                    + lote.getCultura().getAdubo().getTipoAdubo() + "\nDuração adubo: "
                    + lote.getCultura().getAdubo().getDuracaoAdubo() + "\nTipo Agrotoxico: "
                    + lote.getCultura().getAgrotoxico().getTipoAgrotoxico() + "\nVazão do pulverisador em L/min: "
                    + lote.getCultura().getAgrotoxico().getVazaoPulverizador() + "\nTempo para pulverisar em min/ha: "
                    + lote.getCultura().getAgrotoxico().getTempoParaPulverizar());
            System.out.println(" Quantidade de adubo aplicado por linha: " + lote.calcularAduboAplicadoPorLinha());
            System.out.println("Dosagem do agrotoxico por hectar: "
                    + lote.getCultura().getAgrotoxico().CalculaVolumeDosagemAgrotoxico());
        }

    }

    public static void EditarLote(List<Lote> listaLote) {

    }

    public static void ExcluirLote(List<Lote> listaLote) {
        for (Lote lote : listaLote) {
            System.out.println("Id-Lote: " + lote.getIdLote() + "\n");
        }
        for (int i = 0; i < listaLote.size(); i++) {
            System.out.print("Id-Lote: ");
            Scanner id = new Scanner(System.in);
            String idLote = id.nextLine();
            int idLoteInteiro = Integer.parseInt(idLote);
            Lote l = listaLote.get(i);
            if (l.getIdLote() == idLoteInteiro) {
                listaLote.remove(l);
                break;
            }
        }
        System.out.println("Removido");
    }

    public static void MenuLogin(Scanner menu, List<Demanda> list, List<Responsavel> listaResponsavel,
            List<Lote> listaLote) {
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
                EditarResponsavel(listaResponsavel);
            case 5:
                ExcluirResponsavel(listaResponsavel, menu);
                break;
            case 6:
                CadastrarLote(listaLote);
                break;
            case 7:
                ConsultarLote(listaLote);
                break;
            case 8:
                EditarLote(listaLote);
            case 9:
                ExcluirLote(listaLote);
                break;
            case 10:
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
        List<Lote> listaLote = new ArrayList<>();

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
                break;

            case 2:
                RealizarCadastroCooperativa(cadastroC, menu);
                break;
            case 3:
                RealizarLoginResponsavel(loginGeral, listaResponsavel);
                break;

            case 4:
                RealizarLoginProdutor(cadastroP, menu, loginGeral, listaDemanda, listaResponsavel, listaLote);
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
