

package devicerepair;

public class Component {
    private String ComponentName;
    private double cost;

    public Component(String ComponentName, double cost) {
        this.ComponentName = ComponentName;
        this.cost = cost;
    }
    
    public String toString(){
        return ComponentName + ", " + cost + ".";
    }

    public String getComponentName() {
        return ComponentName;
    }

    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    
    
}
