public class TesteAnimal {
    public static void main(String[] args) {
        Peixe peixe1 = new Peixe();
        peixe1.setNome("Nemo");
        peixe1.setPeso(0.5);
        peixe1.setTipoHabitat("Água doce");

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Rex");
        cachorro1.setPeso(15);
        cachorro1.setRaca("Labrador");

        System.out.println(peixe1.toString());
        System.out.println(cachorro1.toString());
    }
}
