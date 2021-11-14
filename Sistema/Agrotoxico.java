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
        if(tempoParaPulverizar <= 0) {
            throw new RuntimeException("Tempo não pode ser 0 ou negativo");
        }
        this.tempoParaPulverizar = tempoParaPulverizar;
    }

    public void setTipoAgrotoxico(String tipoAgrotoxico) {
        if(tipoAgrotoxico == null) {
            throw new RuntimeException("Tipo do Agrotoxico não pode ser nulo");
        }
        this.tipoAgrotoxico = tipoAgrotoxico;
    }

    public void setVazaoPulverizador(double vazaoPulverizador) {
        if(vazaoPulverizador <= 0) {
            throw new RuntimeException("Vazão não pode ser 0 ou negativo");
        }
        this.vazaoPulverizador = vazaoPulverizador;
    }

    public double CalculaVolumeDosagemAgrotoxico() {
        double volume = vazaoPulverizador * tempoParaPulverizar;
        return volume;
    }
}
