package homework;

public class Health {
	
	protected char gender;
	protected double height;
	protected double weight;
	
	
	public Health(char gender, double height, double weight) {
			this.gender = gender;
			this.height = height;
			this.weight = weight;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
}
