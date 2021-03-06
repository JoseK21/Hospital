
package Ventanas;

import java.io.File;

public class Hospital extends javax.swing.JFrame {

    /**
     * Creates new form Hospital
     */
    public Hospital() {        
        crearCarpetas();
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * Creación de Carpetas
     */
    public static void crearCarpetas(){      
        File hospital = new File("Hospital");
        hospital.mkdir();
        File paciente = new File("Hospital\\Pacientes");
        paciente.mkdir();                
        File medico = new File("Hospital\\Medicos");
        medico.mkdir();      
        File visitas = new File("Hospital\\Visitas");
        visitas.mkdir();
        File historialMedico = new File("Hospital\\HistorialMedico");
        historialMedico.mkdir();     
        File historialPresionPeso = new File("Hospital\\HistorialPresionPeso");
        historialPresionPeso.mkdir();     
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegistrarPaciente = new javax.swing.JButton();
        jButtonRegistrarVisitas = new javax.swing.JButton();
        jButtonRegistrarMedico = new javax.swing.JButton();
        jButtonIrReporte = new javax.swing.JButton();
        jLabelHospital = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(645, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegistrarPaciente.setBackground(new java.awt.Color(102, 33, 58));
        jButtonRegistrarPaciente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonRegistrarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarPaciente.setText(" Pacientes");
        jButtonRegistrarPaciente.setBorder(null);
        jButtonRegistrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 40));

        jButtonRegistrarVisitas.setBackground(new java.awt.Color(38, 36, 87));
        jButtonRegistrarVisitas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonRegistrarVisitas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarVisitas.setText("Visita");
        jButtonRegistrarVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarVisitasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 200, 40));

        jButtonRegistrarMedico.setBackground(new java.awt.Color(102, 33, 58));
        jButtonRegistrarMedico.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonRegistrarMedico.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarMedico.setText(" Medicos");
        jButtonRegistrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 200, 40));

        jButtonIrReporte.setBackground(new java.awt.Color(38, 36, 87));
        jButtonIrReporte.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonIrReporte.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIrReporte.setText("Reporte");
        jButtonIrReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIrReporteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIrReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 200, 40));

        jLabelHospital.setBackground(new java.awt.Color(255, 255, 255));
        jLabelHospital.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelHospital.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHospital.setText("Hospital");
        getContentPane().add(jLabelHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 30));

        jButtonSalir.setBackground(new java.awt.Color(38, 36, 87));
        jButtonSalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 90, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Prin.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarPacienteActionPerformed
        RegistroPaciente principal2 = new RegistroPaciente();
        principal2.setTitle("Ventana 2");
        principal2.setVisible(true);        
        dispose();
    }//GEN-LAST:event_jButtonRegistrarPacienteActionPerformed

    private void jButtonRegistrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarMedicoActionPerformed
        RegistroDoctor principal3 = new RegistroDoctor();
        principal3.setTitle("Ventana 3");
        principal3.setVisible(true);        
        dispose();
    }//GEN-LAST:event_jButtonRegistrarMedicoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonIrReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIrReporteActionPerformed
        Reporte principal5 = new Reporte();
        principal5.setTitle("Ventana 5");
        principal5.setVisible(true);        
        dispose();
    }//GEN-LAST:event_jButtonIrReporteActionPerformed

    private void jButtonRegistrarVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarVisitasActionPerformed
        RegistroViisitas principal4 = new RegistroViisitas();

        principal4.setTitle("Ventana 4");

        principal4.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButtonRegistrarVisitasActionPerformed

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
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIrReporte;
    private javax.swing.JButton jButtonRegistrarMedico;
    private javax.swing.JButton jButtonRegistrarPaciente;
    private javax.swing.JButton jButtonRegistrarVisitas;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelHospital;
    // End of variables declaration//GEN-END:variables
}
