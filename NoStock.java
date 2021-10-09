

public class NoStock implements State {

    BroomMachine bm;
 
    public NoStock(BroomMachine bm) {
        this.bm = bm;
    }
 
	public void insertRoller() {
		System.out.println("Roller Insterted ...");
		bm.setBroomState(bm.getHasMaterialState());
	}
 
	public void ejectRoller() {
		System.out.println("Roller is Ejected...");
	}
 
	public void makeComplete() {
		System.out.println("There is no material");
	 }
 
	public void dispense() {
		System.out.println("There is no material to complete and submit");
	} 
	
	public void startProcess() { }
 
	public String toString() {
		return "Material Processing.. roller wait period..";
	}
}
