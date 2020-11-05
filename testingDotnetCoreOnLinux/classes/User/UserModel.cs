using System;

namespace User
{
    public class UserModel
    {

    public String name;
    public String email;
    public String password;

    public String Scan () {
        return $"{name}, {email}, {password} ";
    }
    }
}
