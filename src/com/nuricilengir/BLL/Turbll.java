package com.nuricilengir.BLL;

import java.util.ArrayList;

import com.nuricilengir.iBLL.ITurbll;
import com.nuricilengir.DAL.Turdal;
import com.nuricilengir.Entity.Tur;

public class Turbll implements ITurbll {

	Turdal dal=new Turdal();
	
	@Override
	public boolean kaydet(Tur tur) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sil(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Tur> listele() {
		ArrayList<Tur> turler=dal.listele();
		return turler;
	}

	@Override
	public boolean guncelle(Tur tur) {
		// TODO Auto-generated method stub
		return false;
	}

}
