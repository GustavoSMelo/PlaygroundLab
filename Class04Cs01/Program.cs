using System;

namespace Class04Cs01
{
    class Program
    {
        static void Main(string[] args)
        {
            Carro c = new Carro();
            Carro c2 = new Carro();
            Carro c3 = new Carro();

            //Car 01:
            c.cor = "vermelho";
            c.modelo = "hb20";
            c.velAtual = 120f;
            c.velMax = 180f;
            c.qntdGas = 52;

            c.PrintAll();

            System.Console.WriteLine("\n");
            System.Console.WriteLine("==================");

            //Car 02: 

            c2.cor = "branco";
            c2.modelo = "palio";
            c2.velAtual = 60f;
            c2.velMax = 120f;
            c2.qntdGas = 76;

            c2.PrintAll();
            System.Console.WriteLine("\n");
            System.Console.WriteLine("==================");

            //Car 03:

            c3.cor = "Prata";
            c3.modelo = "S10";
            c3.velAtual = 117.7f;
            c3.velMax = 240f;
            c3.qntdGas = 26;

            c3.PrintAll();
        }
    }
}
