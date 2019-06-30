package java_tutorial.Static_Variables;

public class staticVariables {

    private String firstN;
    private String lastN;
    private static int members =0;       // every object shares the same variable

    public staticVariables(String fn,String ln){

        firstN = fn;
        lastN = ln;
        members ++;
        System.out.printf("Constructor for %s %s, members in the club : %d\n",firstN,lastN,members);

    }
    public String getFirstN(){
        return firstN;
    }
    public String getLastN(){
        return lastN;
    }
    public static int getMembers(){
        return members;
    }

}
