/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gvega2
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdOpciones = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        txtColumnas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("OPERACIONES MATRICES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 250, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        cmdManual.setText("Manual");
        jPanel2.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        cmdAutomatico.setText("Automatico");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 90, -1));

        cmdOpciones.setText("Opciones");
        jPanel2.add(cmdOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 80, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 440, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("No de Filas:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel5.setText("No. de Columnas:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));
        jPanel3.add(txtFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 30, -1));
        jPanel3.add(txtColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 30, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 70));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 310, 190));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 330, 190));

        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cant. Num Pares", "Tabla Resultado", "Letra C", "Diagonal Principal", "Letra H" }));
        cmbOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOperacionesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 120, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        jPanel4.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 570, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 620, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
      int nf, nc;
      DefaultTableModel tm, tm2;
      
      nf = Integer.parseInt(txtFilas.getText());
      nc = Integer.parseInt(txtColumnas.getText());
      
      
      tm =(DefaultTableModel)tblTablaInicial.getModel();
      tm2 = (DefaultTableModel)tblTablaResultado.getModel();
      
      tm.setRowCount(nf);
      tm.setColumnCount(nc);
      
      
      tm2.setRowCount(nf);
      tm2.setColumnCount(nc);
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed
      int nf , nc,n;
      
      nc = tblTablaInicial.getRowCount();
      nf = tblTablaInicial.getColumnCount();
      
      
      for (int i =  0; i< nf; i++){
          for(int j= 0; j<nc; j++){
              n = (int)(Math.random()*50+1);
              tblTablaInicial.setValueAt(n, i, j);
          }
      }
    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
      int nc , nf;
      
      nc = tblTablaInicial.getColumnCount();
      nf = tblTablaInicial.getRowCount();
              
      txtFilas.setText("");
      txtColumnas.setText("");
      txtResultado.setText("");
      cmbOperaciones.setSelectedItem(0);
      txtFilas.requestFocusInWindow();
     
       for (int i =  0; i< nf; i++){
          for(int j= 0; j<nc; j++){
             
              tblTablaInicial.setValueAt("", i, j);
              tblTablaResultado.setValueAt("", i, j);
          }
      }
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmbOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOperacionesActionPerformed
        int op, nc,nf,aux,cont=0;
        
        op =cmbOperaciones.getSelectedIndex();
        
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaResultado.getColumnCount();
        
        
        switch (op){
            case 0:
               
        
        
         for (int i =  0; i< nf; i++){
          for(int j= 0; j<nc; j++){
             
              aux = (int)tblTablaInicial.getValueAt(i, j);
              if(aux % 2 ==0){
                  cont++;
              }
            }  
          }
         txtResultado.setText("El numero de elementos pares es: "+cont);
            break;
            case 1:
               for (int i =  0; i< nf; i++){
                  for(int j= 0; j<nc; j++){
             
              aux = (int)tblTablaInicial.getValueAt(i, j);
              if(aux % 2 ==0){
                  tblTablaResultado.setValueAt(aux, i, j);
                  
              }
            }  
          }
         break;
            case 2:
               for (int i =  0; i< nf; i++){
                  for(int j= 0; j<nc; j++){
             
              aux = (int)tblTablaInicial.getValueAt(i, j);
              if(i==j){
                  tblTablaResultado.setValueAt(aux, i, j);
                  
              }
            }  
          }        
         break;
            case 3:
               for (int i =  0; i< nf; i++){
                  for(int j= 0; j<nc; j++){
             
              aux = (int)tblTablaInicial.getValueAt(i, j);
              if(j==0 || i == 0 || i ==nf-1){
                  tblTablaResultado.setValueAt(aux, i, j);
                  
              }
            }  
          }
             break;
            case 4:
               for (int i =  0; i< nf; i++){
                  for(int j= 0; j<nc; j++){
             
              aux = (int)tblTablaInicial.getValueAt(i, j);
              if(j == 0 || j == nc - 1 || i ==(nf-1)/2){
                  tblTablaResultado.setValueAt(aux, i, j);
                  
              }
            }  
          }
            break;
      }
        
        
    }//GEN-LAST:event_cmbOperacionesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
