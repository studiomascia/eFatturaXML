//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.03.16 alle 01:10:31 PM CET 
//


package it.studiomascia.gestionale.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per FatturaElettronicaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FatturaElettronicaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FatturaElettronicaHeader" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}FatturaElettronicaHeaderType"/&gt;
 *         &lt;element name="FatturaElettronicaBody" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}FatturaElettronicaBodyType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="versione" use="required" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}FormatoTrasmissioneType" /&gt;
 *       &lt;attribute name="SistemaEmittente" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String10Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FatturaElettronicaType", propOrder = {
    "fatturaElettronicaHeader",
    "fatturaElettronicaBody",
    "signature"
})
public class FatturaElettronicaType {

    @XmlElement(name = "FatturaElettronicaHeader", required = true)
    protected FatturaElettronicaHeaderType fatturaElettronicaHeader;
    @XmlElement(name = "FatturaElettronicaBody", required = true)
    protected List<FatturaElettronicaBodyType> fatturaElettronicaBody;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlAttribute(name = "versione", required = true)
    protected FormatoTrasmissioneType versione;
    @XmlAttribute(name = "SistemaEmittente")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sistemaEmittente;

    /**
     * Recupera il valore della proprietà fatturaElettronicaHeader.
     * 
     * @return
     *     possible object is
     *     {@link FatturaElettronicaHeaderType }
     *     
     */
    public FatturaElettronicaHeaderType getFatturaElettronicaHeader() {
        return fatturaElettronicaHeader;
    }

    /**
     * Imposta il valore della proprietà fatturaElettronicaHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link FatturaElettronicaHeaderType }
     *     
     */
    public void setFatturaElettronicaHeader(FatturaElettronicaHeaderType value) {
        this.fatturaElettronicaHeader = value;
    }

    /**
     * Gets the value of the fatturaElettronicaBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fatturaElettronicaBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFatturaElettronicaBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FatturaElettronicaBodyType }
     * 
     * 
     */
    public List<FatturaElettronicaBodyType> getFatturaElettronicaBody() {
        if (fatturaElettronicaBody == null) {
            fatturaElettronicaBody = new ArrayList<FatturaElettronicaBodyType>();
        }
        return this.fatturaElettronicaBody;
    }

    /**
     * Recupera il valore della proprietà signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Imposta il valore della proprietà signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Recupera il valore della proprietà versione.
     * 
     * @return
     *     possible object is
     *     {@link FormatoTrasmissioneType }
     *     
     */
    public FormatoTrasmissioneType getVersione() {
        return versione;
    }

    /**
     * Imposta il valore della proprietà versione.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatoTrasmissioneType }
     *     
     */
    public void setVersione(FormatoTrasmissioneType value) {
        this.versione = value;
    }

    /**
     * Recupera il valore della proprietà sistemaEmittente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaEmittente() {
        return sistemaEmittente;
    }

    /**
     * Imposta il valore della proprietà sistemaEmittente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaEmittente(String value) {
        this.sistemaEmittente = value;
    }

}
