package mx.com.develop.familia;

import java.util.Scanner;

public class Padre extends Persona {

	private static Scanner ent = new Scanner(System.in);

	public static void correr() {
		System.out.println("El padre esta corriendo");
	}

	public String practicandoJava() {

		return getNombres() + " esta practicando Java";
	}

	public Padre() {

	}

	public Padre(String nombres) {
		this(nombres, ent.next());
		super.setNombres(nombres);

	}

	public Padre(String nombres, String ApellidoP) {
		this(nombres, ApellidoP, ent.next());

		super.setApelllidoP(ApellidoP);

	}

	public Padre(String nombres, String ApellidoP, String ApellidoM) {
		this(nombres, ApellidoP, ApellidoM, ent.next());
		super.setApelllidoM(ApellidoM);
	}

	public Padre(String nombres, String ApellidoP, String ApellidoM, String curp) {
		this(nombres, ApellidoP, ApellidoM, ApellidoM, ent.next());
		super.setCurp(curp);

	}

	public Padre(String nombres, String ApellidoP, String ApellidoM, String curp, String direccion) {
		this(nombres, ApellidoP, ApellidoM, ApellidoM, direccion, ent.next());
		super.setDireccion(direccion);

	}

	public Padre(String nombres, String ApellidoP, String ApellidoM, String curp, String direccion, String matricula) {
		// super(nombres,ApellidoP,ApellidoM,curp,direccion);
		// super.setApelllidoP(apelllidoP);

		// this.matricula = matricula;

	}

	@Override
	public String toString() {
		return "Alumno [getCurp()=" + getCurp() + ", getNombres()=" + getNombres() + ", getApelllidoP()="
				+ getApelllidoP() + ", getApelllidoM()=" + getApelllidoM() + ", getDireccion()=" + getDireccion() + "]";
	}

}
