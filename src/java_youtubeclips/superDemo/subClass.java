package java_youtubeclips.superDemo;

public class subClass extends FirstClass{

    public void dummyMethod(){
//        super.dummyMethod();
        System.out.println("dummy");


    }

    public static void main(String[] args) {

        subClass sobj = new subClass();

        sobj.dummyMethod();
    }
}
