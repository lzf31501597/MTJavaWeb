package javaTest.smallChangeSys.homeWork.homeWork09;

public class LabeledPoint extends Point {


	String labeled;

	public LabeledPoint(String labeled, double x, double y) {
		super(x, y);
		this.labeled = labeled;
	}

	@Override
	public String printPoint() {
		// TODO Auto-generated method stub
		return this.labeled +", "+ super.printPoint() ;
	}
	

}
