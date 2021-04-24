package Pets;

public class RegistrarPerdida extends Usuario{
private String mascotaPerdida;


	public  RegistrarPerdida() {
		
	}
	public RegistrarPerdida(String mascotaPerdida) {
		this.mascotaPerdida = mascotaPerdida;

	}
	public String getMascotaPerdida() {
		return mascotaPerdida;
	}
	public void setMascotaPerdida(String mascotaPerdida) {
		this.mascotaPerdida = mascotaPerdida;
	}
	@Override
		public void registrarPerdida() {
			// TODO Auto-generated method stub
			super.registrarPerdida();
		}

}
