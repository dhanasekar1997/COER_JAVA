package CoreJava;

public class variables
{
    static String name="Dhanasekar";
    public int a=50;

    public void Dhana()
    {
        String college = "Sona college";
        System.out.println("College is" + college);
        System.out.println("A value is:"+a);
        System.out.println("Static is:"+name);
    }
    public static void main( String args[] )
    {
        System.out.println( "Dhanasekar" );
        System.out.println("NAME IS:"+name);
        int value=1500;
        int value1=5000;
        int res=value+value1;
        System.out.println("RESULT IS:"+res);
        //Creating object
        //classname objectname=new classname();
        variables vv= new variables();
        vv.Dhana();
    }
}
