public class Passaro extends Animal {
    public Passaro(String nome, int idade) {
        super(nome, idade, "Pássaro");
    }

    @Override
    public double calcularServico(String tipoServico) {
        switch (tipoServico.toLowerCase()) {
            case "banho": return 30.0;
            case "tosa": return 0.0;
            case "consulta": return 70.0;
            default: return 0.0;
        }
    }
}