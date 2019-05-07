package FacturacionApp;


/**
* FacturacionApp/_FacturacionStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from facturacion.idl
* martes 7 de mayo de 2019 11:34:30 AM COT
*/

public class _FacturacionStub extends org.omg.CORBA.portable.ObjectImpl implements FacturacionApp.Facturacion
{

  public boolean insertarFacturacion (String fecha_venta, int id_cliente, int id_producto, int cantidad, int precio_unidad, int precio_sin_iva, int precio_con_iva, int id_tipo_pago, int id_local)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarFacturacion", true);
                $out.write_wstring (fecha_venta);
                $out.write_long (id_cliente);
                $out.write_long (id_producto);
                $out.write_long (cantidad);
                $out.write_long (precio_unidad);
                $out.write_long (precio_sin_iva);
                $out.write_long (precio_con_iva);
                $out.write_long (id_tipo_pago);
                $out.write_long (id_local);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarFacturacion (fecha_venta, id_cliente, id_producto, cantidad, precio_unidad, precio_sin_iva, precio_con_iva, id_tipo_pago, id_local        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarFacturacion

  public boolean actualizarFacturacion (String fecha_venta, int id_cliente, int id_producto, int cantidad, int precio_unidad, int precio_sin_iva, int precio_con_iva, int id_tipo_pago, int id_local)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarFacturacion", true);
                $out.write_wstring (fecha_venta);
                $out.write_long (id_cliente);
                $out.write_long (id_producto);
                $out.write_long (cantidad);
                $out.write_long (precio_unidad);
                $out.write_long (precio_sin_iva);
                $out.write_long (precio_con_iva);
                $out.write_long (id_tipo_pago);
                $out.write_long (id_local);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarFacturacion (fecha_venta, id_cliente, id_producto, cantidad, precio_unidad, precio_sin_iva, precio_con_iva, id_tipo_pago, id_local        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarFacturacion

  public boolean eliminarFacturacion (int id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarFacturacion", true);
                $out.write_long (id);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarFacturacion (id        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarFacturacion

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
    "IDL:FacturacionApp/Facturacion:1.0"};

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
} // class _FacturacionStub