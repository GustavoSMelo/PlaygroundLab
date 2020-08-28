Imports System

Module Program
    Sub Main(args As String())
        'Dim v1, v2 As Integer
        'v1 = 10
        'v2 = 20

        'If v1 = 10 And v2 > v1 Then
        'Console.WriteLine("Okay" & "!")
        'Else
        'Console.WriteLine("No" & "?")
        'End If

        Dim entry As String = Nothing

        While entry <> "fim" Or "sair" Or "exit"
            Console.Write("Digite alguma coisa: ")
            entry = Console.ReadLine()
            Console.WriteLine("Voce digitou " & entry)
        End While
    End Sub
End Module
