//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.05 at 05:20:14 PM CEST 
//


package com.bitplan.mediawiki.japi.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="toclevel" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="fromtitle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="byteoffset" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="anchor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
public class S {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "toclevel")
    protected Byte toclevel;
    @XmlAttribute(name = "level")
    protected Byte level;
    @XmlAttribute(name = "line")
    protected String line;
    @XmlAttribute(name = "number")
    protected Float number;
    @XmlAttribute(name = "index")
    protected Byte index;
    @XmlAttribute(name = "fromtitle")
    protected String fromtitle;
    @XmlAttribute(name = "byteoffset")
    protected Short byteoffset;
    @XmlAttribute(name = "anchor")
    protected String anchor;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the toclevel property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getToclevel() {
        return toclevel;
    }

    /**
     * Sets the value of the toclevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setToclevel(Byte value) {
        this.toclevel = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setLevel(Byte value) {
        this.level = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine(String value) {
        this.line = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNumber(Float value) {
        this.number = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIndex(Byte value) {
        this.index = value;
    }

    /**
     * Gets the value of the fromtitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromtitle() {
        return fromtitle;
    }

    /**
     * Sets the value of the fromtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromtitle(String value) {
        this.fromtitle = value;
    }

    /**
     * Gets the value of the byteoffset property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getByteoffset() {
        return byteoffset;
    }

    /**
     * Sets the value of the byteoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setByteoffset(Short value) {
        this.byteoffset = value;
    }

    /**
     * Gets the value of the anchor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnchor() {
        return anchor;
    }

    /**
     * Sets the value of the anchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnchor(String value) {
        this.anchor = value;
    }

}
