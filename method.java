class method
{
    public int x;
    private int y;
    void cal(int a, int b)
    {
        x = a+1;
        y = b;
    }
    void print()
    {
        System.out.println(""+y);
    }
public static void main(String args[]) 
    {
      method obj = new method();
      obj.cal(2,3);
      System.out.println(obj.x);
      obj.print();
    }        
}