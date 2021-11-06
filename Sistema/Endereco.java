package Sistema;

public class Endereco {
    private String cep;
    private String rua;
    private String bairro;
    private String numeroResidencia;


    public String getBairro() {
        return bairro;
    }
    public String getCep() {
        return cep;
    }
    public String getNumeroResidencia() {
        return numeroResidencia;
    }
    public String getRua() {
        return rua;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setNumeroResidencia(String numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    
}
