/**
 * DtPlataforma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtPlataforma  implements java.io.Serializable {
    private float costo;

    private java.lang.String descripcion;

    private int duracion;

    private java.lang.String espectadoresMax;

    private java.lang.String espectadoresMin;

    private java.lang.String fechaAlta;

    private java.lang.String nombre;

    private java.lang.String URLAsociada;

    public DtPlataforma() {
    }

    public DtPlataforma(
           float costo,
           java.lang.String descripcion,
           int duracion,
           java.lang.String espectadoresMax,
           java.lang.String espectadoresMin,
           java.lang.String fechaAlta,
           java.lang.String nombre,
           java.lang.String URLAsociada) {
           this.costo = costo;
           this.descripcion = descripcion;
           this.duracion = duracion;
           this.espectadoresMax = espectadoresMax;
           this.espectadoresMin = espectadoresMin;
           this.fechaAlta = fechaAlta;
           this.nombre = nombre;
           this.URLAsociada = URLAsociada;
    }


    /**
     * Gets the costo value for this DtPlataforma.
     * 
     * @return costo
     */
    public float getCosto() {
        return costo;
    }


    /**
     * Sets the costo value for this DtPlataforma.
     * 
     * @param costo
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }


    /**
     * Gets the descripcion value for this DtPlataforma.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this DtPlataforma.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the duracion value for this DtPlataforma.
     * 
     * @return duracion
     */
    public int getDuracion() {
        return duracion;
    }


    /**
     * Sets the duracion value for this DtPlataforma.
     * 
     * @param duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    /**
     * Gets the espectadoresMax value for this DtPlataforma.
     * 
     * @return espectadoresMax
     */
    public java.lang.String getEspectadoresMax() {
        return espectadoresMax;
    }


    /**
     * Sets the espectadoresMax value for this DtPlataforma.
     * 
     * @param espectadoresMax
     */
    public void setEspectadoresMax(java.lang.String espectadoresMax) {
        this.espectadoresMax = espectadoresMax;
    }


    /**
     * Gets the espectadoresMin value for this DtPlataforma.
     * 
     * @return espectadoresMin
     */
    public java.lang.String getEspectadoresMin() {
        return espectadoresMin;
    }


    /**
     * Sets the espectadoresMin value for this DtPlataforma.
     * 
     * @param espectadoresMin
     */
    public void setEspectadoresMin(java.lang.String espectadoresMin) {
        this.espectadoresMin = espectadoresMin;
    }


    /**
     * Gets the fechaAlta value for this DtPlataforma.
     * 
     * @return fechaAlta
     */
    public java.lang.String getFechaAlta() {
        return fechaAlta;
    }


    /**
     * Sets the fechaAlta value for this DtPlataforma.
     * 
     * @param fechaAlta
     */
    public void setFechaAlta(java.lang.String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    /**
     * Gets the nombre value for this DtPlataforma.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DtPlataforma.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the URLAsociada value for this DtPlataforma.
     * 
     * @return URLAsociada
     */
    public java.lang.String getURLAsociada() {
        return URLAsociada;
    }


    /**
     * Sets the URLAsociada value for this DtPlataforma.
     * 
     * @param URLAsociada
     */
    public void setURLAsociada(java.lang.String URLAsociada) {
        this.URLAsociada = URLAsociada;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtPlataforma)) return false;
        DtPlataforma other = (DtPlataforma) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.costo == other.getCosto() &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            this.duracion == other.getDuracion() &&
            ((this.espectadoresMax==null && other.getEspectadoresMax()==null) || 
             (this.espectadoresMax!=null &&
              this.espectadoresMax.equals(other.getEspectadoresMax()))) &&
            ((this.espectadoresMin==null && other.getEspectadoresMin()==null) || 
             (this.espectadoresMin!=null &&
              this.espectadoresMin.equals(other.getEspectadoresMin()))) &&
            ((this.fechaAlta==null && other.getFechaAlta()==null) || 
             (this.fechaAlta!=null &&
              this.fechaAlta.equals(other.getFechaAlta()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.URLAsociada==null && other.getURLAsociada()==null) || 
             (this.URLAsociada!=null &&
              this.URLAsociada.equals(other.getURLAsociada())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Float(getCosto()).hashCode();
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        _hashCode += getDuracion();
        if (getEspectadoresMax() != null) {
            _hashCode += getEspectadoresMax().hashCode();
        }
        if (getEspectadoresMin() != null) {
            _hashCode += getEspectadoresMin().hashCode();
        }
        if (getFechaAlta() != null) {
            _hashCode += getFechaAlta().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getURLAsociada() != null) {
            _hashCode += getURLAsociada().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtPlataforma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtPlataforma"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duracion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("espectadoresMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "espectadoresMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("espectadoresMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "espectadoresMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAlta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaAlta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLAsociada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLAsociada"));
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
