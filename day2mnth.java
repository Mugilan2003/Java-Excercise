import java.util.Scanner;
public class day2mnth
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the days");
        int day=sc.nextInt();
        int month=day/30;
        int days=day%30;
        if(month==1&&days==1)
        {
            System.out.println(month+" Month and "+days+" day");
        }
        else if(month==1 && day>1)
            {
                System.out.println(month+" Month and "+days+" days");
            }
        else if(month>1 && day==1)
            {
                System.out.println(month+" Months and "+days+" day");

            }
            else if(month==1&&day==0)
                {
                    System.out.println(month+" Month");
                }
            else if(month==0 && day<1)
                {
                    System.out.println(day+" day");
                }
                sc.close();
    }
}
