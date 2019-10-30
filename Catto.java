package animalContest;

public class Catto extends Animal{
	
	boolean box;

	public Catto(String name, int bornY, boolean box) {
		super(name, bornY);
		this.box = box;
	}
	
	@Override
	public void setSumPointContest() {
		// TODO Auto-generated method stub
		super.setSumPointContest();
		if(!box) {
			setSumPoint(0);
		}
	}

	@Override
	public String toString() {
		return "Catto [box=" + box + "]"+super.toString() ;
	}

}
