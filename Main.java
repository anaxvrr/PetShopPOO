public class Main {
    public static void main(String[] args) {
        PetShop petShop = new PetShop();

        Animal cachorro = new Cachorro("Rex", 3);
        Animal gato = new Gato("Mimi", 2);
        Animal passaro = new Passaro("PiuPiu", 1);

        petShop.registrarAnimal(cachorro);
        petShop.registrarAnimal(gato);
        petShop.registrarAnimal(passaro);

        petShop.realizarServico(cachorro, "banho");
        petShop.realizarServico(gato, "tosa");
        petShop.realizarServico(passaro, "tosa");

        System.out.println("\nAnimais no sistema:");
        petShop.listarAnimais();
    }
}