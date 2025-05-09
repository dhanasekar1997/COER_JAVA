package CoreJava.Operator;

public class Logical {
    public static void main(String[] args)
    {
        int a = 35;
        int b = 35;
        int c = 25;
        System.out.println(a < b || a > c);    //OR operator
        System.out.println(a < b && a > c);
        System.out.println(!(a == b));
        System.out.println((a != b));


        System.out.println("Welcome to Salem");


        String state = "TN";
        String state1 = "TN";
        int height = 175;
        int weight = 71;
        System.out.println(state == state1 && height != weight);
        System.out.println(state1 == "salem" || "TN" == state1);
        System.out.println((!(weight < 70)));
    }
}
