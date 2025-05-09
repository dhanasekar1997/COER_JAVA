package CoreJava;

public class var
{
    static String name = "Vanavasi";
    public int a = 100;

    public void ddd()
    {
        String Panchayat = "VANAVASI POST";
        System.out.println("Is " + Panchayat);
        System.out.println("A value is:" + a);
        System.out.println("Static is:" + name);
    }

    public static void main(String args[])
    {

        System.out.println("VANAVASI");
        System.out.println("NAME IS:" + name);
        int val = 100;
        int val1 = 5000;
        int res = val + val1;
        System.out.println("RESULT IS:" + res);
        var vs = new var();
        vs.ddd();

    }
}
