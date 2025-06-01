/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author estef
 */

import javax.swing.JFrame;



public class VentanaHistoria extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaHistoria.class.getName());
    
    private String nombreJugador;
    
  
    public VentanaHistoria(String nombreJugador) { 
        this.nombreJugador = nombreJugador; 
        initComponents();
        setupHistoriaContent();
        setLocationRelativeTo(null);
        setTitle("El Comienzo de la Aventura");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        applyCustomComponentSettings();
    }
    
    private void applyCustomComponentSettings() {
        // Asegúrate de que historiaTextArea ya haya sido inicializado por initComponents()
        if (historiaTextArea != null) {
            historiaTextArea.setOpaque(false);
            historiaTextArea.setBackground(new java.awt.Color(0, 0, 0, 0));
            historiaTextArea.setForeground(java.awt.Color.WHITE);
            historiaTextArea.setBorder(null); // Si el diseñador no te deja quitar el borde

            // Si usas JScrollPane:
            if (jScrollPane1 != null) {
                jScrollPane1.setOpaque(false);
                jScrollPane1.getViewport().setOpaque(false);
                jScrollPane1.setBorder(null);
            }
        } else {
            System.err.println("Error: historiaTextArea no inicializado antes de applyCustomComponentSettings.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        historiaTextArea = new javax.swing.JTextArea();
        continuarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historiaTextArea.setEditable(false);
        historiaTextArea.setBackground(new java.awt.Color(51, 102, 255));
        historiaTextArea.setColumns(20);
        historiaTextArea.setFont(new java.awt.Font("Monospaced", 3, 36)); // NOI18N
        historiaTextArea.setForeground(new java.awt.Color(255, 255, 255));
        historiaTextArea.setLineWrap(true);
        historiaTextArea.setRows(5);
        historiaTextArea.setWrapStyleWord(true);
        historiaTextArea.setBorder(null);
        historiaTextArea.setOpaque(false);
        jScrollPane1.setViewportView(historiaTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 620, 340));

        continuarButton.setText("Continuar");
        continuarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(continuarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo- VentanaHistoria.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void setupHistoriaContent() {
        String historia = "En un reino antiguo y misterioso, donde la magia fluye como ríos ocultos, " + nombreJugador + " se embarca en una búsqueda épica.\n\n"
                        + "Una fuerza maligna, conocida como 'La Sombra del Olvido', ha comenzado a devorar la memoria del mundo, borrando poco a poco la historia y la identidad de sus habitantes. Solo tú, con la ayuda de un artefacto legendario, puedes detenerla.\n\n"
                        + "Tu misión es reunir los fragmentos de la Gema del Recuerdo, dispersos por las tierras. Cada fragmento desvelará una parte de la verdad y te dará el poder necesario para enfrentarte a la Sombra.\n\n"
                        + "\n¡El destino del reino está en tus manos, " + nombreJugador + "!"; 

        if (historiaTextArea != null) {
            historiaTextArea.setText(historia);
            historiaTextArea.setCaretPosition(0); // Asegura que el texto se muestre desde el principio
        } else {
            System.err.println("Error: historiaTextArea no ha sido inicializado en initComponents().");
        }
        
    }
    
    private void continuarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarButtonActionPerformed
        this.dispose();
        ClasesPersonaje ventanaClase = new ClasesPersonaje(this.nombreJugador);
        ventanaClase.setVisible(true);
    }//GEN-LAST:event_continuarButtonActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuarButton;
    private javax.swing.JTextArea historiaTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
