public class RubberDuck extends Duck implements Squeakable {
    
    public void squeak() {
        System.out.println("Rubber Duck squeaks");
    }

    // Rubber ducks can't fly, so no Flyable implementation
}
