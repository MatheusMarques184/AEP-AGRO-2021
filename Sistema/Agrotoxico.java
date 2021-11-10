package Sistema;

public class Agrotoxico {
    private String tipoAgrotoxico;
    private double vazaoPulverizador;
    private double tempoParaPulverizar;

    public double getTempoParaPulverizar() {
        return tempoParaPulverizar;
    }

    public String getTipoAgrotoxico() {
        return tipoAgrotoxico;
    }

    public double getVazaoPulverizador() {
        return vazaoPulverizador;
    }

    public void setTempoParaPulverizar(double tempoParaPulverizar) {
        this.tempoParaPulverizar = tempoParaPulverizar;
    }

    public void setTipoAgrotoxico(String tipoAgrotoxico) {
        this.tipoAgrotoxico = tipoAgrotoxico;
    }

    public void setVazaoPulverizador(double vazaoPulverizador) {
        this.vazaoPulverizador = vazaoPulverizador;
    }

    public double CalculaVolumeDosagemAgrotoxico() {
        double volume = vazaoPulverizador * tempoParaPulverizar;
        return volume;
    }
}
