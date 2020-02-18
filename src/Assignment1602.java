import java.util.Scanner;

public class Assignment1602 {

    public static void main (String[] Args){
        System.out.println("hello");

        String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS
        int usernumber = 0;
        System.out.println("Please enter Number to multiply by 10: ");
        Scanner s = new Scanner(System.in);
        usernumber = s.nextInt();
        int result = 0;

    try {
            for (int i = 0; i <= 10; i++) {
                result = i * usernumber;
                System.out.print(i + " x " + usernumber + " = " + result);
                System.out.println(newLine);
            }
        } catch (NumberFormatException e){System.out.print("Error encountered. Shutting down.");}
    }
}
