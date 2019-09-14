package java_youtubeclips.this_keywordd;

class thisDemoClass {

    String a = "ciao";

    String b = "chao";



    public thisDemoClass(String a , String b){

    this.a = a;
    this.b = b;

    }
}

public class thisDemo {

    public static void main(String[] args) {

        thisDemoClass thobj = new thisDemoClass("hey", "hello"); // constructor

        System.out.println(thobj.a);

        System.out.println(thobj.b);



    }
}
