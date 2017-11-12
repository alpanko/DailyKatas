package it.dsgroup.enel.wsSoapFacade;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class soapWsConfig {
	
	
	@Bean
	public Jaxb2Marshaller jaxb2Marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("it.dsgroup.enel.ws");
		return marshaller;
	}

//	@Bean
//	public WebServiceTemplate myWebServiceTemplate() {
////		WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
////		client.setDefaultUri("http://www.webservicex.com/stockquote.asmx");
////		client.setMarshaller(marshaller);
////		client.setUnmarshaller(marshaller);
////		return client;
//		
//		WebServiceTemplate myWebServiceTemplate = new WebServiceTemplate();
//		myWebServiceTemplate.setMarshaller(jaxb2Marshaller());
//		myWebServiceTemplate.setUnmarshaller(jaxb2Marshaller());
//		myWebServiceTemplate.setDefaultUri("http://localhost:8282/WebServiceProject/services/GestioneIntegrataSoap");
//
//	    return myWebServiceTemplate;
//		
//	}
	
	@Bean
	public GestioneIntegrataClient gestioneIntegrataClient(Jaxb2Marshaller marshaller) {
		GestioneIntegrataClient client = new GestioneIntegrataClient();
		client.setDefaultUri("http://localhost:8282/WebServiceProject/services/GestioneIntegrataSoap");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	
}
