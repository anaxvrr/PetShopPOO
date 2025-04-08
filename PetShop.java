import java.util.ArrayList;

public class PetShop {
    private ArrayList<Animal> animais = new ArrayList<>();

    public void registrarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println(animal.getNome() + " registrado com sucesso!");
    }

    public void realizarServico(Animal animal, String servico) {
        double preco = animal.calcularServico(servico);
        if (preco > 0) {
            System.out.println("Serviço de " + servico + " para " + animal.getNome() + ": R$" + preco);
        } else {
            System.out.println("Serviço não disponível para " + animal.getEspecie());
        }
    }

    public void listarAnimais() {
        for (Animal a : animais) {
            System.out.println(a.getNome() + " - " + a.getEspecie() + " - Idade: " + a.getIdade());
        }
    }
}