using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace class_game05
{
    public partial class Form1 : Form
    {
        Timer t;
        int cx;
        int cy;
        int velx;
        int vely;

        Pers p = new Pers();

        public Form1()
        {
            cx = 28;
            cy = 250;
            velx = 2;
            vely = 2;

            t = new Timer();
            t.Interval = 1;
            t.Tick += updating;
            t.Start();

            this.Size = new Size(500, 500);
            this.StartPosition = FormStartPosition.CenterScreen;

            this.KeyPress += new KeyPressEventHandler(getKeyDown);

            InitializeComponent();
        }

        private void updating(object sender, EventArgs ea) {
            this.Move();
            p.Move();

            Graphics g = this.CreateGraphics();
            g.Clear(Color.White);

            Pen cellpen = new Pen(Color.Blue);
            g.DrawRectangle(cellpen, cx, cy, 20, 20);

            p.toDraw(g);
            g.Dispose();
        }

        private void Move() {
            cx = cx + velx;
            cy = cy + vely;

            if (cx >= 450) {
                velx *= -1;
            }

            if (cx < 0) {
                velx *= -1;
            }

            if (cy >= 450) {
                vely *= -1;
            }

            if (cy < 0) {
                vely *= -1;
            }
        }

        private void getKeyDown(object o, KeyPressEventArgs key) {
            if (key.KeyChar == (char)Keys.Escape)
            {
                Console.WriteLine("Jogo finalizado com sucesso");
                Close();
            }

            else if (key.KeyChar == (char)Keys.A || key.KeyChar == 'a')
            {
                p.velx = -1;
                p.vely = 0;
            }

            else if (key.KeyChar == (char)Keys.D || key.KeyChar == 'd')
            {
                p.velx = 1;
                p.vely = 0;
            }

            else if (key.KeyChar == (char)Keys.W || key.KeyChar == 'w')
            {
                p.vely = -1;
                p.velx = 0;
            }

            else if (key.KeyChar == (char)Keys.S || key.KeyChar == 's') {
                p.vely = +1;
                p.velx = 0;
            }
        }
    }
}
