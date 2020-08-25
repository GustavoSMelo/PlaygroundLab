Imports System

Module Program
    Sub Main(args As String())
        Dim name As String
        Dim old As String

        Console.WriteLine("Type your name here ")
        name = Console.ReadLine()
        Console.WriteLine("How old are you ? ")
        old = CInt(Console.ReadLine())

        If (old < 18) Then
            Console.WriteLine(name & " you are minor")
        Else
            Console.WriteLine(name & " you are older")
        End If
    End Sub
End Module
