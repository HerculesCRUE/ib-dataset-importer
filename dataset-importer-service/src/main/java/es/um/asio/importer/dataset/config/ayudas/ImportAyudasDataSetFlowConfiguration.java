package es.um.asio.importer.dataset.config.ayudas;

import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.ayudas.AmortizacionFinanciacionRegistroAyudaDefinitiva;
import es.um.asio.domain.ayudas.AnualidadFinanciacionRegistroAyudaDefinitiva;
import es.um.asio.domain.ayudas.ConvocatoriaAyuda;
import es.um.asio.domain.ayudas.DesgloseGastoRegistroAyudaDefinitiva;
import es.um.asio.domain.ayudas.DesgloseGastoRegistroAyudaProvisional;
import es.um.asio.domain.ayudas.DesgloseGastoSolitudAyuda;
import es.um.asio.domain.ayudas.EntidadColaboradoraSolicitudAyuda;
import es.um.asio.domain.ayudas.EquipoSolicitudAyuda;
import es.um.asio.domain.ayudas.FinanciacionRegistroAyudaDefinitiva;
import es.um.asio.domain.ayudas.FinanciacionUnidadAyuda;
import es.um.asio.domain.ayudas.FuenteUnidadAyuda;
import es.um.asio.domain.ayudas.PartidaConvocatoria;
import es.um.asio.domain.ayudas.ReferenciaUnescoSolicitudAyuda;
import es.um.asio.domain.ayudas.RegistroAyudaDefinitiva;
import es.um.asio.domain.ayudas.RegistroAyudaProvisional;
import es.um.asio.domain.ayudas.SolicitudAyuda;
import es.um.asio.domain.ayudas.SubprogramaAyuda;
import es.um.asio.domain.ayudas.TipoAyuda;
import es.um.asio.domain.ayudas.TipoGastoUnidadAyuda;
import es.um.asio.domain.ayudas.UnidadAyuda;
import es.um.asio.domain.ayudas.UnidadGestoraUnidadAyuda;
import es.um.asio.importer.dataset.config.ImportDataSetFlowConfigurationBase;

/**
 * Class to generate Ayudas {@link Flow}
 */
@Configuration
public class ImportAyudasDataSetFlowConfiguration extends ImportDataSetFlowConfigurationBase {

	@Autowired
	private AyudasItemReaderConfiguration configuration;

	/**
	 * Gets the Ayudas flow name.
	 *
	 * @return the flow name
	 */
	@Override
	protected String getFlowName() {
		return "importAyudasFlow";
	}

	/**
     * Gets Ayudas {@link Flow}
     *
     * @return the flow
     */
    @Override
    public Flow getFlow() {
        return new FlowBuilder<SimpleFlow>(getFlowName())
                .start(createStep(AmortizacionFinanciacionRegistroAyudaDefinitiva.class, configuration.amortizacionFinanciacionRegistroAyudaDefinitivaReader()))                
                .next(createStep(AnualidadFinanciacionRegistroAyudaDefinitiva.class,configuration.anualidadFinanciacionRegistroAyudaDefinitivaReader()))
                .next(createStep(ConvocatoriaAyuda.class,configuration.convocatoriaAyudaReader()))
                .next(createStep(DesgloseGastoRegistroAyudaDefinitiva.class,configuration.desgloseGastoRegistroAyudaDefinitivaReader()))
                .next(createStep(DesgloseGastoRegistroAyudaProvisional.class,configuration.desgloseGastoRegistroAyudaProvisionalReader()))
                .next(createStep(DesgloseGastoSolitudAyuda.class,configuration.desgloseGastoSolitudAyudaReader()))
                .next(createStep(EntidadColaboradoraSolicitudAyuda.class,configuration.entidadColaboradoraSolicitudAyudaReader()))
                .next(createStep(EquipoSolicitudAyuda.class,configuration.equipoSolicitudAyuda()))
                .next(createStep(FinanciacionRegistroAyudaDefinitiva.class,configuration.financiacionRegistroAyudaDefinitivaReader()))
                .next(createStep(FinanciacionUnidadAyuda.class,configuration.financiacionUnidadAyudaReader()))
                .next(createStep(FuenteUnidadAyuda.class,configuration.fuenteUnidadAyudaReader()))
                .next(createStep(PartidaConvocatoria.class,configuration.partidaConvocatoriaReader()))
                .next(createStep(ReferenciaUnescoSolicitudAyuda.class,configuration.referenciaUnescoSolicitudAyudaReader()))
                .next(createStep(RegistroAyudaDefinitiva.class,configuration.registroAyudaDefinitivaReader()))
                .next(createStep(RegistroAyudaProvisional.class,configuration.registroAyudaProvisionalReader()))
                .next(createStep(SolicitudAyuda.class,configuration.solicitudAyudaReader()))
                .next(createStep(SubprogramaAyuda.class,configuration.subprogramaAyuda()))
                .next(createStep(TipoAyuda.class,configuration.tipoAyudaReader()))
                .next(createStep(TipoGastoUnidadAyuda.class,configuration.tipoGastoUnidadAyudaReader()))
                .next(createStep(UnidadAyuda.class,configuration.unidadAyudaReader()))
                .next(createStep(UnidadGestoraUnidadAyuda.class,configuration.unidadGestoraUnidadAyudaReader()))
                .build();         
    }
}