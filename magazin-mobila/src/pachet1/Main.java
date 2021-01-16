package pachet1;

import pachet2.Dulap;
import pachet3.Pat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobilier mobila1 = new Mobilier("Baobab");
		Mobilier mobila2 = new Mobilier();
		Dulap dulap1 = new Dulap(4);
		Dulap dulap2 = new Dulap();
		Pat pat1 = new Pat(true);
		Pat pat2 = new Pat();
	
		System.out.println(pat1.isIncludeSaltea());
	}

}
