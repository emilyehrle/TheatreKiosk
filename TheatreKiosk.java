import java.util.Scanner;

public class TheatreKiosk

    //class WristBandHandouts
    //   main ()
    //      num age = 0
    //      num DRINKING_AGE = 21
    //      output “Enter your age: “
    //      input age
    //      if age >= DRINKING_AGE then
    //         output “You get a wrist band!"
    //       end if
    //   return
    //end class


        {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         int age = 0;
         int DRINKING_AGE = 21;

         System.out.print("Enter your age: ");
         age = in.nextInt();

         if (age >= DRINKING_AGE)
         {
             System.out.println("You get a wrist band!");
         }
         else
         {
            System.out.println("Not 21! No wristband!");
         }
         in.close();
}}
