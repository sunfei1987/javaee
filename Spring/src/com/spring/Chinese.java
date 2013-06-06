package com.spring;

public class Chinese implements Person {
	private Axe axe;

	public void userAxe() {
		System.out.println(axe.chop());
	}

	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

}
