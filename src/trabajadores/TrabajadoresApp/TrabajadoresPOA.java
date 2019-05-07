package TrabajadoresApp;


/**
* TrabajadoresApp/TrabajadoresPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from trabajadores.idl
* martes 7 de mayo de 2019 12:23:09 PM COT
*/

public abstract class TrabajadoresPOA extends org.omg.PortableServer.Servant
 implements TrabajadoresApp.TrabajadoresOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarTrabajadores", new java.lang.Integer (0));
    _methods.put ("actualizarTrabajadores", new java.lang.Integer (1));
    _methods.put ("eliminarTrabajadores", new java.lang.Integer (2));
    _methods.put ("shutdown", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // TrabajadoresApp/Trabajadores/insertarTrabajadores
       {
         String nombre = in.read_wstring ();
         String estado = in.read_wstring ();
         int id_local = in.read_long ();
         boolean $result = false;
         $result = this.insertarTrabajadores (nombre, estado, id_local);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // TrabajadoresApp/Trabajadores/actualizarTrabajadores
       {
         String nombre = in.read_wstring ();
         String estado = in.read_wstring ();
         int id_local = in.read_long ();
         boolean $result = false;
         $result = this.actualizarTrabajadores (nombre, estado, id_local);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // TrabajadoresApp/Trabajadores/eliminarTrabajadores
       {
         int id = in.read_long ();
         boolean $result = false;
         $result = this.eliminarTrabajadores (id);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // TrabajadoresApp/Trabajadores/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:TrabajadoresApp/Trabajadores:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Trabajadores _this() 
  {
    return TrabajadoresHelper.narrow(
    super._this_object());
  }

  public Trabajadores _this(org.omg.CORBA.ORB orb) 
  {
    return TrabajadoresHelper.narrow(
    super._this_object(orb));
  }


} // class TrabajadoresPOA
