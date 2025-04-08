public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade, "Cachorro");
    }

    @Override
    public double calcularServico(String tipoServico) {
        switch (tipoServico.toLowerCase()) {
            case "banho": return 50.0;
            case "tosa": return 40.0;
            case "consulta": return 100.0;
            default: return 0.0;
        }
    }
}