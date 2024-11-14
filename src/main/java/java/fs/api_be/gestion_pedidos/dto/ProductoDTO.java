package java.fs.api_be.gestion_pedidos.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data //Para asignar geters and seters y se importa de lombk
public class ProductoDTO {

	
	private long id;
	
	@NotBlank(message = "El nombre es requerido")
	private String nombre;
	
	@Positive(message = "El precio debe ser positivo")
	private Double precio;
	
	@Positive(message = "La cantidad  debe ser mayor a cero")
	@Column(name = "CANTIDAD" , nullable = false)
	
	private String garantia;
	
}
/*

CREATE TABLE TBL_PRODUCTO(
	    PRODUCTO_ID NUMERIC(8) NOT NULL PRIMARY KEY,
	    NOMBRE VARCHAR2(360) NOT NULL,
	    PRECIO NUMERIC (6,2) NOT NULL,
	    CANTIDAD NUMERIC (6,2) NOT NULL,
	    GARANTIA VARCHAR2(20) NULL
	);
*/