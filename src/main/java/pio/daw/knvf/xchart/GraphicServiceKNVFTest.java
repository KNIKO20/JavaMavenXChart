package pio.daw.knvf.xchart;
import java.util.List;
public class GraphicServiceKNVFTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicServiceKNVF barras = new GraphicServiceKNVF();
		barras.addCategorySeries("Ventas Productos",new String[]{"Ene","Feb","Mar"}, new int[]{50, 80, 40});
	}

}
