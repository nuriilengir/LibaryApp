package com.nuricilengir.Datamodel;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import com.nuricilengir.Entity.Kitap;

public class KitapTablosu extends AbstractTableModel {

	private String[] sutunlar;
	private ArrayList<Kitap> kitaplar;

	public KitapTablosu(String[] sutunlar, ArrayList<Kitap> kitaplar) {
		this.sutunlar = sutunlar;
		this.kitaplar = kitaplar;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return sutunlar.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return kitaplar.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub

		Kitap kitap = (Kitap) kitaplar.get(row);

		switch (col) {
		case 0:
			return kitap.getId();
		case 1:
			return kitap.getAd();
		case 2:
			return kitap.getYazar().getAd() + " " + kitap.getYazar().getSoyAd();
		case 3:
			return kitap.getTur().getTur();
		case 4:
			return kitap.getIsbn();

		default:
			break;
		}

		return null;
	}

	@Override
	public String getColumnName(int col) {
		// TODO Auto-generated method stub
		return sutunlar[col];
	}

}
