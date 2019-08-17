package java_tutorial.polymorphism_test;

public class Ex {
    public static void main(String[] args) {

        // polymorphism :

        Sub1 subobj = new Sub3();
        Sub1 subobj1 = new Sub2();

        subobj.e();
        subobj1.e();
        System.out.println();

        // polymorphic array - why polymorphism is useful

        //stores objects from different classes

        Sub1 sub[] = new Sub1[2];
        sub[0] = new Sub2();
        sub[1] = new Sub3();

        //
        for (int i = 0 ; i<sub.length;i++){
            sub[i].e();
        // goes through every object and call the e method
        }



    }

}
