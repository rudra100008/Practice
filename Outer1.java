package Practice;

public class Outer1 {
    private final int data =100;
    class Inner{
        void message(){
            System.out.println("data is:"+ data);
        }
    }
    class Inner1{
        void message(){
            System.out.println("I am ashum.");
        }
    }

    public static void main(String[] args) {
        Outer1 obj=new Outer1();
        Outer1.Inner in= obj.new Inner();
        in.message();
        Outer1.Inner1 in1= obj.new Inner1();
        in1.message();
    }
}
