/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Persona {
     
    private Conexion con;
    private long id_persona;
    private String nombre;
    private String apellidos;
    private String curp;
    private String rfc;
    private String edo_civil;

    public Persona(long id_persona, String nombre, String curp, String apellidos, String rfc, String edo_civil) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curp = curp;
        this.rfc = rfc;
        this.edo_civil = edo_civil;
    }
    
    
    public Persona(){}

    public Conexion getCon() {
        return con;
    }

    public void setCon(Conexion con) {
        this.con = con;
    }

    public long getId_persona() {
        return id_persona;
    }

    public void setId_persona(long id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getEdo_civil() {
        return edo_civil;
    }

    public void setEdo_civil(String edo_civil) {
        this.edo_civil = edo_civil;
    }
    
    //Metodos getters y setters
    public void obtenerPersonaBycurp(){
        try {
            con= new Conexion();
            final String SQL="SELECT * FROM personas WHERE curp=?";
            PreparedStatement sentencia=con.obtenerConexion().prepareStatement(SQL);
            sentencia.setString(1, curp);
            ResultSet record=sentencia.executeQuery();
                  while(record.next()){
                      //Se le esta asignando a la variable el dato que corresponde a la base de datos con
                      //la tabla llamada
                      id_persona=record.getLong("id");
                      nombre= record.getString("nombre");
                      curp=record.getString("curp");
                      apellidos=record.getString("apellidos");
                      rfc=record.getString("rfc");
                      edo_civil=record.getString("estado_civil");
                  }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void guardarpersona(){
        try{
            con = new Conexion();
            final String SQL="SELECT insertar_persona(?,?,?,?,?)";
            PreparedStatement sentencia=con.obtenerConexion().prepareStatement(SQL);
            sentencia.setString(1, nombre);
            sentencia.setString(2, apellidos);
            sentencia.setString(3, curp);
            sentencia.setString(4, rfc);
            sentencia.setString(5, edo_civil);
            ResultSet record=sentencia.executeQuery();
             while(record.next()){
                      //Se le esta asignando a la variable el dato que corresponde a la base de datos con
                      //la tabla llamada
                     //id_persona=record.getLong("id");
                      nombre= record.getString("nombre");
                      apellidos=record.getString("apellidos");
                      curp=record.getString("curp");
                      rfc=record.getString("rfc");
                      edo_civil=record.getString("estado_civil");
                  }
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }
    public void Modificar(){
        try{
            con = new Conexion();
            //Consulta para  modificar los datos de mi tabla persona
            final String sql = "Update persona SET nombre=?,apellidos=?,curp=?,rfc=?,edo_civil=? where curp=?";
            PreparedStatement sen =con.obtenerConexion().prepareStatement(sql);
            sen.setString(1, nombre);
            sen.setString(2, apellidos);
            sen.setString(3, curp);
            sen.setString(4, rfc);
            sen.setString(5, edo_civil);
            sen.setString(6, curp);
            ResultSet record=sen.executeQuery();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void Eliminar(){
        try{
           //Implementamos la conexion a la base de datos
           con= new Conexion();
           //Realizamos la consulta para eliminar los datos
           final String consulta = "DELETE FROM personas Where curp=?";
           PreparedStatement sen=con.obtenerConexion().prepareStatement(consulta);
           sen.setString (1,curp);
           int red=sen.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
  //Trabajando con ARRAYLIST
   public ArrayList<Persona>obtenerPer(){
        ArrayList<Persona>listas=new ArrayList();
        try{
           con = new Conexion();
           final String SQL="SELECT * FROM personas";
           PreparedStatement sentencia =con.obtenerConexion().prepareStatement(SQL);
           ResultSet res =sentencia.executeQuery();
           while(res.next()){
              
               //Se van a traer mi consulta por medio de arreglos
               listas.add(new Persona(res.getLong(1),
                                      res.getString(2),
                                      res.getString(3),
                                      res.getString(4),
                                      res.getString(5),
                                      res.getString(6)));
               
               }return listas;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return listas;
    }
    
    public int obtenerEdad(){
       
        Date fechaNaci = null;
        String año = curp.substring(4, 6);
        String mes = curp.substring(6, 8);
        String dia = curp.substring(8, 10);
        String fecha = año + "-" + mes + "-" + dia;

        try {
            /*
            Mediante la clase SUNSTRING vamos a extraer la 
            fecha de nacimiento por la curp y vamos a calcular {
            la edad
             */
            fechaNaci = (Date) new SimpleDateFormat("yy-MM-dd").parse(fecha);

        } catch (Exception ex) {
            System.out.println("Error:" + ex);
        }
        Calendar fechaNacimiento = Calendar.getInstance();
        /*
        Se crea un objeto que contendra la fecha actual de esta forma podremos
        hacer el calculo de la edad
         */
        Calendar fechaActual = Calendar.getInstance();
        //Se asigna la fecha recibida a la fecha de nacimiento.
        fechaNacimiento.setTime(fechaNaci);
        //fechaNacimiento.set(Integer.parseInt(año1), Integer.parseInt(mes1), Integer.parseInt(dia1));
        //Se restan la fecha actual y la fecha de nacimiento
        int año1 = fechaActual.get(Calendar.YEAR)-fechaNacimiento.get(Calendar.YEAR);
        int mes2 = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
        int dia2 = fechaActual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);
        //Se ajusta el año dependiendo el mes y el día
        if (mes2 < 0 || (mes2 == 0 && dia2 < 0)) {
            año1--;
        }
        //Regresa la edad en base a la fecha de nacimiento
        //Solo si el metodo retorna un entero TECU001113HDFRSRA8
        return año1;
    }
    List<String> generos = new ArrayList<String>();
    List<String> estados = new ArrayList<String>();
     public void obtenergenero(){
         estados.add("AS");
         estados.add("BC");
         estados.add("BS");
         estados.add("CC");
         estados.add("CS");
         estados.add("CH");
         estados.add("DF");
         estados.add("CL");
         estados.add("CM");
         estados.add("DG");
         estados.add("GT");
         estados.add("GR");
         estados.add("HG");
         estados.add("JC");
         estados.add("MC");
         estados.add("MS");
         estados.add("NT");
         estados.add("NL");
         estados.add("OC");
         estados.add("PL");
         estados.add("QO");
         estados.add("QR");
         estados.add("SP");
         estados.add("SL");
         estados.add("SR");
         estados.add("TC");
         estados.add("TS");
         estados.add("TL");
         estados.add("VZ");
         estados.add("YN");
         estados.add("ZS");
          for(int i =0;i<estados.size();i++){
               System.out.println(estados.get(i));
         }
     }
     public void imprimir(){
         
        
         
        
//         if(genero=='H'){
//            for(int i =0;i<estados.size();i++){
//                System.out.println(estados);
//            }
//         }else if(genero=='M'){
//             
//         } 
     }
     
     public static void main(String []arg){
              Persona coni = new Persona();
              coni.obtenergenero();
          }
    /*
    <%
    for(Persona i:new Persona().obtenerPer()){
    %>
    <%= p.getNombre()%>
    <& } %>
     */
}
