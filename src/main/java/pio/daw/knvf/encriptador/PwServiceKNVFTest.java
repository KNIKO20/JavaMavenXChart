package pio.daw.knvf.encriptador;

public class PwServiceKNVFTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PwServiceKNVF servicio = new PwServiceKNVF();
		String password = "mipassword";
		String passwordEncriptada = servicio.encriptarContrasena(password);
		String passwordStrong = servicio.strongContrasena(password);
		System.out.println("**Prueba del alumno KNVF**");
		System.out.println("**La contaseña encriptada es: "+passwordEncriptada);
		System.out.println("**La contaseña fuerte encriptación es: "+passwordStrong);
		
		boolean esValida = servicio.verificarContrasena(password, passwordEncriptada);
		boolean strongValida = servicio.verificarStrong(password, passwordStrong);
		System.out.println("Coinciden "+esValida);
		
		System.out.println("Coinciden "+strongValida);
	}

}
