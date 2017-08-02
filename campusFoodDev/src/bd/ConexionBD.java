package bd;

//import entidades.Universidad;
//import entidades.Usuario;
import Objetos.*;
import java.sql.*;
import java.util.ArrayList;

public class ConexionBD {
    
       private Connection con;
       private static final String DRIVER = "com.mysql.jdbc.Driver";
       private static final String DBMS = "mysql";
       private static final String HOST = "127.0.0.1";
       private static final String PORT = "3306";
       //base de datos
       private static final String DATABASE = "campusFoodDB3";  //cortejamiento: utf8_spanish_ci
       private static final String USER = "root";
       private static final String PASSWORD = "";

    void Conexion(){}
    
    /*METODO CONECTAR*/
   
    public void conectar ()throws Exception{
        try{
            Class.forName(DRIVER);
        }catch(ClassNotFoundException ce){}
            try{
                this.con = DriverManager.getConnection("jdbc:" + DBMS + "://" + HOST + ":" + PORT + "/" + DATABASE, USER, PASSWORD);                
                System.out.println("CONEXION EXITOSA CON LA BASE DE DATOS");
            }catch(SQLException exception){
                System.out.println("ERROR: NO SE PUDO CONECTAR CON LA BASE DE DATOS: "+exception);
            }             
    }
    
    public boolean desconectar(){
        try{
            this.con.close();
            return(true);
        }
        catch(Exception e)
        {
            return(false);
        }    
    }
    
    //FUNCIONES DE PROYECTO RESTAURANTE
    
    //FUNCIONES PARA USUARIO
    
    //funcion ingreso de usuarios
    public boolean ingresarUsuario(usuario u){
        try{
            PreparedStatement st=null;
            st = con.prepareStatement("insert into usuario (cuenta,clave,rol,estado,fecha_registro) values (?,md5(?),?,?,?);");
            st.setString(1,u.getCuenta());
            st.setString(2,u.getClave());
            st.setString(3,u.getRol());
            st.setString(4,u.getEstado());
            st.setString(5,u.getFecha_registro());
            
            st.executeUpdate();
            st.close();
            
            System.out.println("Se ingreso el usuario exitosamente...");
            return true;
        }catch (Exception e){
            System.out.println("Error al ingresar el usuario\n"+e);
            return false;
        }
    }
    
    public boolean esUsuarioValido(usuario u){        
        boolean resultado = false;
        ResultSet rs = null;
        PreparedStatement st = null;
        try{
            st = con.prepareStatement("SELECT * FROM usuario WHERE cuenta = ? AND clave = md5(?) AND estado = ?");            
            st.setString(1,u.getCuenta());         
            st.setString(2,u.getClave());
            st.setString(3,"A");
            rs = st.executeQuery();            
            if(rs.next()){
                u.setRol(rs.getString("rol"));
                resultado = true;
                System.out.println("usuario valido y activo...");
            }else{
                System.out.println("usuario despedido...");
            }
            rs.close();
            st.close();
        }
        catch(Exception e){
            System.out.println(e);
            resultado = false;
        }           
     return resultado; 
    }
    
    //funcion para obtener obejtos usuarios desde cuenta
    public usuario obtenerDatosUsuario(String cuenta){
        usuario u = new usuario();
        ResultSet rs = null;                       
        PreparedStatement st = null;
        try{
            st = con.prepareStatement("SELECT * FROM usuario WHERE cuenta = ?;");            
            st.setString(1,cuenta);         
            rs = st.executeQuery();            
            if(rs.next()){
                u.setId(rs.getInt("id"));
                u.setCuenta(rs.getString("cuenta"));
                u.setRol(rs.getString("rol"));
                u.setEstado(rs.getString("estado"));
                u.setFecha_registro(rs.getString("fecha_registro"));
                System.out.println("Datos de usuario obtenidos...");
            }
            rs.close();
            st.close();
        }catch(SQLException e){
            System.out.println(e);
        }           
        return u; 
    }
    
    //funcion para consulta de usuarios
    public ArrayList<usuario> consultarUsuarios(String busqueda, String tipo){
        ArrayList<usuario> registroU = new ArrayList<usuario>();
        try{
            Statement st = this.con.createStatement();
            //ResultSet rs = st.executeQuery("SELECT * FROM usuario;");
            ResultSet rs = null;
            
            if(tipo.equalsIgnoreCase("usuario")){
                rs = st.executeQuery("SELECT * FROM usuario;");
            }else{
                rs = st.executeQuery("SELECT * FROM cliente WHERE "+tipo+" LIKE '%"+busqueda+"%';");
            }
            
            while (rs.next()){
                int id = rs.getInt("id");
                String cuenta = rs.getString("cuenta");
                String clave = rs.getString("clave");
                String rol = rs.getString("rol");
                String estado = rs.getString("estado");
                String fecha_reg = rs.getString("fecha_registro");
                
                usuario usr = new usuario(id,cuenta,clave,rol,estado,fecha_reg);
                registroU.add(usr);
            }
            System.out.println("usuarios consultados.");
        }catch (Exception e){
            System.out.println("error en consulta de usuarios.");
        }
        return registroU;
    }

    //eliminacion de usuarios
    public boolean eliminarUsuario(int id)
    {
        try
        {
            PreparedStatement st = null;
            st = con.prepareStatement("DELETE FROM usuario WHERE id = ?");            
            st.setInt(1,id);         
            st.executeUpdate();
            st.close();                        
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }        
    }
    
    //despido de usuarios
    public boolean despidoUsuario(int id)
    {
        try
        {
            PreparedStatement st = null;
            st = con.prepareStatement("update usuario set estado='D' WHERE id = ?");            
            st.setInt(1,id);         
            st.executeUpdate();
            st.close();                        
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }        
    }
    
    //funcion para ingresar cliente a bd
    //funcion para consulta de usuarios
    public ArrayList<cliente> consultarClientes(String busqueda, String tipo){
        ArrayList<cliente> registroC = new ArrayList<cliente>();
        try{
            Statement st = this.con.createStatement();
            ResultSet rs = null;
            
            if(tipo.equalsIgnoreCase("cliente")){
                rs = st.executeQuery("SELECT * FROM cliente;");
            }else{
                rs = st.executeQuery("SELECT * FROM cliente WHERE "+tipo+" LIKE '%"+busqueda+"%';");
            }
            while (rs.next()){
                int id = rs.getInt("id");
                String ced = rs.getString("cedula");
                String noms = rs.getString("nombres");
                String apes = rs.getString("apellidos");
                String correo = rs.getString("correo");
                String dir = rs.getString("direccion");
                String tel = rs.getString("telefono");
                String tip = rs.getString("tipo");
                float sald = rs.getFloat("saldo");
                float desc = rs.getFloat("descuento");
                int edad = rs.getInt("edad");
                String sexo = rs.getString("sexo");
                int id_u = rs.getInt("id_usuario");
                
                cliente cli = new cliente(id, ced, noms, apes, correo, dir, tel, tip.charAt(0), sald, desc, edad, sexo.charAt(0), id_u);
                registroC.add(cli);
            }
            System.out.println("clientes consultados bd.");
        }catch (Exception e){
            System.out.println("error en consulta de clientes bd.");
        }
        return registroC;
    }
    
    
    public boolean ingresarCliente(cliente cli){
        try{
            //Ingreso de Datos de Cliente
            PreparedStatement st=null;
            st = con.prepareStatement("INSERT INTO cliente (cedula,nombres,apellidos,correo,direccion,telefono,tipo,saldo,descuento,edad,sexo,id_usuario) VALUES(?,?,?,?,?,?,?,?,?,?,?,?);");
            st.setString(1,cli.getCedula());
            st.setString(2,cli.getNombres());
            st.setString(3,cli.getApellidos());
            st.setString(4,cli.getCorreo());
            st.setString(5,cli.getDireccion());
            st.setString(6,cli.getTelefono());
            st.setString(7,String.valueOf(cli.getTipo()));
            st.setFloat(8,cli.getSaldo());
            st.setFloat(9,cli.getDescuento());
            st.setInt(10,cli.getEdad());
            st.setString(11,String.valueOf(cli.getSexo()));
            st.setInt(12,cli.getId_usuario());
            
            st.executeUpdate();
            st.close();
            
            System.out.println("Cliente Ingresado a DB...");
            return true;
        }catch (Exception e){
            System.out.println("Error al ingrear cliente a DB...");
            return false;
        }
    }
    
    //RESTAURANTE
    //consulta de restaurantes
    public ArrayList<restaurante> consultarRestaurante(String busqueda, String tipo){
        ArrayList<restaurante> registroR = new ArrayList<restaurante>();
        try{
            Statement st = this.con.createStatement();
            ResultSet rs = null;
            
            if(tipo.equalsIgnoreCase("restaurante")){
                rs = st.executeQuery("SELECT * FROM restaurante;");
            }else{
                rs = st.executeQuery("SELECT * FROM restaurante WHERE "+tipo+" LIKE '%"+busqueda+"%';");
            }
            
            while (rs.next()){
                int id = rs.getInt("id");
                String nom = rs.getString("nombre");
                String ubi = rs.getString("ubicacion");
                String desc = rs.getString("descripcion");
                int cap = rs.getShort("capacidad");
                String hora = rs.getString("horario");
                int punt = rs.getShort("puntuacion");
                
                restaurante rest = new restaurante(id, nom, ubi, desc, cap, hora, punt);
                registroR.add(rest);
            }
            System.out.println("restaurantes consultados.");
        }catch (Exception e){
            System.out.println("error en consulta de restaurantes.");
        }
        return registroR;
    }
    
    //ingreso de restaurantes
    public boolean ingresarRestaurante(restaurante r){
        try{
            PreparedStatement st=null;
            st = con.prepareStatement("insert into restaurante (nombre,ubicacion,descripcion,capacidad,horario,puntuacion) values (?,?,?,?,?,?);");
            st.setString(1,r.getNombre());
            st.setString(2,r.getUbicacion());
            st.setString(3,r.getDescripcion());
            st.setInt(4,r.getCapacidad());
            st.setString(5,r.getHorario());
            st.setInt(6,r.getPuntuacion());
            
            st.executeUpdate();
            st.close();
            
            System.out.println("Se ingreso el restaurante exitosamente...");
            return true;
        }catch (Exception e){
            System.out.println("Error al ingresar el restaurante\n"+e);
            return false;
        }
    }
    
    //funcion para obtener datos de restaurante por id
    public restaurante obtenerRestaurante(int id){
        PreparedStatement st = null;
        ResultSet rs = null;
        restaurante rest = new restaurante();
        try
        {            
            st = con.prepareStatement("SELECT * FROM restaurante WHERE id = ?;");
            st.setInt(1,id);         
            rs = st.executeQuery();            
            if(rs.next()){
                String nom = rs.getString("nombre");
                String ubi = rs.getString("ubicacion");
                String desc = rs.getString("descripcion");
                int cap = rs.getInt("cantidad");
                String hora = rs.getString("horario");
                int puntos = rs.getInt("puntuacion");
                rest = new restaurante(nom, ubi, desc, cap, hora, puntos);
            } 
            rs.close();
            st.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }    
        return rest;
    }
    
    //funcion para modificar restaurantes
    public boolean modificarRestaurante(restaurante r1){
        try{
            int idc = r1.getId();
            System.out.println("id de restaurante: "+idc);
            PreparedStatement st2 = null;
            st2 = con.prepareStatement("update restaurante set nombre = ?, ubicacion = ?, descripcion = ?, capacidad = ?, horario = ?, puntuacion = ? where id = ?;");
            st2.setString(1,r1.getNombre());
            st2.setString(2,r1.getUbicacion());
            st2.setString(3,r1.getDescripcion());
            st2.setInt(4,r1.getCapacidad());
            st2.setString(5,r1.getHorario());
            st2.setInt(6,r1.getPuntuacion());
            st2.setInt(7,r1.getId());
            
            st2.executeUpdate();
            st2.close();
            System.out.println("modificacion de restaurante exitosa");
            return true;
        }
        catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }

    
    //FUNCIONES DE PROYECTO ANTERIOR
    /*
    public boolean esUsuarioValido(Usuario u)
    {        
        boolean resultado = false;
        ResultSet rs = null;                       
        PreparedStatement st = null;
        try
        {            
            st = con.prepareStatement("SELECT * FROM usuario WHERE cuenta = ? AND clave = ? AND estado = ?");            
            st.setString(1,u.getCuenta());         
            st.setString(2,u.getClave());
            st.setString(3,"activo");
            rs = st.executeQuery();            
            if(rs.next()){
                u.setRol(rs.getString("rol"));
                resultado = true;
            } 
            rs.close();
            st.close();
        }
        catch(Exception e){
            System.out.println(e);
            resultado = false;
        }           
     return resultado; 
    }
    
    public String obtenerNombreUsuario(Usuario u){
        String nombre = "";
        PreparedStatement st = null;
        ResultSet rs = null;
        try
        {            
            st = con.prepareStatement("SELECT * FROM usuario WHERE cuenta = ?");            
            st.setString(1,u.getCuenta());         
            rs = st.executeQuery();            
            if(rs.next()){
                nombre = rs.getString("nombre");
                //u.getId(Integer.parseInt(rs.getString("id"));
                //u.setRol(rs.getString("nombre"));
            } 
            rs.close();
            st.close();
        }
        catch(Exception e){
            System.out.println(e);
        }    
        System.out.println("el nombre del usuario activo es: "+nombre);
        return nombre;
    }
    
    public Usuario obtenerDatosUsuario(String cuenta){
        PreparedStatement st = null;
        ResultSet rs = null;
        Usuario user = new Usuario();
        try
        {            
            st = con.prepareStatement("SELECT * FROM usuario WHERE cuenta = ?");            
            st.setString(1,cuenta);         
            rs = st.executeQuery();            
            if(rs.next()){
                int id = Integer.parseInt(rs.getString("id"));
                String nombre = rs.getString("nombre");
                String cuentau = rs.getString("cuenta");
                String pass = rs.getString("clave");
                user = new Usuario(id, nombre, cuentau, pass);
            } 
            rs.close();
            st.close();
        }
        catch(Exception e){
            System.out.println(e);
        }    
        //System.out.println("el nombre del usuario activo es: "+id);
        return user;
    }
    
    public boolean cambiarClaveUsuario(Usuario u){
        try{
            String id = String.valueOf(u.getId());
            System.out.println("id del usuario para cambio clave: "+id);
            PreparedStatement st = con.prepareStatement("update usuario set clave = ? where id = "+id);
            st.setString(1,u.getClave());
            
            return true;
        }catch (Exception e){
            return false;
        }
    }
    
    //funcion para ingresar cliente a bd
    public boolean ingresarCliente(Cliente cliente){
        try{
            //Ingreso de Datos de Cliente
            PreparedStatement st=null;
            st = con.prepareStatement("INSERT INTO cliente (cedula,nombre,apellido,correo,tipo,edad,fecha_nacimiento,sexo,direccion,telefono) VALUES(?,?,?,?,?,?,?,?,?,?)");
            st.setString(1,cliente.getCedula());
            st.setString(2,cliente.getNombres());
            st.setString(3,cliente.getApellidos());
            st.setString(4,cliente.getCorreo());
            st.setString(5,cliente.getTipo());
            st.setInt(6,cliente.getEdad());
            st.setString(7,cliente.getFecha_nacimiento());
            st.setString(8,cliente.getSexo());
            //st.setString(9,cliente.getEstado());
            st.setString(9,cliente.getDireccion());
            st.setString(10,cliente.getTelefono());
            
            st.executeUpdate();
            st.close();
            
            System.out.println("Cliente Ingresado a DB...");
            return true;
        }catch (Exception e){
            System.out.println("Error al ingrear cliente a DB...");
            return false;
        }
    }
    
    //funcion para modificar clientes
    public boolean modificarCliente(Cliente cl)
    {
        try
        {
            int idc = cl.getId();
            System.out.println("id de usuario: "+idc);
            PreparedStatement st2 = null;
            st2 = con.prepareStatement("update cliente set nombre = ?, apellido = ?, correo = ?, tipo = ?, edad = ?, fecha_nacimiento = ?, sexo = ?, estado = 1 , direccion = ?, telefono = ? where id = ?");
            st2.setString(1,cl.getNombres());
            st2.setString(2,cl.getApellidos());
            st2.setString(3,cl.getCorreo());
            st2.setString(4,cl.getTipo());
            st2.setInt(5,cl.getEdad());
            st2.setString(6,cl.getFecha_nacimiento());
            st2.setString(7,cl.getSexo());
            st2.setString(8,cl.getDireccion());
            st2.setString(9,cl.getTelefono());            
            st2.setInt(10,cl.getId());            
            
            st2.executeUpdate();
            st2.close();
            System.out.println("modificacion de cliente exitosa");
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
        
    }
        
    //funcion para consultar clientes en bd
    public ArrayList<Cliente> consultarClientes(String busqueda, String tip){
        ArrayList<Cliente> registroC = new ArrayList<Cliente>();
        try{
            Statement st = this.con.createStatement();
            ResultSet rs = null;
            
            if (tip.equalsIgnoreCase("cliente")){
                rs = st.executeQuery("SELECT * FROM cliente;");
            }else if (tip.equalsIgnoreCase("huesped")){
                rs = st.executeQuery("select * from cliente where tipo = huesped;");
            }else if (tip.equalsIgnoreCase("cedula")){
                rs = st.executeQuery("select * from cliente where cedula = "+tip+";");
            }else{
                rs = st.executeQuery("SELECT * FROM cliente WHERE "+tip+" LIKE '%"+busqueda+"%';");
            }
            while(rs.next())
            {
                int id = rs.getInt("id");
                String cedula = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String tipo = rs.getString("tipo");
                int edad = rs.getInt("edad");
                String fecha_nacimiento = rs.getString("fecha_nacimiento");
                String sexo = rs.getString("sexo");
                //int estado = rs.getInt("estado");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                //creacion de cliente desde consulta
                Cliente cli = new Cliente(id,cedula,nombre,apellido,correo,tipo,edad,fecha_nacimiento,sexo,direccion,telefono);
                registroC.add(cli);
            }
            System.out.println("cliente consultado");
        }catch(Exception e){
            System.out.println("error en consulta de cliente db");
        }
        return (registroC);
    }
    
    //funcion para eliminar clientes
    public boolean eliminarCliente(int id)
    {
        try
        {
            PreparedStatement st = null;
            st = con.prepareStatement("DELETE FROM cliente WHERE id = ?");            
            st.setInt(1,id);         
            st.executeUpdate();
            st.close();                        
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }        
    } 
    
    public ArrayList<Usuario> consultarUsuarios(){
        ArrayList<Usuario> registroU = new ArrayList<Usuario>();
        try{
            Statement st = this.con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM usuario");
            while (rs.next()){
                int id = rs.getInt("id");
                String cedula = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String rol = rs.getString("rol");
                String estado = rs.getString("estado");
                String cuenta = rs.getString("cuenta");
                String clave = rs.getString("clave");
                
                Usuario usr = new Usuario(id,cedula,nombre,rol,estado,cuenta,clave);
                registroU.add(usr);
            }
            System.out.println("usuarios consultados.");
        }catch (Exception e){
            System.out.println("error en consulta de usuarios.");
        }
        return registroU;
    }
    
    //funcion para ingresar ingredientes
    public boolean ingresarIngrediente(Ingrediente i){
        try{
            //Ingreso de Datos de Cliente
            PreparedStatement st=null;
            st = con.prepareStatement("insert into ingrediente (nombre,descripcion,tipo,costo_porcion,cantidad) values (?,?,?,?,?);");
            st.setString(1,i.getNombre());
            st.setString(2,i.getDescripcion());
            st.setString(3,i.getTipo());
            st.setFloat(4,i.getCosto_porcion());
            st.setInt(5,i.getCantidad());
            
            st.executeUpdate();
            st.close();
            
            System.out.println("Ingrediente Ingresado a DB...");
            return true;
        }catch (Exception e){
            System.out.println("Error al ingrear ingrediente a DB...");
            return false;
        }
    }

    //funcion para consultar ingredientes
    public ArrayList<Ingrediente> consultarIngredientes(String busqueda, String tip){
        ArrayList<Ingrediente> registroI = new ArrayList<Ingrediente>();
        try{
            Statement st = this.con.createStatement();
            ResultSet rs = null;
            
            if (tip.equalsIgnoreCase("ingrediente")){
                rs = st.executeQuery("SELECT * FROM ingrediente;");
            }else if (tip.equalsIgnoreCase("nombre")){
                rs = st.executeQuery("select * from ingrediente where nombre = "+tip+";");
            }else{
                rs = st.executeQuery("SELECT * FROM ingrediente WHERE "+tip+" LIKE '%"+busqueda+"%';");
            }
            while(rs.next())
            {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String tipo = rs.getString("tipo");
                float costop = rs.getFloat("costo_porcion");
                int cantidad = rs.getInt("cantidad");
                
                Ingrediente ing = new Ingrediente(id, nombre, descripcion, tipo, costop, cantidad);
                registroI.add(ing);
            }
            System.out.println("ingredientes consultados");
        }catch(Exception e){
            System.out.println("error en consulta de ingredientes db");
        }
        return (registroI);
    }
    
    //funcion para modificar ingredientes
    public boolean modificarIngrediente(Ingrediente ing)
    {
        try
        {
            int id = ing.getId();
            System.out.println("id de ingrediente: "+id);
            PreparedStatement st2 = null;
            st2 = con.prepareStatement("update ingrediente set nombre = ?, descripcion = ?, tipo = ?, costo_porcion = ?, cantidad = ? where id = ?");
            st2.setString(1,ing.getNombre());
            st2.setString(2,ing.getDescripcion());
            st2.setString(3,ing.getTipo());
            st2.setFloat(4,ing.getCosto_porcion());
            st2.setInt(5,ing.getCantidad());        
            st2.setInt(6,ing.getId());
            
            st2.executeUpdate();
            st2.close();
            System.out.println("modificacion de ingrediente exitosa");
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
    
    //funcion para eliminar ingredientes
    public boolean eliminarIngrediente(int id)
    {
        try
        {
            PreparedStatement st = null;
            st = con.prepareStatement("DELETE FROM ingrediente WHERE id = ?");            
            st.setInt(1,id);         
            st.executeUpdate();
            st.close();                        
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }        
    } 
    
    //FUNCIONES DE INGRESO DE TRANSACCIONES: PRODUCTO Y PLATO
    public boolean ingresarProducto(Producto p){
        try{
            //Ingreso de Datos de producto
            PreparedStatement st=null;
            st = con.prepareStatement("insert into producto (nombre,descripcion,tamaño,precio,tipo,ids_ingredientes,ventas) values (?,?,?,?,?,?,?);");
            //query para ingresar manual
            //  insert into producto (id,nombre,descripcion,tamaño,precio,tipo) values (2,"plato2","platoss","peq",3,"caldo")
            st.setString(1,p.getNombre());
            st.setString(2,p.getDescripcion());
            st.setString(3,p.getTamaño());
            st.setFloat(4,p.getPrecio());
            st.setString(5,p.getTipo());
            st.setString(6,p.getIngredientes());
            st.setInt(7,p.getVentas());
            
            st.executeUpdate();
            st.close();
            
            System.out.println("Producto Ingresado a DB...");
            return true;
        }catch (Exception e){
            System.out.println("Error al ingrear producto a DB...");
            return false;
        }
    }
    
    public boolean ingresarPlato(int idpr,int iding){
        try{
            //Ingreso de Datos de producto
            PreparedStatement st=null;
            st = con.prepareStatement("insert into plato (id_producto,id_ingrediente) values (?,?);");
            //query para ingresar manual
            //  insert into producto (id,nombre,descripcion,tamaño,precio,tipo) values (2,"plato2","platoss","peq",3,"caldo")
            st.setString(1,String.valueOf(idpr));
            st.setString(2,String.valueOf(iding));
            
            st.executeUpdate();
            st.close();
            
            System.out.println("Plato Ingresado a DB...");
            return true;
        }catch (Exception e){
            System.out.println("Error al ingrear producto a DB...");
            return false;
        }
    }
    
    //  FUNCIONES PARA MANEJO DE PRODUCTOS
    public ArrayList<Ingrediente> cargarIngredientes_Producto(String busqueda, String tip){
        ArrayList<Ingrediente> registroI = new ArrayList<Ingrediente>();
        try{
            Statement st = this.con.createStatement();
            ResultSet rs = null;
            
            if (tip.equalsIgnoreCase("ingrediente")){
                rs = st.executeQuery("SELECT * FROM ingrediente;");
            }else if (tip.equalsIgnoreCase("nombre")){
                rs = st.executeQuery("select * from ingrediente where nombre = "+tip+";");
            }else{
                rs = st.executeQuery("SELECT * FROM ingrediente WHERE "+tip+" LIKE '%"+busqueda+"%';");
            }
            while(rs.next())
            {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String tipo = rs.getString("tipo");
                float costop = rs.getFloat("costo_porcion");
                int cantidad = rs.getInt("cantidad");
                
                Ingrediente ing = new Ingrediente(id, nombre, descripcion, tipo, costop, cantidad);
                registroI.add(ing);
            }
            System.out.println("ingredientes consultados");
        }catch(Exception e){
            System.out.println("error en consulta de ingredientes db");
        }
        return (registroI);
    }
    
    public ArrayList<Producto> consultarProductos(String busqueda, String tip){
        ArrayList<Producto> registroP = new ArrayList<Producto>();
        try{
            Statement st = this.con.createStatement();
            ResultSet rs = null;
            
            if (tip.equalsIgnoreCase("producto")){
                rs = st.executeQuery("SELECT * FROM producto;");
            }else if (tip.equalsIgnoreCase("nombre")){
                rs = st.executeQuery("select * from producto where nombre = "+tip+";");
            }else{
                rs = st.executeQuery("SELECT * FROM producto WHERE "+tip+" LIKE '%"+busqueda+"%';");
            }
            while(rs.next())
            {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String tamaño = rs.getString("tamaño");
                float precio = rs.getFloat("precio");
                String tipo = rs.getString("tipo");
                String ingredientes = rs.getString("ids_ingredientes");
                int ventas = rs.getInt("ventas");
                
                Producto prod = new Producto(id, nombre, descripcion, tamaño, precio, tipo, ingredientes, ventas);
                registroP.add(prod);
            }
            System.out.println("productos consultados");
        }catch(Exception e){
            System.out.println("error en consulta de productos db");
        }
        return (registroP);
    }
    
    public boolean eliminarProducto(int id)
    {
        try
        {
            PreparedStatement st = null;
            st = con.prepareStatement("DELETE FROM producto WHERE id = ?");            
            st.setInt(1,id);         
            st.executeUpdate();
            st.close();                        
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }        
    } 
    
    // FUNCIONES PARA GENERAR ORDENES
    
    public Cliente cargarClienteOrden(String cedula){
        Cliente cli = new Cliente();
        try {
            Statement st = this.con.createStatement();
            ResultSet rs = null;
            
            rs = st.executeQuery("select * from cliente where cedula = "+cedula);
            while(rs.next())
            {
                //int id = rs.getInt("id");
                //String ced = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                //String tipo = rs.getString("tipo");
                //int edad = rs.getInt("edad");
                //String fecha_nacimiento = rs.getString("fecha_nacimiento");
                //String sexo = rs.getString("sexo");
                //int estado = rs.getInt("estado");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                //creacion de cliente desde consulta
                cli = new Cliente(nombre,apellido,correo,direccion,telefono);
                //cliente.add(cli);
                
                System.out.println("cliente obtenido");
                System.out.println(cli);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return cli;
    }
    
    public Producto cargarProductoOrden(String id){
        Producto prod = new Producto();
        int idpr = Integer.parseInt(id);
        try {
            Statement st = this.con.createStatement();
            ResultSet rs = null;
            
            rs = st.executeQuery("select * from producto where id = "+id);
            while(rs.next())
            {
                //String ced = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                //String tipo = rs.getString("tipo");
                //int edad = rs.getInt("edad");
                //String fecha_nacimiento = rs.getString("fecha_nacimiento");
                //String sexo = rs.getString("sexo");
                //int estado = rs.getInt("estado");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                float precio = rs.getFloat("");
                //creacion de cliente desde consulta
                prod = new Producto(idpr,nombre,precio);
                //cliente.add(cli);
                
                System.out.println("cliente obtenido");
                System.out.println(prod);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return prod;
    }
    
    public boolean ingresarOrden(Orden ord){
        try{
            //Ingreso de Datos de orden
            PreparedStatement st=null;
            st = con.prepareStatement("insert into orden (fecha,usuario,cliente,estado,cantidad,productos,subtotal,descuento,subtotal_cero,iva,total) values (?,?,?,?,?,?,?,?,?,?,?);");
            
            st.setString(1,ord.getFecha());
            st.setString(2,ord.getUsuario());
            st.setString(3,ord.getCliente());
            st.setString(4,ord.getEstado());
            st.setString(5,ord.getCantidad());
            st.setString(6,ord.getProductos());
            st.setFloat(7,ord.getSub_total());
            st.setFloat(8,ord.getDescuento());
            st.setFloat(9,ord.getSubcero());
            st.setFloat(10,ord.getIva());
            st.setFloat(11,ord.getTotal());
            
            st.executeUpdate();
            st.close();
            
            System.out.println("Orden Ingresada a DB...");
            return true;
        }catch (Exception e){
            System.out.println("Error al ingresar orden a DB...");
            return false;
        }
    }
    
    /*
    public boolean ingresarUniversidad(Universidad u)
    {
        try
        {
                PreparedStatement st = null;
                st = con.prepareStatement("INSERT INTO universidad(nombre,direccion,ciudad,telefono) VALUES(?,?,?,?) ");            
                st.setString(1,u.getNombre());
                st.setString(2,u.getDireccion());
                st.setString(3,u.getCiudad());
                st.setString(4,u.getTelefono());
                st.executeUpdate();
                st.close();                        
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }        
    }
    
    public ArrayList<Universidad> consultarUniversidades(String descripcion, String tipo)
    {
        ArrayList<Universidad> universidades = new ArrayList<Universidad>();

        try
        {
            Statement st = this.con.createStatement();
            ResultSet rs = null;  
            
            if(tipo.equalsIgnoreCase("TODOS")){
                rs = st.executeQuery("SELECT * FROM universidad;");
            }else if(tipo.equalsIgnoreCase("ID")){
                rs = st.executeQuery("SELECT * FROM universidad WHERE id = "+descripcion+";");
            }else{
                rs = st.executeQuery("SELECT * FROM universidad WHERE "+tipo+" LIKE '%"+descripcion+"%';");
            }            
                        
            while(rs.next())
            {
                int id              = rs.getInt("id");
                String nombre       = rs.getString("nombre");
                String direccion    = rs.getString("direccion");
                String ciudad       = rs.getString("ciudad");
                String telefono     = rs.getString("telefono");
                Universidad u = new Universidad(id, nombre, direccion, ciudad, telefono);                
                universidades.add(u);
            }
        }
        catch(Exception e){System.out.println(e);}
     return(universidades);
    } 
    
    
    public boolean modificarUniversidad(Universidad u)
    {
        try
        {
            PreparedStatement st = null;
            st = con.prepareStatement("UPDATE universidad SET nombre = ?, ciudad = ?, direccion = ?, telefono = ? WHERE id = ?");                        
            st.setString(1,u.getNombre());
            st.setString(2,u.getCiudad());
            st.setString(3,u.getDireccion());
            st.setString(4,u.getTelefono());
            st.setInt(5,u.getId());                       
            st.executeUpdate();
            st.close();                        
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
        
    }   
    
    public boolean eliminarUniversidad(int id)
    {
        try
        {
            PreparedStatement st = null;
            st = con.prepareStatement("DELETE FROM universidad WHERE id = ?");            
            st.setInt(1,id);         
            st.executeUpdate();
            st.close();                        
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }        
    } 
   
    
    public boolean esUsuarioValido(Usuario u)
    {        
        boolean resultado = false;
        ResultSet rs = null;                       
        PreparedStatement st = null;
        try
        {            
            st = con.prepareStatement("SELECT * FROM usuario WHERE id = ? AND clave = md5(?) AND estado = ?");            
            st.setString(1,u.getId());         
            st.setString(2,u.getClave());
            st.setString(3,"A");
            rs = st.executeQuery();            
            if(rs.next()){
                u.setRol(rs.getString("rol").charAt(0));
                resultado = true;
            } 
            
            rs.close();
            st.close();
        }
        catch(Exception e){
            System.out.println(e);
            resultado = false;
        }           
     return resultado; 
    }
    */
    
    
    /*
    //funcion para cargar al sistema datos de los clientes
    public ArrayList<Cliente> cargarClientes() throws Exception , SQLException{
        //recoleccion de datos de clientes en base de datos a arraylist
        Statement st = this.con.createStatement();
        ResultSet rst = st.executeQuery("SELECT * FROM cliente");
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        while (rst.next()){
            Cliente c = new Cliente(Integer.getInteger(rst.getString("id")),rst.getString("cedula"),rst.getString("nombre"),rst.getString("apellido"),rst.getString("correo"),rst.getString("tipo"),Integer.getInteger(rst.getString("edad")),rst.getString("fecha_nacimiento"),rst.getString("sexo"),rst.getString("estado"),rst.getString("direccion"),rst.getString("telefono"));
            listaClientes.add(c);
        }
        return listaClientes;
    }
    */
    
}
