package com.soft.beans;

public class Flipcart {
	
	private BlueDart bldart;
	private DTDC dtdc;
	private Ekart ecart;
	public BlueDart getBldart() {
		return bldart;
	}
	public void setBldart(BlueDart bldart) {
		this.bldart = bldart;
	}
	public DTDC getDtdc() {
		return dtdc;
	}
	public void setDtdc(DTDC dtdc) {
		this.dtdc = dtdc;
	}
	public Ekart getEcart() {
		return ecart;
	}
	public void setEcart(Ekart ecart) {
		this.ecart = ecart;
	}
	@Override
	public String toString() {
		return "Flipcart [bldart=" + bldart + ", dtdc=" + dtdc + ", ecart=" + ecart + "]";
	}
	
	

}
