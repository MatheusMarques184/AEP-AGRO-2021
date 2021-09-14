package Sistema;

public class Cooperativa {
    private String NomeCooperativa;
    private String demanda;
    private double quantidadeDemanda;

    public Cooperativa(String NomeCoopertiva, String demanda, double quantidadeDemanda) {
        this.setNomeCooperativa(NomeCoopertiva);
        this.setDemanda(demanda);
        this.setQuantidadeDemanda(quantidadeDemanda);

    }

    public String getDemanda() {
        return demanda;
    }

    public String getNomeCooperativa() {
        return NomeCooperativa;
    }

    public double getQuantidadeDemanda() {
        return quantidadeDemanda;
    }

    public void setDemanda(String demanda) {
        this.demanda = demanda;
    }

    public void setNomeCooperativa(String nomeCooperativa) {
        if (nomeCooperativa == null) {
            throw new RuntimeException("Nome da coopertiva não pode ser nulo");
        }
        NomeCooperativa = nomeCooperativa;
    }

    public void setQuantidadeDemanda(double quantidadeDemanda) {
        this.quantidadeDemanda = quantidadeDemanda;
    }

}
