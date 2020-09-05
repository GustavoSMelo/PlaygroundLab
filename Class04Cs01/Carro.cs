using System;
using System.Collections.Generic;
using System.Text;

namespace Class04Cs01
{
    public class Carro
    {
        public string modelo;
        public string cor;
        public float velMax;
        public float velAtual;
        public int qntdGas;

        public void PrintAll()
        {
            Console.WriteLine("Modelo: " + modelo);
            Console.WriteLine("Cor: " + cor);
            Console.WriteLine("velocidade maxima: " + velMax + " km/h");
            Console.WriteLine("velocidade Atual: " + velAtual + "km/h");
            Console.WriteLine("Gasolina: " + qntdGas + " % ");
        }
    }
}
