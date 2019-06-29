package java_tutorial.Time_Class;

public class ex {
    public static void main(String[] args) {
        time_Class timeObject = new time_Class();
        System.out.println(timeObject.toMilitary());
        timeObject.setTime(13,27,6);
        System.out.println(timeObject.toMilitary());

    }
}
