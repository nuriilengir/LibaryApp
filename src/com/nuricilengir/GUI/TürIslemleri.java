package com.nuricilengir.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.nuricilengir.Datamodel.TurTablosu;
import com.nuricilengir.Entity.Tur;
import com.nuricilengir.BLL.Turbll;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class TürIslemleri extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args2) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TürIslemleri frame = new TürIslemleri();
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
	public TürIslemleri() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblType = new JLabel("Type");
		lblType.setBounds(44, 25, 61, 16);
		contentPane.add(lblType);

		textField = new JTextField();
		textField.setBounds(117, 20, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(24, 76, 117, 29);
		contentPane.add(btnNewButton);

		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(153, 76, 117, 29);
		contentPane.add(btnRemove);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(287, 76, 117, 29);
		contentPane.add(btnUpdate);

		table = new JTable();

		Turbll turbll = new Turbll();
		ArrayList<Tur> turliste = turbll.listele();

		String[] sutunListe = new String[] { "TurID", "Tür" };

		TurTablosu turTabloModel = new TurTablosu(sutunListe, turliste);

	}
}
