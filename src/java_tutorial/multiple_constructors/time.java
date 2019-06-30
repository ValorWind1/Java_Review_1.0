package java_tutorial.multiple_constructors;

public class time {

    private int hour;           // 3 variables
    private int minute;
    private int second;

    public time (){                     // we can have as many methods that we want depending on the amount of arguments
        this(0,0,0);

    }

    public time (int h) {
        this(h, 0, 0);
    }

    public time (int h,int m) {
        this(h, m, 0);
    }


    public time (int h,int m ,int s) {
        setTime(h,m,s);

    }

    public void setTime(int h, int m , int s){   // method

        setHour(h);
        setMinute(m);
        setSecond(s);

                            // we need 3 methods in order to check that hours 24 , minute/second 60
    }
    public void setHour(int h){            // set methods are used to change data
        hour = ((h>=0&&h<24)?h:0);
    }

    public void setMinute(int m){
        minute = ((m>=0&&m<60)?m:0);

    }
    public void setSecond(int s){
        second = ((s>=0&&s<60)?s:0);

    }

                                             // get method to retrieve data from set methods
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }


    // formatting method/display method

    public String toMilitaryTime(){

        return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());    // %02d = 2 decimal places
    }

}
