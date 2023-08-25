package javaTest.smallChangeSys.homeWork.homeWork09;

public class LabeledPoint extends Point {


	private String labeled;

	public LabeledPoint(String labeled, double x, double y) {
		super(x, y);
		this.labeled = labeled;
	}

	@Override
	public String printPoint() {
		return this.labeled +", "+ super.printPoint() ;
	}
	

}
