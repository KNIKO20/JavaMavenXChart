package pio.daw.knvf.encriptador;
import org.jasypt.util.password.*;
public class PwServiceKNVF {
	private BasicPasswordEncryptor passwordEncryptor;
	private StrongPasswordEncryptor strongEncryptor;
	public PwServiceKNVF() {
		this.passwordEncryptor = new BasicPasswordEncryptor();
		this.strongEncryptor = new StrongPasswordEncryptor();
	}
	
	public String encriptarContrasena(String contrasenaSinEncriptar) {
		return passwordEncryptor.encryptPassword(contrasenaSinEncriptar);
	}
	public boolean verificarContrasena(String contrasena, String contrasenaEncriptada) {
		return passwordEncryptor.checkPassword(contrasena, contrasenaEncriptada);
	}
	public String strongContrasena(String contrasenaSinEncriptar) {
		return strongEncryptor.encryptPassword(contrasenaSinEncriptar);
	}
	public boolean verificarStrong(String contrasena, String contrasenaEncriptada) {
		return strongEncryptor.checkPassword(contrasena, contrasenaEncriptada);
	}
}