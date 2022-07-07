package br.com.tokio.charts;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class GraficoPizza extends JFrame {

	// GRAFICO DE TESTE

	public GraficoPizza() {
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setTitle("Seguros Residenciais");
		setSize(950, 700);
		setLocationRelativeTo(null);

		criarGrafico();

		setVisible(true);

	}

	public void criarGrafico() {
		DefaultPieDataset seguros = new DefaultPieDataset();
		seguros.setValue("Premiado", 4);
		seguros.setValue("Fian�a Locativa", 5);
		seguros.setValue("Imobili�rio", 3);

		JFreeChart grafico = ChartFactory.createPieChart("Relat�rios de Seguros Residenciais", seguros, true, true,
				true);
		ChartPanel painel = new ChartPanel(grafico);
		add(painel);
	}

	public static void main(String[] args) {

		new GraficoPizza();

	}
}