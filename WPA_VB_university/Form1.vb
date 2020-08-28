Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Label.Text = "Kimetsu no yaiba"
        TextBox1.Text = Label.Text
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        MessageBox.Show("Voce clickou no botão")
    End Sub
End Class
