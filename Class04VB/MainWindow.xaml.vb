Class MainWindow
    Dim qntdOne As String
    Dim qntdTwo As String
    Dim qntdThree As String

    Private Sub Button_Click(sender As Object, e As RoutedEventArgs)
        If chkFirst.IsChecked = False And chkSecond.IsChecked = False And chkThird.IsChecked = False Then
            MessageBox.Show("To continue, please, choose one")
        Else
            Dim txtResult As String = "Voce comprou "

            If chkFirst.IsChecked Then
                txtResult += qntdOne & " Fusca, "
            End If

            If chkSecond.IsChecked Then
                txtResult += qntdTwo & " Onyx, "
            End If

            If chkThird.IsChecked Then
                txtResult += qntdThree & " Sandero "
            End If

            MessageBox.Show(txtResult)
        End If
    End Sub

    Private Sub chkFirst_Checked(sender As Object, e As RoutedEventArgs) Handles chkFirst.Checked
        If txtField.Text.Equals("") Or txtField.Text.Equals(Nothing) Then
            MessageBox.Show("To continue, please, insert the field first ")
            chkFirst.IsChecked = False
        Else
            qntdOne = txtField.Text
            txtField.Text = ""
            MessageBox.Show("Product inserted with success")
        End If
    End Sub

    Private Sub chkSecond_Checked(sender As Object, e As RoutedEventArgs) Handles chkSecond.Checked
        If txtField.Text.Equals("") Or txtField.Text.Equals(Nothing) Then
            MessageBox.Show("To continue, please, insert the field first ")
            chkSecond.IsChecked = False
        Else
            qntdTwo = txtField.Text
            txtField.Text = ""
            MessageBox.Show("Product inserted with success")
        End If
    End Sub

    Private Sub chkThird_Checked(sender As Object, e As RoutedEventArgs) Handles chkThird.Checked
        If txtField.Text.Equals("") Or txtField.Text.Equals(Nothing) Then
            MessageBox.Show("To continue, please, insert the field first ")
            chkThird.IsChecked = False
        Else
            qntdThree = txtField.Text
            txtField.Text = ""
            MessageBox.Show("Product inserted with success")
        End If
    End Sub
End Class
