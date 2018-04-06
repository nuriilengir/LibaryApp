package com.nuricilengir.DAL;

import java.awt.TrayIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.nuricilengir.iDAL.IKitapdal;
import com.nuricilengir.Entity.Kitap;
import com.nuricilengir.Entity.Tur;
import com.nuricilengir.Entity.Yazar;
import com.nuricilengir.Connector.Database;

public class Kitapdal implements IKitapdal {

	private PreparedStatement statament;
	private ResultSet res;
	private Connection baglanti;

	public Kitapdal() {
		// TODO Auto-generated constructor stub
		baglanti = Database.baglan("kütüphane");

	}

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
		ArrayList<Kitap> kitapListe = new ArrayList<Kitap>();
		try {
			statament = baglanti.prepareStatement(
					"SELECT * FROM `kitap` inner join yazar on kitap.yazarId=yazar.yazarID inner join tür on tür.türId=kitap.türId");
			res = statament.executeQuery();
			while (res.next()) {
				Yazar yz = new Yazar(res.getInt("yazar.yazarID"), res.getString("yazar.ad"),
						res.getString("yazar.soyad"));
				Tur tr = new Tur(res.getInt("tür.türId"), res.getString("tür.tür"));
				Kitap kit = new Kitap(res.getInt("kitap.id"), res.getString("kitap.ad"), yz, tr, res.getString("isbn"));
				kitapListe.add(kit);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return kitapListe;
	}

	@Override
	public boolean guncelle(Kitap kitap) {

		// veritabanina baglan
		// gelen kitap bilgileri ile update yaz

		String sql = "update from kitap set ad=?,yazarID=?,turID=?,isbn=? where kitapID=?";
		// try {
		// statament=baglanti.prepareStatement(sql);
		// statament.setString(1,kitap.getAd());
		// statament.setInt(2,kitap.getId());
		// statament.se(3,kitap.getTur().getId());
		// statament.setString(4,kitap.getAd());
		// statament.setString(5,kitap.getAd());
		//
		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		return false;
	}

}
