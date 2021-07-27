package com.crud_spring.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
		//    atributos 
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Integer id;
		
		private String nombre;
		private String descripcion;
		private Double precio;
		
		// constructor
		public Producto(Integer id, String nombre, String descripcion, Double precio) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.precio = precio;
		}

		public Producto() {
			super();
		}

		
		// getters and setters	
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public Double getPrecio() {
			return precio;
		}

		public void setPrecio(Double precio) {
			this.precio = precio;
		}

		@Override
		public String toString() {
			return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
					+ "]";
		}
		
		
		
}

