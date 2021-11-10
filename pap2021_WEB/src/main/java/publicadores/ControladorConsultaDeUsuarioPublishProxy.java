package publicadores;

public class ControladorConsultaDeUsuarioPublishProxy implements publicadores.ControladorConsultaDeUsuarioPublish {
  private String _endpoint = null;
  private publicadores.ControladorConsultaDeUsuarioPublish controladorConsultaDeUsuarioPublish = null;
  
  public ControladorConsultaDeUsuarioPublishProxy() {
    _initControladorConsultaDeUsuarioPublishProxy();
  }
  
  public ControladorConsultaDeUsuarioPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorConsultaDeUsuarioPublishProxy();
  }
  
  private void _initControladorConsultaDeUsuarioPublishProxy() {
    try {
      controladorConsultaDeUsuarioPublish = (new publicadores.ControladorConsultaDeUsuarioPublishServiceLocator()).getControladorConsultaDeUsuarioPublishPort();
      if (controladorConsultaDeUsuarioPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorConsultaDeUsuarioPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorConsultaDeUsuarioPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorConsultaDeUsuarioPublish != null)
      ((javax.xml.rpc.Stub)controladorConsultaDeUsuarioPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorConsultaDeUsuarioPublish getControladorConsultaDeUsuarioPublish() {
    if (controladorConsultaDeUsuarioPublish == null)
      _initControladorConsultaDeUsuarioPublishProxy();
    return controladorConsultaDeUsuarioPublish;
  }
  
  public publicadores.DtFuncion[] listaInfoFunciones(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeUsuarioPublish == null)
      _initControladorConsultaDeUsuarioPublishProxy();
    return controladorConsultaDeUsuarioPublish.listaInfoFunciones(arg0);
  }
  
  public publicadores.DtUsuario dtu() throws java.rmi.RemoteException{
    if (controladorConsultaDeUsuarioPublish == null)
      _initControladorConsultaDeUsuarioPublishProxy();
    return controladorConsultaDeUsuarioPublish.dtu();
  }
  
  public publicadores.DtUsuario[] seleccionaUsuario(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeUsuarioPublish == null)
      _initControladorConsultaDeUsuarioPublishProxy();
    return controladorConsultaDeUsuarioPublish.seleccionaUsuario(arg0);
  }
  
  public publicadores.DtEspectador dte() throws java.rmi.RemoteException{
    if (controladorConsultaDeUsuarioPublish == null)
      _initControladorConsultaDeUsuarioPublishProxy();
    return controladorConsultaDeUsuarioPublish.dte();
  }
  
  public publicadores.DtArtista dta() throws java.rmi.RemoteException{
    if (controladorConsultaDeUsuarioPublish == null)
      _initControladorConsultaDeUsuarioPublishProxy();
    return controladorConsultaDeUsuarioPublish.dta();
  }
  
  public publicadores.DtEspectaculo[] listaInfoEspectaculos(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeUsuarioPublish == null)
      _initControladorConsultaDeUsuarioPublishProxy();
    return controladorConsultaDeUsuarioPublish.listaInfoEspectaculos(arg0);
  }
  
  public publicadores.DtEspectador[] listarUsuariosEspectador() throws java.rmi.RemoteException{
    if (controladorConsultaDeUsuarioPublish == null)
      _initControladorConsultaDeUsuarioPublishProxy();
    return controladorConsultaDeUsuarioPublish.listarUsuariosEspectador();
  }
  
  public publicadores.DtArtista[] listarUsuariosArtista() throws java.rmi.RemoteException{
    if (controladorConsultaDeUsuarioPublish == null)
      _initControladorConsultaDeUsuarioPublishProxy();
    return controladorConsultaDeUsuarioPublish.listarUsuariosArtista();
  }
  
  
}