
package org.onvif.ver10.accesscontrol.wsdl;

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
 *         &lt;element name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StartReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "limit",
    "startReference"
})
@XmlRootElement(name = "GetAreaInfoList")
public class GetAreaInfoList {

    @XmlElement(name = "Limit")
    protected Integer limit;
    @XmlElement(name = "StartReference")
    protected String startReference;

    /**
     * Recupera il valore della proprietà limit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Imposta il valore della proprietà limit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Recupera il valore della proprietà startReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartReference() {
        return startReference;
    }

    /**
     * Imposta il valore della proprietà startReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartReference(String value) {
        this.startReference = value;
    }

}
