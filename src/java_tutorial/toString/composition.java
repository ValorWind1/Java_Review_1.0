package java_tutorial.toString;

public class composition {

    // composition = references to other objects in other classes .

    private String name;
    private toString birthday;

    public composition(String theName, toString theDate) {   // constructor

        name = theName;
        birthday = theDate;


    }

    public String toString() {

            return String.format("My name is %s, my birthday is %s ",name,birthday);  // you cvan a string / or an object

    }

}

