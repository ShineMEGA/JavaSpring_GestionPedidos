package java.fs.api_be.gestion_pedidos.mapper;


import java.fs.api_be.gestion_pedidos.dto.ProductoDTO;
import java.fs.api_be.gestion_pedidos.entity.ProductoEntity;
import java.util.List;

import org.springframework.context.annotation.Bean;

public interface ProductoMapper {
	
	 ProductoDTO toDTO(ProductoEntity e);
	 List<ProductoDTO> toDTO(List<ProductoEntity> lstE);
	 

}
