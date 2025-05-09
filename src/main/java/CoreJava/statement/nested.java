package CoreJava.statement;

import java.util.Scanner;

public class nested
{
    public static void main(String[]args)
    {
        Scanner SM=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=SM.nextInt();
        if(age>=18)
        {
            System.out.println("Welcome to Wonderla");
            System.out.println("Thrilling Water Games");
            String gender = SM.next();

            if (gender.equals("male") || (gender.equals("Male")))
            {
                System.out.println("Your Water Level zone 40M");
            }
            else
            {
                System.out.println("Water Level is High");
            }
        }
            else
            {
                System.out.println("Its a kids area,  Prohibited");
            }
        }
    }

