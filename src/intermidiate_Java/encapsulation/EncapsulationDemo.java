package intermidiate_Java.encapsulation;

public class EncapsulationDemo {
    // encapsulation = binding data with methods

    // Private variables
    private Integer moneyOwed;
    // We make sure variables are always private
    private String name;


// Getter, and setter methods that will access our private variables.

    public Integer getMoneyOwed() {

        return moneyOwed;
    }

    public void setTotal(Integer moneyOwed) {

        this.moneyOwed = moneyOwed;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}