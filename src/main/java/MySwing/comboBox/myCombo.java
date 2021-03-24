/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySwing.comboBox;

/**
 *
 * @author Arturo
 */
public class myCombo extends javax.swing.JFrame {

    /**
     * Creates new form myCombo
     */
    public myCombo() {        
        initComponents();
 
        cbxNombresCodigo.addItem("Alma Getsemani");
        cbxNombresCodigo.addItem("Jesus Ramon");     
        cbxNombresCodigo.addItem("Julio Rene");     
        cbxNombresCodigo.addItem("Paulina Jacqueline");
        
        initCbxPersona();
        
    }
    
    private void initCbxPersona(){
    
        Persona p1 = new Persona("Alma","Choqui Molina" ,"lejos");
        cbxObjPersona.addItem(p1);
        cbxObjPersona.addItem( new Persona("Jesus Ramon", "Herrera", "Popular") );
        cbxObjPersona.addItem( new Persona("Julio Rene", "Blanco", "Guaymas Norte") );
        cbxObjPersona.addItem( new Persona("Fabricio Saul", "Nuñez", "Piedron") );
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxNombres = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        cbxNombresCodigo = new javax.swing.JComboBox<>();
        btnSaludo = new javax.swing.JButton();
        cbxObjPersona = new javax.swing.JComboBox<>();
        lblColonia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbxNombres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------", "Damian Arturo", "Axel Gerardo", "Ramon Antonio", "Daniel Axel", "Luis Gerardo", "Fabian Lopez", "Daniel Alexis", "Luis Adriel" }));
        cbxNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNombresActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("...");

        btnSaludo.setText("Saludar");
        btnSaludo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaludoActionPerformed(evt);
            }
        });

        cbxObjPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxObjPersonaActionPerformed(evt);
            }
        });

        lblColonia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblColonia.setForeground(new java.awt.Color(153, 0, 102));
        lblColonia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(cbxNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSaludo, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(cbxNombresCodigo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxObjPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxObjPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(cbxNombresCodigo)
                    .addComponent(cbxNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNombresActionPerformed
   
        String nombre = (String) cbxNombres.getSelectedItem();
        
        lblNombre.setText(nombre);
        
        
        
        
        
    }//GEN-LAST:event_cbxNombresActionPerformed

    private void btnSaludoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaludoActionPerformed

String nombre = (String) cbxNombresCodigo.getSelectedItem();

lblNombre.setText("Hola "+nombre);
        
        
    }//GEN-LAST:event_btnSaludoActionPerformed

    private void cbxObjPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxObjPersonaActionPerformed
     
   Persona personaSeleccionada = (Persona)  cbxObjPersona.getSelectedItem();
        
   lblNombre.setText(personaSeleccionada.getNombre()+" "+personaSeleccionada.getApellidos());
   lblColonia.setText(personaSeleccionada.getCiudad());
        
    }//GEN-LAST:event_cbxObjPersonaActionPerformed

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
            java.util.logging.Logger.getLogger(myCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myCombo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaludo;
    private javax.swing.JComboBox<String> cbxNombres;
    private javax.swing.JComboBox<String> cbxNombresCodigo;
    private javax.swing.JComboBox<Persona> cbxObjPersona;
    private javax.swing.JLabel lblColonia;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}