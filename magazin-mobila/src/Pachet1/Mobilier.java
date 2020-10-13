package Pachet1;

public class Mobilier {

	private String denumireModel;
	private String tipLemn;
	private double lungime;
	private double latime;
	private double adancime;

	public Mobilier() {

	}

	public Mobilier(String tipLemn) {
		this.tipLemn = tipLemn;
	}

	public String getDenumireModel() {

		return this.denumireModel;
	}

	public void setDenumireModel(String denumireModel) {
		this.denumireModel = denumireModel;
	}

	public String getTipLemn() {

		return this.tipLemn;
	}

	public void setTipLemn(String tipLemn) {
		this.tipLemn = tipLemn;
	}

	public double getLungime() {
		return lungime;
	}

	public void setLungime(double lungime) {
		this.lungime = lungime;
	}

	public double getLatime() {
		return latime;
	}

	public void setLatime(double latime) {
		this.latime = latime;
	}

	public double getAdancime() {
		return adancime;
	}

	public void setAdancime(double adancime) {
		this.adancime = adancime;
	}

}
