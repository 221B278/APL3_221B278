/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        LazySOL lazySOL1 = LazySOL.getInstance();
        LazySOL lazySOL2 = LazySOL.getInstance();
        LazySOL lazySOL3 = LazySOL.getInstance();
        //EagerSOL eagerSOL1 = EagerSOL.getInstance();
        //EagerSOL eagerSOL2 = EagerSOL.getInstance();

        System.out.println(lazySOL1 == lazySOL3);
        //System.out.println(eagerSOL1 == eagerSOL2);

        System.out.println("Instances created: " + LazySOL.getCounter());
        //System.out.println("Instances created: " + EagerSOL.getCounter());
    }
}

