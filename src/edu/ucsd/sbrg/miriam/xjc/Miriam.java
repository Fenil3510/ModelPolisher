//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.04.27 at 01:32:33 PM CEST
//
package edu.ucsd.sbrg.miriam.xjc;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datatype" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="synonyms" type="{http://www.biomodels.net/MIRIAM/}synonyms" minOccurs="0"/>
 *                   &lt;element name="definition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="uris" type="{http://www.biomodels.net/MIRIAM/}uris" maxOccurs="unbounded"/>
 *                   &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="documentations" type="{http://www.biomodels.net/MIRIAM/}documentations" minOccurs="0"/>
 *                   &lt;element name="resources" type="{http://www.biomodels.net/MIRIAM/}resources"/>
 *                   &lt;element name="restrictions" type="{http://www.biomodels.net/MIRIAM/}restrictions" minOccurs="0"/>
 *                   &lt;element name="tags" type="{http://www.biomodels.net/MIRIAM/}tags" minOccurs="0"/>
 *                   &lt;element name="annotation" type="{http://www.biomodels.net/MIRIAM/}annotation" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" use="required" type="{http://www.biomodels.net/MIRIAM/}dataTypeID" />
 *                 &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="restricted" type="{http://www.biomodels.net/MIRIAM/}TrueOrFalse" />
 *                 &lt;attribute name="obsolete" type="{http://www.biomodels.net/MIRIAM/}TrueOrFalse" />
 *                 &lt;attribute name="replacement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listOfTags" type="{http://www.biomodels.net/MIRIAM/}listOfTags" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="data-version" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"datatype", "listOfTags"})
@XmlRootElement(name = "miriam")
public class Miriam {

  @XmlElement(required = true)
  protected List<Miriam.Datatype> datatype;
  protected ListOfTags listOfTags;
  @XmlAttribute(name = "date", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar date;
  @XmlAttribute(name = "data-version", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar dataVersion;


  /**
   * Gets the value of the datatype property.
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the datatype property.
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getDatatype().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Miriam.Datatype }
   */
  public List<Miriam.Datatype> getDatatype() {
    if (datatype == null) {
      datatype = new ArrayList<Miriam.Datatype>();
    }
    return this.datatype;
  }


  /**
   * Gets the value of the listOfTags property.
   * 
   * @return
   *         possible object is
   *         {@link ListOfTags }
   */
  public ListOfTags getListOfTags() {
    return listOfTags;
  }


  /**
   * Sets the value of the listOfTags property.
   * 
   * @param value
   *        allowed object is
   *        {@link ListOfTags }
   */
  public void setListOfTags(ListOfTags value) {
    this.listOfTags = value;
  }


  /**
   * Gets the value of the date property.
   * 
   * @return
   *         possible object is
   *         {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDate() {
    return date;
  }


  /**
   * Sets the value of the date property.
   * 
   * @param value
   *        allowed object is
   *        {@link XMLGregorianCalendar }
   */
  public void setDate(XMLGregorianCalendar value) {
    this.date = value;
  }


  /**
   * Gets the value of the dataVersion property.
   * 
   * @return
   *         possible object is
   *         {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDataVersion() {
    return dataVersion;
  }


  /**
   * Sets the value of the dataVersion property.
   * 
   * @param value
   *        allowed object is
   *        {@link XMLGregorianCalendar }
   */
  public void setDataVersion(XMLGregorianCalendar value) {
    this.dataVersion = value;
  }

  /**
   * <p>
   * Java class for anonymous complex type.
   * <p>
   * The following schema fragment specifies the expected content contained within this class.
   * 
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="synonyms" type="{http://www.biomodels.net/MIRIAM/}synonyms" minOccurs="0"/>
   *         &lt;element name="definition" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="uris" type="{http://www.biomodels.net/MIRIAM/}uris" maxOccurs="unbounded"/>
   *         &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="documentations" type="{http://www.biomodels.net/MIRIAM/}documentations" minOccurs="0"/>
   *         &lt;element name="resources" type="{http://www.biomodels.net/MIRIAM/}resources"/>
   *         &lt;element name="restrictions" type="{http://www.biomodels.net/MIRIAM/}restrictions" minOccurs="0"/>
   *         &lt;element name="tags" type="{http://www.biomodels.net/MIRIAM/}tags" minOccurs="0"/>
   *         &lt;element name="annotation" type="{http://www.biomodels.net/MIRIAM/}annotation" minOccurs="0"/>
   *       &lt;/sequence>
   *       &lt;attribute name="id" use="required" type="{http://www.biomodels.net/MIRIAM/}dataTypeID" />
   *       &lt;attribute name="pattern" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
   *       &lt;attribute name="restricted" type="{http://www.biomodels.net/MIRIAM/}TrueOrFalse" />
   *       &lt;attribute name="obsolete" type="{http://www.biomodels.net/MIRIAM/}TrueOrFalse" />
   *       &lt;attribute name="replacement" type="{http://www.w3.org/2001/XMLSchema}string" />
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"comment", "name", "synonyms", "definition", "uris", "namespace", "documentations",
    "resources", "restrictions", "tags", "annotation"})
  public static class Datatype {

    protected String comment;
    @XmlElement(required = true)
    protected String name;
    protected Synonyms synonyms;
    @XmlElement(required = true)
    protected String definition;
    @XmlElement(required = true)
    protected List<Uris> uris;
    @XmlElement(required = true)
    protected String namespace;
    protected Documentations documentations;
    @XmlElement(required = true)
    protected Resources resources;
    protected Restrictions restrictions;
    protected Tags tags;
    protected Annotation annotation;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "pattern", required = true)
    protected String pattern;
    @XmlAttribute(name = "restricted")
    protected Boolean restricted;
    @XmlAttribute(name = "obsolete")
    protected Boolean obsolete;
    @XmlAttribute(name = "replacement")
    protected String replacement;


    /**
     * Gets the value of the comment property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     */
    public String getComment() {
      return comment;
    }


    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *        allowed object is
     *        {@link String }
     */
    public void setComment(String value) {
      this.comment = value;
    }


    /**
     * Gets the value of the name property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     */
    public String getName() {
      return name;
    }


    /**
     * Sets the value of the name property.
     * 
     * @param value
     *        allowed object is
     *        {@link String }
     */
    public void setName(String value) {
      this.name = value;
    }


    /**
     * Gets the value of the synonyms property.
     * 
     * @return
     *         possible object is
     *         {@link Synonyms }
     */
    public Synonyms getSynonyms() {
      return synonyms;
    }


    /**
     * Sets the value of the synonyms property.
     * 
     * @param value
     *        allowed object is
     *        {@link Synonyms }
     */
    public void setSynonyms(Synonyms value) {
      this.synonyms = value;
    }


    /**
     * Gets the value of the definition property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     */
    public String getDefinition() {
      return definition;
    }


    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *        allowed object is
     *        {@link String }
     */
    public void setDefinition(String value) {
      this.definition = value;
    }


    /**
     * Gets the value of the uris property.
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uris property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getUris().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uris }
     */
    public List<Uris> getUris() {
      if (uris == null) {
        uris = new ArrayList<Uris>();
      }
      return this.uris;
    }


    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     */
    public String getNamespace() {
      return namespace;
    }


    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *        allowed object is
     *        {@link String }
     */
    public void setNamespace(String value) {
      this.namespace = value;
    }


    /**
     * Gets the value of the documentations property.
     * 
     * @return
     *         possible object is
     *         {@link Documentations }
     */
    public Documentations getDocumentations() {
      return documentations;
    }


    /**
     * Sets the value of the documentations property.
     * 
     * @param value
     *        allowed object is
     *        {@link Documentations }
     */
    public void setDocumentations(Documentations value) {
      this.documentations = value;
    }


    /**
     * Gets the value of the resources property.
     * 
     * @return
     *         possible object is
     *         {@link Resources }
     */
    public Resources getResources() {
      return resources;
    }


    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *        allowed object is
     *        {@link Resources }
     */
    public void setResources(Resources value) {
      this.resources = value;
    }


    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *         possible object is
     *         {@link Restrictions }
     */
    public Restrictions getRestrictions() {
      return restrictions;
    }


    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *        allowed object is
     *        {@link Restrictions }
     */
    public void setRestrictions(Restrictions value) {
      this.restrictions = value;
    }


    /**
     * Gets the value of the tags property.
     * 
     * @return
     *         possible object is
     *         {@link Tags }
     */
    public Tags getTags() {
      return tags;
    }


    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *        allowed object is
     *        {@link Tags }
     */
    public void setTags(Tags value) {
      this.tags = value;
    }


    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *         possible object is
     *         {@link Annotation }
     */
    public Annotation getAnnotation() {
      return annotation;
    }


    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *        allowed object is
     *        {@link Annotation }
     */
    public void setAnnotation(Annotation value) {
      this.annotation = value;
    }


    /**
     * Gets the value of the id property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     */
    public String getId() {
      return id;
    }


    /**
     * Sets the value of the id property.
     * 
     * @param value
     *        allowed object is
     *        {@link String }
     */
    public void setId(String value) {
      this.id = value;
    }


    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     */
    public String getPattern() {
      return pattern;
    }


    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *        allowed object is
     *        {@link String }
     */
    public void setPattern(String value) {
      this.pattern = value;
    }


    /**
     * Gets the value of the restricted property.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     */
    public Boolean isRestricted() {
      return restricted;
    }


    /**
     * Sets the value of the restricted property.
     * 
     * @param value
     *        allowed object is
     *        {@link Boolean }
     */
    public void setRestricted(Boolean value) {
      this.restricted = value;
    }


    /**
     * Gets the value of the obsolete property.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     */
    public Boolean isObsolete() {
      return obsolete;
    }


    /**
     * Sets the value of the obsolete property.
     * 
     * @param value
     *        allowed object is
     *        {@link Boolean }
     */
    public void setObsolete(Boolean value) {
      this.obsolete = value;
    }


    /**
     * Gets the value of the replacement property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     */
    public String getReplacement() {
      return replacement;
    }


    /**
     * Sets the value of the replacement property.
     * 
     * @param value
     *        allowed object is
     *        {@link String }
     */
    public void setReplacement(String value) {
      this.replacement = value;
    }
  }
}
