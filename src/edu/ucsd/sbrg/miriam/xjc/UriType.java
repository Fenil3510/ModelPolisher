//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.04.27 at 01:32:33 PM CEST
//
package edu.ucsd.sbrg.miriam.xjc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for uriType.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="uriType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *     &lt;enumeration value="URN"/>
 *     &lt;enumeration value="URL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "uriType")
@XmlEnum
public enum UriType {
  URN,
  URL;

  public String value() {
    return name();
  }


  public static UriType fromValue(String v) {
    return valueOf(v);
  }
}