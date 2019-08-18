package java_tutorial.arrays1_0;

public class Summing_arrays_elements {
    public static void main(String[] args) {

        int a [ ] = {1,2,3,4,5,6};

        int sum = 0 ;

        for(int i = 0; i<a.length;i++){
            sum += a[i];
            System.out.println(sum);
            System.out.println("-------------");

        }
        System.out.println("The sum is "+sum);


    }
}
