//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.07 at 12:34:08 p.�m. CEST 
//


package es.um.asio.importer.cnv.model.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CvnBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CvnBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnBean", propOrder = {
    "code"
})
@XmlSeeAlso({
    CvnDateDayMonthYear.class,
    CvnAuthorBean.class,
    CvnPhoneBean.class,
    CvnExternalPKBean.class,
    CvnDouble.class,
    CvnDateYear.class,
    CvnPhotoBean.class,
    CvnPageBean.class,
    CvnBoolean.class,
    CvnDuration.class,
    CvnFamilyNameBean.class,
    CvnVolumeBean.class,
    CvnEntityBean.class,
    CvnString.class,
    CvnTitleBean.class,
    CvnDateMonthYear.class,
    CvnItemBean.class
})
public class CvnBean {

    @XmlElement(name = "Code")
    protected String code;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
