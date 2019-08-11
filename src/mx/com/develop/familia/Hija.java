package mx.com.develop.familia;

import java.util.Scanner;

public class Hija extends Padre{
	
	private static Scanner ent = new Scanner(System.in);
	


	@Override
	public String practicandoJava() { //Anulando el metodo de la clase padre 
		return super.practicandoJava();
	}

	public Hija() {	
		
	}
	
	public Hija(String nombres) {
		this(nombres, ent.next());
		super.setNombres(nombres);

	}

	public Hija(String nombres, String ApellidoP) {
		this(nombres,ApellidoP,getApelllidoP());
		
		//super.setApelllidoP(ApellidoP);
		//super.getApelllidoP();

	}
	public Hija(String nombres, String ApellidoP, String ApellidoM) {
		this(nombres,ApellidoP, ApellidoM, ent.next());
		super.setApelllidoM(ApellidoM);
	}

	public Hija(String nombres, String ApellidoP, String ApellidoM, String curp) {
		this(nombres,ApellidoP, ApellidoM, ApellidoM,ent.next());
		super.setCurp(curp);

	}
	public Hija(String nombres, String ApellidoP, String ApellidoM, String curp, String direccion) {
		this(nombres,ApellidoP, ApellidoM, ApellidoM, direccion,getDireccion());
		super.setDireccion(direccion);

	}
	public Hija(String nombres, String ApellidoP, String ApellidoM, String curp, String direccion, String matricula) {
		//super(nombres,ApellidoP,ApellidoM,curp,direccion);
		//super.setApelllidoP(apelllidoP);
		
		//this.matricula = matricula;

	}

	@Override
	public String toString() {
		return "Alumno [getCurp()=" + getCurp() + ", getNombres()=" + getNombres()
				+ ", getApelllidoP()=" + getApelllidoP() + ", getApelllidoM()=" + getApelllidoM() + ", getDireccion()="
				+ getDireccion() + "]";
	}

}
