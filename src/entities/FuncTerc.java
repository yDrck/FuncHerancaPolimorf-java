package entities;

public class FuncTerc extends Funcionario {

	private double adicional;

	public FuncTerc() {
		
	}
	
	public FuncTerc(String name, Integer hour, double valuePerHour, double adicional) {
		super(name, hour, valuePerHour);
		this.adicional = adicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + (this.adicional*1.1);
	}
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

}
