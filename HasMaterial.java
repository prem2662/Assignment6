

public class HasMaterial implements State {
	BroomMachine bm;
 
	public HasMaterial(BroomMachine bm) {
		this.bm = bm;
	}
  
	public void insertRoller() {
		System.out.println("Already roller inserted. ");
	}
 
	public void ejectRoller() {
		System.out.println("roller use in process");
		bm.setBroomState(bm.getNoMaterialState());
	}
 
	public void makeComplete() {
		System.out.println("Product make complete...");
		bm.setBroomState(bm.getBroomSoldState());
	}

    public void dispense() {
        System.out.println("Product ready for dispense");
    }
    
    public void startProcess() { }
 
	public String toString() {
		return "Waiting for sale process";
	}
}
