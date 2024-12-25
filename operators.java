import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
    
        /*Type Casting
        int tc;
        tc=(short)a;
        System.out.println(tc);*/

        //Arithmetic operators
        System.out.println("a+b:"+(a+b));
        System.out.println("a-b:"+(a-b));
        System.out.println("axb:"+(a*b));
        System.out.println("a/b:"+(float)a/b);
        System.out.println("a%b:"+(float)a%b);
        
        //Relational operators
        System.out.println("a<b:"+(a<b));
        System.out.println("a<=b:"+(a<=b));
        System.out.println("a>b:"+(a>b));
        System.out.println("a>=b:"+(a>=b));
        System.out.println("a==b:"+(a==b));
        System.out.println("a!=b:"+(a!=b));
        
       // sc.close();
        //increment Operators
        System.out.println("++a:"+(++a));
        System.out.println("a++:"+(a++));
        System.out.println("--a:"+(--a));
        System.out.println("a--:"+(a--));
        
        //conditional operator
         c =(a>b)?a:b;
         System.out.println(c);
        sc.close();
    }
}
