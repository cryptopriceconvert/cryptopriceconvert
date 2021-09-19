package com.cryptopriceconverter.sf.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AllCrypto {

	private Btcinr btcinr;
	private Xrpinr xrpinr;
	private Ethinr ethinr;
	
	public Btcinr getBtcinr() {
		return btcinr;
	}
	public void setBtcinr(Btcinr btcinr) {
		this.btcinr = btcinr;
	}
	public Xrpinr getXrpinr() {
		return xrpinr;
	}
	public void setXrpinr(Xrpinr xrpinr) {
		this.xrpinr = xrpinr;
	}
	public Ethinr getEthinr() {
		return ethinr;
	}
	public void setEthinr(Ethinr ethinr) {
		this.ethinr = ethinr;
	}
	

}
