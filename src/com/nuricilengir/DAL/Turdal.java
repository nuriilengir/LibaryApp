package com.nuricilengir.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import com.nuricilengir.iDAL.ITurdal;
import com.nuricilengir.Entity.Tur;
import com.nuricilengir.Connector.Database;

public class Turdal implements ITurdal {

	private PreparedStatement statament;
	private ResultSet res;
	private Connection baglanti;

	public Turdal() {
		// TODO Auto-generated constructor stub
		baglanti = Database.baglan("kütüphane");
	}

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
		ArrayList<Tur> turler = new ArrayList<Tur>();
		try {
			statament = baglanti.prepareStatement("select * from tür");
			res = statament.executeQuery();

			while (res.next()) {
				Tur t1 = new Tur(res.getInt("türId"), res.getString("tür"));
				turler.add(t1);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return turler;
	}

	@Override
	public boolean guncelle(Tur tur) {
		// TODO Auto-generated method stub
		return false;
	}

}
