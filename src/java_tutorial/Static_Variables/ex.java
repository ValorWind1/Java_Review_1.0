package java_tutorial.Static_Variables;

public class ex {
    public static void main(String[] args) {
        staticVariables member1 = new staticVariables("Megan" , "Fox");
        staticVariables member2 = new staticVariables("Natalie" , "Portman");
        staticVariables member3 = new staticVariables("Taylor" , "Swift");


        System.out.println();
//        System.out.println(member1.getFirstN());
//        System.out.println(member1.getLastN());
//        System.out.println(member1.getMembers());

        System.out.println(staticVariables.getMembers());


    }
}
