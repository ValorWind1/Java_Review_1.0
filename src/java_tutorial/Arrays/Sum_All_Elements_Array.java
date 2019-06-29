package java_tutorial.Arrays;

public class Sum_All_Elements_Array {
    public static void main(String[] args) {

        int sports [] = {21,43,53,7,3,5};

        int sum=0;

        for(int counter = 0;counter<sports.length;counter++){

            sum+=sports[counter];

        }


        System.out.println("the sum of these numbers is " + sum);

    }
}
