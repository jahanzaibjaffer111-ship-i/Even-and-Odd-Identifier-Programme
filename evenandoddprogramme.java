import java.util.Scanner;

public class evenandoddprogramme
{
    public static void main(String[] args)
    {
        try (Scanner read = new Scanner(System.in)) {
            int a;
            while(true)
            {
                System.out.println("Hello");
                System.out.println("Welcome to Even and Odd check Calculator");
                System.out.println("Type Value");
                a=read.nextInt();
                if (a % 2 == 0)
                {
                    System.out.println("Even");
                }
                if (a % 2 != 0)
                {
                    System.out.println("Odd");
                }
                System.out.println("Thank you");
                System.out.println("Bye");
                System.out.println(".");

            }
        }
    }

}

