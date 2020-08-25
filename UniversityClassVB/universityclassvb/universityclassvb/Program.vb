Imports System

Module Program
    Sub Main(args As String())
        Dim chooseYourFavoriteSoulsBorn As String
        Console.WriteLine("What your favorite souls born ? [1] Dark Souls 1
        [2]Bloodbornd")
        chooseYourFavoriteSoulsBorn = Console.ReadLine()

        If (chooseYourFavoriteSoulsBorn.Equals("1")) Then
            Console.WriteLine("Dark Souls is your favorite souls born")
        ElseIf (chooseYourFavoriteSoulsBorn.Equals("2")) Then
            Console.WriteLine("BloodBorne is your favorite souls born")
        Else
            Console.WriteLine("BTW, Bloodborne is better")
        End If
    End Sub
End Module
