
public class Retangulo {
	public int base;
	public int altura;
	
	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//Método para criar área
	public int calcularArea() {
		return base * altura;
	}
	
	//método para criar perímetro
	public int calcularPerimetro() {
		return 2 * base + 2 * altura;
	}
}
