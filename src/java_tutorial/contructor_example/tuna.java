package java_tutorial.contructor_example;

public class tuna {
    private String girlName;    // private instances variables .only accessed by methods inside class can use it

    public tuna(String name){      // constructor object,initialize your variable as soon as we create object.
        girlName = name;

    }
    public void setName(String name){
        girlName=name;

    }

    public String getName(){
        return girlName;
    }

    public void saying(){
        System.out.printf("yourt first gf was %s",getName());
    }
}
