package java_tutorial.enumaration;

import java.util.EnumSet;

public enum Enum1_0 {

    //  enumeration : kind of like classes but we can use to define constants
    // enumaration  = kinda like constants that act like objects

    daniel("cool","25"),camila ("cute","19"),alyssa("flake","20"),
    camilla("smart","16"),tayla("cute","18");

    private final String desc;
    private final String year;


    //enumaration constructor
    Enum1_0(String description,String birthday){
        desc = description;
        year = birthday;

    }

    public String getDesc(){
        return desc;

    }
    public String getYear(){
        return year;

    }

    public static void main(String[] args) {
        for(Enum1_0 i : Enum1_0.values()){  // built in array from enum/constants
            System.out.printf("%s\t%s\t%s\n",i,i.getDesc(),i.getYear());

        }
        System.out.println();
        for(Enum1_0 x : EnumSet.range(Enum1_0.camila,Enum1_0.tayla)){    // Enumset Range
            System.out.printf("%s\t%s\t%s\n",x,x.getDesc(),x.getYear());
        }
    }
}
