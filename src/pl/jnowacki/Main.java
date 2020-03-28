package pl.jnowacki;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String... args) {
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
////        slajd 31, z1
//        String name = "Jedrzej";
//        System.out.println("Witaj, " + name);
//
////        slajd 31, zad2
//        System.out.print("str1 \n");
//        System.out.print("str2 \n");
////
////        slajd 31, zad3
//        double myDouble = 2.123123123;
//        System.out.printf("%.2f\n", myDouble);
//
////        slajd 31, zad4
//        System.out.printf("%15s %15s %15s\n", "asd", "aaaaaaaaaa", "sda");
//
////        slajd 33, z1
//        Scanner in = new Scanner(System.in);
//
//        String nameFromInput = in.nextLine();
//        System.out.println("Hello " + nameFromInput);
////
////        slajd 33, z2
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
//
////        slajd 39, z3
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
//
////        slajd 40, z1
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        System.out.printf("%d + %d = %d\n", a, b, a + b);
//
//        String formattedString = String.format("%d - %d = %d", a, b, a - b);
//        System.out.print(formattedString);
//
////        slajd 40, z2
//        System.out.println("Podaj a: ");
//        int liczbaA = Integer.valueOf(in.nextLine());
//
//        System.out.println("Podaj b: ");
//        int liczbaB = Integer.valueOf(in.nextLine());
//
//        System.out.println("Podaj dzialanie: ");
//        String dzialanie = in.nextLine();
//
//        if ("+".equals(dzialanie)) {
//            System.out.printf("%d + %d = %d\n", liczbaA, liczbaB, liczbaA + liczbaB);
//        } else if ("-".equals(dzialanie)) {
//            System.out.printf("%d - %d = %d\n", liczbaA, liczbaB, liczbaA - liczbaB);
//        }
//
////        slajd 40, z3
//        System.out.println("Podaj a: ");
//        int numberA = Integer.valueOf(in.nextLine());
//
//        System.out.println("Podaj b: ");
//        int numberB = Integer.valueOf(in.nextLine());
//
//        System.out.println("Podaj dzialanie: ");
//        String action = in.nextLine();
//
//        switch (action) {
//            case "+":
//                System.out.printf("%d + %d = %d\n", numberA, numberB, numberA + numberB);
//                break;
//            case "-":
//                System.out.printf("%d - %d = %d\n", numberA, numberB, numberA - numberB);
//                break;
//            case "*":
//                System.out.printf("%d * %d = %d\n", numberA, numberB, numberA * numberB);
//                break;
//            case "/":
//                System.out.printf("%d / %d = %d\n", numberA, numberB, numberA / numberB);
//                break;
//            default:
//                System.out.println("nieznane dzialanie");
//        }
//
////        trenary operator vs if-else
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
//
////        slajd 43, z1
//
//        String product;
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Podaj produkt nr " + (i + 1));
//            product = in.nextLine();
//            System.out.println("Dodano " + product);
//        }
//
////        budowanie stringow w petli
//        StringBuilder suma = new StringBuilder();
//
//        for (int i = 0; i < 5; i++) {
//            String newWord = in.nextLine();
//            suma.append(newWord);
//        }
//
//        System.out.println(suma);
//
////        for z labelka
//        zzzzzzzzzzzzzzz:
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println(i + " : " + j);
//                if (j == 3) {
//                    break zzzzzzzzzzzzzzz;
//                }
//            }
//        }
//
//        int i = 0;
//
//        while (i++ < 3) { //postinkrementacja
//            System.out.println(i);
//        }
//
//        do {
//            System.out.println(1);
//        } while (false);
//
////        slajd 48, z1
//        String myProduct;
//        int index = 0;
//
//        while (index++ < 3) {
//            System.out.println("Podaj produkt nr " + (index));
//            myProduct = in.nextLine();
//            System.out.println("Dodano " + myProduct);
//        }
//
//////        to samo, z do while
////        String myProduct;
////        int index = 0;
////
////        do {
////            System.out.println("Podaj produkt nr " + (index + 1));
////            myProduct = in.nextLine();
////            System.out.println("Dodano " + myProduct);
////        } while (++index < 3);
//
//////        Czytanie linii, aż user poda "k"
////        String inputFromUser;
////        do {
////            inputFromUser = in.nextLine();
////            System.out.println(inputFromUser);
////        } while (!"k".equals(inputFromUser));
//
////        To samo, z while
////        String inputFromUser;
////
////        while (!(inputFromUser = in.nextLine()).equals("k")) {
////            System.out.println(inputFromUser);
////        }
//
////        Kalkulator z warunkiem wyjścia
//        System.out.println("Podaj dzialanie lub [k] aby wyjsc: ");
//        String inputFromUser = in.nextLine();
//
//        while (!inputFromUser.equals("k")) {
//            System.out.println("Podaj a: ");
//            int aFromUser = Integer.valueOf(in.nextLine());
//
//            System.out.println("Podaj b: ");
//            int bFromUser = Integer.valueOf(in.nextLine());
//
//            switch (inputFromUser) {
//                case "+":
//                    System.out.printf("%d + %d = %d\n", aFromUser, bFromUser, aFromUser + bFromUser);
//                    break;
//                case "-":
//                    System.out.printf("%d - %d = %d\n", aFromUser, bFromUser, aFromUser - bFromUser);
//                    break;
//                case "*":
//                    System.out.printf("%d * %d = %d\n", aFromUser, bFromUser, aFromUser * bFromUser);
//                    break;
//                case "/":
//                    System.out.printf("%d / %d = %d\n", aFromUser, bFromUser, aFromUser / bFromUser);
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
//
////        Slajd 52 z1
//        String[] zakupy = new String[3];
//
//        for (int j = 0; j < zakupy.length; j++) {
//            System.out.println("podaj produkt nr " + (j + 1));
//            zakupy[j] = in.nextLine();
//        }
//
//        System.out.println("Twoje zakupy:");
//
//        for (int j = 0; j < zakupy.length; j++) {
//            System.out.println("Produkt nr " + (j + 1) + ": " + zakupy[j]);
//        }
//
//////        To samo z while
////        String[] zakupy = new String[3];
////
////        int i = 0;
////
////        while (i < zakupy.length) {
////            System.out.println("podaj produkt nr " + (i + 1));
////            zakupy[i] = in.nextLine();
////            i++;
////        }
////
////        System.out.println("Twoje zakupy:");
////        i = 0;
////        while (i < zakupy.length) {
////            System.out.println("Produkt nr " + (i + 1) + ": " + zakupy[i]);
////            i++;
////        }
//
////        slajd 52, z2
//        System.out.println("Podaj rozmiar tablicy: ");
//        int tabSize = Integer.valueOf(in.nextLine());
//
//        int[] intTab = new int[tabSize];
//
////        for do zapisu
//        for (int j = 0; j < intTab.length; j++) {
//            System.out.println("Podaj wyraz nr " + (j + 1) + ": ");
//            intTab[j] = Integer.valueOf(in.nextLine());
//        }
//
////      for do sumowania
//        int sumaFor = 0;
//        for (int currentNumber : intTab) {
//            sumaFor = sumaFor + currentNumber;
//        }
//
//        System.out.println("Suma to: " + sumaFor);
//
////        slajd 52, z3
//        String[] namesTab = {"Jas", "Malgosia", "Ania", "Kuba", "Szymek"};
//
//        String names = "";
//
//        for (String nameForEach : namesTab) {
//            if (!"".equals(names)) {
//                names += ", ";
//            }
//            names += nameForEach;
//        }

//        kalkulator BMI
//        Scanner bmiIn = new Scanner(System.in);
//
//        System.out.println("Podaj wzrost w [m] ");
//        double height = Double.parseDouble(bmiIn.nextLine().replace(',', '.'));
//
//        System.out.println("Podaj wagę w [kg] ");
//        double weight = Double.parseDouble(bmiIn.nextLine().replace(',', '.'));
//
//        double bmi = weight / (Math.pow(height, 2));
//
//        System.out.printf("Twoje BMI to %.2f\n", bmi);
//
//        if(bmi > 25) {
//            System.out.println("BMI za wysokie");
//        } else if (bmi < 18) {
//            System.out.println("BMI za niskie");
//        } else {
//            System.out.println("BMI w normie");
//        }
//
//        FizzBuzz
//
//        for (int i = 1; i <= 100; i++) {
//
//            if(i % 15 == 0)
//                System.out.println("FizzBuzz");
//            else if (i % 3 == 0)
//                System.out.println("Fizz");
//            else if (i % 5 == 0)
//                System.out.println("Buzz");
//            else
//                System.out.println(i);
//        }
//
//        FizzBuzz inaczej
//
//        for (int i = 1; i <= 100; i++) {
//            String result = "";
//
//            if (i % 3 == 0)
//                result += "Fizz";
//
//            if (i % 5 == 0)
//                result += "Buzz";
//
//            if (result.isEmpty())
//                result += i;
//
//            System.out.println(result);
//        }
//
//        slajd 53
//
//        int[] myIntTab = {2, 6, 2, 5, -10, -56, 20};
//
////        zad 1a
//        int max1a = myIntTab[0];
//
//        for (int i = 1; i < myIntTab.length; i++) {
//            if(max1a < myIntTab[i]) {
//                max1a = myIntTab[i];
//            }
//        }
//
//        System.out.println("Max to: " + max1a);
//
////        zad 1b
//        int min1b = myIntTab[0];
//
//        for (int i = 1; i < myIntTab.length; i++) {
//            if(min1b > myIntTab[i]) {
//                min1b = myIntTab[i];
//            }
//        }
//
//        System.out.println("Min to: " + min1b);
//
////        zad 1c
//        int suma1c = 0;
//
//        for (int i = 0; i < myIntTab.length; i++) {
//            suma1c += myIntTab[i];
//        }
//
//        System.out.println("Suma to: " + suma1c);
//
////        zad 1d
//        int suma1d = 0;
//
//        for (int i = 0; i < myIntTab.length; i++) {
//            suma1d += myIntTab[i];
//        }
//
//        System.out.println("Średnia to: " + suma1d / myIntTab.length);
//
////        tablice wielowymiarowe
//        int[][] my2dTable = {
//                {1, 3, 5},
//                {5, 6},
//                {4, 6, -10, 3}
//        };
//
//        for (int i = 0; i < my2dTable.length; i++) {
//            for (int j = 0; j < my2dTable[i].length; j++){
//                System.out.print(my2dTable[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        my2dTable[1][1] = 999999;
//
//        for (int i = 0; i < my2dTable.length; i++) {
//            for (int j = 0; j < my2dTable[i].length; j++){
//                System.out.print(my2dTable[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int[][] my8x8tab = new int[8][8];
//
//        for (int i = 0; i < my8x8tab.length; i++) {
//            for (int j = 0; j < my8x8tab[i].length; j++){
//                my8x8tab[i][j] = 1;
//            }
//        }
//
//        for (int i = 0; i < my8x8tab.length; i++) {
//            for (int j = 0; j < my8x8tab[i].length; j++){
//                System.out.print(my8x8tab[i][j] + " ");
//            }
//            System.out.println();
//        }
//
////        slajd 56 z1
//        Scanner inSq = new Scanner(System.in);
//
//        System.out.println("Podaj rozmiar kwadratu: ");
//        int size = Integer.parseInt(inSq.nextLine());
//
//        String[][] z1p56Board = new String[size][size];
//
////        tworzenie planszy
//        for (int i = 0; i < z1p56Board.length; i++) {
//            for (int j = 0; j < z1p56Board[i].length; j++){
//                if(i == 0 || i == z1p56Board.length - 1) {
//                    z1p56Board[i][j] = "#";
//                } else if(j == 0 || j == z1p56Board[i].length - 1) {
//                    z1p56Board[i][j] = "#";
//                } else {
//                    z1p56Board[i][j] = " ";
//                }
//            }
//        }
//
////        drukowanie
//        for (int i = 0; i < z1p56Board.length; i++) {
//            for (int j = 0; j < z1p56Board[i].length; j++){
//                System.out.print(z1p56Board[i][j]);
//            }
//            System.out.println();
//        }

        varArgsTest(3, 3, 3, 1, 56);
        System.out.printf("");
    }

    private static void varArgsTest(int... numbers) {
        System.out.println("liczba argumentow: " + numbers.length);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
