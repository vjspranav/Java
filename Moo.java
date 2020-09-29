public class Moo {
    int a;
    private int b;
    public int c;

    void fun(int val)
    {

        b = val;
    }

    void display() 
    {
        System.out.println(" b:" +b);
        // system.out.println(this is a public access specifier" +c);
    }

}

class test
{
    public static void main(String[] args)
    {

        Moo obj1 = new Moo();
        obj1.a=100;
        //obj1.b=19;
        obj1.c=900;
        obj1.fun(19);
        obj1.display();

    } 
}