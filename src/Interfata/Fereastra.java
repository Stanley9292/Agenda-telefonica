/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfata;

/**
 *
 * @author Stan
 */
public class Fereastra extends javax.swing.JFrame {

    /**
     * Creates new form Fereastra
     */
    public Fereastra() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        Ordonare_abonati = new javax.swing.JPanel();
        rNume = new javax.swing.JRadioButton();
        rPrenume = new javax.swing.JRadioButton();
        rCNP = new javax.swing.JRadioButton();
        rTelefon = new javax.swing.JRadioButton();
        bOKOrdonare = new javax.swing.JButton();
        Adaugare_abonat = new javax.swing.JPanel();
        tNume = new javax.swing.JTextField();
        bAdaugare = new javax.swing.JButton();
        bIesire = new javax.swing.JButton();
        tPrenume = new javax.swing.JTextField();
        tCNP = new javax.swing.JTextField();
        tTelefon = new javax.swing.JTextField();
        lNume = new javax.swing.JLabel();
        lPrenume = new javax.swing.JLabel();
        lCNP = new javax.swing.JLabel();
        lTelefon = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Save = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();
        Abonati = new javax.swing.JMenu();
        Adauga = new javax.swing.JMenu();
        Cauta = new javax.swing.JMenu();
        Sterge = new javax.swing.JMenu();
        Modifica = new javax.swing.JMenu();
        Help = new javax.swing.JMenu();
        Inregistrare = new javax.swing.JMenuItem();

        rNume.setText("Nume");

        rPrenume.setText("Prenume");

        rCNP.setText("CNP");

        rTelefon.setText("Numar de telefon");

        bOKOrdonare.setText("Ordoneaza");
        bOKOrdonare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOKOrdonareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ordonare_abonatiLayout = new javax.swing.GroupLayout(Ordonare_abonati);
        Ordonare_abonati.setLayout(Ordonare_abonatiLayout);
        Ordonare_abonatiLayout.setHorizontalGroup(
            Ordonare_abonatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ordonare_abonatiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ordonare_abonatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ordonare_abonatiLayout.createSequentialGroup()
                        .addComponent(rNume)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Ordonare_abonatiLayout.createSequentialGroup()
                        .addGroup(Ordonare_abonatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rPrenume)
                            .addComponent(rCNP)
                            .addComponent(rTelefon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(bOKOrdonare)))
                .addContainerGap())
        );
        Ordonare_abonatiLayout.setVerticalGroup(
            Ordonare_abonatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ordonare_abonatiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rNume)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Ordonare_abonatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ordonare_abonatiLayout.createSequentialGroup()
                        .addComponent(rPrenume)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rCNP))
                    .addGroup(Ordonare_abonatiLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(bOKOrdonare)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rTelefon))
        );

        bAdaugare.setText("Adaugare");
        bAdaugare.setToolTipText("");
        bAdaugare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdaugareActionPerformed(evt);
            }
        });

        bIesire.setText("Iesire");

        lNume.setText("Nume");

        lPrenume.setText("Prenume");

        lCNP.setText("CNP");

        lTelefon.setText("Numar telefon");

        javax.swing.GroupLayout Adaugare_abonatLayout = new javax.swing.GroupLayout(Adaugare_abonat);
        Adaugare_abonat.setLayout(Adaugare_abonatLayout);
        Adaugare_abonatLayout.setHorizontalGroup(
            Adaugare_abonatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adaugare_abonatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Adaugare_abonatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lPrenume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lCNP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Adaugare_abonatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(tPrenume)
                    .addComponent(tNume)
                    .addComponent(tCNP))
                .addGap(18, 18, 18)
                .addGroup(Adaugare_abonatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bIesire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bAdaugare))
                .addGap(13, 13, 13))
        );
        Adaugare_abonatLayout.setVerticalGroup(
            Adaugare_abonatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adaugare_abonatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Adaugare_abonatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNume, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNume))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Adaugare_abonatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAdaugare)
                    .addGroup(Adaugare_abonatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lPrenume)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Adaugare_abonatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bIesire)
                    .addGroup(Adaugare_abonatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tCNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lCNP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Adaugare_abonatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tTelefon)
                    .addComponent(lTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nume", "Prenume", "CNP", "Numar Telefon"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 10);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jButton1.setText("jButton1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("jButton1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setText("jButton1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jButton3, gridBagConstraints);

        jButton4.setText("jButton1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jButton4, gridBagConstraints);

        jButton5.setText("jButton1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jButton5, gridBagConstraints);

        File.setText("File");

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        File.add(Save);

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        File.add(Open);

        MenuBar.add(File);

        Abonati.setText("Abonati");

        Adauga.setText("Adauga");
        Abonati.add(Adauga);

        Cauta.setText("Cauta");
        Abonati.add(Cauta);

        Sterge.setText("Sterge");
        Abonati.add(Sterge);

        Modifica.setText("Modifica");
        Abonati.add(Modifica);

        MenuBar.add(Abonati);

        Help.setText("Help");

        Inregistrare.setText("Inregistrare");
        Help.add(Inregistrare);

        MenuBar.add(Help);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    private void bAdaugareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdaugareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAdaugareActionPerformed

    private void bOKOrdonareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOKOrdonareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bOKOrdonareActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenActionPerformed

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
            java.util.logging.Logger.getLogger(Fereastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fereastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fereastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fereastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fereastra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Abonati;
    private javax.swing.JMenu Adauga;
    private javax.swing.JPanel Adaugare_abonat;
    private javax.swing.JMenu Cauta;
    private javax.swing.JMenu File;
    private javax.swing.JMenu Help;
    private javax.swing.JMenuItem Inregistrare;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu Modifica;
    private javax.swing.JMenuItem Open;
    private javax.swing.JPanel Ordonare_abonati;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenu Sterge;
    private javax.swing.JButton bAdaugare;
    private javax.swing.JButton bIesire;
    private javax.swing.JButton bOKOrdonare;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lCNP;
    private javax.swing.JLabel lNume;
    private javax.swing.JLabel lPrenume;
    private javax.swing.JLabel lTelefon;
    private javax.swing.JRadioButton rCNP;
    private javax.swing.JRadioButton rNume;
    private javax.swing.JRadioButton rPrenume;
    private javax.swing.JRadioButton rTelefon;
    private javax.swing.JTextField tCNP;
    private javax.swing.JTextField tNume;
    private javax.swing.JTextField tPrenume;
    private javax.swing.JTextField tTelefon;
    // End of variables declaration//GEN-END:variables
}
