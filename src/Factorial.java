
public class Factorial {
	private int number;
	private int fact;
	public void setNumber(int number) {
		this.number = number;
	}
	public int getFact() {
		return fact;
	}
	public void setFact(int fact) {
		this.fact = fact;
	}
	public int getNumber() {
		return number;
	}
	public int calfact(int n) {
		if(n==0)
			return 1;
		return n*calfact(n-1);
	}

}
