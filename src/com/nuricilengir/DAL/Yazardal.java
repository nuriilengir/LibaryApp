package com.nuricilengir.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nuricilengir.iDAL.IYazardal;
import com.nuricilengir.Entity.Yazar;
import com.nuricilengir.Connector.Database;

public class Yazardal implements IYazardal {
	private Connection baglanti;
	private PreparedStatement statement;
	private ResultSet res;

	public Yazardal() {
		// TODO Auto-generated constructor stub
		baglanti = Database.baglan("kütüphane");
	}

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
		ArrayList<Yazar> yazarListe = new ArrayList<Yazar>();

		try {
			statement = baglanti.prepareStatement("select * from yazar");
			res = statement.executeQuery();
			while (res.next()) {

				// System.out.println(res.getString("soyAd")+"\n");
				Yazar yz = new Yazar(res.getInt("yazarID"), res.getString("ad"), res.getString("soyad"));
				yazarListe.add(yz);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return yazarListe;
	}

	@Override
	public boolean guncelle(Yazar yazar) {
		// TODO Auto-generated method stub
		return false;
	}

}
