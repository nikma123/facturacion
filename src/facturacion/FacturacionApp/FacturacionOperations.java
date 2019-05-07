package FacturacionApp;


/**
* FacturacionApp/FacturacionOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from facturacion.idl
* martes 7 de mayo de 2019 11:34:30 AM COT
*/

public interface FacturacionOperations 
{
  boolean insertarFacturacion (String fecha_venta, int id_cliente, int id_producto, int cantidad, int precio_unidad, int precio_sin_iva, int precio_con_iva, int id_tipo_pago, int id_local);
  boolean actualizarFacturacion (String fecha_venta, int id_cliente, int id_producto, int cantidad, int precio_unidad, int precio_sin_iva, int precio_con_iva, int id_tipo_pago, int id_local);
  boolean eliminarFacturacion (int id);
  void shutdown ();
} // interface FacturacionOperations