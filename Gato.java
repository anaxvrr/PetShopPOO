public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade, "Gato");
    }

    @Override
    public double calcularServico(String tipoServico) {
        switch (tipoServico.toLowerCase()) {
            case "banho": return 40.0;
            case "tosa": return 35.0;
            case "consulta": return 90.0;
            default: return 0.0;
        }
    }
}