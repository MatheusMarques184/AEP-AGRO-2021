package Sistema;

public class Login {
    String nome;
    String senha;
    
    public String getNome() {
        return nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        if (senha == null || senha.length() < 6) {
            throw new RuntimeException("Senha invalida");
        }
        this.senha=senha;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


}
