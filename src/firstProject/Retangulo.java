package firstProject;

public class Retangulo {
	public Integer base;
	public Integer altura;
	public Long area;
	
	public Retangulo(Integer base, Integer altura) {
		this.base = base;
		this.altura = altura;
		
		this.calcularArea();
	}
	
	public void calcularArea() {
		this.area = (this.base.longValue() * this.altura.longValue());
	}
	
	public void mostrarArea() {
		System.out.println("Área do retângulo: " + this.area.toString() );

	}
}
