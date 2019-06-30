package java_tutorial.toString;

public class toString {

    private int month;
    private int day;
    private int year;


    public toString(int m , int d , int y){
        month = m;
        day = d;
        year = y;

        System.out.printf("The constructor for this is %s\n",this);
    }

    // string representation of an object

    public String toString(){

        return String.format("%d/%d/%d" ,month,day,year);

// composition = references to other objects in other classes .

    }

}
