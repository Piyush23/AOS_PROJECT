package environment;

import java.util.ArrayList;

public class Road {
	private int lid1, lid2;
	private ArrayList<Car> left, straight;

	public Road(int lid1, int lid2, ArrayList<Car> left, ArrayList<Car> straight) {
		super();
		this.lid1 = lid1;
		this.lid2 = lid2;
		this.left = left;
		this.straight = straight;
	}

	public int getLid1() {
		return lid1;
	}

	public void setLid1(int lid1) {
		this.lid1 = lid1;
	}

	public int getLid2() {
		return lid2;
	}

	public void setLid2(int lid2) {
		this.lid2 = lid2;
	}

	public ArrayList<Car> getLeft() {
		return left;
	}

	public void setLeft(ArrayList<Car> left) {
		this.left = left;
	}

	public ArrayList<Car> getStraight() {
		return straight;
	}

	public void setStraight(ArrayList<Car> straight) {
		this.straight = straight;
	}

}
