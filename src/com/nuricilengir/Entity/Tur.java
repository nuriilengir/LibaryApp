package com.nuricilengir.Entity;

public class Tur {
	private int id;
	private String tur;

	public Tur(int id, String tur) {
		super();
		this.id = id;
		this.tur = tur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tur;
	}

}
