package Sistema;

public class Cooperativa {
    private String NomeCooperativa;
    private String CNPJ;
    private String senha; // 6

    public Cooperativa(String NomeCoopertiva, String senhaString, String CNPJ) {
        this.setNomeCooperativa(NomeCoopertiva);
        this.setCNPJ(CNPJ);
        this.setSenha(senhaString);

    }

    public String getNomeCooperativa() {
        return NomeCooperativa;
    }

    public String getCNPJ() {
        return CNPJ;
    }


    public String getSenha() {
        return senha;
    }

    // --------------------------
    public void setNomeCooperativa(String nomeCooperativa) {
        if (nomeCooperativa == null) {
            throw new RuntimeException("Nome da coopertiva não pode ser nulo");
        }
        NomeCooperativa = nomeCooperativa;
    }

    public void setCNPJ(String CNPJ) {
       
        if (CNPJ.length() != 14) {
            throw new RuntimeException("CNPJ Invalido");
        }

        this.CNPJ = CNPJ;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.length() < 6) {
            throw new RuntimeException("Senha invalida");
        }
        this.senha = senha;
    }
    

}
