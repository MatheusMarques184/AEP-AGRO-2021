package Sistema;

public class App {
    public static void imprimirProdutor(Produtor p) {
        System.out.println("\nProdutor " + p.getNome());
        System.out.println(p.getRegistroResponsavel() + "- " + p.getCpf() + "- " + p.getRg() + "- " + p.getEndereco()
                + "- " + p.getNumeroCelular());
    }

    public static void imprimirCooperativa(Cooperativa c) {
        System.out.println("\nCooperativa " + c.getNomeCooperativa());
        System.out.println(c.getDemanda() + "-" + c.getQuantidadeDemanda());
    }

    public static void main(String[] args) {

        Produtor thomas = new Produtor("REGISTRO", "Thomas", 1234567891, 12345678, "Av. sao paulo", 123456789);
        Produtor kleber = new Produtor("Registro2", "Kleber", 1234567891, 12345678, "Av. belem", 123456789);

        Cooperativa coopUM = new Cooperativa("Cooperativa1", "Soja", 134.55);
        // thomas.setNome(null);
        // thomas.setEndereco(null);
        // coopUM.setNomeCooperativa(null);
        imprimirProdutor(thomas);
        imprimirProdutor(kleber);
        imprimirCooperativa(coopUM);
    }

}
