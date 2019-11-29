public class Main {
    public static void main(String[] args) {
        FirePokemon pikachu = new FirePokemon();
        pikachu.setNavn("Pikachu");
        pikachu.setGender("Han");
        pikachu.setSkade((short) 80);
        pikachu.setNummerPokedex(25);

        System.out.println("Interface eksempel!");
        pikachu.spyIld();
        System.out.println(pikachu.toString());
    }
}
