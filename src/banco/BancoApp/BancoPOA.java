package BancoApp;


/**
* BancoApp/BancoPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from banco.idl
* martes 7 de mayo de 2019 11:06:32 AM COT
*/

public abstract class BancoPOA extends org.omg.PortableServer.Servant
 implements BancoApp.BancoOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarBanco", new java.lang.Integer (0));
    _methods.put ("actualizarBanco", new java.lang.Integer (1));
    _methods.put ("eliminarBanco", new java.lang.Integer (2));
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
       case 0:  // BancoApp/Banco/insertarBanco
       {
         String nombre = in.read_wstring ();
         String estado = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarBanco (nombre, estado);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // BancoApp/Banco/actualizarBanco
       {
         String nombre = in.read_wstring ();
         String estado = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarBanco (nombre, estado);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // BancoApp/Banco/eliminarBanco
       {
         int id = in.read_long ();
         boolean $result = false;
         $result = this.eliminarBanco (id);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // BancoApp/Banco/shutdown
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
    "IDL:BancoApp/Banco:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Banco _this() 
  {
    return BancoHelper.narrow(
    super._this_object());
  }

  public Banco _this(org.omg.CORBA.ORB orb) 
  {
    return BancoHelper.narrow(
    super._this_object(orb));
  }


} // class BancoPOA