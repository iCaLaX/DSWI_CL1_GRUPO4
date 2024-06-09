//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 11:06:05 PM PET 
//


package pe.edu.cibertec.ws.objects;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Date;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nomAutor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apeAutor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechNacAutor" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
    "nomAutor",
    "apeAutor",
    "fechNacAutor"
})
@XmlRootElement(name = "createAutorRequest")
public class CreateAutorRequest {

    @XmlElement(required = true)
    protected String nomAutor;
    @XmlElement(required = true)
    protected String apeAutor;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechNacAutor;

    /**
     * Obtiene el valor de la propiedad nomAutor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomAutor() {
        return nomAutor;
    }

    /**
     * Define el valor de la propiedad nomAutor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomAutor(String value) {
        this.nomAutor = value;
    }

    /**
     * Obtiene el valor de la propiedad apeAutor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApeAutor() {
        return apeAutor;
    }

    /**
     * Define el valor de la propiedad apeAutor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApeAutor(String value) {
        this.apeAutor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechNacAutor.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public Date getFechNacAutor() {
        return fechNacAutor;
    }

    /**
     * Define el valor de la propiedad fechNacAutor.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechNacAutor(XMLGregorianCalendar value) {
        this.fechNacAutor = value;
    }

}
