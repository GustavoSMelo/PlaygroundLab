package exercicioaula09estrutura;

import javax.swing.JOptionPane;
import Classes.Filmes;

public class HomeFmr extends javax.swing.JFrame {

    /**
     * Creates new form HomeFmr
     */
    Filmes f = new Filmes();
    public HomeFmr() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDiretor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        btnEncontrarFilmeAcao = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnListarFilmes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Titulo: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 60, 50, 19);
        getContentPane().add(txtTitulo);
        txtTitulo.setBounds(130, 50, 210, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Diretor: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 120, 60, 19);
        getContentPane().add(txtDiretor);
        txtDiretor.setBounds(130, 110, 210, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Ano: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 180, 50, 19);
        getContentPane().add(txtAno);
        txtAno.setBounds(130, 170, 210, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Pais: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 240, 50, 19);
        getContentPane().add(txtPais);
        txtPais.setBounds(130, 230, 210, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Genero: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 290, 70, 19);
        getContentPane().add(txtGenero);
        txtGenero.setBounds(130, 280, 210, 30);

        btnEncontrarFilmeAcao.setText("Retirar ate encontrar filme de ação");
        btnEncontrarFilmeAcao.setToolTipText("");
        btnEncontrarFilmeAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncontrarFilmeAcaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncontrarFilmeAcao);
        btnEncontrarFilmeAcao.setBounds(340, 340, 250, 40);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(20, 340, 110, 40);

        btnListarFilmes.setText("Listar filmes cadastrados");
        btnListarFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarFilmesActionPerformed(evt);
            }
        });
        getContentPane().add(btnListarFilmes);
        btnListarFilmes.setBounds(140, 340, 190, 40);

        txtArea.setColumns(20);
        txtArea.setLineWrap(true);
        txtArea.setRows(5);
        txtArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 400, 560, 180);

        setBounds(0, 0, 638, 659);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(txtAno.getText().equalsIgnoreCase("") ||
                txtDiretor.getText().equalsIgnoreCase("") ||
                txtGenero.getText().equalsIgnoreCase("") ||
                txtPais.getText().equalsIgnoreCase("") ||
                txtTitulo.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Complete all the fields to continue please... ");
           
        }else{
            Filmes film = new Filmes(txtTitulo.getText(), txtDiretor.getText(), txtGenero.getText(), txtPais.getText(), Integer.parseInt(txtAno.getText()));
            
            boolean response = f.enqueue(film);
            if(response){
                txtArea.setText("Film inserted with success! ");
            }else{
                txtArea.setText("Error to put film in array! ");
            }
            
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnListarFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarFilmesActionPerformed
        txtArea.setText(f.toString());
    }//GEN-LAST:event_btnListarFilmesActionPerformed

    private void btnEncontrarFilmeAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncontrarFilmeAcaoActionPerformed
        txtArea.setText(f.ReturnActionFilms());
    }//GEN-LAST:event_btnEncontrarFilmeAcaoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFmr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFmr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFmr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFmr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFmr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEncontrarFilmeAcao;
    private javax.swing.JButton btnListarFilmes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDiretor;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
