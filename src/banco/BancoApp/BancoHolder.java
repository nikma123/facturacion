package BancoApp;

/**
* BancoApp/BancoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from banco.idl
* martes 7 de mayo de 2019 11:06:32 AM COT
*/

public final class BancoHolder implements org.omg.CORBA.portable.Streamable
{
  public BancoApp.Banco value = null;

  public BancoHolder ()
  {
  }

  public BancoHolder (BancoApp.Banco initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BancoApp.BancoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BancoApp.BancoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BancoApp.BancoHelper.type ();
  }

}
