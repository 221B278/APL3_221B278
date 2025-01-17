/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    int age;
    String name;
    
    void setage (int age)
    { 
        this.age =age ;
    }
     void setname  (String name)
    { 
     this.name =name;
    }

    void getage()
    {
        System.out.println("age: "+ age);
        
    }
     void getname()
    {
        System.out.println("name: "+ name );
    }
    
  
	public static void main(String[] args) {
		Main obj = new Main();
		obj.setage(4);
		obj.setname("anu");
		obj.getage();
		obj.getname();
	}
}
