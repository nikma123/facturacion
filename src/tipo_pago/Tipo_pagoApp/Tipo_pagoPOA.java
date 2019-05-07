package Tipo_pagoApp;


/**
* Tipo_pagoApp/Tipo_pagoPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from tipo_pago.idl
* martes 7 de mayo de 2019 12:19:12 PM COT
*/

public abstract class Tipo_pagoPOA extends org.omg.PortableServer.Servant
 implements Tipo_pagoApp.Tipo_pagoOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarTipo_pago", new java.lang.Integer (0));
    _methods.put ("actualizarTipo_pago", new java.lang.Integer (1));
    _methods.put ("eliminarTipo_pago", new java.lang.Integer (2));
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
       case 0:  // Tipo_pagoApp/Tipo_pago/insertarTipo_pago
       {
         String descripcion = in.read_wstring ();
         String estado = in.read_wstring ();
         int id_banco = in.read_long ();
         boolean $result = false;
         $result = this.insertarTipo_pago (descripcion, estado, id_banco);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Tipo_pagoApp/Tipo_pago/actualizarTipo_pago
       {
         String descripcion = in.read_wstring ();
         String estado = in.read_wstring ();
         int id_banco = in.read_long ();
         boolean $result = false;
         $result = this.actualizarTipo_pago (descripcion, estado, id_banco);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Tipo_pagoApp/Tipo_pago/eliminarTipo_pago
       {
         int id = in.read_long ();
         boolean $result = false;
         $result = this.eliminarTipo_pago (id);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Tipo_pagoApp/Tipo_pago/shutdown
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
    "IDL:Tipo_pagoApp/Tipo_pago:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Tipo_pago _this() 
  {
    return Tipo_pagoHelper.narrow(
    super._this_object());
  }

  public Tipo_pago _this(org.omg.CORBA.ORB orb) 
  {
    return Tipo_pagoHelper.narrow(
    super._this_object(orb));
  }


} // class Tipo_pagoPOA