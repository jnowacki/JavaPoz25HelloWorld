package pl.jnowacki;

public class Person {
    public int age = 8;

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void sayHelloToSomeone(String name){
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println("!");
    }

    public void sayAge(){
        System.out.print("I'm ");
        System.out.println(age);
    }

    public int getAge() {
        return age;
    }
}
