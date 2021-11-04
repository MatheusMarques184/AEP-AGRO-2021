package Sistema;

public class Produtor {
    private String nome;
    private String cpf;
    private String senha;
    private String data;
    private String email;
    private String numeroCelular;

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getData() {

        return data.substring(0, 2) + "/" + data.substring(2, 4) + "/" + data.substring(4);
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public void setCpf(String cpf) {
        if (cpf.length() != 11) {
            throw new RuntimeException("CPF esta incorreto");
        }
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new RuntimeException("Nome não pode ser nulo!");
        }
        this.nome = nome;
    }

    public void setNumeroCelular(String numeroCelular) {
        if (numeroCelular.length() != 11) {
            throw new RuntimeException("Numero de celular esta incorreto");
        }

        this.numeroCelular = numeroCelular;
    }

    public void setData(String data) {
        if (data == null) {
            throw new RuntimeException("Data não existe");
        }
        this.data = data;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.length() < 6) {
            throw new RuntimeException("Senha invalida");
        }
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
