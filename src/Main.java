public class Main {
    public static void main(String[] args){
        int one = 1;
        System.out.println("This is the main");
        if (one > 2)
        sayHello();
        else
            sayGoodbye();


    }
    public static void sayGoodbye()
    {
        System.out.println("Bye");
    }
    public static void sayHello()
    {
        System.out.println("Hello");
    }
}
