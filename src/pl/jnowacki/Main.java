package pl.jnowacki;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Person piotrek = new Person();
//
//        piotrek.sayHello();
//        piotrek.sayAge();
//
//        piotrek.sayHelloToSomeone("ciocia Kasia");
//
//        System.out.println("Piotrek is");
//        System.out.println(piotrek.getAge());
//        System.out.println("yo");
//
//////        slajd 31, z1
//        String name = "Jedrzej";
//        System.out.println("Witaj, " + name);
//
//////        slajd 31, zad2
//        System.out.print("str1 \n");
//        System.out.print("str2 \n");
////
//////        slajd 31, zad3
//        double myDouble = 2.123123123;
//        System.out.printf("%.2f\n", myDouble);
//
//////        slajd 31, zad4
//        System.out.printf("%15s %15s %15s\n", "asd", "aaaaaaaaaa", "sda");
////
//////        slajd 33, z1
        Scanner in = new Scanner(System.in);
//
//        String nameFromInput = in.nextLine();
//        System.out.println("Hello " + nameFromInput);
////
//////        slajd 33, z2
//        int intA = in.nextInt();
//        int intB = in.nextInt();
//
//        System.out.println(intA + intB);
//
////        slajd 36, z1
//
//        System.out.print("\nPodaj liczbe: ");
//        int number = in.nextInt();
//
//        if (number < 10) {
//            System.out.println("Less than 10");
//        } else if (number == 10) {
//            System.out.println("Is 10");
//        } else {
//            System.out.println("Greater than 10");
//        }
//
////        slajd 36, z2
//        System.out.println("Nowa Liczba po tym");
//        int naszaLiczba = in.nextInt();
//        if (naszaLiczba == 0) {
//            System.out.println("*");
//        } else if (naszaLiczba == 1) {
//            System.out.println("$");
//        } else if (naszaLiczba == 2) {
//            System.out.println("@");
//        } else if (naszaLiczba == 3) {
//            System.out.println("^");
//        } else if (naszaLiczba == 4) {
//            System.out.println("&");
//        } else if (naszaLiczba == 5) {
//            System.out.println("`");
//        } else if (naszaLiczba == 7) {
//            System.out.println("~");
//        } else if (naszaLiczba == 8) {
//            System.out.println("?");
//        } else if (naszaLiczba == 9) {
//            System.out.println(">");
//        } else if (naszaLiczba > 10) {
//            System.out.println("Nasza Liczba większa niz 10");
//        }
//
//
////        slajd 36, z3
//        String input = in.nextLine();
//
//        if ("gwiazdka".equals(input)) {
//            System.out.println("*");
//        } else if ("hash".equals(input)) {
//            System.out.println("#");
//        }

//        slajd 39, z3
//        String userRequest = in.nextLine();
//
//        switch (userRequest) {
//            case "s":
//            case "star":
//                System.out.println("*");
//                break;
//            case "h":
//            case "hash":
//                System.out.println("#");
//            default:
//                System.out.println("not recognized");
//        }

//        slajd 40, z1
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        System.out.printf("%d + %d = %d\n", a, b, a + b);
//
//        String formattedString = String.format("%d - %d = %d", a, b, a - b);
//        System.out.print(formattedString);

//        slajd 40, z2
//        System.out.println("Podaj a: ");
//        int a = Integer.valueOf(in.nextLine());
//
//        System.out.println("Podaj b: ");
//        int b = Integer.valueOf(in.nextLine());
//
//        System.out.println("Podaj dzialanie: ");
//        String dzialanie = in.nextLine();
//
//        if ("+".equals(dzialanie)) {
//            System.out.printf("%d + %d = %d\n", a, b, a + b);
//        } else if ("-".equals(dzialanie)) {
//            System.out.printf("%d - %d = %d\n", a, b, a - b);
//        }

//        slajd 40, z3
//        System.out.println("Podaj a: ");
//        int a = Integer.valueOf(in.nextLine());
//
//        System.out.println("Podaj b: ");
//        int b = Integer.valueOf(in.nextLine());
//
//        System.out.println("Podaj dzialanie: ");
//        String dzialanie = in.nextLine();
//
//        switch (dzialanie) {
//            case "+":
//                System.out.printf("%d + %d = %d\n", a, b, a + b);
//                break;
//            case "-":
//                System.out.printf("%d - %d = %d\n", a, b, a - b);
//                break;
//            case "*":
//                System.out.printf("%d * %d = %d\n", a, b, a * b);
//                break;
//            case "/":
//                System.out.printf("%d / %d = %d\n", a, b, a / b);
//                break;
//            default:
//                System.out.println("nieznane dzialanie");
//        }

//        String parzyste;
//        int liczba = 7;
//
//        if (liczba % 2 == 0) {
//            parzyste = "tak";
//        } else {
//            parzyste = "nie";
//        }
//
//        parzyste = (liczba % 2 == 0) ? "tak" : "nie";

//        for
//        for(int i = 0; i < 5; ++i) {
//            System.out.println(i);
//        }

//        slajd 43, z1

//        String product;
//
//        for(int i = 0; i < 3; i++) {
//            System.out.println("Podaj produkt nr " + (i + 1));
//            product = in.nextLine();
//            System.out.println("Dodano " + product);
//        }

//        budowanie stringow w petli
//        StringBuilder suma = new StringBuilder();
//
//        for (int i = 0; i < 5; i++) {
//            String newWord = in.nextLine();
//            suma.append(newWord);
//        }
//
//        System.out.println(suma);

//        for z labelka
//zzzzzzzzzzzzzzz:
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println(i + " : " + j);
//                if(j == 3) {
//                    break zzzzzzzzzzzzzzz;
//                }
//            }
//        }

//        int i = 0;
//
//        while (i++ < 3) { //postinkrementacja
//            System.out.println(i);
//        }

//        do{
//            System.out.println(1);
//        } while (false);

//        slajd 48, z1

//        String product;
//        int i = 0;
//
//        while(i++ < 3) {
//            System.out.println("Podaj produkt nr " + (i));
//            product = in.nextLine();
//            System.out.println("Dodano " + product);
//        }

//        String product;
//        int i = 0;
//
//        do {
//            System.out.println("Podaj produkt nr " + (i+1));
//            product = in.nextLine();
//            System.out.println("Dodano " + product);
//        } while (++i < 3);

//        String inputFromUser;
//        do{
//            inputFromUser = in.nextLine();
//            System.out.println(inputFromUser);
//        }while(!"k".equals(inputFromUser));
//
//        String inputFromUser;
//
//        while (!(inputFromUser = in.nextLine()).equals("k")) {
//            System.out.println(inputFromUser);
//        }

//        System.out.println("Podaj dzialanie lub [k] aby wyjsc: ");
//        String inputFromUser = in.nextLine();
//
//        while (!inputFromUser.equals("k")) {
//            System.out.println("Podaj a: ");
//            int a = Integer.valueOf(in.nextLine());
//
//            System.out.println("Podaj b: ");
//            int b = Integer.valueOf(in.nextLine());
//
//            switch (inputFromUser) {
//                case "+":
//                    System.out.printf("%d + %d = %d\n", a, b, a + b);
//                    break;
//                case "-":
//                    System.out.printf("%d - %d = %d\n", a, b, a - b);
//                    break;
//                case "*":
//                    System.out.printf("%d * %d = %d\n", a, b, a * b);
//                    break;
//                case "/":
//                    System.out.printf("%d / %d = %d\n", a, b, a / b);
//                    break;
//                default:
//                    System.out.println("nieznane dzialanie");
//            }
//
//            System.out.println("Podaj dzialanie lub [k] aby wyjsc: ");
//            inputFromUser = in.nextLine();
//        }
//
//        System.out.println("Koniec programu");

//        String[] zakupy = new String[3];
//
//        for (int i = 0; i < zakupy.length; i++) {
//            System.out.println("podaj produkt nr " + (i + 1));
//            zakupy[i] = in.nextLine();
//        }
//
//        System.out.println("Twoje zakupy:");
//
//        for (int i = 0; i < zakupy.length; i++) {
//            System.out.println("Produkt nr "+ (i + 1) + ": " + zakupy[i]);
//        }

        String[] zakupy = new String[3];

        int i = 0;

        while(i < zakupy.length) {
            System.out.println("podaj produkt nr " + (i + 1));
            zakupy[i] = in.nextLine();
            i++;
        }

        System.out.println("Twoje zakupy:");
        i = 0;
        while(i < zakupy.length) {
            System.out.println("Produkt nr "+ (i + 1) + ": " + zakupy[i]);
            i++;
        }
    }
}
