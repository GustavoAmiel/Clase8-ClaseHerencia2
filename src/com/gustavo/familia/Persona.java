package com.gustavo.familia;

public class Persona {
	private String curp;
	private String nombres;
	private static String apelllidoP;
	private String apelllidoM;
	private static String direccion;

	public Persona(String nombres, String apelllidoP, String apelllidoM, String curp, String direccion) {
		super();
		this.curp = curp;
		this.nombres = nombres;
		this.apelllidoP = apelllidoP;
		this.apelllidoM = apelllidoM;
		this.direccion = direccion;
	}

	public Persona() {

	}

	/**
	 * Metodos Setters and Getters
	 */
	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public static String getApelllidoP() {
		return apelllidoP;
	}

	public void setApelllidoP(String apelllidoP) {
		this.apelllidoP = apelllidoP;
	}

	public String getApelllidoM() {
		return apelllidoM;
	}

	public void setApelllidoM(String apelllidoM) {
		this.apelllidoM = apelllidoM;
	}

	public static String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [curp=" + curp + ", nombres=" + nombres + ", apelllidoP=" + apelllidoP + ", apelllidoM="
				+ apelllidoM + ", direccion=" + direccion + "]";
	}
}
