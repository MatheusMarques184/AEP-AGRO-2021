package Sistema;

public class Lote {
    private int idLote;
    private Cultura cultura;
    private String hectare;
    private String registroResponsavel;

    public Cultura getCultura() {
        return cultura;
    }
    public int getIdLote() {
        return idLote;
    }
    public String getHectare() {
        return hectare;
    }
    public String getRegistroResponsavel() {
        return registroResponsavel;
    }
    public void setCultura(Cultura cultura) {
        if(cultura == null) {
            throw new RuntimeException("Cultura não pode ser nula");
        }
        this.cultura = cultura;
    }
    public void setIdLote(int idLote) {

        this.idLote = idLote;
    }
    public void setHectare(String hectare) {
        if(hectare == null) {
            throw new RuntimeException("não pode ser nulo");
        }
        this.hectare = hectare;
    }
    public void setRegistroResponsavel(String registroResponsavel) {
        if(registroResponsavel == null) {
            throw new RuntimeException("Registro não pode ser nulo");
        }
        this.registroResponsavel = registroResponsavel;
    }

    public double calcularAduboAplicadoPorLinha() {
       double qAplicadaPorMetroDeLInha =  (cultura.getEspacamentoSulgo() * cultura.getAdubo().getQuantidadeAduboPorHectar()) / 10.0;
       return qAplicadaPorMetroDeLInha;
    }
    
}
