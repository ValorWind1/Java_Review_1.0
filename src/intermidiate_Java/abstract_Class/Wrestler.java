package intermidiate_Java.abstract_Class;


/**
 *
 * Also a contract like an interface
 *Abstract class got abstract methods
 * An Abstract =  is a method that doesn't contain a body **
 * An Abstract Class = Is a class that usually contains at least one abstract method **
 *
 */

public abstract class Wrestler {

    public void paymentForWork(int hours){
        System.out.println("The Wrestle Will Make $ "+ hours*250.000+" for tonight's match");

        
    }

    public abstract void themeMusic();
    public abstract void finisher();


}
