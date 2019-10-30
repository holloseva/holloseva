package animalContest;

import java.util.Random;

public class Doggo extends Animal{
	
	int loyalty;
	
	public void setBeautyContest() {
		Random r = new Random();
		setBeauty(r.nextInt(101));
	}
	
	@Override
	public void setSumPointContest() {
		// TODO Auto-generated method stub
		
		super.setSumPointContest();
		setLoyaltyContest();
		int sum= getSumPoint();
		setSumPoint((sum+loyalty)*100/200);
	}

	@Override
	public String toString() {
		return "Doggo [loyalty=" + loyalty + "]"+super.toString() ;
	}
	
	
	public void setLoyaltyContest() {
		Random r = new Random();
		setLoyalty(r.nextInt(101));
	}

	public int getLoyalty() {
		return loyalty;
	}

	public void setLoyalty(int loyalty) {
		this.loyalty = loyalty;
	}

	public Doggo(String name, int bornY) {
		super(name, bornY);
	}

}
