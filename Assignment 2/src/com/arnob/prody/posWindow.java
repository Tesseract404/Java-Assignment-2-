package com.arnob.prody;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class posWindow extends JFrame {
	JFrame frame;
	int rCount=0,oCount=0,sCount=0,slCount=0,onCount=0;
	int rc=0,oc=0,sc=0,slc =0,onc=0;
	public posWindow() {
		
		products rice = new products(1,"rice",80,0);
		products oil = new products(2,"oil",150,0);
		products sugar = new products(3,"sugar",110,0);
		products salt = new products(4,"salt",50,0);
		products onion = new products(5,"onion",90,0);
		
		
 		
		frame = new JFrame();
		frame.setTitle(" ");
		frame.getContentPane().setBackground(new Color(219, 112, 147));
		frame.setBounds(350, 350, 576, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
 		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 540, 254);
		panel.add(panel_1); 
		panel_1.setLayout(null);
		
		JLabel lbl1 = new JLabel("Sl#");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl1.setBounds(10, 11, 52, 32);
		panel_1.add(lbl1);
		
		JLabel lblPnme = new JLabel("Product Name");
		lblPnme.setHorizontalAlignment(SwingConstants.CENTER);
		lblPnme.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPnme.setBounds(118, 11, 119, 32);
		panel_1.add(lblPnme);
		
		JLabel lblQty = new JLabel("Qty(Kg/L)");
		lblQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQty.setBounds(247, 11, 108, 32);
		panel_1.add(lblQty);
		
		JLabel lblPrc = new JLabel("Price");
		lblPrc.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrc.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrc.setBounds(365, 11, 52, 32);
		panel_1.add(lblPrc);
		
		JLabel lblAmnt = new JLabel("Amount");
		lblAmnt.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmnt.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAmnt.setBounds(457, 11, 67, 32);
		panel_1.add(lblAmnt);
		
		JLabel lblNewLabel = new JLabel("#1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 62, 31, 24);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("#2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 97, 31, 24);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("#3");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(20, 132, 31, 24);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("#4");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(20, 167, 31, 24);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("#5");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(20, 202, 31, 24);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNm = new JLabel("Rice");
		lblNm.setHorizontalAlignment(SwingConstants.CENTER);
		lblNm.setBounds(97, 62, 157, 24);
		panel_1.add(lblNm);
		
		JLabel lblNm_1 = new JLabel("Oil");
		lblNm_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNm_1.setBounds(97, 102, 157, 24);
		panel_1.add(lblNm_1);
		
		JLabel lblNm_2 = new JLabel("Sugar");
		lblNm_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNm_2.setBounds(97, 137, 157, 24);
		panel_1.add(lblNm_2);
		
		JLabel lblNm_3 = new JLabel("Salt");
		lblNm_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNm_3.setBounds(97, 172, 157, 24);
		panel_1.add(lblNm_3);
		
		JLabel lblNm_4 = new JLabel("Onion");
		lblNm_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNm_4.setBounds(97, 207, 157, 24);
		panel_1.add(lblNm_4);
		
		JLabel lblQ = new JLabel();
		lblQ.setText(String.valueOf(rice.getQty()));
		lblQ.setHorizontalAlignment(SwingConstants.CENTER);
		lblQ.setBounds(274, 62, 60, 24);
		panel_1.add(lblQ);
		
		JLabel lblQ_1 = new JLabel();
		lblQ_1.setText(String.valueOf(oil.getQty()));
		lblQ_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblQ_1.setBounds(274, 102, 60, 24);
		panel_1.add(lblQ_1);
		
		JLabel lblQ_2 = new JLabel( );
		lblQ_2.setText(String.valueOf(sugar.getQty()));
		lblQ_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblQ_2.setBounds(274, 137, 60, 24);
		panel_1.add(lblQ_2);
		
		JLabel lblQ_3 = new JLabel( );
		lblQ_3.setText(String.valueOf(salt.getQty()));
		lblQ_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblQ_3.setBounds(274, 172, 60, 24);
		panel_1.add(lblQ_3);
		
		JLabel lblQ_4 = new JLabel( );
		lblQ_4.setText(String.valueOf(onion.getQty()));
		lblQ_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblQ_4.setBounds(274, 207, 60, 24);
		panel_1.add(lblQ_4);
		
		JLabel lbrice = new JLabel(  );
		lbrice.setText(String.valueOf(rice.getPrice()));
		lbrice.setHorizontalAlignment(SwingConstants.CENTER);
		lbrice.setBounds(365, 62, 60, 24);
		panel_1.add(lbrice);
		
		JLabel lboil = new JLabel( );
		lboil.setText(String.valueOf(oil.getPrice()));
		lboil.setHorizontalAlignment(SwingConstants.CENTER);
		lboil.setBounds(365, 102, 60, 24);
		panel_1.add(lboil);
		
		JLabel lbsugar = new JLabel( );
		lbsugar.setText(String.valueOf(sugar.getPrice()));
		lbsugar.setHorizontalAlignment(SwingConstants.CENTER);
		lbsugar.setBounds(365, 137, 60, 24);
		panel_1.add(lbsugar);
		
		JLabel lbsalt = new JLabel( );
		lbsalt.setText(String.valueOf(salt.getPrice()));
		lbsalt.setHorizontalAlignment(SwingConstants.CENTER);
		lbsalt.setBounds(365, 172, 60, 24);
		panel_1.add(lbsalt); 
		
		JLabel lbonion = new JLabel( );
		lbonion.setText(String.valueOf(onion.getPrice()));
		lbonion.setHorizontalAlignment(SwingConstants.CENTER);
		lbonion.setBounds(365, 207, 60, 24);
		panel_1.add(lbonion);
		
		JLabel lblrt = new JLabel("0");
		lblrt.setHorizontalAlignment(SwingConstants.CENTER);
		lblrt.setBounds(457, 62, 67, 24);
		panel_1.add(lblrt);
		
		JLabel lbot = new JLabel("0");
		lbot.setHorizontalAlignment(SwingConstants.CENTER);
		lbot.setBounds(457, 102, 67, 24);
		panel_1.add(lbot);
		
		JLabel lbst = new JLabel("0");
		lbst.setHorizontalAlignment(SwingConstants.CENTER);
		lbst.setBounds(457, 137, 67, 24);
		panel_1.add(lbst);
		
		JLabel lbslt = new JLabel("0");
		lbslt.setHorizontalAlignment(SwingConstants.CENTER);
		lbslt.setBounds(457, 172, 67, 24);
		panel_1.add(lbslt);
		
		JLabel lbont = new JLabel("0");
		lbont.setHorizontalAlignment(SwingConstants.CENTER);
		lbont.setBounds(457, 207, 67, 24);
		panel_1.add(lbont);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(SystemColor.textHighlightText);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(248, 287, 113, 42);
		panel.add(btnNewButton);
		
		
		
		JButton btnRice = new JButton("Rice");
		btnRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				        rCount++;
				        rc++;
						btnRice.setText("Rice x "+ rc );
						System.out.println(rc);
			}
		});
		btnRice.setVisible(false);
		btnRice.setBackground(Color.WHITE);
		btnRice.setForeground(Color.GRAY);
		btnRice.setBounds(30, 332, 127, 23);
		panel.add(btnRice);
		
		JButton btnOil = new JButton("Oil");
		btnOil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oCount++;
		        oc++;
				btnOil.setText("Oil x "+ oc );
			}
		});
		btnOil.setVisible(false);
		btnOil.setForeground(Color.GRAY);
		btnOil.setBackground(Color.WHITE);
		btnOil.setBounds(30, 349, 127, 23);
		panel.add(btnOil);
		
		JButton btnSugar = new JButton("Sugar");
		btnSugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sCount++;
		        sc++;
				btnSugar.setText("Sugar x "+ sc );
			}
		});
		btnSugar.setVisible(false);
		btnSugar.setForeground(Color.GRAY);
		btnSugar.setBackground(Color.WHITE);
		btnSugar.setBounds(30, 371, 127, 23);
		panel.add(btnSugar);
		
		JButton btnSalt = new JButton("Salt");
		btnSalt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				slCount++;
		        slc++;
				btnSalt.setText("Salt x "+ slc );
			}
		});
		btnSalt.setVisible(false);
		btnSalt.setForeground(Color.GRAY);
		btnSalt.setBackground(Color.WHITE);
		btnSalt.setBounds(30, 393, 127, 23);
		panel.add(btnSalt);
		
		JButton btnOnion = new JButton("Oinion");
		btnOnion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onCount++;
		        onc++;
				btnOnion.setText("Onion x "+ onc );
			}
		});
		btnOnion.setVisible(false);
		btnOnion.setForeground(Color.GRAY);
		btnOnion.setBackground(Color.WHITE);
		btnOnion.setBounds(30, 415, 127, 23);
		panel.add(btnOnion);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Proceed with these items?","Confirmation", JOptionPane.OK_CANCEL_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					
					lblQ.setText(String.valueOf(rice.getQty()+rCount));  
					 rice.setQty(rice.getQty()+rCount);
					lblQ_1.setText(String.valueOf(oil.getQty()+oCount));		
					lblQ_2.setText(String.valueOf(sugar.getQty()+sCount));
					lblQ_3.setText(String.valueOf(salt.getQty()+slCount));
					lblQ_4.setText(String.valueOf(onion.getQty()+onCount));
					
					 System.out.println("debug: "+ rice.getQty()+ rice.getPrice());
					
					
		            // ADD ITEMS TO THE TABLE
		             
		        } else {
		            System.out.println("User CANCELLED");
		        }
				
				lblrt.setText(String.valueOf( rice.getQty()* rice.getPrice() ));
				lbot.setText(String.valueOf(oil.getQty()* oil.getPrice()));
				lbst.setText(String.valueOf(sugar.getQty()* sugar.getPrice()));
				lbslt.setText(String.valueOf(salt.getQty()* salt.getPrice()));
				lbont.setText(String.valueOf(onion.getQty()* onion.getPrice()));

				btnRice.setText("Rice"); 
				rc=0; 
				btnOil.setText("Oil");
				 
				oc = 0;
				btnSugar.setText("Sugar"); 
				 
				sc= 0;
				btnSalt.setText("Salt");
				 
				slc= 0;
				btnOnion.setText("Onion"); 
	
				onc= 0;
			}
		});
		btnNewButton_1.setBackground(SystemColor.menu);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(167, 288, 71, 43);
		panel.add(btnNewButton_1);
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnRice.setText("Rice"); 
				rice.setQty(0);
				rc=0;
				btnOil.setText("Oil");
				oil.setQty(0);
				oc= 0;
				btnSugar.setText("Sugar"); 
				sugar.setQty(0);
				sc= 0;
				btnSalt.setText("Salt");
				salt.setQty(0);
				slc= 0;
				btnOnion.setText("Onion"); 
				onion.setQty(0);
				onc= 0;
				 
			}
		});
		btnReset.setVisible(false);
		btnReset.setBackground(SystemColor.activeCaptionBorder);
		btnReset.setBounds(167, 351, 71, 23);
		panel.add(btnReset);
		
		JButton bSelectItem = new JButton("Select Item");
		bSelectItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnRice.setVisible(true);
				btnOil.setVisible(true); 
				btnSugar.setVisible(true);
				btnSalt.setVisible(true);
				btnOnion.setVisible(true); 
				btnReset.setVisible(true);
			} 
		});
		bSelectItem.setBackground(SystemColor.activeCaption);
		bSelectItem.setFont(new Font("Tahoma", Font.BOLD, 11));
		bSelectItem.setBounds(30, 286, 127, 25);
		panel.add(bSelectItem);
		 
	}
 
	public static void main(String[] args) {
		 posWindow pw = new posWindow();
		 pw.frame.setVisible(true);
	}
	 
}
