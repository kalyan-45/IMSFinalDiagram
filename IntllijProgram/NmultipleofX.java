import java.util.*;
public class Source {

   public static void main(String[] args) {
     int x,n;
     Scanner input= new Scanner(System.in);
     x=input.nextInt();
     n=input.nextInt();
     int counter =1;
     while (counter<=n){
         System.out.println(x*counter);
         counter=counter+1;
     }
   }
}
