package Sistema;

public class Demanda {
    private String demanda;
    private String qDemanda;

    public String getDemanda() {
        return demanda;
    }

    public String getqDemanda() {
        return qDemanda;
    }

    public void setDemanda(String demanda) {
        if (demanda == null) {
            throw new RuntimeException("Demanda não pode ser vazia!");
        }
        this.demanda = demanda;
    }

    public void setqDemanda(String qDemanda) {
        if(qDemanda == null) {
            throw new RuntimeException("Quantidade não pode ser nula");
        }
        this.qDemanda = qDemanda;
    }

}
