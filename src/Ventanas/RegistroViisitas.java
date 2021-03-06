/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegistroViisitas extends javax.swing.JFrame {

    public RegistroViisitas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelN_Visita = new javax.swing.JLabel();
        jLabelF_Visita = new javax.swing.JLabel();
        jLabelCod_Paciente = new javax.swing.JLabel();
        jLabelCod_Medico = new javax.swing.JLabel();
        jLabelMotivo_Visita = new javax.swing.JLabel();
        jtf_num = new javax.swing.JTextField();
        jtf_fec = new javax.swing.JTextField();
        jtf_cdp = new javax.swing.JTextField();
        jtf_cdm = new javax.swing.JTextField();
        jb_mod = new javax.swing.JButton();
        jb_eli = new javax.swing.JButton();
        jb_reg = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jtf_bus = new javax.swing.JTextField();
        jLabelCod_Medico1 = new javax.swing.JLabel();
        jLabelCod_Paciente1 = new javax.swing.JLabel();
        jLabelF_Visita1 = new javax.swing.JLabel();
        jtf_enf = new javax.swing.JTextField();
        jtf_pre = new javax.swing.JTextField();
        jtf_pes = new javax.swing.JTextField();
        jLabelN_Visita1 = new javax.swing.JLabel();
        jtf_mdv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTitulo.setText("Visitas");

        jLabelN_Visita.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelN_Visita.setForeground(new java.awt.Color(153, 153, 153));
        jLabelN_Visita.setText("Numero de visita :");

        jLabelF_Visita.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelF_Visita.setForeground(new java.awt.Color(153, 153, 153));
        jLabelF_Visita.setText("Fecha de visita :");

        jLabelCod_Paciente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCod_Paciente.setForeground(new java.awt.Color(153, 153, 153));
        jLabelCod_Paciente.setText("Codigo del Paciente :");

        jLabelCod_Medico.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCod_Medico.setForeground(new java.awt.Color(153, 153, 153));
        jLabelCod_Medico.setText("Codigo del Medico :");

        jLabelMotivo_Visita.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelMotivo_Visita.setForeground(new java.awt.Color(153, 153, 153));
        jLabelMotivo_Visita.setText("Motivo de la Visita :");

        jtf_fec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_fecActionPerformed(evt);
            }
        });

        jtf_cdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_cdpActionPerformed(evt);
            }
        });

        jb_mod.setBackground(new java.awt.Color(38, 36, 87));
        jb_mod.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jb_mod.setForeground(new java.awt.Color(255, 255, 255));
        jb_mod.setText("Modificar");
        jb_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modActionPerformed(evt);
            }
        });

        jb_eli.setBackground(new java.awt.Color(38, 36, 87));
        jb_eli.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jb_eli.setForeground(new java.awt.Color(255, 255, 255));
        jb_eli.setText("Eliminar");
        jb_eli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliActionPerformed(evt);
            }
        });

        jb_reg.setBackground(new java.awt.Color(38, 36, 87));
        jb_reg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jb_reg.setForeground(new java.awt.Color(255, 255, 255));
        jb_reg.setText("Registrar");
        jb_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_regActionPerformed(evt);
            }
        });

        jButtonRegresar.setBackground(new java.awt.Color(102, 33, 58));
        jButtonRegresar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jtf_bus.setToolTipText("Escriba el numero de visita");

        jLabelCod_Medico1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCod_Medico1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelCod_Medico1.setText("Peso :");

        jLabelCod_Paciente1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCod_Paciente1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelCod_Paciente1.setText(" Presión :");

        jLabelF_Visita1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelF_Visita1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelF_Visita1.setText("Enfermedad :");

        jtf_enf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_enfActionPerformed(evt);
            }
        });

        jtf_pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_preActionPerformed(evt);
            }
        });

        jLabelN_Visita1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelN_Visita1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelN_Visita1.setText("Numero de visita :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jb_reg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelTitulo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelN_Visita, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_num))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelF_Visita, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_fec, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelCod_Paciente1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabelCod_Medico1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_pes))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelCod_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtf_cdp, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelF_Visita1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_enf))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelCod_Medico)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtf_cdm)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelN_Visita1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtf_bus, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jb_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23)
                            .addComponent(jb_eli, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMotivo_Visita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_mdv, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelN_Visita)
                    .addComponent(jtf_num, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelF_Visita)
                    .addComponent(jtf_fec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelCod_Paciente)
                    .addComponent(jtf_cdp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelCod_Medico)
                    .addComponent(jtf_cdm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_mdv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMotivo_Visita))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelF_Visita1)
                    .addComponent(jtf_enf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCod_Paciente1)
                    .addComponent(jtf_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCod_Medico1)
                    .addComponent(jtf_pes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_bus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelN_Visita1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_eli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_cdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_cdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_cdpActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        Hospital principal = new Hospital();
        principal.setTitle("Ventana 2");
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jb_eliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliActionPerformed
        String bus = jtf_bus.getText();
        if (bus.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese numero de visita", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            File file = new File("Hospital\\Visitas\\" + bus + ".txt");
            if (file.delete()) {
                JOptionPane.showMessageDialog(null, "Visita eliminada exitosamente", "EXITO", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Visita " + bus + " inexistente", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        jtf_bus.setText("");
    }//GEN-LAST:event_jb_eliActionPerformed

    private void jtf_fecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_fecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_fecActionPerformed

    private void jb_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_regActionPerformed
        String num = jtf_num.getText();
        String fec = jtf_fec.getText();
        String cdp = jtf_cdp.getText();
        String cdm = jtf_cdm.getText();
        String mdv = jtf_mdv.getText();
        String enf = jtf_enf.getText();
        String pre = jtf_pre.getText();
        String pes = jtf_pes.getText();

        if (num.isEmpty() || fec.isEmpty() || cdp.isEmpty() || cdm.isEmpty() || mdv.isEmpty() || enf.isEmpty() || pre.isEmpty() || pes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los espacios", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {

            File paciente = new File("Hospital\\Pacientes\\" + cdp + ".txt");
            File doctor = new File("Hospital\\Medicos\\" + cdm + ".txt");
            if (!paciente.exists()) {
                JOptionPane.showMessageDialog(null, "Codigo de paciente inexistente", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
            } else if (!doctor.exists()) {
                JOptionPane.showMessageDialog(null, "Codigo de medico inexistente", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
            } else {  // Todo Bien
                jb_mod.setEnabled(true);
                jb_eli.setEnabled(true);
                jtf_bus.setEnabled(true);
                jtf_num.setEnabled(true);
                jtf_cdm.setEnabled(true);
                jtf_cdp.setEnabled(true);

                if (jb_reg.getText().equals("Registrar")) {
                    File nuevoVisitas = new File("Hospital\\Visitas\\" + num + ".txt");
                    if (nuevoVisitas.exists()) {
                        JOptionPane.showMessageDialog(null, "Visita ya registrada", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    } else {
                        try {
                            FileWriter write = new FileWriter("Hospital\\Visitas\\" + num + ".txt", true);
                            try (PrintWriter print_line = new PrintWriter(write)) {
                                print_line.printf(num + "\n" + fec + "\n" + cdp + "\n" + cdm + "\n" + mdv + "\n" + enf + "\n" + pre + "\n" + pes);
                                JOptionPane.showMessageDialog(null, "Visita registrada exitosamente", "EXITO", JOptionPane.INFORMATION_MESSAGE);
                                jtf_num.setText("");
                                jtf_fec.setText("");
                                jtf_cdp.setText("");
                                jtf_cdm.setText("");
                                jtf_mdv.setText("");
                                jtf_enf.setText("");
                                jtf_pre.setText("");
                                jtf_pes.setText("");
                                // Codigo para guardar los historiales
                                File historialMedico = new File("Hospital\\HistorialMedicos\\" + cdp + ".txt");
                                FileWriter fileWriter = new FileWriter("Hospital\\HistorialMedico\\" + cdp + ".txt", true); //Set true for append mode
                                PrintWriter printWriter;
                                printWriter = new PrintWriter(fileWriter);
                                printWriter.println(enf);  //Nueva linea con el dato (Enfermedad)
                                printWriter.close();

                                File historialPresionPeso = new File("Hospital\\HistorialPresionPeso\\" + cdp + ".txt");
                                FileWriter fileWriterPresionPeso = new FileWriter("Hospital\\HistorialPresionPeso\\" + cdp + ".txt", true); //Set true for append mode
                                PrintWriter printWriterPresionPeso;
                                printWriterPresionPeso = new PrintWriter(fileWriterPresionPeso);
                                printWriterPresionPeso.println(pre);    //Agrego datos al txt
                                printWriterPresionPeso.println(pes);    // ´´
                                printWriterPresionPeso.close();
                                //Contador de lineas en archivo 1
                                BufferedReader r5;
                                int numLinea = 1;
                                try {
                                    r5 = new BufferedReader(new FileReader("Hospital\\HistorialPresionPeso\\" + cdp + ".txt"));
                                    String line = r5.readLine();
                                    while (line != null) {
                                        System.out.println("Dato visto : " + line + "  en la fila :" + numLinea);
                                        line = r5.readLine();
                                        numLinea++;
                                    }
                                    numLinea--;
                                    System.out.print(">>>>>> TOTAL DE FILAS : " + numLinea);
                                    r5.close();
                                } catch (IOException e) {
                                }
                                if (numLinea == 12) {   //Debo eliminar 2 fila : las primeras 
                                    //Contador de lineas en archivo 2
                                    try {
                                        r5 = new BufferedReader(new FileReader("Hospital\\HistorialPresionPeso\\" + cdp + ".txt"));
                                        String line = r5.readLine();
                                        int contador = 1;
                                        String datosViejos = "";
                                        //Contador de lineas
                                        while (line != null) {
                                            System.out.println(">Fila analizada : " + contador);
                                            if (contador >= 3) {
                                                datosViejos = datosViejos + line + "\n";
                                            } else {
                                                System.out.println(">Fila omitida : " + contador);
                                            }
                                            line = r5.readLine();
                                            contador++;
                                        }
                                        System.out.println(">Datos recopilados....\n" + datosViejos);
                                        r5.close();

                                        File file = new File("Hospital\\HistorialPresionPeso\\" + cdp + ".txt");
                                        file.delete();

                                        try {
                                            FileWriter wr = new FileWriter("Hospital\\HistorialPresionPeso\\" + cdp + ".txt", true);
                                            try (PrintWriter p = new PrintWriter(wr)) {
                                                p.printf(datosViejos);
                                            }
                                        } catch (IOException ex) {
                                            Logger.getLogger(RegistroViisitas.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    } catch (IOException e) {
                                    }
                                }
                                printWriterPresionPeso.close();
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(RegistroViisitas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else if (jb_reg.getText().equals("Guardar")) {
                    File file = new File("Hospital\\Visitas\\" + num + ".txt");
                    file.delete();
                    try {
                        FileWriter write = new FileWriter("Hospital\\Visitas\\" + num + ".txt", true);
                        try (PrintWriter print_line = new PrintWriter(write)) {
                            print_line.printf(num + "\n" + fec + "\n" + cdp + "\n" + cdm + "\n" + mdv + "\n" + enf + "\n" + pre + "\n" + pes);
                            jtf_num.setText("");
                            jtf_fec.setText("");
                            jtf_cdp.setText("");
                            jtf_cdm.setText("");
                            jtf_mdv.setText("");
                            jtf_enf.setText("");
                            jtf_pre.setText("");
                            jtf_bus.setText("");
                            jtf_pes.setText("");

                            JOptionPane.showMessageDialog(null, "Visita modifica exitosamente", "EXITO", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(RegistroViisitas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jb_reg.setText("Registrar");
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR....");
                }
            }
        }

    }//GEN-LAST:event_jb_regActionPerformed

    private void jb_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modActionPerformed
        String bus = jtf_bus.getText();
        if (bus.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese numero de visita", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            File nuevoVisitas = new File("Hospital\\Visitas\\" + bus + ".txt");
            if (nuevoVisitas.exists()) {
                // Asignación de texto al boton registrar->guardar y la casilla de busqueda de numula a vacio
                jb_reg.setText("Guardar");
                jtf_bus.setText("");
                // Bloqueo de casiilas y botones
                jb_mod.setEnabled(false);
                jb_eli.setEnabled(false);
                jtf_bus.setEnabled(false);
                jtf_num.setEnabled(false);

                jtf_cdm.setEnabled(false);
                jtf_cdp.setEnabled(false);

                BufferedReader reader;
                try {
                    reader = new BufferedReader(new FileReader("Hospital\\Visitas\\" + bus + ".txt"));
                    String line = reader.readLine();
                    int numLinea = 1;
                    while (line != null) {
                        if (numLinea == 1) {
                            jtf_num.setText(line);
                        } else if (numLinea == 2) {
                            jtf_fec.setText(line);
                        } else if (numLinea == 3) {
                            jtf_cdp.setText(line);
                        } else if (numLinea == 4) {
                            jtf_cdm.setText(line);
                        } else if (numLinea == 5) {
                            jtf_mdv.setText(line);
                        } else if (numLinea == 6) {
                            jtf_enf.setText(line);
                        } else if (numLinea == 7) {
                            jtf_pre.setText(line);
                        } else if (numLinea == 8) {
                            jtf_pes.setText(line);
                        } else {
                            break;
                        }
                        line = reader.readLine();
                        numLinea++;
                    }
                    reader.close();
                } catch (IOException e) {
                }
            } else {
                JOptionPane.showMessageDialog(null, "Visita " + bus + " inexistente", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        jtf_bus.setText("");
    }//GEN-LAST:event_jb_modActionPerformed

    private void jtf_enfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_enfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_enfActionPerformed

    private void jtf_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_preActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_preActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introdunum in Java SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(RegistroViisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroViisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroViisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroViisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistroViisitas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelCod_Medico;
    private javax.swing.JLabel jLabelCod_Medico1;
    private javax.swing.JLabel jLabelCod_Paciente;
    private javax.swing.JLabel jLabelCod_Paciente1;
    private javax.swing.JLabel jLabelF_Visita;
    private javax.swing.JLabel jLabelF_Visita1;
    private javax.swing.JLabel jLabelMotivo_Visita;
    private javax.swing.JLabel jLabelN_Visita;
    private javax.swing.JLabel jLabelN_Visita1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JButton jb_eli;
    private javax.swing.JButton jb_mod;
    private javax.swing.JButton jb_reg;
    private javax.swing.JTextField jtf_bus;
    private javax.swing.JTextField jtf_cdm;
    private javax.swing.JTextField jtf_cdp;
    private javax.swing.JTextField jtf_enf;
    private javax.swing.JTextField jtf_fec;
    private javax.swing.JTextField jtf_mdv;
    private javax.swing.JTextField jtf_num;
    private javax.swing.JTextField jtf_pes;
    private javax.swing.JTextField jtf_pre;
    // End of variables declaration//GEN-END:variables
}
