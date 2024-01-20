package Practice;

public class AnimalInfo  extends Domestic implements Animal{
    void eat(){
        System.out.println("Lion eats meat.");
        System.out.println("Dog eats Dog Food.");
    }

    @Override
    void stronger() {
        System.out.println("Lion is Stronger than dog.");
        System.out.println("Dog is not stronger than lion.");
    }
   public  void  dog(){
        System.out.println("Dog is friends of Human.");
    }
     public void lion(){
        System.out.println("lion is king of jungle.");
    }

    public static void main(String[] args) {
        AnimalInfo animal =new AnimalInfo();
        animal.dog();
        animal.lion();
        animal.eat();
        animal.stronger();
    }
}
