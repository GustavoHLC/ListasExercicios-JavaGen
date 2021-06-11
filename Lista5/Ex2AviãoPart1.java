package Lista5;

public class Ex2AviãoPart1 {
	
	private String MarcaAviao;
	private int ModeloAviao;
	private int Passageiros;
	
	public Ex2AviãoPart1 (String marca, int modelo, int quantidade) {
		MarcaAviao = marca;
		ModeloAviao = modelo;
		Passageiros = quantidade;
		
	}
	
	public String getmostrarmarca() {
		String mostrarMarca = "A marca do avião é: " + MarcaAviao;
		return mostrarMarca;
	}
	public String getmostrarmodelo() {
		String mostrarModelo = "A marca do avião é: " + ModeloAviao;
		return mostrarModelo;
	}
	public String getmostrarpassageiros() {
		String mostrarPassageiros = "A marca do avião é: " + Passageiros;
		return mostrarPassageiros;
	}
	
}
