package ProveedoresApp;


/**
* ProveedoresApp/_ProveedoresStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from proveedores.idl
* martes 7 de mayo de 2019 12:02:08 PM COT
*/

public class _ProveedoresStub extends org.omg.CORBA.portable.ObjectImpl implements ProveedoresApp.Proveedores
{

  public boolean insertarProveedores (int cedula, String nombre, String apellido, String telefono, int id_producto, int id_marca, int marca, int precio_compra, int precio_uno, int precio_dos, int precio_tres, String fecha_compra)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarProveedores", true);
                $out.write_long (cedula);
                $out.write_wstring (nombre);
                $out.write_wstring (apellido);
                $out.write_wstring (telefono);
                $out.write_long (id_producto);
                $out.write_long (id_marca);
                $out.write_long (marca);
                $out.write_long (precio_compra);
                $out.write_long (precio_uno);
                $out.write_long (precio_dos);
                $out.write_long (precio_tres);
                $out.write_wstring (fecha_compra);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarProveedores (cedula, nombre, apellido, telefono, id_producto, id_marca, marca, precio_compra, precio_uno, precio_dos, precio_tres, fecha_compra        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarProveedores

  public boolean actualizarProveedor (int cedula, String nombre, String apellido, String telefono, int id_producto, int id_marca, int marca, int precio_compra, int precio_uno, int precio_dos, int precio_tres, String fecha_compra)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarProveedor", true);
                $out.write_long (cedula);
                $out.write_wstring (nombre);
                $out.write_wstring (apellido);
                $out.write_wstring (telefono);
                $out.write_long (id_producto);
                $out.write_long (id_marca);
                $out.write_long (marca);
                $out.write_long (precio_compra);
                $out.write_long (precio_uno);
                $out.write_long (precio_dos);
                $out.write_long (precio_tres);
                $out.write_wstring (fecha_compra);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarProveedor (cedula, nombre, apellido, telefono, id_producto, id_marca, marca, precio_compra, precio_uno, precio_dos, precio_tres, fecha_compra        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarProveedor

  public boolean eliminarProveedor (int id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarProveedor", true);
                $out.write_long (id);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarProveedor (id        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarProveedor

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ProveedoresApp/Proveedores:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ProveedoresStub
