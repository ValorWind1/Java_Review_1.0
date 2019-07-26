package java_tutorial.Java_Formatting;

public class formatting {
    public static void main(String[] args) {

        // D = integer
        System.out.printf("%d",10);    // % = INDICATOR

        //F = floating point numbers
        System.out.printf("%f",10.1);

        //c = Character
        System.out.printf("%c",'a');

        //C = Character Capitalised
        System.out.printf("%C",'a');

        //s = String , there's also capital S, variant
        System.out.printf("%s","Hello");

        // b = Boolean conditional statement, there's also capital B , variant
        System.out.printf("%b",5<4);

        // e = Scientific notation , capital variance E
        System.out.printf("%e",10.123);

        //g = print decimal or scientific format , capital variance available
        System.out.printf("%g", 1000000.0);

        // o = octal base
        System.out.printf("%o",10);

        //x = hexidecimal , capital variance available
        System.out.printf("%x",10);

        // h = hash code , capital variance available
        System.out.printf("%h","hello");

        // a = hexidecimal floating point values
        System.out.printf("%a",10.12);

        // n = line break
        System.out.printf("%n");

        //%% = printing a percent symbol % .
        System.out.printf("%%");

    }
}
