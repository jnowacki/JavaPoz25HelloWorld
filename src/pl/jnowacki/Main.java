package pl.jnowacki;

public class Main {

    public static void main(String[] args) {
        Person piotrek = new Person();

        piotrek.sayHello();
        piotrek.sayAge();

        piotrek.sayHelloToSomeone("ciocia Kasia");

        System.out.println("Piotrek is");
        System.out.println(piotrek.getAge());
        System.out.println("yo");

    }
}
