package training.spring.restful.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import training.spring.restful.domain.Producto;

@RestController
@RequestMapping("producto")
public class ProductoResource {

	private List<Producto> productos = new ArrayList<Producto>();

	// Selecionar todos los productos
	@GetMapping
	public List<Producto> obtenerProducto() {
		return productos;

	}

	// selecionar un producto por id
	@GetMapping("/{id}")
	public Producto obtenerPorductoPorId(@PathVariable Long id) {
		for (Producto producto : productos) {
			if (producto.getId().equals(id)) {
				return producto;
			}
		}
		return null;
	}

	// Crear producto
	@PostMapping
	public Producto crearProducto(@RequestBody Producto producto) {

		producto.setId(System.currentTimeMillis());
		productos.add(producto);
		return producto;
	}

	// Actualizar producto
	@PutMapping("/{id}")
	public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto productoactualizado) {

		for (Producto producto : productos) {
			if (producto.getId().equals(id)) {
				producto.setNombre(productoactualizado.getNombre());
				producto.setPrecio(productoactualizado.getPrecio());
				return producto;
			}
		}
		return null;
	}

}
