package Sistema;

public class Login {
    String nome;
    String senha;
    String registro;
    
    public String getNome() {
        return nome;
    }
    public String getRegistro() {
        return registro;
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
        if(nome == null) {
            throw new RuntimeException("Nome não pode ser nulo");
        }
        this.nome = nome;
    }
    public void setRegistro(String registro) {
        if(registro == null) {
            throw new  RuntimeException("Registro não pode ser nulo");
        }
        this.registro = registro;
    }


}
