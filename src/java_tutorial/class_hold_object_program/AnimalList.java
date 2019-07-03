package java_tutorial.class_hold_object_program;

public class AnimalList {

    private animal[] animalList = new animal[5];
    private int i = 0 ;

    public void animalAdd(animal a){

        if(i<animalList.length){
            animalList[i] = a;
            System.out.println("Animal Added at index "+i);
            i++;
        }
    }

}
