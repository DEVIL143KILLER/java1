package Oops;

class Enc {
	private int roll;
	private String name;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Encapsulation 
{
	public static void main(String[] args) 
	{
		Enc e = new Enc();
		e.setRoll(23);
		e.setName("Ram");
		System.out.println("Roll:" + e.getRoll());
		System.out.println("Name:" + e.getName());
	}

}