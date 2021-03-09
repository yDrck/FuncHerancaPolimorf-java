package entities;

public class Funcionario {
	
	protected String name;
	protected Integer hour;
	protected double valuePerHour;
	
	
	public Funcionario() {
		
	}
	
	public Funcionario(String name, Integer hour, double valuePerHour) {
		super();
		this.name = name;
		this.hour = hour;
		this.valuePerHour = valuePerHour;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double pagamento() {
		return this.getValuePerHour() * this.getHour();
	}

	
	
}
