package drones;
public class Dron {
	//declaracion de variables
	int	rpmRotor1;
	int rpmRotor2;
	int rpmRotor1Max;
	int rpmRotor2Max;
	Double  empuje;
	final Double factorEmpuje=2.3;
	//constructor por defecto
	public Dron() {
		this.rpmRotor1 = 0;
		this.rpmRotor2 = 0;
		this.rpmRotor1Max = 1000;
		this.rpmRotor2Max = 1000;
		this.empuje =0.0;
	}
	//segundo constructor con revoluciones maximas dadas por un valor
	public Dron(int rpmRotorMax) {
		this.rpmRotor1 = 0;
		this.rpmRotor2 = 0;
		this.rpmRotor1Max = rpmRotorMax;
		this.rpmRotor2Max = rpmRotorMax;
		this.empuje =0.0;
	}
	
	//getter y seters, en el caso de getFactorEmpuje solo tiene get ya que es una variable final.
	public int getRpmRotor1() {
		return rpmRotor1;
	}
	public void setRpmRotor1(int rpmRotor1) {
		this.rpmRotor1 = rpmRotor1;
	}
	public int getRpmRotor2() {
		return rpmRotor2;
	}
	public void setRpmRotor2(int rpmRotor2) {
		this.rpmRotor2 = rpmRotor2;
	}
	public int getRpmRotor1Max() {
		return rpmRotor1Max;
	}
	public void setRpmRotor1Max(int rpmRotor1Max) {
		this.rpmRotor1Max = rpmRotor1Max;
	}
	public int getRpmRotor2Max() {
		return rpmRotor2Max;
	}
	public void setRpmRotor2Max(int rpmRotor2Max) {
		this.rpmRotor2Max = rpmRotor2Max;
	}
	public Double getEmpuje() {
		return empuje;
	}
	public void setEmpuje(Double empuje) {
		this.empuje = empuje;
	}
	public Double getFactorEmpuje() {
		return factorEmpuje;
	}
	@Override
	public String toString() {
		return "Dron [RPM del motor 1=" + rpmRotor1 + ", RPM del motor 2=" + rpmRotor2 + ", empuje=" + empuje + "]";
	}
	
	public boolean rotoresEnPar() {
		if (getRpmRotor1()==getRpmRotor2()) {
			return true;
		}else {
			return false;
		}
	}
	public void IncRpmRotor(int n) {
		switch (n) {
		case 1:
			if (getRpmRotor1()<=(getRpmRotor1Max()-100)) {
				setRpmRotor1(getRpmRotor1()+100);
			}
			setRpmRotor1(getRpmRotor1());
			
			break;
		case 2:
			if (getRpmRotor2()<=(getRpmRotor2Max()-100)) {
				setRpmRotor2(getRpmRotor2()+100);
			}
			setRpmRotor2(getRpmRotor2());
			
			break;
		case 3:
			if (getRpmRotor1()<=(getRpmRotor1Max()-100)) {
				setRpmRotor1(getRpmRotor1()+100);
			}
			if (getRpmRotor2()<=((getRpmRotor2Max()-100))) {
				setRpmRotor2((getRpmRotor2()+100));
			}
			setEmpuje(getEmpuje()+0.5);
			break;
		}
		setEmpuje(getEmpuje()+0.5);
		if(rotoresEnPar()) {
			setEmpuje((getEmpuje()*2.3));
		}
	}
	
	
	
}
