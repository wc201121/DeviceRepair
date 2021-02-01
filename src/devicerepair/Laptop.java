package devicerepair;

import java.util.*;

public class Laptop extends Device {

    private ArrayList<Component> Components = new ArrayList<>();

    public Laptop(String IdentificationCode, String MakeAndModel, String owner, String ProblemDescription, String RepairNotes, String priority) {
        super(IdentificationCode, MakeAndModel, owner, ProblemDescription, RepairNotes, priority);
    }

    public ArrayList<Component> getComponents() {
        return Components;
    }

    public void setComponents(ArrayList<Component> Components) {
        this.Components = Components;
    }
    
    public void addComponent(Component component){
        Components.add(component);
        
    }
    
//    public void deleteComponent(int index) {
//        if (index >= 0 && < Components.size()) {
//                Components.remove(index);
//        }
    }


