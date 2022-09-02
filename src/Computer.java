
public class Computer extends Book {
	private String type;
	String str="NetWorking";
	String str1="DataStructure";
	String str2="DBMS";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if(type.equals(str)||type.equals(str1)||type.equals(str2)) {
		this.type = type;
	}
		else {
			System.out.println("oops sorry this is Invalid type!");
		}
	
	
	}
}
