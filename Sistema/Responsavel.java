package Sistema;

public class Responsavel {
    private String registro;
    private String nome;
    private Endereco endereco;
    private String cpf;
    private String rg;
    private String senha;

    public String getRegistro() {
        return registro;
    }

    public String getSenha() {
        return senha;
    }
    
    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRegistro(String registro) {
        if (registro == null) {
            throw new RuntimeException("Registro não pode ser nulo");
        }
        this.registro = registro;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.length() < 6) {
            throw new RuntimeException("Senha invalida");
        }
        this.senha = senha;
    }

    public void setCpf(String cpf) {
        if (cpf.length() != 11) {
            throw new RuntimeException("CPF esta incorreto");
        }
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new RuntimeException("Endereço não pode ser nulo");
        }
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new RuntimeException("Nome não pode ser nulo");
        }
        this.nome = nome;
    }

    public void setRg(String rg) { // checar
        if (rg.length() != 7) {
            throw new RuntimeException("RG invalido");
        }
        this.rg = rg;
    }
}
