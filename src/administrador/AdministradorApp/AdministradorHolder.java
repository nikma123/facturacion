package AdministradorApp;

/**
* AdministradorApp/AdministradorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from administrador.idl
* martes 7 de mayo de 2019 11:02:58 AM COT
*/

public final class AdministradorHolder implements org.omg.CORBA.portable.Streamable
{
  public AdministradorApp.Administrador value = null;

  public AdministradorHolder ()
  {
  }

  public AdministradorHolder (AdministradorApp.Administrador initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AdministradorApp.AdministradorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AdministradorApp.AdministradorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AdministradorApp.AdministradorHelper.type ();
  }

}
