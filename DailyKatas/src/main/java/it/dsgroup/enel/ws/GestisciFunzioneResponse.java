//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.09 alle 05:25:14 PM CET 
//


package it.dsgroup.enel.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GestisciFunzioneResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gestisciFunzioneResult"
})
@XmlRootElement(name = "GestisciFunzioneResponse")
public class GestisciFunzioneResponse {

    @XmlElement(name = "GestisciFunzioneResult", required = true)
    protected String gestisciFunzioneResult;

    /**
     * Recupera il valore della proprietà gestisciFunzioneResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGestisciFunzioneResult() {
        return gestisciFunzioneResult;
    }

    /**
     * Imposta il valore della proprietà gestisciFunzioneResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGestisciFunzioneResult(String value) {
        this.gestisciFunzioneResult = value;
    }

}
