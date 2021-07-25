package es.um.asio.importer.cerif.processor.mappings.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import es.um.asio.domain.cerif.BaseCerif;
import es.um.asio.domain.cerif.ProductoCerif;
import es.um.asio.domain.cerif.ProductoCreadorCerif;
import es.um.asio.domain.cerif.ProductoProyectoCerif;
import es.um.asio.domain.cerif.ProductoPublicadorCerif;
import es.um.asio.importer.cerif.model.Product;
import es.um.asio.importer.cerif.model.Product.OriginatesFrom;

public class ProductoMapper extends CerifBaseMapper {

	public static List<? extends BaseCerif> mapXsdToDomain(Product product) {
		List<BaseCerif> domains = new ArrayList<BaseCerif>();
		if (product == null) {
			return domains;
		}

		ProductoCerif productoCerif = new ProductoCerif();
		productoCerif.setShortId(product.getId());
		productoCerif.setTipo(product.getType() != null ? product.getType().getValue() : null);
		productoCerif.setNombre(mapLangStringsToString(product.getName()));
		productoCerif.setDescripcion(mapLangStringsToString(product.getDescription()));

		domains.add(productoCerif);
		
		domains.addAll(mapCerifRelations(product.getOriginatesFrom(), ProductoMapper::mapOriginatesFromToIdProyecto,
				mapProyectosXsdToDomain(productoCerif.getShortId())));

		if (product.getCreators() != null) {
			domains.addAll(mapCerifRelations(product.getCreators().getCreator(),
					CerifBaseMapper::mapCfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitTypeToPersonId,
					mapCreadoresXsdToDomain(productoCerif.getShortId())));
		}

		if (product.getPublishers() != null) {
			domains.addAll(mapCerifRelations(product.getPublishers().getPublisher(),
					CerifBaseMapper::mapCfLinkWithDisplayNameToPersonOrOrgUnitTypeToUnidadId,
					mapPublicadoresXsdToDomain(productoCerif.getShortId())));
		}

		return domains;
	}

	private static Function<String, ProductoProyectoCerif> mapProyectosXsdToDomain(String shortId) {
		return (idProyecto) -> {
			ProductoProyectoCerif productoProyectoCerif = new ProductoProyectoCerif();
			productoProyectoCerif.setIdProducto(shortId);
			productoProyectoCerif.setIdProyecto(idProyecto);
			return productoProyectoCerif;
		};
	}

	private static String mapOriginatesFromToIdProyecto(OriginatesFrom originatesFrom) {
		if (originatesFrom == null || originatesFrom.getProjectFundingSubstitutionGroupHead() == null
				|| originatesFrom.getProjectFundingSubstitutionGroupHead().getValue() == null) {
			return null;
		}

		return originatesFrom.getProjectFundingSubstitutionGroupHead().getValue().getId();
	}

	private static Function<String, ProductoCreadorCerif> mapCreadoresXsdToDomain(String shortId) {
		return (idPersona) -> {
			ProductoCreadorCerif productoCreadorCerif = new ProductoCreadorCerif();
			productoCreadorCerif.setIdProducto(shortId);
			productoCreadorCerif.setIdPersona(idPersona);
			return productoCreadorCerif;
		};
	}

	private static Function<String, ProductoPublicadorCerif> mapPublicadoresXsdToDomain(String shortId) {
		return (idUnidadOrganizativa) -> {
			ProductoPublicadorCerif publicadorCerif = new ProductoPublicadorCerif();
			publicadorCerif.setIdProducto(shortId);
			publicadorCerif.setIdUnidadOrganizativa(idUnidadOrganizativa);
			return publicadorCerif;
		};
	}
}
