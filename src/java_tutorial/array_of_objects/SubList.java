package java_tutorial.array_of_objects;

public class SubList {

    private Sub1 [] thelist = new Sub1[5]; // can hold 5 objts

    private int i = 0  ;

    public void add(Sub1 a){
        if(i<thelist.length){
            thelist[i]=a;
            System.out.println("animal added at index : "+i++);
        }
    }


}
