
package lab08_angelt;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angel
 */
public class AUDI extends javax.swing.JFrame {

    public AUDI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_carros = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_piezas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jd_piezas = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_nombrePieza = new javax.swing.JTextField();
        tf_materialPieza = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_piezas = new javax.swing.JTable();
        tf_tiempo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bt_crearPieza = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bt_eliminar = new javax.swing.JButton();
        jd_partes = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_partesPiezas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        bt_agregarParte = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_sistema = new javax.swing.JMenu();
        jmi_carros = new javax.swing.JMenuItem();
        jmi_partes = new javax.swing.JMenuItem();
        jmi_piezas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_salir = new javax.swing.JMenuItem();
        jm_ensamblaje = new javax.swing.JMenu();
        jmi_nsblCarros = new javax.swing.JMenuItem();

        jl_piezas.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_piezas);

        jLabel1.setText("Lista de Piezas");

        javax.swing.GroupLayout jd_carrosLayout = new javax.swing.GroupLayout(jd_carros.getContentPane());
        jd_carros.getContentPane().setLayout(jd_carrosLayout);
        jd_carrosLayout.setHorizontalGroup(
            jd_carrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_carrosLayout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addGroup(jd_carrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_carrosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_carrosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(228, 228, 228))))
        );
        jd_carrosLayout.setVerticalGroup(
            jd_carrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_carrosLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        jLabel2.setText("Nombre:");

        jLabel3.setText("Material:");

        jLabel4.setText("Tiempo de elaboración:");

        jt_piezas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Material", "Tiempo Elaboración"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_piezas);

        jLabel5.setText("Mins");

        bt_crearPieza.setText("Crear Pieza");
        bt_crearPieza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearPiezaMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("Creación de Piezas");

        bt_eliminar.setText("Eliminar");

        javax.swing.GroupLayout jd_piezasLayout = new javax.swing.GroupLayout(jd_piezas.getContentPane());
        jd_piezas.getContentPane().setLayout(jd_piezasLayout);
        jd_piezasLayout.setHorizontalGroup(
            jd_piezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_piezasLayout.createSequentialGroup()
                .addGroup(jd_piezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_piezasLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jd_piezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_piezasLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_materialPieza))
                            .addGroup(jd_piezasLayout.createSequentialGroup()
                                .addGroup(jd_piezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_piezasLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_nombrePieza, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jd_piezasLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_piezasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_crearPieza)))
                .addGap(18, 18, 18)
                .addGroup(jd_piezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_piezasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_eliminar)
                .addGap(49, 49, 49))
        );
        jd_piezasLayout.setVerticalGroup(
            jd_piezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_piezasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jd_piezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_piezasLayout.createSequentialGroup()
                        .addGroup(jd_piezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_nombrePieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_piezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_materialPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_piezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(bt_crearPieza))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(bt_eliminar)
                .addGap(21, 21, 21))
        );

        jt_partesPiezas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Material", "Tiempo Elaboración"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jt_partesPiezas);

        jLabel7.setText("Nombre:");

        bt_agregarParte.setText("Agregar");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Creación de Partes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_agregarParte)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(213, 213, 213))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(bt_agregarParte))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_partesLayout = new javax.swing.GroupLayout(jd_partes.getContentPane());
        jd_partes.getContentPane().setLayout(jd_partesLayout);
        jd_partesLayout.setHorizontalGroup(
            jd_partesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_partesLayout.setVerticalGroup(
            jd_partesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jm_sistema.setText("Sistema");

        jmi_carros.setText("Carros");
        jmi_carros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_carrosActionPerformed(evt);
            }
        });
        jm_sistema.add(jmi_carros);

        jmi_partes.setText("Partes");
        jmi_partes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_partesActionPerformed(evt);
            }
        });
        jm_sistema.add(jmi_partes);

        jmi_piezas.setText("Piezas");
        jmi_piezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_piezasActionPerformed(evt);
            }
        });
        jm_sistema.add(jmi_piezas);
        jm_sistema.add(jSeparator1);

        jmi_salir.setText("Salir");
        jm_sistema.add(jmi_salir);

        jMenuBar1.add(jm_sistema);

        jm_ensamblaje.setText("Ensamblaje");

        jmi_nsblCarros.setText("Carros");
        jm_ensamblaje.add(jmi_nsblCarros);

        jMenuBar1.add(jm_ensamblaje);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_carrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_carrosActionPerformed
        jd_carros.pack();
        jd_carros.setModal(true);
        jd_carros.setLocationRelativeTo(this);
        jd_carros.setVisible(true);
    }//GEN-LAST:event_jmi_carrosActionPerformed

    private void jmi_piezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_piezasActionPerformed
        jd_piezas.pack();
        jd_piezas.setModal(true);
        jd_piezas.setLocationRelativeTo(this);
        jd_piezas.setVisible(true);
    }//GEN-LAST:event_jmi_piezasActionPerformed

    private void jmi_partesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_partesActionPerformed
        jd_partes.pack();
        jd_partes.setModal(true);
        jd_partes.setLocationRelativeTo(this);
        jd_partes.setVisible(true);
    }//GEN-LAST:event_jmi_partesActionPerformed

    private void bt_crearPiezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearPiezaMouseClicked
        String nombre, material;
        int tiempo;
        try{
            nombre=tf_nombrePieza.getText();
            material=tf_materialPieza.getText();
            tiempo=Integer.parseInt(tf_tiempo.getText());
            
            Pieza pi = new Pieza(nombre, material, tiempo);
            
            
            JOptionPane.showMessageDialog(jd_piezas,
                    "Pieza agregada exitosamente","Éxito en Ejecución",
                    JOptionPane.INFORMATION_MESSAGE);
            
            tf_nombrePieza.setText("");
            tf_materialPieza.setText("");
            tf_tiempo.setText("");
            Object[] newrow={pi.getNombre(),pi.getMaterial(),pi.getTiempoElabo()};
            
            DefaultTableModel model = (DefaultTableModel)jt_piezas.getModel();
            DefaultListModel modeloLista =(DefaultListModel)jl_piezas.getModel();
            model.addRow(newrow);
            modeloLista.addElement(pi);
            jl_piezas.setModel(modeloLista);
            jt_piezas.setModel(model);
            listaPieza.add(pi);
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_bt_crearPiezaMouseClicked

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
            java.util.logging.Logger.getLogger(AUDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AUDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AUDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AUDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AUDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregarParte;
    private javax.swing.JButton bt_crearPieza;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDialog jd_carros;
    private javax.swing.JDialog jd_partes;
    private javax.swing.JDialog jd_piezas;
    private javax.swing.JList<String> jl_piezas;
    private javax.swing.JMenu jm_ensamblaje;
    private javax.swing.JMenu jm_sistema;
    private javax.swing.JMenuItem jmi_carros;
    private javax.swing.JMenuItem jmi_nsblCarros;
    private javax.swing.JMenuItem jmi_partes;
    private javax.swing.JMenuItem jmi_piezas;
    private javax.swing.JMenuItem jmi_salir;
    private javax.swing.JTable jt_partesPiezas;
    private javax.swing.JTable jt_piezas;
    private javax.swing.JTextField tf_materialPieza;
    private javax.swing.JTextField tf_nombrePieza;
    private javax.swing.JTextField tf_tiempo;
    // End of variables declaration//GEN-END:variables

    ArrayList<Pieza> listaPieza=new ArrayList();
}
