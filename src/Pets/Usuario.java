package Pets;

public class Usuario {
	private String correo;
	private String contrase�a;
	private String nombreUsuario;
	private String mascota;
	private String caracteristicasMascota;
	
	
	Usuario (){
		
	}
	public Usuario (String correo, String contrase�a, String nombreUsuario, String mascota, String caracteristicasMascota){
		this.contrase�a = contrase�a;
		this.correo =correo;
		this.nombreUsuario = nombreUsuario;
		this.caracteristicasMascota = caracteristicasMascota;
		this.mascota = mascota;
	}
	
	public String getMascota() {
		return mascota;
	}
	public void setMascota(String mascota) {
		this.mascota = mascota;
	}
	public String getCaracteristicasMascota() {
		return caracteristicasMascota;
	}
	public void setCaracteristicasMascota(String caracteristicasMascota) {
		this.caracteristicasMascota = caracteristicasMascota;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public void verificarLogin () {
		
	}
	public void cambiarClave() {
		
	}
	public void registrarPerdida () {
		
	}
	public void crearUsuaio () {
		
	}

	
	

}
