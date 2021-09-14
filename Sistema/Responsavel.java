package Sistema;

public class Responsavel {
    private String Registro;
    private String Senha;

    public Responsavel(String registro, String senha){
        this.setSenha(senha);
        this.setRegistro(registro);
    }

    public String getRegistro() {
        return Registro;
    }
    public String getSenha() {
        return Senha;
    }
    public void setRegistro(String registro) {
        Registro = registro;
    }
    public void setSenha(String senha) {
        if (senha == null || senha.length() < 6) {
            throw new RuntimeException("Senha invalida");
        }
        Senha = senha;
    }

    
}
