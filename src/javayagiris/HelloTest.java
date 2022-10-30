package javayagiris;

public class HelloTest {

    public static void main(String[] args) {
        Hello object = new Hello();

        String answer = object.sayHello("BERFIN");
        System.out.println(answer);

        System.out.println("World: " + object.world);

        answer = object.sayHello("");
        System.out.println(answer);
    }
}