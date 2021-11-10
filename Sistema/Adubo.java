package Sistema;

public class Adubo {
    private String marcaAdubo;
    private String tipoAdubo;
    private String duracaoAdubo;
    private double quantidadeAduboPorHectar;

    public String getDuracaoAdubo() {
        return duracaoAdubo;
    }
    public String getMarcaAdubo() {
        return marcaAdubo;
    }
    public String getTipoAdubo() {
        return tipoAdubo;
    }
    public double getQuantidadeAduboPorHectar() {
        return quantidadeAduboPorHectar;
    }
    public void setDuracaoAdubo(String duracaoAdubo) {
        this.duracaoAdubo = duracaoAdubo;
    }
    public void setMarcaAdubo(String marcaAdubo) {
        this.marcaAdubo = marcaAdubo;
    }
    public void setTipoAdubo(String tipoAdubo) {
        this.tipoAdubo = tipoAdubo;
    }
    public void setQuantidadeAduboPorHectar(double quantidadeAduboPorHectar) {
        this.quantidadeAduboPorHectar = quantidadeAduboPorHectar;
    }

    
}
