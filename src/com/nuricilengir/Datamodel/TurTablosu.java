package com.nuricilengir.Datamodel;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import com.nuricilengir.Entity.Tur;

public class TurTablosu extends AbstractTableModel {

	private String[] sutunlar;
	private ArrayList<Tur> turler;

	public TurTablosu(String[] sutunlar, ArrayList<Tur> turler) {

		this.sutunlar = sutunlar;
		this.turler = turler;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return turler.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return sutunlar.length;
	}

	@Override
	public Object getValueAt(int satir, int sutun) {
		// TODO Auto-generated method stub

		Tur tur = turler.get(satir); // o satırda ki türü aldık

		switch (sutun) {
		case 0:
			return tur.getId();
		case 1:
			return tur.getTur();

		default:
			break;
		}

		return null;
	}

	@Override
	public String getColumnName(int arg0) {

		return sutunlar[arg0];
	}

}
