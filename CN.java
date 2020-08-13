public class CN
{
    double real, img;
     
    CN(double r, double i)
    {
     this.real = r;
     this.img = i;
    }
     
    public static CN sum(CN s1, CN s2)
    {
         CN tempe = new CN(0, 0);
         tempe.real = s1.real + s2.real;
         tempe.img = s1.img + s2.img;
         return tempe;
     }
     public static void main(String args[]) 
     {
         CN s1 = new CN(2, 5);
         CN s2 = new CN(4, 3);
         CN tempe = sum(s1, s2);
         System.out.printf("Sum is: "+ tempe.real+" + "+ tempe.img +"i");
     }
 }