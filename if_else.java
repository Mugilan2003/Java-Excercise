import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greater");
        }
        else if(b>a && b>c){
            System.out.println(b+" is greater");
        }
        else if(c>a && c>b){
            System.out.println(c+" is greater");
        }
        else{
            System.out.println("Invalid data");
        }
        sc.close();
    }
}
