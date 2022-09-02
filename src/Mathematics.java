
public class Mathematics extends Book {
	private String type;
	String str="Algebraic";
	String str1="Geometery";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if(type.equals(str)||type.equals(str1)) {
		this.type = type;
	}
		else {
			System.out.println("oops sorry!");
		}
	
}
}
