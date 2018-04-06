package com.nuricilengir.iBLL;

import java.util.ArrayList;
import com.nuricilengir.Entity.Tur;

public interface ITurbll {
	public boolean kaydet(Tur tur);

	public boolean sil(int id);

	public ArrayList<Tur> listele();

	public boolean guncelle(Tur tur);
}
