

public class BroomSold implements State {
 
    BroomMachine bm;
 
    public BroomSold(BroomMachine bm) {
        this.bm = bm;
    }
       
	public void insertRoller() {
		System.out.println("Sale Process Completing");
	}
 
	public void ejectRoller() {
		System.out.println("Dont eject Roller...");
	}
 
	public void makeComplete() {
		System.out.println("Process Complete!");
	}
 
	public void dispense() {
		bm.productRelease();
		if (bm.getI() > 0) {
			bm.setBroomState(bm.getNoMaterialState());
		} else {
			System.out.println("No Stock available !");
			bm.setBroomState(bm.getNoStockState());
		}
	}
	
	public void startProcess() { }
 
	public String toString() {
		return "Product dispensing started";
	}
}

