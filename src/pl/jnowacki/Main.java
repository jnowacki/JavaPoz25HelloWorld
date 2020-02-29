package pl.jnowacki;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person piotrek = new Person();

        piotrek.sayHello();
        piotrek.sayAge();

        piotrek.sayHelloToSomeone("ciocia Kasia");

        System.out.println("Piotrek is");
        System.out.println(piotrek.getAge());
        System.out.println("yo");

////        slajd 31, z1
        String name = "Jedrzej";
        System.out.println("Witaj, " + name);

////        slajd 31, zad2
        System.out.print("str1 \n");
        System.out.print("str2 \n");
//
////        slajd 31, zad3
        double myDouble = 2.123123123;
        System.out.printf("%.2f\n", myDouble);

////        slajd 31, zad4
        System.out.printf("%15s %15s %15s\n", "asd", "aaaaaaaaaa", "sda");
//
////        slajd 33, z1
        Scanner in = new Scanner(System.in);

        String nameFromInput = in.nextLine();
        System.out.println("Hello " + nameFromInput);
//
////        slajd 33, z2
        int intA = in.nextInt();
        int intB = in.nextInt();

        System.out.println(intA + intB);

//        slajd 36, z1

        System.out.print("\nPodaj liczbe: ");
        int number = in.nextInt();

        if (number < 10) {
            System.out.println("Less than 10");
        } else if (number == 10) {
            System.out.println("Is 10");
        } else {
            System.out.println("Greater than 10");
        }

//        slajd 36, z2
        System.out.println("Nowa Liczba po tym");
        int naszaLiczba = in.nextInt();
        if (naszaLiczba == 0) {
            System.out.println("*");
        } else if (naszaLiczba == 1) {
            System.out.println("$");
        } else if (naszaLiczba == 2) {
            System.out.println("@");
        } else if (naszaLiczba == 3) {
            System.out.println("^");
        } else if (naszaLiczba == 4) {
            System.out.println("&");
        } else if (naszaLiczba == 5) {
            System.out.println("`");
        } else if (naszaLiczba == 7) {
            System.out.println("~");
        } else if (naszaLiczba == 8) {
            System.out.println("?");
        } else if (naszaLiczba == 9) {
            System.out.println(">");
        } else if (naszaLiczba > 10) {
            System.out.println("Nasza Liczba większa niz 10");
        }


//        slajd 36, z3
        String input = in.nextLine();

        if ("gwiazdka".equals(input)) {
            System.out.println("*");
        } else if ("hash".equals(input)) {
            System.out.println("#");
        }
    }
}
