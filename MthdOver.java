public class MthdOver {
   static int val(int x){
    return(5+x);
   } 
   static double val(double x){
    return(5+x);
   }
   public static void main(String[] args) {
    int num=val(60);
    double num2=val(60.566);
    System.out.println(num);
    System.out.println(num2);
   }
}
