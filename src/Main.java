import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args)
    {
        double TempF = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Temperature in Celsius");

        double TempC = 0;
        String Invalid = "";

        if(in.hasNextDouble())
        {
            TempC = in.nextDouble();
            TempF = (TempC * 1.8 ) + 32;
            System.out.println("Your temperature in Fareinheit is "+ TempF + " degrees");
        }
        else
        {
            System.out.println("Invalid input please try again");
        }





    }
}