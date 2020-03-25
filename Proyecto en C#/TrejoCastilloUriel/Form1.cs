using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TrejoCastilloUriel
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //Llamamos a nuestra clase conectar para hacer nuestro procedimiento de conexion a base
            Class1 conexion = new Class1();
            conexion.conectar();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            //Llamamos a nuestra clase desconectar para hacer nuestro procedimiento de cerrar conexion
            Class1 conexion = new Class1();
            conexion.desconectar();
        }
    }
}
