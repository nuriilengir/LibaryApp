package com.nuricilengir.Connector;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Database {

	public static Connection baglan(String veritabani) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + veritabani, "root", "");
			JOptionPane.showMessageDialog(null, "Success");
			return baglanti;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Warning : Connection Erorr" + e.toString());
			return null;
			// TODO: handle exception
		}

	}

}
