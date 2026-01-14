import java.util.Scanner;

public class evenandoddprogramme
{
    public static void main(String[] args)
    {
        try (Scanner read = new Scanner(System.in)) {
            int a;
            while(true)
            {
                System.out.println("HELLO");
                System.out.println("WELCOME TO EVEN AND ODD CHECK PROGRAMME");
                System.out.println("TYPE VALUE");
                a=read.nextInt();
                if (a % 2 == 0)
                {
                    System.out.println("EVEN");
                }
                if (a % 2 != 0)
                {
                    System.out.println("ODD");
                }
                System.out.println("THANKS");
                System.out.println("BYE");
                System.out.println(".");

            }
        }


    }

}
