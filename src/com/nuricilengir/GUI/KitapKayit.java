package com.nuricilengir.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.nuricilengir.Datamodel.KitapTablosu;
import com.nuricilengir.Entity.Kitap;
import com.nuricilengir.Entity.Tur;
import com.nuricilengir.Entity.Yazar;
import com.nuricilengir.BLL.Kitapbll;
import com.nuricilengir.BLL.Turbll;
import com.nuricilengir.BLL.Yazarbll;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KitapKayit extends JFrame {

	private JPanel contentPane;
	private JTextField txtKitapAd;
	private JTextField txtIsbn;
	private Yazarbll yazarbll;
	private Turbll turbll;
	private JTable table;
	private Kitapbll kitapbll;
	private Kitap seciliKitap = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KitapKayit frame = new KitapKayit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KitapKayit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(52, 11, 295, 202);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Kitap Ad\u0131");
		lblNewLabel.setBounds(10, 28, 46, 14);
		panel.add(lblNewLabel);

		JLabel lblIsbnNumaras = new JLabel("ISBN Numaras\u0131");
		lblIsbnNumaras.setBounds(10, 53, 106, 14);
		panel.add(lblIsbnNumaras);

		JLabel lblYazar = new JLabel("Yazar");
		lblYazar.setBounds(10, 77, 46, 14);
		panel.add(lblYazar);

		JLabel lblTr = new JLabel("T\u00FCr");
		lblTr.setBounds(10, 102, 46, 14);
		panel.add(lblTr);

		txtKitapAd = new JTextField();
		txtKitapAd.setBounds(126, 25, 143, 20);
		panel.add(txtKitapAd);
		txtKitapAd.setColumns(10);

		txtIsbn = new JTextField();
		txtIsbn.setBounds(126, 50, 143, 20);
		panel.add(txtIsbn);
		txtIsbn.setColumns(10);
		yazarbll = new Yazarbll();

		ArrayList<Yazar> yazarListe = yazarbll.listele();
		DefaultComboBoxModel<Yazar> yazarlarModel = new DefaultComboBoxModel(yazarListe.toArray());
		JComboBox cmbYazar = new JComboBox(yazarlarModel);
		cmbYazar.setBounds(126, 74, 143, 20);
		cmbYazar.insertItemAt("Yazar Sesiniz", 0);
		cmbYazar.setSelectedIndex(0);
		panel.add(cmbYazar);

		turbll = new Turbll();
		ArrayList<Tur> turler = turbll.listele();
		DefaultComboBoxModel<Tur> turModel = new DefaultComboBoxModel(turler.toArray());

		JComboBox cmbTur = new JComboBox(turModel);
		cmbTur.setBounds(126, 99, 143, 20);
		cmbTur.insertItemAt("Kitap Türü Seciniz", 0);
		cmbTur.setSelectedIndex(0);
		panel.add(cmbTur);

		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (txtKitapAd.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(rootPane, "Lütfen Kitap Adi Giriniz");
					txtKitapAd.requestFocus();
					return;
				}

				if (txtIsbn.getText().equals("")) {
					JOptionPane.showMessageDialog(rootPane, "Lütfen isbn Giriniz");
					txtIsbn.requestFocus();
					return;
				}

				if (cmbYazar.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(rootPane, "Lütfen yazar seciniz");
					cmbYazar.requestFocus();
					return;

				}

				if (cmbTur.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(rootPane, "Lütfen tür seciniz");
					cmbTur.requestFocus();
					return;

				}

				String ad = txtKitapAd.getText().trim();
				Yazar yazar = (Yazar) cmbYazar.getSelectedItem();
				Tur tur = (Tur) cmbTur.getSelectedItem();
				String isbn = txtIsbn.getText().trim();
				Kitap kitap = new Kitap(1, ad, yazar, tur, isbn);

				kitapbll = new Kitapbll();
				kitapbll.kaydet(kitap);

			}
		});
		btnKaydet.setBounds(10, 130, 106, 23);
		panel.add(btnKaydet);

		JButton btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (seciliKitap == null) {
					JOptionPane.showMessageDialog(null, "Kitap Secilmedi");
					return;
				}

				seciliKitap.setAd(txtKitapAd.getText().trim());
				seciliKitap.setIsbn(txtIsbn.getText().trim());
				seciliKitap.setYazar((Yazar) cmbYazar.getSelectedItem());
				seciliKitap.setTur((Tur) cmbTur.getSelectedItem());

			}
		});
		btnGncelle.setBounds(122, 130, 89, 23);
		panel.add(btnGncelle);

		String[] sutunlar = new String[] { "ID", "Kitap Adi", "Yazar", "Tür", "isbn" };
		Kitapbll kitapbll = new Kitapbll();
		ArrayList<Kitap> kitaplar = kitapbll.listele();

		KitapTablosu tablo = new KitapTablosu(sutunlar, kitaplar);
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int satir = table.getSelectedRow();
				JOptionPane.showMessageDialog(null, satir);
				seciliKitap = kitaplar.get(satir);
				// JOptionPane.showMessageDialog(rootPane,seciliKitap.getAd());

				String isbn = seciliKitap.getIsbn();
				txtIsbn.setText(isbn);
				txtKitapAd.setText(seciliKitap.getAd());
				cmbTur.setSelectedItem(seciliKitap.toString());

			}

			@Override
			public void mousePressed(MouseEvent e) {
			}
		});

		table.setModel(tablo);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(37, 224, 326, 140);
		contentPane.add(scrollPane);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
