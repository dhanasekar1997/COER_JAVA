package CoreJava.Operator;

import java.util.Scanner;

public class Arthimetic
{
public void addtion() {
    Scanner scan1 = new Scanner(System.in);
    int a = scan1.nextInt();
    int b = scan1.nextInt();
    int c = a - b;
    System.out.println("THE RESULT C:" + c);


}
    public static void main( String args[] )
    {
        Arthimetic aa= new Arthimetic();
        aa.addtion();

        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int value1 = scan.nextInt();
        int output = value1 + value;
        System.out.println("The value is :" + output);
    }
}
