package java_review;

import java.util.Scanner;   // Scanner = accepts user inputs
import java.util.*;         // * = imports entire library

public class animal {           // Public means everyone can access it
     public static final double FAVNUMBER = 1.6180;    // static means it will be shared by every animal object
                                // final means thats a constant and it cant be changed
     private String name;       // variables/fields: can start with letters,_(underscore),$
                                // private methods can only be access by other methods INSIDE the class
     private int weight;

     private boolean hasOwner = false;

     private byte age;

     private long uniqueID;

     private char favoriteChar;

     private double speed;   // decimal numbers

    private float height;    // decimal too

    protected static int numberOfAnimals =0;   // protected data type : this value can only be access by other code in the package

    static Scanner userInput = new Scanner(System.in);  // System.in = receives data from the keyboard

    public animal(){          // every time an animal object is created we need a cosntructor
        // super();             // Ex every field , and method in animal will be available for subclasses dog and cat

        numberOfAnimals++; // ++ increase by one

        int sumOfNumbers = 5 + 1;
        System.out.println("5 + 1 = "+ sumOfNumbers);

        int diffOfNumbers = 5 - 1;
        System.out.println("5 - 1 = "+ diffOfNumbers);

        int multiplOfNumbers = 5 * 1;
        System.out.println("5 * 1 = "+ multiplOfNumbers);

        int divisOfNumbers = 5 / 1;
        System.out.println("5 / 1 = "+ divisOfNumbers);

        int modOfNumbers = 5 % 3;
        System.out.println("5 % 3 = "+ modOfNumbers);

        System.out.print("Enter the name: \n");
        if(userInput.hasNextLine()){    //hasnextline = if the user inputted a series of strings/characters

            this.setName(userInput.nextLine());                           // this = reference to the object that was created
                                        // hasNextInt (returning int), hasNextFloat(floats),hasNextDouble , hasNextBoolean
                                        // they will return true if its the right data type
        }

        this.setFavoriteChar();
        this.setUniqueID();          // method overloading

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique Id set to: "+ this.uniqueID);
    }

    public void setUniqueID() {   // method overloading. you can never have same attribute
        long minNumber = 1;
        long maxNumber = 1000000;

        this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber)+1)); // generating a random number and casting(long) , because random gives us a DOUBLE. We ave to tell java that we want a LONG
        String stringNumber = Long.toString(maxNumber); //converting primitive into a  string(object)

        int numberString = Integer.parseInt(stringNumber); // converting string(object into a primitive
        System.out.println("Unique Id set to: "+ this.uniqueID);

    }

    public char getFavoriteChar() {
        return favoriteChar;
    }

    public void setFavoriteChar(char favoriteChar) {
        this.favoriteChar = favoriteChar;
    }

    public void setFavoriteChar() {             // another method overloading
        int randomNumber=(int) (Math.random()*126) + 1;
        // converting above int into below char
        this.favoriteChar = (char) randomNumber;

        if(randomNumber == 32){
            System.out.println("Favorite character set to space");
        }else if (randomNumber==10){
            System.out.println("Favorite character se to newline");
        }else {

            System.out.println("Favorite character set to"+this.favoriteChar);
        }

        if ((randomNumber > 97 ) && (randomNumber < 122)) {
            System.out.println("Favorite character is a lowercase letter ");
        }
        if (((randomNumber > 97 ) && (randomNumber < 122)) || ((randomNumber > 64 ) && (randomNumber < 91))) {
            System.out.println("Favorite character is a  letter ");

        }

        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;

        switch(randomNumber){

            case 8:
                System.out.println("Favorite character set to backspace ");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Favprite character set to backspace ");
                break;

            default:
                System.out.println();
                break;


        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


    protected static void countTo(int startingNumber){

        for(int i = startingNumber; i <=100; i++){
            if(i == 90 ) continue;
            System.out.println(i);
        }
    }

    protected static String printNumbers(int maxNumbers){
        int i =1;

        while (i < (maxNumbers / 2)){
            System.out.println(i);
            i++;

            if(i == (maxNumbers/2)) break;
        }

        animal.countTo(maxNumbers/2);

        return " End of printNumbers";

    }

    protected static void guessMynumber(){

        int number ;

        do {

            System.out.println("Guess number up to 100");

            while(!userInput.hasNextInt()){
                String numberEntered = userInput.next();
                System.out.printf("%s is not a number\n",numberEntered);
            }

            number =userInput.nextInt();

        }while (number !=50);

    }

    //polymorphism
    public String makeSound(){
        return "GRRRR";
    }
    public static void speakAnimal(animal randanimal){

        System.out.println("animal says " + randanimal.makeSound());
    }



    // Execute code
    public static void main(String[] args) {   // void a method without any return values

        animal theAnimal = new animal();

        int[] favoriteNumber;
        favoriteNumber = new int[20];
        favoriteNumber[0] = 100;

        String [] stringArrays = {"Random", "Words", " Here"};

        for (String word : stringArrays){
            System.out.println(word);
        }

        String[][][] arrayName = {{{"000"}, {"100"},{"200"},{"300"}},
                {{"010"},{"110"},{"210"},{"310"}},
                {{"020"},{"120"},{"220"},{"320"} }};

    }

}
