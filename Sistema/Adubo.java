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
        if(duracaoAdubo == null) {
            throw new RuntimeException("Duração não pode ser nula");
        }
        this.duracaoAdubo = duracaoAdubo;
    }
    public void setMarcaAdubo(String marcaAdubo) {
        if(marcaAdubo == null) {
            throw new RuntimeException("Marca não pode ser nula");
        }
        this.marcaAdubo = marcaAdubo;
    }
    public void setTipoAdubo(String tipoAdubo) {
        if(tipoAdubo == null) {
            throw new RuntimeException("Tipo adubo não pode ser nulo");
        }
        this.tipoAdubo = tipoAdubo;
    }
    public void setQuantidadeAduboPorHectar(double quantidadeAduboPorHectar) {
        this.quantidadeAduboPorHectar = quantidadeAduboPorHectar;
    }

    
}
