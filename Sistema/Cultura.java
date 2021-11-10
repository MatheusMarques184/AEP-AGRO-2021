package Sistema;

public class Cultura {
    private String tipoCultura;
    private String cicloPlantio;
    private Adubo adubo;
    private int espacamentoSulgo;
    private String descansoPosPlantio;

    public Adubo getAdubo() {
        return adubo;
    }
    public String getCicloPlantio() {
        return cicloPlantio;
    }
    public String getTipoCultura() {
        return tipoCultura;
    }
    public String getDescansoPosPlantio() {
        return descansoPosPlantio;
    }
    public int getEspacamentoSulgo() {
        return espacamentoSulgo;
    }

    public void setAdubo(Adubo adubo) {
        this.adubo = adubo;
    }
    public void setCicloPlantio(String cicloPlantio) {
        this.cicloPlantio = cicloPlantio;
    }
    public void setTipoCultura(String tipoCultura) {
        this.tipoCultura = tipoCultura;
    }
    public void setDescansoPosPlantio(String descansoPosPlantio) {
        this.descansoPosPlantio = descansoPosPlantio;
    }
    public void setEspacamentoSulgo(int espacamentoSulgo) {
        this.espacamentoSulgo = espacamentoSulgo;
    }
}
