package com.nuricilengir.iBLL;

import java.util.ArrayList;

import com.nuricilengir.Entity.Yazar;

public interface IYazarbll {
	public boolean kaydet(Yazar yazar);

	public boolean sil(int id);

	public ArrayList<Yazar> listele();

	public boolean guncelle(Yazar yazar);

}
