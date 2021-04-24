package Pets;

public class Masscota extends Usuario{
	private String mascota;
	Masscota(){
		
	}
	public Masscota (String mascota){
		this.mascota = mascota;
	}
	

	public String getMascota() {
		return mascota;
	}
	public void setMascota(String mascota) {
		this.mascota = mascota;
	}
	public void resgistro(String caracteristicasMascota, String mascota) {
		super.setCaracteristicasMascota(caracteristicasMascota);
		
	
	}

 
}
