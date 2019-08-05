package java_tutorial.multipleMethods_and_instances;

public class tuna {

    private String girlName;    // private instances variables .only accessed by methods inside class can use it

    public void setName(String name){
        girlName=name;

    }

    public String getName(){

        return girlName;
    }

    public void saying(){

        System.out.printf("your first gf was %s",getName());
    }
}
