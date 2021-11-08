/**
 * DtEspectaculo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtEspectaculo  implements java.io.Serializable {
    private java.lang.String artista;

    private float costo;

    private java.lang.String descripcion;

    private int duracion;

    private int espectadoresMax;

    private int espectadoresMin;

    private java.util.Calendar fechaRegistro;

    private java.lang.String image;

    private java.lang.String nombre;

    private java.lang.String urlAsociada;

    public DtEspectaculo() {
    }

    public DtEspectaculo(
           java.lang.String artista,
           float costo,
           java.lang.String descripcion,
           int duracion,
           int espectadoresMax,
           int espectadoresMin,
           java.util.Calendar fechaRegistro,
           java.lang.String image,
           java.lang.String nombre,
           java.lang.String urlAsociada) {
           this.artista = artista;
           this.costo = costo;
           this.descripcion = descripcion;
           this.duracion = duracion;
           this.espectadoresMax = espectadoresMax;
           this.espectadoresMin = espectadoresMin;
           this.fechaRegistro = fechaRegistro;
           this.image = image;
           this.nombre = nombre;
           this.urlAsociada = urlAsociada;
    }


    /**
     * Gets the artista value for this DtEspectaculo.
     * 
     * @return artista
     */
    public java.lang.String getArtista() {
        return artista;
    }


    /**
     * Sets the artista value for this DtEspectaculo.
     * 
     * @param artista
     */
    public void setArtista(java.lang.String artista) {
        this.artista = artista;
    }


    /**
     * Gets the costo value for this DtEspectaculo.
     * 
     * @return costo
     */
    public float getCosto() {
        return costo;
    }


    /**
     * Sets the costo value for this DtEspectaculo.
     * 
     * @param costo
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }


    /**
     * Gets the descripcion value for this DtEspectaculo.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this DtEspectaculo.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the duracion value for this DtEspectaculo.
     * 
     * @return duracion
     */
    public int getDuracion() {
        return duracion;
    }


    /**
     * Sets the duracion value for this DtEspectaculo.
     * 
     * @param duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    /**
     * Gets the espectadoresMax value for this DtEspectaculo.
     * 
     * @return espectadoresMax
     */
    public int getEspectadoresMax() {
        return espectadoresMax;
    }


    /**
     * Sets the espectadoresMax value for this DtEspectaculo.
     * 
     * @param espectadoresMax
     */
    public void setEspectadoresMax(int espectadoresMax) {
        this.espectadoresMax = espectadoresMax;
    }


    /**
     * Gets the espectadoresMin value for this DtEspectaculo.
     * 
     * @return espectadoresMin
     */
    public int getEspectadoresMin() {
        return espectadoresMin;
    }


    /**
     * Sets the espectadoresMin value for this DtEspectaculo.
     * 
     * @param espectadoresMin
     */
    public void setEspectadoresMin(int espectadoresMin) {
        this.espectadoresMin = espectadoresMin;
    }


    /**
     * Gets the fechaRegistro value for this DtEspectaculo.
     * 
     * @return fechaRegistro
     */
    public java.util.Calendar getFechaRegistro() {
        return fechaRegistro;
    }


    /**
     * Sets the fechaRegistro value for this DtEspectaculo.
     * 
     * @param fechaRegistro
     */
    public void setFechaRegistro(java.util.Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


    /**
     * Gets the image value for this DtEspectaculo.
     * 
     * @return image
     */
    public java.lang.String getImage() {
        return image;
    }


    /**
     * Sets the image value for this DtEspectaculo.
     * 
     * @param image
     */
    public void setImage(java.lang.String image) {
        this.image = image;
    }


    /**
     * Gets the nombre value for this DtEspectaculo.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DtEspectaculo.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the urlAsociada value for this DtEspectaculo.
     * 
     * @return urlAsociada
     */
    public java.lang.String getUrlAsociada() {
        return urlAsociada;
    }


    /**
     * Sets the urlAsociada value for this DtEspectaculo.
     * 
     * @param urlAsociada
     */
    public void setUrlAsociada(java.lang.String urlAsociada) {
        this.urlAsociada = urlAsociada;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtEspectaculo)) return false;
        DtEspectaculo other = (DtEspectaculo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.artista==null && other.getArtista()==null) || 
             (this.artista!=null &&
              this.artista.equals(other.getArtista()))) &&
            this.costo == other.getCosto() &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            this.duracion == other.getDuracion() &&
            this.espectadoresMax == other.getEspectadoresMax() &&
            this.espectadoresMin == other.getEspectadoresMin() &&
            ((this.fechaRegistro==null && other.getFechaRegistro()==null) || 
             (this.fechaRegistro!=null &&
              this.fechaRegistro.equals(other.getFechaRegistro()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.urlAsociada==null && other.getUrlAsociada()==null) || 
             (this.urlAsociada!=null &&
              this.urlAsociada.equals(other.getUrlAsociada())));
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
        if (getArtista() != null) {
            _hashCode += getArtista().hashCode();
        }
        _hashCode += new Float(getCosto()).hashCode();
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        _hashCode += getDuracion();
        _hashCode += getEspectadoresMax();
        _hashCode += getEspectadoresMin();
        if (getFechaRegistro() != null) {
            _hashCode += getFechaRegistro().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getUrlAsociada() != null) {
            _hashCode += getUrlAsociada().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtEspectaculo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtEspectaculo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artista");
        elemField.setXmlName(new javax.xml.namespace.QName("", "artista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("espectadoresMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "espectadoresMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("", "image"));
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
        elemField.setFieldName("urlAsociada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlAsociada"));
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
