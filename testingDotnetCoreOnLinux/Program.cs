using System;
using User;

namespace testingDotnetCoreOnLinux
{
    class Program
    {
        static void Main(string[] args)
        {
            User.UserModel user = new User.UserModel();
            user.name = "Gustavo";
            user.email = "gustavo@mail.com";
            user.password = "gustavo";

            Console.WriteLine(user.Scan());
        }
    }
}
