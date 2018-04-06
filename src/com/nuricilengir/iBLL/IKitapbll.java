package com.nuricilengir.iBLL;

import java.util.ArrayList;

import com.nuricilengir.Entity.Kitap;

public interface IKitapbll {

	public boolean kaydet(Kitap kitap);

	public boolean sil(int id);

	public ArrayList<Kitap> listele();

	public boolean guncelle(Kitap kitap);

}
