package com.nuricilengir.iDAL;

import java.util.ArrayList;

import com.nuricilengir.Entity.Tur;

public interface ITurdal {
	public boolean kaydet(Tur tur);

	public boolean sil(int id);

	public ArrayList<Tur> listele();

	public boolean guncelle(Tur tur);
}
