class ComplexNumber
{
    double real, img;
    
    ComplexNumber()
    {
        real=0;
        img=0;
    }

    ComplexNumber(double r, double i)
    {
     this.real = r;
     this.img = i;
    }
     
    public static ComplexNumber sum(ComplexNumber s1, ComplexNumber s2)
    {
         ComplexNumber tempe = new ComplexNumber(0, 0);
         tempe.real = s1.real + s2.real;
         tempe.img = s1.img + s2.img;
         return tempe;
     }
     public static void main(String args[]) 
     {
         ComplexNumber s1 = new ComplexNumber(4, 5);
         ComplexNumber s2 = new ComplexNumber(4, 3);
         ComplexNumber tempe = sum(s1, s2);
         System.out.printf("Sum is: "+ tempe.real+" + "+ tempe.img +"i");
     }
 }