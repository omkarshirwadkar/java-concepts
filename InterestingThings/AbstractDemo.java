abstract class Demo {
    public void abstractMethod(){
        System.out.println("Abstract Method");
    }
}

public class AbstractDemo extends Demo{
    public static void main(String[] args) {
        Demo obj = new AbstractDemo();
        obj.abstractMethod();
    }
}