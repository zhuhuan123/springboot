package o;

import org.junit.Test;

public class UI {

	@Test
	public void l() {
		Pl pl = new S();
		System.out.println("从中 取出值 ");
		pl.s();
	}
	
	@Test
	public void j() {
		System.out.println("UI test ");
		
	}
}

class Pl{
	public void s() {
		System.out.println("par");
	}
}

class S extends Pl{
	public void s() {
		System.out.println("sub");
	}
}