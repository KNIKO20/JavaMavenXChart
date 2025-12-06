package pio.daw.knvf.xchart;
import java.util.List;

import org.knowm.xchart.*;

public class GraphicServiceKNVF {
    private XYChart xyChart;
    private CategoryChart categoryChart;
    private PieChart pieChart;

    public GraphicServiceKNVF() {
        this.xyChart = new XYChartBuilder()
                .width(600).height(400)
                .title("XY Chart")
                .xAxisTitle("X")
                .yAxisTitle("Y")
                .build();

        this.categoryChart = new CategoryChartBuilder()
                .width(1000).height(400)
                .title("Category Chart")
                .xAxisTitle("Categoría")
                .yAxisTitle("Valor")
                .build();

        this.pieChart = new PieChartBuilder()
                .width(600).height(400)
                .title("Pie Chart")
                .build();
    }

    public void addXYSeries(String nombre, double[] xData, double[] yData) {
        xyChart.addSeries(nombre, xData, yData);
    }

    public void mostrarXYChart() {
        new SwingWrapper<>(xyChart).displayChart();
    }


    public void addCategorySeries(String nombre, List<String> categorias, List<Number> valores) {
        categoryChart.addSeries(nombre, categorias, valores);
    }

    public void mostrarCategoryChart() {
        new SwingWrapper<>(categoryChart).displayChart();
    }


    public void addPieSeries(String nombre, Number valor) {
        pieChart.addSeries(nombre, valor);
    }

    public void mostrarPieChart() {
        new SwingWrapper<>(pieChart).displayChart();
    }


    public void exportarXYChart(String ruta) throws Exception {
        BitmapEncoder.saveBitmap(xyChart, ruta, BitmapEncoder.BitmapFormat.PNG);
    }

    public void exportarCategoryChart(String ruta) throws Exception {
        BitmapEncoder.saveBitmap(categoryChart, ruta, BitmapEncoder.BitmapFormat.PNG);
    }

    public void exportarPieChart(String ruta) throws Exception {
        BitmapEncoder.saveBitmap(pieChart, ruta, BitmapEncoder.BitmapFormat.PNG);
    }
}
