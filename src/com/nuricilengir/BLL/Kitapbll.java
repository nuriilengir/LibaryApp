package com.nuricilengir.BLL;

import java.util.ArrayList;

import com.nuricilengir.iBLL.IKitapbll;
import com.nuricilengir.DAL.Kitapdal;
import com.nuricilengir.Entity.Kitap;

public class Kitapbll implements IKitapbll {
	Kitapdal dal=new Kitapdal();
	
	
	@Override
	public boolean kaydet(Kitap kitap) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sil(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Kitap> listele() {
		// TODO Auto-generated method stub
		
		return dal.listele();
	}

	@Override
	public boolean guncelle(Kitap kitap) {
		boolean sonuc=dal.guncelle(kitap);
		return sonuc;
	}

}
