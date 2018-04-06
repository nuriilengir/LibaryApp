package com.nuricilengir.Entity;

public class Yazar {
	private int id;
	private String ad;
	private String soyAd;

	public Yazar(int id, String ad, String soyAd) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyAd = soyAd;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ad + " " + soyAd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyAd() {
		return soyAd;
	}

	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub

		if (arg0 instanceof Kitap) {
			Kitap kit = (Kitap) arg0;
			if (kit.getId() == this.getId())
				return true;

		}
		return false;
	}

}
