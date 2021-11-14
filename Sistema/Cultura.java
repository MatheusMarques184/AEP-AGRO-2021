package Sistema;

import java.nio.channels.ReadPendingException;

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
        if(adubo == null) {
            throw new RuntimeException("Adubo não pode ser nulo");
        }
        this.adubo = adubo;
    }
    public void setCicloPlantio(String cicloPlantio) {
        if(cicloPlantio == null) {
            throw new RuntimeException("Ciclo não pode ser nulo");
        }
        this.cicloPlantio = cicloPlantio;
    }
    public void setTipoCultura(String tipoCultura) {
        if(tipoCultura == null) {
            throw new RuntimeException("Tipo da cultura não pode ser nulo");
        }
        this.tipoCultura = tipoCultura;
    }
    public void setDescansoPosPlantio(String descansoPosPlantio) {
        if(descansoPosPlantio == null) {
            throw new RuntimeException("Descanso pós plantio não pode ser nulo");
        }
        this.descansoPosPlantio = descansoPosPlantio;
    }
    public void setEspacamentoSulgo(double espacamentoSulgo) {
        if(espacamentoSulgo < 0) {
            throw new RuntimeException("Espaçamento dos sulgos não pode ser negativo");
        }
        this.espacamentoSulgo = espacamentoSulgo;
    }
    public void setAgrotoxico(Agrotoxico agrotoxico) {
        if(agrotoxico == null) {
            throw new RuntimeException("Agrotóxico não pode ser nulo");
        }
        this.agrotoxico = agrotoxico;
    }
}
