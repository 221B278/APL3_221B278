/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        rubberDuck.swim();
        rubberDuck.fly();
        rubberDuck.makeSound();

        woodenDuck.swim();
        woodenDuck.fly();
        woodenDuck.makeSound();

        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.makeSound();

        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.makeSound();
    }


}
