public class BroomMachineTest
{
    

	public static void main(String[] args) {
		BroomMachine bm = new BroomMachine(10);

		System.out.println(bm);

		bm.insertRoller();
		bm.makeComplete();

		System.out.println(bm);

		bm.insertRoller();
		bm.makeComplete();
		bm.insertRoller();
		bm.makeComplete();
		
		bm.startProcess(10);
		bm.insertRoller();
		bm.makeComplete();

		System.out.println(bm);
	}

}

