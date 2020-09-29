public class user_input {
    public void display() { // method with no parameters
       int a = 5;
       int b = 5;
       int sum = a + b ;
       System.out.println("Sum is:-" +sum);
    }
    public void display(String name) { // method with a single parameter
       System.out.println("display() method with a single parameter");
    }
    public void display(String firstName, String lastName) { // method with multiple parameters
       System.out.println("display() method with multiple parameters");
    }
    public static void main(String args[]) {
       user_input test = new user_input();
       test.display();
       test.display();
       test.display();
    }
 }