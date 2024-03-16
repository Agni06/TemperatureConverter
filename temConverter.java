import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static double C_F(double C)
    {
        double F  = (C * 9/5) + 32;
        return F;
    }
    public static double F_C(double F)
    {
        double C  = (F - 32) * 5/9;
        return C;

    }
    public static double input(String word)
    {
        System.out.println("Enter "+word+" value:");
        double val = sc.nextDouble();
        return val;


    }
    static void output(double val, String word){
        System.out.printf("%s value: %.2f",word,val);
    }
    public static void main(String[] args) {
        System.out.println("1. Celcius to Fahrenheit \n 2.Fahrenheit to Celcius\n");
        do {
            System.out.println("\nEnter Choice: ");
            int ch = sc.nextInt();
            double num  =0 ;
            switch(ch)
            {
                case 1 : num = input("Celcius");
                output(C_F(num), "Fahrenheit");
                break;
                case 2 : num = input("Fahrenheit");
                output(F_C(num), "Celcius");
                break;
                default: System.out.println("Invalid Input");

            }
        }while(true);

    }
}
