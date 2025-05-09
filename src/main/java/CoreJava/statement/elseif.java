package CoreJava.statement;

import java.util.Scanner;

public class elseif
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("My company details");
        String emp_company_name=scan.nextLine();

        if(emp_company_name.equalsIgnoreCase("Zealous"))
        {
            System.out.println("You are working in IT industry");
        }
        else if (emp_company_name.equalsIgnoreCase("CTS"))
        {
            System.out.println("You are working in BPO");
        }
        else {
            System.out.println("You are not working in both sector");
        }
    }


}
