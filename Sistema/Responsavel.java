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

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.length() < 6) {
            throw new RuntimeException("Senha invalida");
        }
        this.senha = senha;
    }

}
