package Sistema;

public class Cultura {
    private String tipoCultura;
    private String cicloPlantio;
    private Adubo adubo;
    private double espacamentoSulgo;
    private String descansoPosPlantio;
    private Agrotoxico agrotoxico;

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
    public double getEspacamentoSulgo() {
        return espacamentoSulgo;
    }
    public Agrotoxico getAgrotoxico() {
        return agrotoxico;
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
    public void setEspacamentoSulgo(double espacamentoSulgo) {
        this.espacamentoSulgo = espacamentoSulgo;
    }
    public void setAgrotoxico(Agrotoxico agrotoxico) {
        this.agrotoxico = agrotoxico;
    }
}
