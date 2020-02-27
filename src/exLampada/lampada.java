package exLampada;

public class lampada {

	private String estado;

	public lampada() {
		
	}
	public lampada(String estado) {
		
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String Apagar(String estado) {
		return this.estado = "Apagada";
	}
	
	public String Acender(String acesa) {
		return this.estado = "Acesa";
	}
	
	public String meioAcesa(String meioAcesa) {
		return this.estado = "meioAcesa";
	}
}
