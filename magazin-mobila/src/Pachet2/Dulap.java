package Pachet2;

import Pachet1.Mobilier;

public class Dulap extends Mobilier {

	private int numarUsi;

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
