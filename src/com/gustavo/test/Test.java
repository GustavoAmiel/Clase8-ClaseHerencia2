package com.gustavo.test;

import com.gustavo.familia.Hija;
import com.gustavo.familia.Padre;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Padre padre = new Padre();
		
		padre.setNombres("Gustavo Amiel");
		padre.setApelllidoP("Urbina");
		padre.setApelllidoM("Avila");
		padre.setCurp("curp#123456");
		padre.setDireccion("direccion#1234");
		
		Hija hija = new Hija();
		
		hija.setNombres("Dulce");
		hija.setApelllidoP("Urbina");
		hija.setApelllidoM("Avila");
		hija.setCurp("curp#123456");
		hija.setDireccion("direccion#1234");
		
		
		System.out.println(padre.practicandoJava());
		System.out.println(hija.practicandoJava()); //Anulando el metodo de la clase Padre
//		System.out.println(new Padre().practicandoJava());
//		System.out.println(new Hija().practicandoJava());

	}

}
