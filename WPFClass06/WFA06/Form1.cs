using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WFA06
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnMensagem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Clickou ");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            lblMensagem.Text = "Estamos aprendendo C#";
        }

        private void btnExibirDia_Click(object sender, EventArgs e)
        {
            DateTime day = System.DateTime.Now;
            MessageBox.Show("Hoje é: " + day.ToString());
        }
    }
}
