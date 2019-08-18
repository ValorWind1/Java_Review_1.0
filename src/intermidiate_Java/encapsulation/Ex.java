package intermidiate_Java.encapsulation;

public class Ex {

    public static void main(String[] args) {

        EncapsulationDemo demoObject1 = new EncapsulationDemo();
        demoObject1.setTotal(5);
        demoObject1.setName("Dan");

        System.out.println(demoObject1.getMoneyOwed());
        System.out.println(demoObject1.getName());

    }
}
