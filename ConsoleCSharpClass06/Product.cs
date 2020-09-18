using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleCSharpClass06
{
    public class Product
    {
        public string name;
        public float price;
        public int code;

        public Product() { }

        public void ShowDetails() {
            System.Console.WriteLine("Name: " + this.name +
                "\nPrice: " + this.price
                +"\nCode: " + this.code);

        }
    }
}
