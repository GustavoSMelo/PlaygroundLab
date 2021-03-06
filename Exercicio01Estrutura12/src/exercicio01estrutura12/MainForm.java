/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01estrutura12;

import javax.swing.JOptionPane;
import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author Botzera
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }
    
    Fila f = new Fila();
    Pilha p1 = new Pilha();
    Pilha p2 = new Pilha();
    Pilha p3 = new Pilha();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPacienteNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        btnFilaDeEspera = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnCall3 = new javax.swing.JButton();
        btnCall1 = new javax.swing.JButton();
        btnCall2 = new javax.swing.JButton();
        btnAten3 = new javax.swing.JButton();
        btnAten1 = new javax.swing.JButton();
        btnAten2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nome do paciente: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 60, 108, 16);
        getContentPane().add(txtPacienteNome);
        txtPacienteNome.setBounds(290, 50, 160, 30);

        jLabel2.setText("RG do paciente: ");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 100, 91, 16);
        getContentPane().add(txtRG);
        txtRG.setBounds(290, 100, 160, 30);

        btnFilaDeEspera.setText("Fila de espera");
        btnFilaDeEspera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilaDeEsperaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFilaDeEspera);
        btnFilaDeEspera.setBounds(320, 200, 110, 40);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(180, 200, 110, 40);

        btnCall3.setText("Chamar consultorio 3");
        btnCall3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCall3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCall3);
        btnCall3.setBounds(370, 280, 160, 50);

        btnCall1.setText("Chamar consultorio 1");
        btnCall1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCall1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCall1);
        btnCall1.setBounds(30, 280, 160, 50);

        btnCall2.setText("Chamar consultorio 2");
        btnCall2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCall2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCall2);
        btnCall2.setBounds(200, 280, 160, 50);

        btnAten3.setText("Atendidos no conultorio 3");
        btnAten3.setToolTipText("");
        btnAten3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAten3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAten3);
        btnAten3.setBounds(410, 340, 180, 50);

        btnAten1.setText("Atendidos no conultorio 1");
        btnAten1.setToolTipText("");
        btnAten1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAten1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAten1);
        btnAten1.setBounds(30, 340, 180, 50);

        btnAten2.setText("Atendidos no conultorio 2");
        btnAten2.setToolTipText("");
        btnAten2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAten2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAten2);
        btnAten2.setBounds(220, 340, 180, 50);

        setBounds(0, 0, 622, 449);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(txtPacienteNome.getText().equalsIgnoreCase("") || txtRG.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Complete all the fields to continue ");
        }else{
            Dictionary<String, String> people = new Hashtable();
            people.put(txtPacienteNome.getText(), txtRG.getText());
            f.push(people);
            JOptionPane.showMessageDialog(null, "Item inserido com sucesso! ");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnFilaDeEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilaDeEsperaActionPerformed
        JOptionPane.showMessageDialog(null, f.toString());
    }//GEN-LAST:event_btnFilaDeEsperaActionPerformed

    private void btnCall1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCall1ActionPerformed
        if(f.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fila Vazia ");
        }else{
            p1.push(f.top());
            JOptionPane.showMessageDialog(null, "Chamado no consultorio 1 ");
        }
    }//GEN-LAST:event_btnCall1ActionPerformed

    private void btnCall2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCall2ActionPerformed
        if(f.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fila Vazia ");
        }else{
            p2.push(f.top());
            JOptionPane.showMessageDialog(null, "Chamado no consultorio 2 ");
        }
    }//GEN-LAST:event_btnCall2ActionPerformed

    private void btnCall3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCall3ActionPerformed
        if(f.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fila Vazia ");
        }else{
            p3.push(f.top());
            JOptionPane.showMessageDialog(null, "Chamado no consultorio 3 ");
        }
    }//GEN-LAST:event_btnCall3ActionPerformed

    private void btnAten1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAten1ActionPerformed
        JOptionPane.showMessageDialog(null, "As pessoas que foram consultadas no consultorio 1 foram: "+p1.toString());
         
    }//GEN-LAST:event_btnAten1ActionPerformed

    private void btnAten2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAten2ActionPerformed
         JOptionPane.showMessageDialog(null, "As pessoas que foram consultadas no consultorio 2 foram: "+p2.toString());
    }//GEN-LAST:event_btnAten2ActionPerformed

    private void btnAten3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAten3ActionPerformed
        JOptionPane.showMessageDialog(null, "As pessoas que foram consultadas no consultorio 3 foram: "+p3.toString());
    }//GEN-LAST:event_btnAten3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAten1;
    private javax.swing.JButton btnAten2;
    private javax.swing.JButton btnAten3;
    private javax.swing.JButton btnCall1;
    private javax.swing.JButton btnCall2;
    private javax.swing.JButton btnCall3;
    private javax.swing.JButton btnFilaDeEspera;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtPacienteNome;
    private javax.swing.JTextField txtRG;
    // End of variables declaration//GEN-END:variables
}
