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
        ((RubberDuck) rubberDuck).squeak();

        woodenDuck.swim();
        // WoodenDuck doesn't have squeak or quack behavior

        redHeadDuck.swim();
        ((RedHeadDuck) redHeadDuck).fly();
        ((RedHeadDuck) redHeadDuck).quack();

        lakeDuck.swim();
        ((LakeDuck) lakeDuck).fly();
        ((LakeDuck) lakeDuck).quack();
    }
    


}
