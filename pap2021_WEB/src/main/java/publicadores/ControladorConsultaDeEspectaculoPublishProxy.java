package publicadores;

public class ControladorConsultaDeEspectaculoPublishProxy implements publicadores.ControladorConsultaDeEspectaculoPublish {
  private String _endpoint = null;
  private publicadores.ControladorConsultaDeEspectaculoPublish controladorConsultaDeEspectaculoPublish = null;
  
  public ControladorConsultaDeEspectaculoPublishProxy() {
    _initControladorConsultaDeEspectaculoPublishProxy();
  }
  
  public ControladorConsultaDeEspectaculoPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorConsultaDeEspectaculoPublishProxy();
  }
  
  private void _initControladorConsultaDeEspectaculoPublishProxy() {
    try {
      controladorConsultaDeEspectaculoPublish = (new publicadores.ControladorConsultaDeEspectaculoPublishServiceLocator()).getControladorConsultaDeEspectaculoPublishPort();
      if (controladorConsultaDeEspectaculoPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorConsultaDeEspectaculoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorConsultaDeEspectaculoPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorConsultaDeEspectaculoPublish != null)
      ((javax.xml.rpc.Stub)controladorConsultaDeEspectaculoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorConsultaDeEspectaculoPublish getControladorConsultaDeEspectaculoPublish() {
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish;
  }
  
  public java.lang.String[] listarArtistasInvitados() throws java.rmi.RemoteException{
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish.listarArtistasInvitados();
  }
  
  public publicadores.ArrayList listarPaquetes() throws java.rmi.RemoteException{
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish.listarPaquetes();
  }
  
  public publicadores.DtPaquete seleccionaPaquete(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish.seleccionaPaquete(arg0);
  }
  
  public publicadores.DtFuncion seleccionaFuncion(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish.seleccionaFuncion(arg0);
  }
  
  public publicadores.ArrayList listarEspectaculos() throws java.rmi.RemoteException{
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish.listarEspectaculos();
  }
  
  public publicadores.ArrayList listarFunciones() throws java.rmi.RemoteException{
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish.listarFunciones();
  }
  
  public publicadores.DtPlataforma seleccionaPlataforma(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish.seleccionaPlataforma(arg0);
  }
  
  public publicadores.DtEspectaculo seleccionaEspectaculo(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish.seleccionaEspectaculo(arg0);
  }
  
  public publicadores.ArrayList listarPlataformas() throws java.rmi.RemoteException{
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish.listarPlataformas();
  }
  
  public java.lang.String[] listarPlataformasComboBox() throws java.rmi.RemoteException{
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish.listarPlataformasComboBox();
  }
  
  public java.lang.String[] listarEspectaculosComboBox() throws java.rmi.RemoteException{
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish.listarEspectaculosComboBox();
  }
  
  public java.lang.String[] listarPaquetesComboBox() throws java.rmi.RemoteException{
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish.listarPaquetesComboBox();
  }
  
  public java.lang.String[] listarFuncionesComboBox() throws java.rmi.RemoteException{
    if (controladorConsultaDeEspectaculoPublish == null)
      _initControladorConsultaDeEspectaculoPublishProxy();
    return controladorConsultaDeEspectaculoPublish.listarFuncionesComboBox();
  }
  
  
}