package java_tutorial.enumaration;

import java.util.EnumSet;    // so we can use Range Method

public class ex {
    public static void main(String[] args) {

        for(enumaration i: enumaration.values())
            System.out.printf("%s\t%s\t%s\n",i,i.getDesc(),i.getYear());

        System.out.println("\nAnd now for the range of constants\n");

        for(enumaration i: EnumSet.range(enumaration.kelsey,enumaration.candy))
            System.out.printf("%s\t%s\t%s\n",i,i.getDesc(),i.getYear());

    }
}
