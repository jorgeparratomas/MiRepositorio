package training.spring.restful.domain;

public class Producto {
	private Long id;
	private String nombre;
	private double precio;

	public Producto() {
		super();
	}

	public Producto(Long id, String nombre, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
