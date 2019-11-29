public class ElectricPokemon extends Pokemon implements EX, CanFly{
    public ElectricPokemon(){}
    public void givStoed(){
        System.out.println("Whooooooaaaaa!!!!");
    }

    @Override
    public void fly() {

    }

    @Override
    public void ex() {
        System.out.println("Sput ild og flyver, på den måde.");
    }
}


