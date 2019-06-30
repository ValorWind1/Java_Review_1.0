package java_tutorial.multiple_constructors;

public class ex {
    public static void main(String[] args) {

        time timeobject1 = new time();
        time timeobject2 = new time(5);
        time timeobject3 = new time(5,13);
        time timeobject4 = new time(5,13,45);

        System.out.printf("%s\n",timeobject1.toMilitaryTime());
        System.out.printf("%s\n",timeobject2.toMilitaryTime());
        System.out.printf("%s\n",timeobject3.toMilitaryTime());
        System.out.printf("%s\n",timeobject4.toMilitaryTime());
    }
}
