/**
 * DtArtista.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtArtista  extends publicadores.DtUsuario  implements java.io.Serializable {
    private java.lang.String biografia;

    private java.lang.String descGeneral;

    private java.lang.String link;

    public DtArtista() {
    }

    public DtArtista(
           java.lang.String apellido,
           java.lang.String email,
           java.util.Calendar fechaNac,
           java.lang.String image,
           java.lang.String nickName,
           java.lang.String nombre,
           java.lang.String password,
           java.lang.String biografia,
           java.lang.String descGeneral,
           java.lang.String link) {
        super(
            apellido,
            email,
            fechaNac,
            image,
            nickName,
            nombre,
            password);
        this.biografia = biografia;
        this.descGeneral = descGeneral;
        this.link = link;
    }


    /**
     * Gets the biografia value for this DtArtista.
     * 
     * @return biografia
     */
    public java.lang.String getBiografia() {
        return biografia;
    }


    /**
     * Sets the biografia value for this DtArtista.
     * 
     * @param biografia
     */
    public void setBiografia(java.lang.String biografia) {
        this.biografia = biografia;
    }


    /**
     * Gets the descGeneral value for this DtArtista.
     * 
     * @return descGeneral
     */
    public java.lang.String getDescGeneral() {
        return descGeneral;
    }


    /**
     * Sets the descGeneral value for this DtArtista.
     * 
     * @param descGeneral
     */
    public void setDescGeneral(java.lang.String descGeneral) {
        this.descGeneral = descGeneral;
    }


    /**
     * Gets the link value for this DtArtista.
     * 
     * @return link
     */
    public java.lang.String getLink() {
        return link;
    }


    /**
     * Sets the link value for this DtArtista.
     * 
     * @param link
     */
    public void setLink(java.lang.String link) {
        this.link = link;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtArtista)) return false;
        DtArtista other = (DtArtista) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.biografia==null && other.getBiografia()==null) || 
             (this.biografia!=null &&
              this.biografia.equals(other.getBiografia()))) &&
            ((this.descGeneral==null && other.getDescGeneral()==null) || 
             (this.descGeneral!=null &&
              this.descGeneral.equals(other.getDescGeneral()))) &&
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              this.link.equals(other.getLink())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBiografia() != null) {
            _hashCode += getBiografia().hashCode();
        }
        if (getDescGeneral() != null) {
            _hashCode += getDescGeneral().hashCode();
        }
        if (getLink() != null) {
            _hashCode += getLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtArtista.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtArtista"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biografia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "biografia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descGeneral");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descGeneral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
