package Sistema;

public class Lote {
    private int idLote;
    private Cultura cultura;
    private String hectare;
    private String registroResponsavel;
    private String cnpjCooperativa;

    public Cultura getCultura() {
        return cultura;
    }
    public int getIdLote() {
        return idLote;
    }
    public String getCnpjCooperativa() {
        return cnpjCooperativa;
    }
    public String getHectare() {
        return hectare;
    }
    public String getRegistroResponsavel() {
        return registroResponsavel;
    }
    public void setCultura(Cultura cultura) {
        this.cultura = cultura;
    }
    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }
    public void setCnpjCooperativa(String cnpjCooperativa) {
        this.cnpjCooperativa = cnpjCooperativa;
    }
    public void setHectare(String hectare) {
        this.hectare = hectare;
    }
    public void setRegistroResponsavel(String registroResponsavel) {
        this.registroResponsavel = registroResponsavel;
    }
    
}
