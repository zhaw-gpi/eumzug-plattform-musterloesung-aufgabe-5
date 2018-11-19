//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.05 um 08:29:35 AM CET 
//


package ch.zhaw.gpi.eumzugplattform.processdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WohnungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WohnungType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WHGNR" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="WSTWK" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="WMEHRG" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="WBEZ" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="WAZIM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WohnungType", propOrder = {
    "whgnr",
    "wstwk",
    "wmehrg",
    "wbez",
    "wazim"
})
public class WohnungType {

    @XmlElement(name = "WHGNR", required = true)
    protected String whgnr;
    @XmlElement(name = "WSTWK")
    protected int wstwk;
    @XmlElement(name = "WMEHRG")
    protected int wmehrg;
    @XmlElement(name = "WBEZ", required = true)
    protected String wbez;
    @XmlElement(name = "WAZIM")
    protected Integer wazim;

    /**
     * Ruft den Wert der whgnr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWHGNR() {
        return whgnr;
    }

    /**
     * Legt den Wert der whgnr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWHGNR(String value) {
        this.whgnr = value;
    }

    /**
     * Ruft den Wert der wstwk-Eigenschaft ab.
     * 
     */
    public int getWSTWK() {
        return wstwk;
    }

    /**
     * Legt den Wert der wstwk-Eigenschaft fest.
     * 
     */
    public void setWSTWK(int value) {
        this.wstwk = value;
    }

    /**
     * Ruft den Wert der wmehrg-Eigenschaft ab.
     * 
     */
    public int getWMEHRG() {
        return wmehrg;
    }

    /**
     * Legt den Wert der wmehrg-Eigenschaft fest.
     * 
     */
    public void setWMEHRG(int value) {
        this.wmehrg = value;
    }

    /**
     * Ruft den Wert der wbez-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWBEZ() {
        return wbez;
    }

    /**
     * Legt den Wert der wbez-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWBEZ(String value) {
        this.wbez = value;
    }

    /**
     * Ruft den Wert der wazim-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWAZIM() {
        return wazim;
    }

    /**
     * Legt den Wert der wazim-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWAZIM(Integer value) {
        this.wazim = value;
    }

}
