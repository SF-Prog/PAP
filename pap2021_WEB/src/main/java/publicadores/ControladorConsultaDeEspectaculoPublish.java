/**
 * ControladorConsultaDeEspectaculoPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorConsultaDeEspectaculoPublish extends java.rmi.Remote {
    public java.lang.String[] listarPlataformasComboBox() throws java.rmi.RemoteException;
    public java.lang.String[] listarEspectaculosComboBox() throws java.rmi.RemoteException;
    public java.lang.String[] listarPaquetesComboBox() throws java.rmi.RemoteException;
    public java.lang.String[] listarFuncionesComboBox() throws java.rmi.RemoteException;
    public publicadores.DtPlataforma[] listarPlataformas() throws java.rmi.RemoteException;
    public java.lang.String[] listarArtistasInvitados() throws java.rmi.RemoteException;
    public publicadores.DtPlataforma seleccionaPlataforma(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtEspectaculo seleccionaEspectaculo(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtPaquete seleccionaPaquete(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtEspectaculo[] listarEspectaculos() throws java.rmi.RemoteException;
    public publicadores.DtFuncion seleccionaFuncion(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtPaquete[] listarPaquetes() throws java.rmi.RemoteException;
    public publicadores.DtFuncion[] listarFunciones() throws java.rmi.RemoteException;
}
