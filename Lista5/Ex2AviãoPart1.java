package Lista5;

public class Ex2Avi�oPart1 {
	
	private String MarcaAviao;
	private int ModeloAviao;
	private int Passageiros;
	
	public Ex2Avi�oPart1 (String marca, int modelo, int quantidade) {
		MarcaAviao = marca;
		ModeloAviao = modelo;
		Passageiros = quantidade;
		
	}
	
	public String getmostrarmarca() {
		String mostrarMarca = "A marca do avi�o �: " + MarcaAviao;
		return mostrarMarca;
	}
	public String getmostrarmodelo() {
		String mostrarModelo = "A marca do avi�o �: " + ModeloAviao;
		return mostrarModelo;
	}
	public String getmostrarpassageiros() {
		String mostrarPassageiros = "A marca do avi�o �: " + Passageiros;
		return mostrarPassageiros;
	}
	
}
