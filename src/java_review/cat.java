package java_review;

public class cat extends animal {  //Ex every field , and method in animal will be available for subclasses dog and cat

    public cat(){


    }
    public String makeSound(){
        return " Meow";
    }

    public static void main(String[] args) {
        animal tomo = new cat();
        animal chester = new dog();

        animal[] TheAnimals = new animal[10];

        TheAnimals[0] = tomo;
        TheAnimals[1] = chester;

        System.out.println("Tomo says" + TheAnimals[0].makeSound());
        System.out.println("Chester says" + TheAnimals[1].makeSound());

    }
}
