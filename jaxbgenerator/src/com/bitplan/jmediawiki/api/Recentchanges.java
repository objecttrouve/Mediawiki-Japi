//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.01 at 09:01:23 PM CET 
//


package com.bitplan.jmediawiki.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rc" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ns" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pageid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="revid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="old_revid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="rcid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="oldlen" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="newlen" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="new" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rc"
})
public class Recentchanges {

    protected List<Rc> rc;

    /**
     * Gets the value of the rc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rc }
     * 
     * 
     */
    public List<Rc> getRc() {
        if (rc == null) {
            rc = new ArrayList<Rc>();
        }
        return this.rc;
    }

}