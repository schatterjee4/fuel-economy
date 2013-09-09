package org.karcio.app;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class FuelEconomyGui {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				FuelEconomyFrame frame = new FuelEconomyFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);

			}
		});

	}

}
