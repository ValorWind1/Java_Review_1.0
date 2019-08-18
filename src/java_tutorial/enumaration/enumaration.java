package java_tutorial.enumaration;

public enum enumaration {      // enumerations : Constants that are also objects

    bucky("nice","22"),
    kelsey("cutie","10"),
    julia("bigmistake","12"),
    nicole("italian","13"),
    candy("different","14"),
    erin("iwish","16");


    private final String desc;
    private final String year;

    enumaration(String description, String birthday){
        desc = description;
        year = birthday;


    }

    public String getDesc(){
        return desc;

    }

    public String getYear(){
        return year;
    }




}
