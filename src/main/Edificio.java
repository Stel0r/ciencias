package main;

public class Edificio implements Comparable<Edificio> {
	
	private int pisos;
	private double area;
	private int localidad;
	
	
	public Edificio(int pisos, double area, int localidad) {
		super();
		this.pisos = pisos;
		this.area = area;
		this.localidad = localidad;
	}
	
	public int getPisos() {
		return pisos;
	}
	public void setPisos(int pisos) {
		this.pisos = pisos;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getLocalidad() {
		return localidad;
	}
	public void setLocalidad(int localidad) {
		this.localidad = localidad;
	}

	@Override
	public int compareTo(Edificio o) {
		if(o.localidad!=this.localidad)
			return this.localidad - o.localidad;
		if(o.area != this.area)
			return (int) (this.area - o.area);
		if(o.pisos != this.pisos)
			return this.pisos - o.pisos;
		return 0;
	}
	
	
}
