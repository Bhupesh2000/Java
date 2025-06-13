class Demo {
    // Instance initializer block (runs before every constructor)
    {
        System.out.println("Instance block executed");
    }

    // Static initializer block (runs once when class is loaded(when first object is created))
    static {
        System.out.println("Static block executed");
    }

    public Demo() {
        System.out.println("Constructor executed");
    }
}


class App{
    {
        System.out.println("App Instance block");
    }

    static {
        System.out.println("App static block");
    }

    App(){
        System.out.println("App constructor");
    }

    static void run(){
        System.out.println("App static method called");
    }
}

public class InitializerBlocks {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        App.run();
        // App static block
        // App static method called


        App a1 = new App();
        // App Instance block
        // App constructor

        App.run();
        // App static method called
    }
}