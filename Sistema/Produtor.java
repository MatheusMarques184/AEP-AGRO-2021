package Sistema;

public class Produtor {
    private String registroResponsavel;
    private String nome;
    private int cpf;
    private int rg;
    private String endereco;
    private int numeroCelular;

    public Produtor(String registroResponsavel, String nome, int cpf, int rg, String endereco, int numeroCelular) {
        this.setRegistroResponsavel(registroResponsavel);
        this.setCpf(cpf);
        this.setNome(nome);
        this.setRg(rg);
        this.setEndereco(endereco);
        this.setNumeroCelular(numeroCelular);

    }

    public int getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public String getRegistroResponsavel() {
        return registroResponsavel;
    }

    public int getRg() {
        return rg;
    }

    public void setCpf(int cpf) {
        String s = Integer.toString(cpf);
        if (s.length() != 10) {// ? 11
            throw new RuntimeException("CPF esta incorreto");
        }
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        if (endereco == null) {
            throw new RuntimeException("Endereço não pode ser nulo");
        }
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new RuntimeException("Nome não pode ser nulo!");
        }
        this.nome = nome;
    }

    public void setNumeroCelular(int numeroCelular) {
        String s = Integer.toString(numeroCelular);
        if (s.length() != 9) {
            throw new RuntimeException("Numero de celular esta incorreto");
        }

        this.numeroCelular = numeroCelular;
    }

    public void setRegistroResponsavel(String registroResponsavel) {
        if (registroResponsavel == null) {
            throw new RuntimeException("Registro não pode ser nulo");
        }
        this.registroResponsavel = registroResponsavel;
    }

    public void setRg(int rg) {
        String s = Integer.toString(rg);
        if (s.length() != 8) {
            throw new RuntimeException("RG esta incorreto");
        }
        this.rg = rg;
    }

}
