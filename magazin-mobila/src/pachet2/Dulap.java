package pachet2;

import pachet1.Mobilier;

public class Dulap extends Mobilier {
	
	private boolean areOglinda;
	private int numarUsi;

	public boolean areOglinda() {
		return areOglinda;
	}

	public void setAreOglinda(boolean areOglinda) {
		this.areOglinda = areOglinda;
	}

	public Dulap(int numarUsi) {
		this.numarUsi = numarUsi;
	}

	public Dulap() {
		numarUsi = 5;
	}

	public int getNumarUsi() {
		return numarUsi;
	}

	public void setNumarUsi(int numarUsi) {
		this.numarUsi = numarUsi;
	}

}
