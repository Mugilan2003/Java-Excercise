import java.util.Scanner;
public class calciSwitch {
    public static void main(String[] args){
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Add: press \'1\' ");
        System.out.println("Sub: press \'2\' ");
        System.out.println("Mul: press \'3\' ");
        System.out.println("Div: press \'4\' ");
        c=sc.nextInt();
        sc.close();  
        switch (c) {
            case 1:
                d=a+b;
                 System.out.println(d);
            break;
            case 2:
                d=a-b;
                System.out.println(d);
            break;
            case 3:
                d=a*b;
                System.out.println(d);
            break;
            case 4:
                d=a/b;
                double f=(int)d;
                System.out.println(f);
            break;
            default:
            System.out.println("Invalid");
            break;
        }
    }
}
