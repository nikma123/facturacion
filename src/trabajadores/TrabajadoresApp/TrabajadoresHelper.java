package TrabajadoresApp;


/**
* TrabajadoresApp/TrabajadoresHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from trabajadores.idl
* martes 7 de mayo de 2019 12:23:09 PM COT
*/

abstract public class TrabajadoresHelper
{
  private static String  _id = "IDL:TrabajadoresApp/Trabajadores:1.0";

  public static void insert (org.omg.CORBA.Any a, TrabajadoresApp.Trabajadores that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static TrabajadoresApp.Trabajadores extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (TrabajadoresApp.TrabajadoresHelper.id (), "Trabajadores");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static TrabajadoresApp.Trabajadores read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_TrabajadoresStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, TrabajadoresApp.Trabajadores value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static TrabajadoresApp.Trabajadores narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof TrabajadoresApp.Trabajadores)
      return (TrabajadoresApp.Trabajadores)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      TrabajadoresApp._TrabajadoresStub stub = new TrabajadoresApp._TrabajadoresStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static TrabajadoresApp.Trabajadores unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof TrabajadoresApp.Trabajadores)
      return (TrabajadoresApp.Trabajadores)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      TrabajadoresApp._TrabajadoresStub stub = new TrabajadoresApp._TrabajadoresStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
