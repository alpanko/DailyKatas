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
 *         &lt;element name="operazione" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id_funzione" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descr_funzione" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id_funzione_old" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "operazione",
    "idFunzione",
    "descrFunzione",
    "idFunzioneOld"
})
@XmlRootElement(name = "GestisciFunzione")
public class GestisciFunzione {

    @XmlElement(required = true)
    protected String operazione;
    @XmlElement(name = "id_funzione", required = true)
    protected String idFunzione;
    @XmlElement(name = "descr_funzione", required = true)
    protected String descrFunzione;
    @XmlElement(name = "id_funzione_old", required = true)
    protected String idFunzioneOld;

    /**
     * Recupera il valore della proprietà operazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperazione() {
        return operazione;
    }

    /**
     * Imposta il valore della proprietà operazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperazione(String value) {
        this.operazione = value;
    }

    /**
     * Recupera il valore della proprietà idFunzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFunzione() {
        return idFunzione;
    }

    /**
     * Imposta il valore della proprietà idFunzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFunzione(String value) {
        this.idFunzione = value;
    }

    /**
     * Recupera il valore della proprietà descrFunzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrFunzione() {
        return descrFunzione;
    }

    /**
     * Imposta il valore della proprietà descrFunzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrFunzione(String value) {
        this.descrFunzione = value;
    }

    /**
     * Recupera il valore della proprietà idFunzioneOld.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFunzioneOld() {
        return idFunzioneOld;
    }

    /**
     * Imposta il valore della proprietà idFunzioneOld.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFunzioneOld(String value) {
        this.idFunzioneOld = value;
    }

}
