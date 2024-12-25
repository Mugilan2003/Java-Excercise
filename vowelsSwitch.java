import java.util.Scanner;
public class vowelsSwitch
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Charatcter");
        String a=sc.next();
        sc.close();
        char   b=a.charAt(0);
        System.out.println(b);
        switch (b) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println(b+" is a Vowel");
                break;
             default:
             System.out.println(b+" is Not a Vowel");
                break;
        }
       
    }
}
