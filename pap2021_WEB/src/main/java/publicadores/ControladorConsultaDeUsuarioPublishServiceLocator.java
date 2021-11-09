/**
 * ControladorConsultaDeUsuarioPublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorConsultaDeUsuarioPublishServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorConsultaDeUsuarioPublishService {

    public ControladorConsultaDeUsuarioPublishServiceLocator() {
    }


    public ControladorConsultaDeUsuarioPublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorConsultaDeUsuarioPublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorConsultaDeUsuarioPublishPort
    private java.lang.String ControladorConsultaDeUsuarioPublishPort_address = "http://127.0.0.1:8080/ControladorConsultaDeUsuario";

    public java.lang.String getControladorConsultaDeUsuarioPublishPortAddress() {
        return ControladorConsultaDeUsuarioPublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorConsultaDeUsuarioPublishPortWSDDServiceName = "ControladorConsultaDeUsuarioPublishPort";

    public java.lang.String getControladorConsultaDeUsuarioPublishPortWSDDServiceName() {
        return ControladorConsultaDeUsuarioPublishPortWSDDServiceName;
    }

    public void setControladorConsultaDeUsuarioPublishPortWSDDServiceName(java.lang.String name) {
        ControladorConsultaDeUsuarioPublishPortWSDDServiceName = name;
    }

    public publicadores.ControladorConsultaDeUsuarioPublish getControladorConsultaDeUsuarioPublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorConsultaDeUsuarioPublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorConsultaDeUsuarioPublishPort(endpoint);
    }

    public publicadores.ControladorConsultaDeUsuarioPublish getControladorConsultaDeUsuarioPublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorConsultaDeUsuarioPublishPortBindingStub _stub = new publicadores.ControladorConsultaDeUsuarioPublishPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorConsultaDeUsuarioPublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorConsultaDeUsuarioPublishPortEndpointAddress(java.lang.String address) {
        ControladorConsultaDeUsuarioPublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorConsultaDeUsuarioPublish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorConsultaDeUsuarioPublishPortBindingStub _stub = new publicadores.ControladorConsultaDeUsuarioPublishPortBindingStub(new java.net.URL(ControladorConsultaDeUsuarioPublishPort_address), this);
                _stub.setPortName(getControladorConsultaDeUsuarioPublishPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ControladorConsultaDeUsuarioPublishPort".equals(inputPortName)) {
            return getControladorConsultaDeUsuarioPublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorConsultaDeUsuarioPublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorConsultaDeUsuarioPublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorConsultaDeUsuarioPublishPort".equals(portName)) {
            setControladorConsultaDeUsuarioPublishPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
