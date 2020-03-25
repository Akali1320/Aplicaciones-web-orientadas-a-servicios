using Npgsql;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TrejoCastilloUriel
{
    class Class1
    {
        /*Se instancia el Npgsql es un proveedor de datos ADO.NET de código abierto para PostgreSQL, 
         * permite que los programas escritos en C #, Visual Basic, F # accedan al servidor de base de datos PostgreSQL.*/

         //Aqui estamos instanciando lo que son los datos para poder hacer la conexion a Postgresql
        NpgsqlConnection conn = new NpgsqlConnection("Server = localhost; User Id =postgres; Password = bd ; Database = UTTEC");

        //Estamos creando un metodo para hacer conexion a mi base de datos
        public void conectar()
        {
          
                conn.Open();
                System.Windows.Forms.MessageBox.Show("Se conecto a la base de datos");
     
            
        }
        //Estomos creando un metodo para cerrar nuestra base de datos y los vamos a agregar a los botones
        public void desconectar()
        {
            conn.Close();
            System.Windows.Forms.MessageBox.Show("La base de datos se a cerrado");
        }
    }
}
