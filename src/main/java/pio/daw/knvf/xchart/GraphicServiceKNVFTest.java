package pio.daw.knvf.xchart;
import java.util.Arrays;

public class GraphicServiceKNVFTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicServiceKNVF barras = new GraphicServiceKNVF();
		barras.addCategorySeries("Ventas aproximadas (millones de copias)",Arrays.asList("Red Dead Redemption II", "GTA San Andreas", "GTA Vice City", "GTA V"), Arrays.asList(55, 45, 25, 195));
		barras.mostrarCategoryChart();
		try {
			barras.exportarCategoryChart("C:\\Users\\Kev\\Pictures\\Charts-knvf");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("La ruta no existe o está mal referenciada.");
			e.printStackTrace();
		}
		GraphicServiceKNVF pie = new GraphicServiceKNVF();
		
		pie.addPieSeries("Muy Malo", 12);
		pie.addPieSeries("Malo", 36);
		pie.addPieSeries("Regular", 17);
		pie.addPieSeries("Bueno", 68);
		pie.addPieSeries("Excelent", 53);
		pie.mostrarPieChart();
		
		
		double[] datosX= {0.0, 24.6, 49.4, 78.1};
		double[] datosY = {51.1, 8.6, 3.4, 78.8};
		GraphicServiceKNVF xy = new GraphicServiceKNVF();
		xy.addXYSeries("Estadisticas",datosX , datosY);
		xy.mostrarXYChart();
	}

}
