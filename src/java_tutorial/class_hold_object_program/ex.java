package java_tutorial.class_hold_object_program;

public class ex {

    public static void main(String[] args) {

//        DogList doglistObject = new DogList();
//        dog d = new dog();
//        dog d1 = new dog();
//        doglistObject.add(d);
//        doglistObject.add(d1);


        AnimalList AL = new AnimalList();
        dog d = new dog();
        fish f = new fish();

        AL.animalAdd(d);
        AL.animalAdd(f);



    }
}
