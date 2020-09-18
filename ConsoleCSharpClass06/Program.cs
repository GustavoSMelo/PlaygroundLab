using System;

namespace ConsoleCSharpClass06
{
    class Program
    {
        static void Main(string[] args)
        {
            Product p = new Product();
            p.code = 1;
            p.name = "Playstation 5";
            p.price = 4999f;

            p.ShowDetails();
        }
    }
}
