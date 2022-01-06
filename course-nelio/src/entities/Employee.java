package entities;

public class Employee {

	private String name;
	private Double valuePerHour;
	private Integer hours;
	
	
	public Employee() {
	}


	public Employee(String name, Double valuePerHour, Integer hours) {
		this.name = name;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getValuePerHour() {
		return valuePerHour;
	}
	
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Integer getHours() {
		return hours;
	}
	
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double payEmployee() {
		return valuePerHour * hours;
	}
}







