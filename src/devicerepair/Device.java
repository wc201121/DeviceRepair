
package devicerepair;

public class Device {
    
    protected String IdentificationCode;
    protected String MakeAndModel;
    protected String owner;
    protected String ProblemDescription;
    protected String RepairNotes;
    protected String priority;

    public Device(String IdentificationCode, String MakeAndModel, String owner, String ProblemDescription, String RepairNotes, String priority) {
        this.IdentificationCode = IdentificationCode;
        this.MakeAndModel = MakeAndModel;
        this.owner = owner;
        this.ProblemDescription = ProblemDescription;
        this.RepairNotes = RepairNotes;
        this.priority = priority;
    }
    
    public String toString(){
        return IdentificationCode + ", " + MakeAndModel + ", " + owner + ", " + ProblemDescription + ", " + RepairNotes + ", " + priority + ".";
    }

    public String getIdentificationCode() {
        return IdentificationCode;
    }

    public void setIdentificationCode(String IdentificationCode) {
        this.IdentificationCode = IdentificationCode;
    }

    public String getMakeAndModel() {
        return MakeAndModel;
    }

    public void setMakeAndModel(String MakeAndModel) {
        this.MakeAndModel = MakeAndModel;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public void setProblemDescription(String ProblemDescription) {
        this.ProblemDescription = ProblemDescription;
    }

    public String getRepairNotes() {
        return RepairNotes;
    }

    public void setRepairNotes(String RepairNotes) {
        this.RepairNotes = RepairNotes;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    
    
    
}
