using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace class_game05
{
    public class Pers
    {
        public int x;
        public int y;
        public int tamanhox;
        public int tamanhoy;
        public int velx;
        public int vely;

        public Pers() {
            x = 200;
            y = 200;
            tamanhox = 30;
            tamanhoy = 25;
            velx = 0;
            vely = 0;
        }

        public void Move() {
            x += velx;
            y += vely;
        }

        public void toDraw(Graphics g) {
            g.FillRectangle(Brushes.Red, x, y, tamanhox, tamanhoy);
        }
    }
}
