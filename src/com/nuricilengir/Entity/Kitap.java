package com.nuricilengir.Entity;

public class Kitap {

	private int id;
	private String ad;
	private Yazar yazar;
	private Tur tur;
	private String isbn;

	public Kitap(int id, String ad, Yazar yazar, Tur tur, String isbn) {
		super();
		this.id = id;
		this.ad = ad;
		this.yazar = yazar;
		this.tur = tur;
		this.isbn = isbn;
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

	public Yazar getYazar() {
		return yazar;
	}

	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}

	public Tur getTur() {
		return tur;
	}

	public void setTur(Tur tur) {
		this.tur = tur;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
