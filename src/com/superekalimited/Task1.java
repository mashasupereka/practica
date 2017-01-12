package com.superekalimited;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        // 1)
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hallo, " + name);

        //2)
        for (int index = args.length - 1; index >= 0; index--) {
            System.out.println(args[index]);
        }

        // 3)
        int numberOfRandoms = 5;
        Random random = new Random();

        for (int index = 1; index <= numberOfRandoms; index++) {
            System.out.println(random.nextInt());
        }

        for (int index = 1; index <= numberOfRandoms; index++) {
            System.out.print(random.nextInt() + " ");
        }

        //4)
        System.out.println("Please enter your password");
        String password = scanner.next();
        String exemplePassword = "1234b";
        if (password.equals(exemplePassword)) {
            System.out.println("yhyyyy");
        } else {
            System.out.println("Zrada");
        }

        //5)
        int sum = 0;
        int production = 1;
        for (int index = 0; index <= args.length - 1; index++) {
            sum = sum + Integer.parseInt(args[index]);
            production = production * Integer.parseInt(args[index]);
        }
        System.out.println("Production= " + production);
        System.out.println("Sum= " + sum);

        //6)
        int number = 3;
        int[] numberArray = new int[number];
        int whileIndex = 0;
        System.out.println("Please enter " + number + " ints");
        while (whileIndex < number) {
            System.out.println("Please enter one more int");
            numberArray[whileIndex] = Integer.parseInt(scanner.next());
            whileIndex++;

        }
        //6.1)
        System.out.println("Четные");
        whileIndex = 0;
        while (whileIndex < number) {
            if (numberArray[whileIndex] % 2 == 0) {
                System.out.println(numberArray[whileIndex]);
            }

            whileIndex++;
        }
        //6.2)
        System.out.println("Нечетные");
        whileIndex = 0;
        while (whileIndex < number) {
            if (numberArray[whileIndex] % 2 == 1) {
                System.out.println(numberArray[whileIndex]);
            }

            whileIndex++;
        }


        whileIndex = 0;
        int maxNumber = numberArray[0];
        while (whileIndex < number) {
            if (numberArray[whileIndex] > maxNumber) {
                maxNumber = numberArray[whileIndex];
            }
            whileIndex++;

        }
        System.out.println("Max Number = " + maxNumber);

        whileIndex = 0;
        int minNumber = numberArray[0];
        while (whileIndex < number) {
            if (numberArray[whileIndex] < minNumber) {
                minNumber = numberArray[whileIndex];
            }
            whileIndex++;

        }
        System.out.println("Min Number = " + minNumber);

        //6.3)
        System.out.println("Делятся на 3 или 9");
        whileIndex = 0;
        while (whileIndex < number) {
            if (numberArray[whileIndex] % 3 == 0 || numberArray[whileIndex] % 9 == 0) {
                System.out.println(numberArray[whileIndex]);
            }

            whileIndex++;
        }

        //6.4)
        System.out.println("Делятся на 5 и 7");
        whileIndex = 0;
        while (whileIndex < number) {
            if (numberArray[whileIndex] % 5 == 0 && numberArray[whileIndex] % 7 == 0) {
                System.out.println(numberArray[whileIndex]);
            }

            whileIndex++;
        }
        //6.5)
        System.out.println("Трехзначные");
        whileIndex = 0;
        while (whileIndex < number) {
            if (numberArray[whileIndex] >= 100 && numberArray[whileIndex] <= 999) {
                String thisNumber = Integer.toString(numberArray[whileIndex]);

                char firstChar = thisNumber.charAt(0);
                char secondChar = thisNumber.charAt(1);
                char thirdChar = thisNumber.charAt(2);
                if (firstChar != secondChar && secondChar != thirdChar) {
                    System.out.println(numberArray[whileIndex]);
                }
            }
            whileIndex++;

        }
        //6.6)
        System.out.println("Счастливые");
        whileIndex = 0;
        while (whileIndex < number) {

            String thisNumber = Integer.toString(numberArray[whileIndex]);
            int length = thisNumber.length();
            if (length > 1) {
                int charIndex = 0;
                boolean isMagicNumber = true;
                while (charIndex + 1 < length) {
                    if (thisNumber.charAt(charIndex) != thisNumber.charAt(charIndex + 1)) {
                        isMagicNumber = false;
                    }
                    charIndex++;
                }
                if (isMagicNumber) {
                    System.out.println("Счастливое= " + thisNumber);
                }
            }

            whileIndex++;

        }

        //6.7)
        System.out.println("Полусумма");
        whileIndex = 1;
        while (whileIndex + 1 < number) {
            int right = numberArray[whileIndex + 1];
            int left = numberArray[whileIndex - 1];
            int semiSum = (right + left) / 2;
            if (numberArray[whileIndex] == semiSum) {
                System.out.println("Элемент " + numberArray[whileIndex] + " равен полусумме своих соседей: " + numberArray[whileIndex - 1] + " и " + numberArray[whileIndex + 1]);

            }
            whileIndex++;


        }
    }
}


