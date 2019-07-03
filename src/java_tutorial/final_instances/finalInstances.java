package java_tutorial.final_instances;

public class finalInstances {

    private int sum;
    private final int NUMBER ;  // final = cant modified not matter what

    public finalInstances(int x){
        NUMBER = x ;
    }

    public void add(){

        sum+= NUMBER;
    }

    public String toString(){

        return String.format("sum = %d\n", sum);


    }

}
