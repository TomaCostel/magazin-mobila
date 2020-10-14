package pachet3;

import pachet1.Mobilier;

public class Pat extends Mobilier {

	private boolean includeSaltea;
	private boolean areSomiera;

	public Pat(boolean includeSaltea) {
		this.includeSaltea = includeSaltea;
	}

	public Pat() {
		areSomiera = false;
	}

	public boolean isIncludeSaltea() {
		return includeSaltea;
	}

	public void setIncludeSaltea(boolean includeSaltea) {
		this.includeSaltea = includeSaltea;
	}

	public boolean isAreSomiera() {
		return areSomiera;
	}

	public void setAreSomiera(boolean areSomiera) {
		this.areSomiera = areSomiera;
		if (getDenumireModel().startsWith("a") || getDenumireModel().startsWith("e")
				|| getDenumireModel().startsWith("i") || getDenumireModel().startsWith("o")) {
			areSomiera = true;
		}
	}

}
