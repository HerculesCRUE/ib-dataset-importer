//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.07 at 12:34:08 p.�m. CEST 
//


package es.um.asio.importer.cvn.model.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CvnItemBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CvnItemBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://codes.cvn.fecyt.es/beans}CvnBean">
 *       &lt;sequence>
 *         &lt;element name="CvnAuthorBean" type="{http://codes.cvn.fecyt.es/beans}CvnAuthorBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnBoolean" type="{http://codes.cvn.fecyt.es/beans}CvnBoolean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnCodeGroup" type="{http://codes.cvn.fecyt.es/beans}CvnCodeGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnDateDayMonthYear" type="{http://codes.cvn.fecyt.es/beans}CvnDateDayMonthYear" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnDateMonthYear" type="{http://codes.cvn.fecyt.es/beans}CvnDateMonthYear" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnDateYear" type="{http://codes.cvn.fecyt.es/beans}CvnDateYear" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnDouble" type="{http://codes.cvn.fecyt.es/beans}CvnDouble" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnDuration" type="{http://codes.cvn.fecyt.es/beans}CvnDuration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnEntityBean" type="{http://codes.cvn.fecyt.es/beans}CvnEntityBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnExternalPKBean" type="{http://codes.cvn.fecyt.es/beans}CvnExternalPKBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnFamilyNameBean" type="{http://codes.cvn.fecyt.es/beans}CvnFamilyNameBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnPageBean" type="{http://codes.cvn.fecyt.es/beans}CvnPageBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnPhoneBean" type="{http://codes.cvn.fecyt.es/beans}CvnPhoneBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnPhotoBean" type="{http://codes.cvn.fecyt.es/beans}CvnPhotoBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnRichText" type="{http://codes.cvn.fecyt.es/beans}CvnRichText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnString" type="{http://codes.cvn.fecyt.es/beans}CvnString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnTitleBean" type="{http://codes.cvn.fecyt.es/beans}CvnTitleBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CvnVolumeBean" type="{http://codes.cvn.fecyt.es/beans}CvnVolumeBean" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CvnItemBean", propOrder = {
    "cvnAuthorBean",
    "cvnBoolean",
    "cvnCodeGroup",
    "cvnDateDayMonthYear",
    "cvnDateMonthYear",
    "cvnDateYear",
    "cvnDouble",
    "cvnDuration",
    "cvnEntityBean",
    "cvnExternalPKBean",
    "cvnFamilyNameBean",
    "cvnPageBean",
    "cvnPhoneBean",
    "cvnPhotoBean",
    "cvnRichText",
    "cvnString",
    "cvnTitleBean",
    "cvnVolumeBean"
})
@XmlSeeAlso({
    CvnCodeGroup.class
})
public class CvnItemBean
    extends CvnBean
{

    @XmlElement(name = "CvnAuthorBean")
    protected List<CvnAuthorBean> cvnAuthorBean;
    @XmlElement(name = "CvnBoolean")
    protected List<CvnBoolean> cvnBoolean;
    @XmlElement(name = "CvnCodeGroup")
    protected List<CvnCodeGroup> cvnCodeGroup;
    @XmlElement(name = "CvnDateDayMonthYear")
    protected List<CvnDateDayMonthYear> cvnDateDayMonthYear;
    @XmlElement(name = "CvnDateMonthYear")
    protected List<CvnDateMonthYear> cvnDateMonthYear;
    @XmlElement(name = "CvnDateYear")
    protected List<CvnDateYear> cvnDateYear;
    @XmlElement(name = "CvnDouble")
    protected List<CvnDouble> cvnDouble;
    @XmlElement(name = "CvnDuration")
    protected List<CvnDuration> cvnDuration;
    @XmlElement(name = "CvnEntityBean")
    protected List<CvnEntityBean> cvnEntityBean;
    @XmlElement(name = "CvnExternalPKBean")
    protected List<CvnExternalPKBean> cvnExternalPKBean;
    @XmlElement(name = "CvnFamilyNameBean")
    protected List<CvnFamilyNameBean> cvnFamilyNameBean;
    @XmlElement(name = "CvnPageBean")
    protected List<CvnPageBean> cvnPageBean;
    @XmlElement(name = "CvnPhoneBean")
    protected List<CvnPhoneBean> cvnPhoneBean;
    @XmlElement(name = "CvnPhotoBean")
    protected List<CvnPhotoBean> cvnPhotoBean;
    @XmlElement(name = "CvnRichText")
    protected List<CvnRichText> cvnRichText;
    @XmlElement(name = "CvnString")
    protected List<CvnString> cvnString;
    @XmlElement(name = "CvnTitleBean")
    protected List<CvnTitleBean> cvnTitleBean;
    @XmlElement(name = "CvnVolumeBean")
    protected List<CvnVolumeBean> cvnVolumeBean;

    /**
     * Gets the value of the cvnAuthorBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnAuthorBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnAuthorBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnAuthorBean }
     * 
     * 
     */
    public List<CvnAuthorBean> getCvnAuthorBean() {
        if (cvnAuthorBean == null) {
            cvnAuthorBean = new ArrayList<>();
        }
        return this.cvnAuthorBean;
    }

    /**
     * Gets the value of the cvnBoolean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnBoolean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnBoolean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnBoolean }
     * 
     * 
     */
    public List<CvnBoolean> getCvnBoolean() {
        if (cvnBoolean == null) {
            cvnBoolean = new ArrayList<>();
        }
        return this.cvnBoolean;
    }

    /**
     * Gets the value of the cvnCodeGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnCodeGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnCodeGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnCodeGroup }
     * 
     * 
     */
    public List<CvnCodeGroup> getCvnCodeGroup() {
        if (cvnCodeGroup == null) {
            cvnCodeGroup = new ArrayList<>();
        }
        return this.cvnCodeGroup;
    }

    /**
     * Gets the value of the cvnDateDayMonthYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnDateDayMonthYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnDateDayMonthYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnDateDayMonthYear }
     * 
     * 
     */
    public List<CvnDateDayMonthYear> getCvnDateDayMonthYear() {
        if (cvnDateDayMonthYear == null) {
            cvnDateDayMonthYear = new ArrayList<>();
        }
        return this.cvnDateDayMonthYear;
    }

    /**
     * Gets the value of the cvnDateMonthYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnDateMonthYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnDateMonthYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnDateMonthYear }
     * 
     * 
     */
    public List<CvnDateMonthYear> getCvnDateMonthYear() {
        if (cvnDateMonthYear == null) {
            cvnDateMonthYear = new ArrayList<>();
        }
        return this.cvnDateMonthYear;
    }

    /**
     * Gets the value of the cvnDateYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnDateYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnDateYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnDateYear }
     * 
     * 
     */
    public List<CvnDateYear> getCvnDateYear() {
        if (cvnDateYear == null) {
            cvnDateYear = new ArrayList<>();
        }
        return this.cvnDateYear;
    }

    /**
     * Gets the value of the cvnDouble property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnDouble property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnDouble().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnDouble }
     * 
     * 
     */
    public List<CvnDouble> getCvnDouble() {
        if (cvnDouble == null) {
            cvnDouble = new ArrayList<>();
        }
        return this.cvnDouble;
    }

    /**
     * Gets the value of the cvnDuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnDuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnDuration }
     * 
     * 
     */
    public List<CvnDuration> getCvnDuration() {
        if (cvnDuration == null) {
            cvnDuration = new ArrayList<>();
        }
        return this.cvnDuration;
    }

    /**
     * Gets the value of the cvnEntityBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnEntityBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnEntityBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnEntityBean }
     * 
     * 
     */
    public List<CvnEntityBean> getCvnEntityBean() {
        if (cvnEntityBean == null) {
            cvnEntityBean = new ArrayList<>();
        }
        return this.cvnEntityBean;
    }

    /**
     * Gets the value of the cvnExternalPKBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnExternalPKBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnExternalPKBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnExternalPKBean }
     * 
     * 
     */
    public List<CvnExternalPKBean> getCvnExternalPKBean() {
        if (cvnExternalPKBean == null) {
            cvnExternalPKBean = new ArrayList<>();
        }
        return this.cvnExternalPKBean;
    }

    /**
     * Gets the value of the cvnFamilyNameBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnFamilyNameBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnFamilyNameBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnFamilyNameBean }
     * 
     * 
     */
    public List<CvnFamilyNameBean> getCvnFamilyNameBean() {
        if (cvnFamilyNameBean == null) {
            cvnFamilyNameBean = new ArrayList<>();
        }
        return this.cvnFamilyNameBean;
    }

    /**
     * Gets the value of the cvnPageBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnPageBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnPageBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnPageBean }
     * 
     * 
     */
    public List<CvnPageBean> getCvnPageBean() {
        if (cvnPageBean == null) {
            cvnPageBean = new ArrayList<>();
        }
        return this.cvnPageBean;
    }

    /**
     * Gets the value of the cvnPhoneBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnPhoneBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnPhoneBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnPhoneBean }
     * 
     * 
     */
    public List<CvnPhoneBean> getCvnPhoneBean() {
        if (cvnPhoneBean == null) {
            cvnPhoneBean = new ArrayList<>();
        }
        return this.cvnPhoneBean;
    }

    /**
     * Gets the value of the cvnPhotoBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnPhotoBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnPhotoBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnPhotoBean }
     * 
     * 
     */
    public List<CvnPhotoBean> getCvnPhotoBean() {
        if (cvnPhotoBean == null) {
            cvnPhotoBean = new ArrayList<>();
        }
        return this.cvnPhotoBean;
    }

    /**
     * Gets the value of the cvnRichText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnRichText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnRichText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnRichText }
     * 
     * 
     */
    public List<CvnRichText> getCvnRichText() {
        if (cvnRichText == null) {
            cvnRichText = new ArrayList<>();
        }
        return this.cvnRichText;
    }

    /**
     * Gets the value of the cvnString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnString }
     * 
     * 
     */
    public List<CvnString> getCvnString() {
        if (cvnString == null) {
            cvnString = new ArrayList<>();
        }
        return this.cvnString;
    }

    /**
     * Gets the value of the cvnTitleBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnTitleBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnTitleBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnTitleBean }
     * 
     * 
     */
    public List<CvnTitleBean> getCvnTitleBean() {
        if (cvnTitleBean == null) {
            cvnTitleBean = new ArrayList<>();
        }
        return this.cvnTitleBean;
    }

    /**
     * Gets the value of the cvnVolumeBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvnVolumeBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvnVolumeBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvnVolumeBean }
     * 
     * 
     */
    public List<CvnVolumeBean> getCvnVolumeBean() {
        if (cvnVolumeBean == null) {
            cvnVolumeBean = new ArrayList<>();
        }
        return this.cvnVolumeBean;
    }

}
