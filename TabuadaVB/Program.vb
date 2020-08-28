Imports System

Module Program
    Sub Main(args As String())
        'Vars
        Dim TypedUserNumber As Integer = 0
        Dim TryAgain As Boolean = False
        Dim Count As Integer = 1

        'Check typed user
        While TryAgain = False
            Console.Write("Type a number between 1 to 9: ")
            TypedUserNumber = Console.ReadLine()
            If TypedUserNumber >= 1 And TypedUserNumber <= 9 Then
                TryAgain = True
            Else
                Console.WriteLine("Try Again please")
            End If
        End While

        'multiplication table
        While Count <= 10
            Console.WriteLine(TypedUserNumber & " * " & Count & " = " & TypedUserNumber * Count)
            Count += 1
        End While
    End Sub
End Module
