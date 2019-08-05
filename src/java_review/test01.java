package java_review;

public class test01 {

private String gname;

    public test01(String name){
        gname = name;
    }

    public void setName(String name){
        gname = name;
}

    public String getName(){
        return gname;
    }
    public void displayName(){
        System.out.println("name is: "+gname);
    }


}
