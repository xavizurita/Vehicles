package com.vehicles.project;

public class Wheel {
	private String brandWheel;
	private double diameterDavantDreta;
	private double diameterDavantEsquerra;
	private double diameterDarreraDreta;
	private double diameterDarreraEsquerra;
	

	
	public Wheel(String brandWheel, double diameterDavantDreta, double diameterDavantEsquerra, double diameterDarreraDreta, double diameterDarreraEsquerra) {
		super();
		this.brandWheel = brandWheel;
		this.diameterDavantDreta = diameterDavantDreta;
		this.diameterDavantEsquerra = diameterDavantEsquerra;
		this.diameterDarreraDreta = diameterDarreraDreta;
		this.diameterDarreraEsquerra = diameterDarreraEsquerra;	

	}

	public String getBrandWheel() {
		return brandWheel;
	}

	public void setBrandWheel(String brandWheel) {
		this.brandWheel = brandWheel;
	}

	public double getDiameterDavantDreta() {
		return diameterDavantDreta;
	}

	public void setDiameterDavantDreta(double diameterDavantDreta) {
		this.diameterDavantDreta = diameterDavantDreta;
	}


	public double getdiameterDavantEsquerra() {
		return diameterDavantEsquerra;
	}

	public void setdiameterDavantEsquerra(double diameterDavantEsquerra) {
		this.diameterDavantEsquerra = diameterDavantEsquerra;
	}
	
		public double getDiameterDarreraDreta() {
		return diameterDarreraDreta;
	}

	public void setDiameterDarreraDreta(double diameterDarreraDreta) {
		this.diameterDarreraDreta = diameterDarreraDreta;
	}

	public double getDiameterDarreraEsquerra() {
		return diameterDarreraEsquerra;
	}

	public void setDiameterDarreraEsquerra(double diameterDarreraEsquerra) {
		this.diameterDarreraEsquerra = diameterDarreraEsquerra;
	}

	@Override
	public String toString() {
		return "Marca ==> " + brandWheel + " - D Davant dreta ==> " + diameterDavantDreta + " - - D Davant esquerra ==> " + diameterDavantEsquerra + " - - D Darrera Dreta ==> " + diameterDarreraDreta + " - - D Darrera Esquerra ==> " + diameterDarreraEsquerra + " ";
	}



	

}
