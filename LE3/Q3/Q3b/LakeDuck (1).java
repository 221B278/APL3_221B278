public class LakeDuck extends Duck implements Flyable, Quackable {
   
    public void fly() {
        System.out.println("Lake Duck is flying");
    }

    public void quack() {
        System.out.println("Lake Duck quacks");
    }
}
