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
 * Blocco relativo ai dati del Rappresentante Fiscale
 * 
 * <p>Classe Java per RappresentanteFiscaleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RappresentanteFiscaleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatiAnagrafici" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DatiAnagraficiRappresentanteType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RappresentanteFiscaleType", propOrder = {
    "datiAnagrafici"
})
public class RappresentanteFiscaleType {

    @XmlElement(name = "DatiAnagrafici", required = true)
    protected DatiAnagraficiRappresentanteType datiAnagrafici;

    /**
     * Recupera il valore della proprietà datiAnagrafici.
     * 
     * @return
     *     possible object is
     *     {@link DatiAnagraficiRappresentanteType }
     *     
     */
    public DatiAnagraficiRappresentanteType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    /**
     * Imposta il valore della proprietà datiAnagrafici.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiAnagraficiRappresentanteType }
     *     
     */
    public void setDatiAnagrafici(DatiAnagraficiRappresentanteType value) {
        this.datiAnagrafici = value;
    }

}
