package java_tutorial.final_instances;

public class ex {
    public static void main(String[] args) {


        finalInstances finalInstancesObject = new finalInstances(10);

        for(int i =0; i<5;i++){
            finalInstancesObject.add();
            System.out.printf("%s",finalInstancesObject);

        }

    }
}
