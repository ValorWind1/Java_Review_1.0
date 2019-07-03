package java_tutorial.class_hold_object_program;

public class DogList {

    private dog [] thelist = new dog[5];

    private int i = 0;

    public void add(dog d){
        if(i<thelist.length){  // check if the list is full or not .
            thelist[i] = d;
            System.out.println("Dog added at index " + i);
            i++;
        }

    }


}
