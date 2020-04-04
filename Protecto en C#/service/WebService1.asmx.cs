using Npgsql;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace service
{
    /// <summary>
    /// Descripción breve de WebService1
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class WebService1 : System.Web.Services.WebService
    {

        [WebMethod]
        public string HelloWorld()
        {
            return "Hola a todos";
        }
        [WebMethod]
        public string fechayhora()
        {
            return DateTime.Today.ToString();
        }
        [WebMethod]
        public DataSet datos()
        {
            String dato = "2";
            NpgsqlConnection con = new NpgsqlConnection(ConfigurationManager.ConnectionStrings["postgres"].ConnectionString);
            con.Open();
            NpgsqlCommand llamar = new NpgsqlCommand("Select nombre,curp From personas where id_persona ="+dato, con);
            NpgsqlDataAdapter añadir = new NpgsqlDataAdapter(llamar);
            DataSet dz = new DataSet();
            añadir.Fill(dz);
            return dz;
        }
    }
}
