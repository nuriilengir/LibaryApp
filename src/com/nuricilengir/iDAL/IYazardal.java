package com.nuricilengir.iDAL;

import java.util.ArrayList;

import com.nuricilengir.Entity.Yazar;

public interface IYazardal {
	public boolean kaydet(Yazar yazar);

	public boolean sil(int id);

	public ArrayList<Yazar> listele();

	public boolean guncelle(Yazar yazar);
}
