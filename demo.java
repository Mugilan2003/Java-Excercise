import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter player");
    String a=sc.nextLine();
     if(a.equals("dhoni")){
         System.out.println("Winner CSK");
     }
     else if(a=="virat"){
         System.out.println("Eesala cuppu lollypopu");
     }
     else{
         System.out.println("veliya poda po**u");
     }
    sc.close();
    }
}
