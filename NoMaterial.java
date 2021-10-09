

public class NoMaterial implements State {
    BroomMachine bm;
 
    public NoMaterial(BroomMachine bm) {
        this.bm = bm;
    }
 
	public void insertRoller() {
		System.out.println("Material Required to process");
		bm.setBroomState(bm.getHasMaterialState());
	}
 
	public void ejectRoller() {
		System.out.println("please use insert roller first");
	}
 
	public void makeComplete() {
		System.out.println("roller activity is not done to complete make");
	 }
 
	public void dispense() {
		System.out.println("Product is not made");
	} 
	
	public void startProcess() { }
 
	public String toString() {
		return "procuring Material";
	}
}
