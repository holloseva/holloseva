package animalContest;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Animal implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;
 
	
	private String name;
	private int bornY;
	private int beauty;
	private int behavior;
	private int sumPoint;
	private static int nO =0;
	
	public int getnO() {
		return nO;
	}
	public void setnO() {
		nO++;
	}

	static int maxYear= 10;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBornY() {
		return bornY;
	}
	public void setBornY(int bornY) {
		this.bornY = bornY;
	}
	public int getBeauty() {
		return beauty;
	}
	public void setBeauty(int beauty) {
		this.beauty = beauty;
	}
	public int getBehavior() {
		return behavior;
	}
	public void setBehavior(int behavior) {
		this.behavior = behavior;
	}
	public Animal(String name, int bornY) {
		super();
		this.name = name;
		this.bornY = bornY;
		setnO();
	
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public int getSumPoint() {
		return sumPoint;
	}
	public void setSumPoint(int sumPoint) {
		this.sumPoint = sumPoint;
	}
	
	public void setBeautyContest() {
		Random r = new Random();
		setBeauty(r.nextInt(101));
	}
	
	public void setBehaviorContest() {
		Random r = new Random();
		setBehavior(r.nextInt(101));
	}
	
	public void setSumPointContest() {


int year = Calendar.getInstance().get(Calendar.YEAR);
		int y = year -bornY;
		if(y>maxYear) {
			setSumPoint(behavior);
		}
		else {
			setSumPoint(((maxYear-y)*getBeauty()+y*getBehavior())/maxYear);
		}
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", bornY=" + bornY + ", beauty=" + beauty + ", behavior=" + behavior
				+ ", sumPoint=" + sumPoint + ", nO=" + nO + "]";
	}
	
	
	
	

}
