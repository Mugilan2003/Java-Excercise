import java.util.Scanner;;

public class Method {
    static void add() {
        int a = 50;
        int b = 60;
        int c = a + b;
        System.out.println("a+b is:" + c);
    }

    static void sub() {
        int a = 100;
        int b = 60;
        int c = a - b;
        System.out.println("a-b is:" + c);
    }

    public int addition(int x, int y) {
        int z = x + y;
        return z;
    }

    public int subtract(int x, int y) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        x = sc.nextInt();
        System.out.println("Enter b value");
        y = sc.nextInt();
        int z = x - y;
        sc.close();
        System.out.print("a-b is : ");
        return (z);
    }

    public static void main(String[] args) {
        Method obj = new Method();
        Method.add();
        Method.sub();
        System.out.println(obj.addition(5, 10));
        System.out.println(obj.subtract(0, 0));
    }
}
