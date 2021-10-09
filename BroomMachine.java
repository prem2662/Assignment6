
public class BroomMachine
{
        
        int i = 0;
        State broomstate;
        State nostock;
	State broomsold;
	State nomaterial;
	State hasmaterial;
 
	
	
 
	public BroomMachine(int broomcnt) {
		nostock = new NoStock(this);
		broomsold = new BroomSold(this);
		nomaterial = new NoMaterial(this);
		hasmaterial = new HasMaterial(this);

		this.i = broomcnt;
 		if (broomcnt > 0) {
			broomstate = nomaterial;
		} else {
			broomstate = nostock;
		}
	}
 
	public void insertRoller() {
		broomstate.insertRoller();
	}
 
	public void ejectRoller() {
		broomstate.ejectRoller();
	}
 
	public void makeComplete() {
		broomstate.makeComplete();
		broomstate.dispense();
	}
 
	void productRelease() {
		System.out.println("A Broom Stick is recived by packing station...");
		if (i > 0) {
			i = i - 1;
		}
	}
 
	int getI() {
		return i;
	}
 
	void startProcess(int c) {
		this.i += c;
		System.out.println("The product process is started, the product count is : " + this.i);
		broomstate.startProcess();
	}

	void setBroomState(State state) {
		this.broomstate = state;
	}
    public State getBroomState() {
        return broomstate;
    }

    public State getNoStockState() {
        return nostock;
    }

    public State getNoMaterialState() {
        return nomaterial;
    }

    public State getHasMaterialState() {
        return hasmaterial;
    }

    public State getBroomSoldState() {
        return broomsold;
    }
 
	public String toString() {
		StringBuffer output = new StringBuffer();
		output.append("\n Stock is: " + i + " Brooms");
		if (i != 1) {
			output.append("\n There is Stock: Yes");
		}
		
		output.append("\n Broom Machin State: " + broomstate + "\n");
		return output.toString();
	}
}

