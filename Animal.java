public abstract class Animal {
    private String nome;
    private int idade;
    private String especie;

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        setIdade(idade);
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Restrição: idade não pode ser negativa
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade não pode ser negativa!");
        } else {
            this.idade = idade;
        }
    }

    public String getEspecie() {
        return especie;
    }

    public abstract double calcularServico(String tipoServico);
}