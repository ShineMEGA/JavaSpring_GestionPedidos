package java.fs.api_be.gestion_pedidos.mapper;

import java.fs.api_be.gestion_pedidos.dto.ProductoDTO;
import java.fs.api_be.gestion_pedidos.entity.ProductoEntity;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class ProductoMapperImpl implements ProductoMapper {
	
	private final  ModelMapper modelMaper;
	 
	public ProductoMapperImpl(ModelMapper modelMaper) {
		super();
		this.modelMaper = modelMaper;
	}
	@Override
	public ProductoDTO toDTO(ProductoEntity e) {
		return modelMaper.map(e, ProductoDTO.class);
	}


	@Override
	public List<ProductoDTO> toDTO(List<ProductoEntity> lstE) {
		return lstE.stream().map(e -> toDTO(e)).toList();
	}

}
