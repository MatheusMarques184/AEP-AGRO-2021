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
        if(bairro == null) {
            throw new RuntimeException("Bairro não pode ser nulo");
        }
        this.bairro = bairro;
    }
    public void setCep(String cep) {
        if(cep == null || cep.length() != 8) {
            throw new RuntimeException("CEP não pode ner nulo");
        }
        this.cep = cep;
    }
    public void setNumeroResidencia(String numeroResidencia) {
        if(numeroResidencia == null) {
            throw new RuntimeException("Numero da residêcia não pode ser nula");
        }
        this.numeroResidencia = numeroResidencia;
    }
    public void setRua(String rua) {
        if(rua == null) {
            throw new RuntimeException("Rua não pode ser nula");
        }
        this.rua = rua;
    }
    
}
