package it.dsgroup.enel.wsSoapFacade;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import it.dsgroup.enel.ws.GestisciFunzione;
import it.dsgroup.enel.ws.GestisciFunzioneResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GestioneIntegrataClient extends WebServiceGatewaySupport {

    private static long lastModifiedTime = -1;
    private final Properties prop = new Properties();
    private static final Logger log = Logger.getLogger(GestioneIntegrataClient.class);
    @Autowired
    private Environment env;

    @PostConstruct
    public void init() {
        System.out.println("env.getProperty(\"eni.ws.endpoint\")" + env.getProperty("eni.ws.endpoint"));
    }

    public String sayHello(String operazione, String id_funzione, String descr_funzione, String id_funzione_old) throws Exception {

        log.info("Nel metodo say hello");
        String ret = "";
        try {
            GestisciFunzione request = new GestisciFunzione();
            request.setOperazione(operazione);
            request.setIdFunzione(id_funzione);
            request.setDescrFunzione(descr_funzione);
            request.setIdFunzioneOld(id_funzione_old);

            GestisciFunzioneResponse response = (GestisciFunzioneResponse) getWebServiceTemplate()
                    .marshalSendAndReceive(env.getProperty("eni.ws.endpoint"),
                            request,
                            new SoapActionCallback(env.getProperty("eni.ws.service")));
            log.info("Fine chiamata al service response :" + response.getGestisciFunzioneResult());

            ret = response.getGestisciFunzioneResult();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }

        return ret;
    }

    public  Properties getWsEndOint(String fileUrl) throws IOException {
        log.info("Nel metodo get endoint");
log.info("fileUrl :"+fileUrl);
        File f;
        f = new File(fileUrl);
        InputStream input = null;
        
        log.info("valore iniziale di lastmodifiedDAte = "+lastModifiedTime);
        log.info("valore della data di modifica del file = "+f.lastModified());

        if (f.lastModified() != lastModifiedTime) {
            try {
                input = new FileInputStream(f.getAbsolutePath());
                prop.load(input);
                System.out.println(prop.getProperty("eni.ws.endpoint"));

            } catch (IOException ex) {
                throw ex;
            } finally {
                if (input != null) {
                    try {
                        input.close();
                    } catch (IOException e) {
                        throw e;
                    }
                }
            }
            lastModifiedTime = f.lastModified();
        }
        log.info("nuovo valore di lastmodifiedDAte = "+lastModifiedTime);
    log.info("Fine del metodo get endoint");
        return prop;

    }

}
