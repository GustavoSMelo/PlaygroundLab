/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckescolanatacao;

import java.awt.JobAttributes;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel
 */
public class TelaExamesMedicos extends javax.swing.JFrame {

    public TelaExamesMedicos() {
        initComponents();
    }
    
    LinkedList listAdulto = new LinkedList();
    LinkedList listIdoso = new LinkedList();
    LinkedList listCrianca = new LinkedList();
    boolean nowIsAdulto = true;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        btnListAdult = new javax.swing.JButton();
        btnListIdosos = new javax.swing.JButton();
        btnStore = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        btnListCrianca = new javax.swing.JButton();
        btnAtender = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escola de natação");

        jLabel1.setText("Nome do candidato: ");

        jLabel2.setText("Idade do candidato:");

        btnListAdult.setText("Lista de adultos");
        btnListAdult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListAdultActionPerformed(evt);
            }
        });

        btnListIdosos.setText("Lista de idosos");
        btnListIdosos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListIdososActionPerformed(evt);
            }
        });

        btnStore.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnStore.setText("Registrar");
        btnStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreActionPerformed(evt);
            }
        });

        jLabel3.setText("Sexo do candidato:");

        btnListCrianca.setText("Lista de crianças");
        btnListCrianca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListCriancaActionPerformed(evt);
            }
        });

        btnAtender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtender.setText("Atender");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("20644272 - Gustavo Santos Melo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(btnListIdosos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListAdult, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(btnStore))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnAtender, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnStore, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListAdult, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListIdosos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnAtender, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(18, 18, 18))
        );

        setSize(new java.awt.Dimension(487, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean verify(){
        if(txtNome.getText().equalsIgnoreCase("") || txtNome.getText().equalsIgnoreCase(null) ||
           txtSexo.getText().equalsIgnoreCase("") || txtSexo.getText().equalsIgnoreCase(null) ||
           Integer.parseInt(txtIdade.getText()) <= 0){
            return true;
        }else{
            return false;
        }
    }
    
    private void btnStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreActionPerformed
        if(verify()){
            JOptionPane.showMessageDialog(null, "To continue with this action, please insert all the fields ");
        }else{
            Candidato cand = new Candidato(txtNome.getText(), txtSexo.getText(), Integer.parseInt(txtIdade.getText()));
            
            if(cand.getIdade() < 18){
                if(listCrianca.isEmpty()){
                    listCrianca.addFirst(cand);
                }else{
                    listCrianca.addLast(cand);
                }
                
                JOptionPane.showMessageDialog(null, "Criança inserida com sucesso! ");
            }else if(cand.getIdade() >= 60){
                if(listIdoso.isEmpty()){
                    listIdoso.addFirst(cand);
                }else{
                    listIdoso.addLast(cand);
                }
                JOptionPane.showMessageDialog(null, "Idoso inserido com sucesso! ");
            }else{
                if(listAdulto.isEmpty()){
                    listAdulto.addFirst(cand);
                }else{
                    listAdulto.addLast(cand);
                }
                JOptionPane.showMessageDialog(null, "Adulto inserido com sucesso! ");
            }
        }
    }//GEN-LAST:event_btnStoreActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        if(!listIdoso.isEmpty()){
            Candidato cand = (Candidato) listIdoso.removeFirst();
            
            JOptionPane.showMessageDialog(null, "O idoso atendido foi: " + cand.toString());
        }else if(listAdulto.isEmpty() && listCrianca.isEmpty()){
            JOptionPane.showMessageDialog(null, "Todas as pessoas foram atendidas !");
        }else if(listAdulto.isEmpty() && !listCrianca.isEmpty()){
            Candidato cand = (Candidato) listCrianca.removeFirst();
            
            JOptionPane.showMessageDialog(null, "A criança atendida foi: "+ cand.toString());
        }
        else if(!listAdulto.isEmpty() && listCrianca.isEmpty()){
            Candidato cand = (Candidato) listAdulto.removeFirst();
            
            JOptionPane.showMessageDialog(null, "O adulto atendido foi: "+ cand.toString());
        }else{
            if(nowIsAdulto){
                Candidato cand = (Candidato) listAdulto.removeFirst();
                JOptionPane.showMessageDialog(null, "O adulto atendido foi: "+ cand.toString());
                nowIsAdulto = false;
            }else{
                Candidato cand = (Candidato) listCrianca.removeFirst();
                JOptionPane.showMessageDialog(null, "A criança atendida foi: "+ cand.toString());
                nowIsAdulto = true;
            }
        }
    }//GEN-LAST:event_btnAtenderActionPerformed

    private void btnListIdososActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListIdososActionPerformed
        if(listIdoso.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nao tem nenhum idoso na fila de espera ");
        }else{
            Object[] allIdosos = listIdoso.toArray();
            String message = "";
            for(int i = 0; i < allIdosos.length; i++){
                Candidato cand = (Candidato)allIdosos[i];
                message += cand.toString() + "\n";
            }
            
            JOptionPane.showMessageDialog(null, "Os idosos que estão na fila são: \n\n "+ message);
        }
    }//GEN-LAST:event_btnListIdososActionPerformed

    private void btnListCriancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListCriancaActionPerformed
        if(listCrianca.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nao tem nenhuma criança na fila de espera ");
        }else{
            Object[] allCrianca = listCrianca.toArray();
            String message = "";
            for(int i = 0; i < allCrianca.length; i++){
                Candidato cand = (Candidato)allCrianca[i];
                message += cand.toString() + "\n";
            }
            
            JOptionPane.showMessageDialog(null, "As crianças que estão na fila são: \n\n "+ message);
        }
    }//GEN-LAST:event_btnListCriancaActionPerformed

    private void btnListAdultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListAdultActionPerformed
        if(listAdulto.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nao tem nenhum adulto na fila de espera ");
        }else{
            Object[] allAdulto = listAdulto.toArray();
            String message = "";
            for(int i = 0; i < allAdulto.length; i++){
                Candidato cand = (Candidato)allAdulto[i];
                message += cand.toString() + "\n";
            }
            
            JOptionPane.showMessageDialog(null, "Os adulto que estão na fila são: \n\n "+ message);
        }
    }//GEN-LAST:event_btnListAdultActionPerformed

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
            java.util.logging.Logger.getLogger(TelaExamesMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExamesMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExamesMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExamesMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExamesMedicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnListAdult;
    private javax.swing.JButton btnListCrianca;
    private javax.swing.JButton btnListIdosos;
    private javax.swing.JButton btnStore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
