package com.nuricilengir.BLL;

import java.util.ArrayList;

import com.nuricilengir.iBLL.IYazarbll;
import com.nuricilengir.DAL.Yazardal;
import com.nuricilengir.Entity.Yazar;

public class Yazarbll implements IYazarbll{

	Yazardal dal=new Yazardal();
	
	@Override
	public boolean kaydet(Yazar yazar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sil(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Yazar> listele() {
	
		ArrayList<Yazar> yazarlar=dal.listele();
		
		return  yazarlar;
	}

	@Override
	public boolean guncelle(Yazar yazar) {
		// TODO Auto-generated method stub
		return false;
	}

}
