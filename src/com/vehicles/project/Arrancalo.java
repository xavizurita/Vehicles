package com.vehicles.project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arrancalo {

	public static void main(String[] args) {
		
		Scanner lectura = new Scanner(System.in);
		Scanner lectura2 = new Scanner(System.in);
		Scanner lectura3 = new Scanner(System.in);
		Car ObjCar[] = new Car[10];							
		Bike ObjBike[] = new Bike[10];
		
		String plate = "";				
		String brand = "";
		String color = "";
		int resposta=0;
		int resposta2=0;
		String brandWheel;
		Double diameterDavantDreta;
		Double diameterDavantEsquerra;
		Double diameterDarreraDreta;
		Double diameterDarreraEsquerra;
		
		while (resposta !=1 && resposta !=2 && resposta !=3) {
//			resposta = Integer.parseInt(JOptionPane.showInputDialog("1.- Car \n2.- Bike \n3.- End \n -- write and choose an option  --"));
			System.out.println("-- write and choose an option  -- \n1.- Car     2.- Bike      3.- End");
			resposta = Integer.parseInt(lectura2.nextLine());
			switch(resposta) {
				case 1: System.out.println("(" + resposta + ") - - - - A R E A    C A R - - - -"+ "(" + resposta + ")");

					int contador = 0;	
					int bucleEntrada1=1;
					while (bucleEntrada1 == 1) {
						boolean matCorrecta = true;
						
						while (matCorrecta) {
							System.out.println("dime la MATRICULA formato: AAA9999 o AA9999");
							plate = lectura.nextLine();
							int largo = plate.length();
							int contarLetras = 0;
							int contarNumeros = 0;
					
							for (int hh=0; hh<largo; hh++) {
								if (Character.isDigit(plate.charAt(hh)) == false) {
									contarLetras ++;
								}else {
									contarNumeros ++;
								}
							}
							if ((contarNumeros == 4) && (contarLetras == 2 || contarLetras ==3)) { // es la amtricula de 4 numeros i 2 o 3 lletres?
								matCorrecta = false;
							}else {
								System.out.println("MATRICULA INCORRECTA numero de lletres " + contarLetras +" numero de numeros " +contarNumeros);
								matCorrecta = true;
							}
						}
					
						System.out.println("dime la MARCA: ");
						brand = lectura.nextLine();
						System.out.println("dime el COLOR: ");
						color = lectura.nextLine();
						ObjCar[contador]= new Car(plate, brand, color);
						contador ++;
	
						ArrayList<Wheel> rodes = new ArrayList<Wheel>();
						System.out.println("Marca de la Roda: ");
						brandWheel = lectura.nextLine();
						
						do {
							System.out.println("Diametre de la Roda DAVANT DRETA");
							diameterDavantDreta = Double.parseDouble(lectura.nextLine());
							if (diameterDavantDreta < 0.4 || diameterDavantDreta > 4) {
								System.out.println("Error en el Diametro pon un nuevo valor: ");
//								JOptionPane.showMessageDialog(null, "Error en el Diametro ","                     A T E N C I ó N", JOptionPane.WARNING_MESSAGE);
							}
						} while (diameterDavantDreta < 0.4 || diameterDavantDreta > 4);
						
						do {
							System.out.println("Diametre de la Roda DAVANT ESQUERRA");
							diameterDavantEsquerra = Double.parseDouble(lectura.nextLine());
							if (diameterDavantEsquerra < 0.4 || diameterDavantEsquerra > 4) {
								System.out.println("Error en el Diametro pon un nuevo valor: ");
//								JOptionPane.showMessageDialog(null, "Error en el Diametro ","                     A T E N C I ó N", JOptionPane.WARNING_MESSAGE);
							}
						} while (diameterDavantEsquerra < 0.4 || diameterDavantEsquerra > 4);
					
						do {
							System.out.println("Diametre de la Roda DARRERA DRETA");
							diameterDarreraDreta = Double.parseDouble(lectura.nextLine());
							if (diameterDarreraDreta < 0.4 || diameterDarreraDreta > 4) {
								System.out.println("Error en el Diametro pon un nuevo valor: ");
//								JOptionPane.showMessageDialog(null, "Error en el Diametro ","                     A T E N C I ó N", JOptionPane.WARNING_MESSAGE);
							}
						} while (diameterDarreraDreta < 0.4 || diameterDarreraDreta > 4);
						
						do {
							System.out.println("Diametre de la Roda DARRERA ESQUERRA");
							diameterDarreraEsquerra = Double.parseDouble(lectura.nextLine());
							if (diameterDarreraEsquerra < 0.4 || diameterDarreraEsquerra > 4) {
								System.out.println("Error en el Diametro pon un nuevo valor: ");
//								JOptionPane.showMessageDialog(null, "Error en el Diametro ","                     A T E N C I ó N", JOptionPane.WARNING_MESSAGE);
							}
						} while (diameterDarreraEsquerra < 0.4 || diameterDarreraEsquerra > 4);
					
						Wheel totalRodes = new Wheel(brandWheel, diameterDavantDreta, diameterDavantEsquerra, diameterDarreraDreta, diameterDarreraEsquerra );
						rodes.add(totalRodes);	
						System.out.println("Matricula ==> " + plate + " " + totalRodes);
						
//						bucleEntrada1 = Integer.parseInt(JOptionPane.showInputDialog("1.- Pulsa 1 per entrar mes Vehicles \n2.- Pulsa 2 per finalitzar entrades"));
						System.out.println("1.- Pulsa 1 per entrar mes Vehicles \n2.- Pulsa 2 per finalitzar entrades");
						bucleEntrada1 = Integer.parseInt(lectura2.nextLine());
					}	
					
					for (int hh=0; hh<contador; hh++) {		
						System.out.println("Matricula ==> " + ObjCar[hh].getPlate() + " - - Marca ==> " + ObjCar[hh].getBrand() 
								+ "  - - Color ==> " + ObjCar[hh].getColor());
					}
					
					
					break;
				case 2:  System.out.println("(" + resposta + ") - - - - A R E A    B I K E - - - -"+ "(" + resposta + ")");

				int contador1 = 0;	
				int bucleEntrada2=1;
				while (bucleEntrada2 == 1) {
					boolean matCorrecta = true;
					
					while (matCorrecta) {
						System.out.println("dime la MATRICULA: AAA9999 o AA9999");
						plate = lectura.nextLine();
						int largo = plate.length();
						int contarLetras = 0;
						int contarNumeros = 0;
				
						for (int hh=0; hh<largo; hh++) {
							if (Character.isDigit(plate.charAt(hh)) == false) {
								contarLetras ++;
							}else {
								contarNumeros ++;
							}
						}
						if ((contarNumeros == 4) && (contarLetras == 2 || contarLetras ==3)) { // es la amtricula de 4 numeros i 2 o 3 lletres?
							matCorrecta = false;
						}else {
							System.out.println("MATRICULA INCORRECTA numero de lletres " + contarLetras +" numero de numeros " +contarNumeros);
							matCorrecta = true;
						}
					}
				
					System.out.println("dime la MARCA: ");
					brand = lectura.nextLine();
					System.out.println("dime el COLOR: ");
					color = lectura.nextLine();
					ObjBike[contador1] = new Bike(plate, brand, color);
					contador1 ++;

					ArrayList<Wheel> rodes = new ArrayList<Wheel>();
					System.out.println("Marca de la Roda: ");
					brandWheel = lectura.nextLine();
					
					do {
						System.out.println("Diametre de la Roda DAVANT");
						diameterDavantDreta = Double.parseDouble(lectura.nextLine());
						if (diameterDavantDreta < 0.4 || diameterDavantDreta > 4) {
//							JOptionPane.showMessageDialog(null, "Error en el Diametro ","                     A T E N C I ó N", JOptionPane.WARNING_MESSAGE);
							System.out.println("Error en el Diametro pon un nuevo valor: ");
						}
					} while (diameterDavantDreta < 0.4 || diameterDavantDreta > 4);
					
					diameterDavantEsquerra = 0.0;
					
					do {
						System.out.println("Diametre de la Roda DARRERA");
						diameterDarreraDreta = Double.parseDouble(lectura.nextLine());
						if (diameterDarreraDreta < 0.4 || diameterDarreraDreta > 4) {
//							JOptionPane.showMessageDialog(null, "Error en el Diametro ","                     A T E N C I ó N", JOptionPane.WARNING_MESSAGE);
							System.out.println("Error en el Diametro pon un nuevo valor: ");
						}
					} while (diameterDarreraDreta < 0.4 || diameterDarreraDreta > 4);

					diameterDarreraEsquerra = 0.0;
					
					Wheel totalRodes = new Wheel(brandWheel, diameterDavantDreta, diameterDavantEsquerra, diameterDarreraDreta, diameterDarreraEsquerra );
					rodes.add(totalRodes);	
					System.out.println("Matricula ==> " + plate + " " + totalRodes);
//					bucleEntrada2 = Integer.parseInt(JOptionPane.showInputDialog("1.- Pulsa 1 per entrar mes Vehicles \n2.- Pulsa 2 per finalitzar entrades"));
					System.out.println("1.- Pulsa 1 per entrar mes Bikes \n2.- Pulsa 2 per finalitzar entrades");
					bucleEntrada2 = Integer.parseInt(lectura3.nextLine());

				}	
				
				for (int hh=0; hh<contador1; hh++) {		
					System.out.println("Matricula ==> " + ObjBike[hh].getPlate() + " - - Marca ==> " + ObjBike[hh].getBrand() 
							+ "  - - Color ==> " + ObjBike[hh].getColor());
				}
				
					break;
				case 3:
					System.exit(0);
					break;
				default:
//					JOptionPane.showMessageDialog(null, "la Opcion elegida no existe ","      A T E N C I O N", JOptionPane.WARNING_MESSAGE);
					System.out.println("la Opcion elegida no existe ");
					break;
				}  // tancament switch
			
		} // tancament while
		
	} // tancament main

} // tancament class arrancalo
