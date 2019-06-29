package java_tutorial;

import java.util.Random;

public class random_number_generator {
    public static void main(String[] args) {
        Random rd = new Random();

        int number;

        for (int counter = 1; counter <= 10; counter++) {
            number = 1+rd.nextInt(6); // inside parenthesis we write how many options we want it to have for random gen

            System.out.println("number :"+ number);
        }
    }
}
