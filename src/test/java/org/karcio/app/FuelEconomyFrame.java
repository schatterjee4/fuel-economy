package org.karcio.app;

import javax.swing.JFrame;

public class FuelEconomyFrame extends JFrame {

	private static final long serialVersionUID = 74145160450377595L;
	private static final int DEFAULT_WIDTH = 450;
	private static final int DEFAULT_HEIGHT = 350;

	public FuelEconomyFrame() {

		setTitle("Fuel Economy v 0.1");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		FuelEconomyPanel panel = new FuelEconomyPanel();
		add(panel);
		pack();

	}

}
