package java_tutorial.p;

public class ex {
    public static void main(String[] args) {

//        // polymorphic array
//
//        superClass array1[]= new superClass[2];
//        array1[0] = new subClass();
//        array1[1]=new subClass1();
//
//        for (int x=0;x<2;++x){
//            array1[x].eat();



        // polymorphic arguments

        fatty bk = new fatty();
        superClass sc = new superClass();
//        subClass1 sc1 = new subClass1();
        superClass sc1 = new subClass1();


        bk.digest(sc);
        bk.digest(sc1);


        }


    }
