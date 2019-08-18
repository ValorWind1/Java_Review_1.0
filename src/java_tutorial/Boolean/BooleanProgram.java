package java_tutorial.Boolean;

public class BooleanProgram {
    public static void main(String[] args) {

        boolean passsedDoor = true ;
        boolean missedDoor = false ;
        boolean passedAllDoors = false;

        int counter = 0 ;



        if(passsedDoor){
            System.out.println("passed 1st door");
            counter = counter + 1;
        }
        if(passsedDoor){
            System.out.println("passed 2nd door");
            counter = counter + 1 ;
        }
        if(passsedDoor){
            System.out.println("passed 3rd door");
            counter = counter + 1;
        }
        if(counter == 3){
            passedAllDoors = true;

        }
        if (passedAllDoors ){
            System.out.println("U WON");
        }

    }

}
