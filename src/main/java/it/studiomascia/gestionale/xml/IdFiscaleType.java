//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.03.16 alle 01:10:31 PM CET 
//


package it.studiomascia.gestionale.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IdFiscaleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IdFiscaleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdPaese" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}NazioneType"/&gt;
 *         &lt;element name="IdCodice" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CodiceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdFiscaleType", propOrder = {
    "idPaese",
    "idCodice"
})
public class IdFiscaleType {

    @XmlElement(name = "IdPaese", required = true)
    protected String idPaese;
    @XmlElement(name = "IdCodice", required = true)
    protected String idCodice;

    /**
     * Recupera il valore della proprietà idPaese.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPaese() {
        return idPaese;
    }

    /**
     * Imposta il valore della proprietà idPaese.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPaese(String value) {
        this.idPaese = value;
    }

    /**
     * Recupera il valore della proprietà idCodice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCodice() {
        return idCodice;
    }

    /**
     * Imposta il valore della proprietà idCodice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCodice(String value) {
        this.idCodice = value;
    }

}
