package sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static sistema.Pagos.fechavencimiento;

public class Pagos extends javax.swing.JFrame {

    ConexionMysql con = new ConexionMysql();
    Connection cn = con.conectar();

    public Pagos() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Icono del JFrame
        setIconImage(new ImageIcon(getClass().getResource("/images/ballet.png")).getImage());
        limpiarEntradas();
        cargarFecha();
        
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
        txtIdCliente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtComentarios = new javax.swing.JTextField();
        containerPagar = new javax.swing.JPanel();
        btnPagar = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        btnInicioClient = new javax.swing.JButton();
        fechavencimiento = new javax.swing.JTextField();
        panelContainerMonto = new javax.swing.JPanel();
        txtMonto = new javax.swing.JTextField();
        txtInteres = new javax.swing.JTextField();
        btnInteres = new javax.swing.JButton();
        CalcularDias = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar pago");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "PAGOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        txtIdCliente.setEditable(false);
        txtIdCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtIdCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtIdCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "ID CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Nombre y Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Comentarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txtComentarios.setBackground(new java.awt.Color(255, 255, 255));
        txtComentarios.setForeground(new java.awt.Color(0, 0, 0));
        txtComentarios.setText("Nombre del Cliente  ");
        txtComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComentariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        containerPagar.setBackground(new java.awt.Color(153, 153, 255));

        btnPagar.setBackground(new java.awt.Color(153, 153, 255));
        btnPagar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(0, 0, 0));
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/metodo-de-pago.png"))); // NOI18N
        btnPagar.setText("PAGAR");
        btnPagar.setContentAreaFilled(false);
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.setIconTextGap(5);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerPagarLayout = new javax.swing.GroupLayout(containerPagar);
        containerPagar.setLayout(containerPagarLayout);
        containerPagarLayout.setHorizontalGroup(
            containerPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containerPagarLayout.setVerticalGroup(
            containerPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "FECHA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        btnInicioClient.setBackground(new java.awt.Color(255, 255, 255));
        btnInicioClient.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnInicioClient.setForeground(new java.awt.Color(255, 255, 255));
        btnInicioClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-atras (2).png"))); // NOI18N
        btnInicioClient.setContentAreaFilled(false);
        btnInicioClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicioClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioClientActionPerformed(evt);
            }
        });

        fechavencimiento.setBackground(new java.awt.Color(255, 255, 255));
        fechavencimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Fecha Vencimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        fechavencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechavencimientoActionPerformed(evt);
            }
        });

        panelContainerMonto.setBackground(new java.awt.Color(255, 255, 255));
        panelContainerMonto.setForeground(new java.awt.Color(153, 153, 153));

        txtMonto.setBackground(new java.awt.Color(204, 204, 255));
        txtMonto.setForeground(new java.awt.Color(0, 0, 0));
        txtMonto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "MONTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        txtInteres.setBackground(new java.awt.Color(255, 255, 255));
        txtInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInteresActionPerformed(evt);
            }
        });

        btnInteres.setBackground(new java.awt.Color(255, 255, 255));
        btnInteres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/controlar.png"))); // NOI18N
        btnInteres.setBorderPainted(false);
        btnInteres.setContentAreaFilled(false);
        btnInteres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInteresActionPerformed(evt);
            }
        });

        CalcularDias.setForeground(new java.awt.Color(0, 0, 0));
        CalcularDias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nomina-de-sueldos.png"))); // NOI18N
        CalcularDias.setToolTipText("");
        CalcularDias.setContentAreaFilled(false);
        CalcularDias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CalcularDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularDiasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContainerMontoLayout = new javax.swing.GroupLayout(panelContainerMonto);
        panelContainerMonto.setLayout(panelContainerMontoLayout);
        panelContainerMontoLayout.setHorizontalGroup(
            panelContainerMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainerMontoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CalcularDias, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panelContainerMontoLayout.setVerticalGroup(
            panelContainerMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainerMontoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContainerMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CalcularDias, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Desarrolado por CM TECHNOLOGIES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(fechavencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtNombre))
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnInicioClient, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelContainerMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(containerPagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(245, 245, 245))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInicioClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechavencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelContainerMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(containerPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO detalles_pagos (ID_cliente,fecha_pago,fecha_vencimiento,monto,comentarios) VALUES (?,?,?,?,?)");
            ps.setString(1, txtIdCliente.getText());
            ps.setString(2, txtFecha.getText());
            ps.setString(3, fechavencimiento.getText());
            ps.setString(4, txtMonto.getText());
            ps.setString(5, txtComentarios.getText());
            ps.executeUpdate();
            
            actualizarFechaVencimiento(fechavencimiento.getText(), Integer.parseInt(txtIdCliente.getText()));
            JOptionPane.showMessageDialog(null, "PAGO REALIZADO CORRECTAMENTE");
            
           String nombre,fecha,monto,fechaVen;
           fecha=txtFecha.getText();
           nombre=txtNombre.getText();
           monto=txtMonto.getText();
           fechaVen=fechavencimiento.getText();
            
           Vencidos v = new Vencidos();
           v.setVisible(true);
           Recibo rc = new Recibo();
           rc.txtFecha.setText(fecha);
           rc.txtnameR.setText(nombre);
           rc.txtMontoR.setText(monto);
           rc.txtDescripcion.setText("PAGO DE CUOTA DE LA FECHA : "+fechaVen);
           rc.setVisible(true);
           this.dispose();
          
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "INGRESE EL MONTO");
            System.out.println("ERROR AL REALIZAR PAGO " + e);
        } catch (ParseException ex) {
            Logger.getLogger(Pagos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed

    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
       
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnInicioClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioClientActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnInicioClientActionPerformed

    private void fechavencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechavencimientoActionPerformed
        
    }//GEN-LAST:event_fechavencimientoActionPerformed

    private void txtComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComentariosActionPerformed
       
    }//GEN-LAST:event_txtComentariosActionPerformed

    private void btnInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInteresActionPerformed
        //Calcular Monto de interes
      double dias,monto,montoNuevo;
      dias=Double.parseDouble(txtInteres.getText());
      monto=Double.parseDouble(txtMonto.getText());
      montoNuevo=calcularInteres(dias, monto);
      String mn = ""+montoNuevo;
      txtMonto.setText(mn);
      limpiarDatoInteres();
    }//GEN-LAST:event_btnInteresActionPerformed

    private void txtInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInteresActionPerformed
   
    }//GEN-LAST:event_txtInteresActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void CalcularDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularDiasActionPerformed
        CalcularDiasInteres();
    }//GEN-LAST:event_CalcularDiasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularDias;
    private javax.swing.JButton btnInicioClient;
    private javax.swing.JButton btnInteres;
    private javax.swing.JButton btnPagar;
    private javax.swing.JPanel containerPagar;
    public static javax.swing.JTextField fechavencimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelContainerMonto;
    public javax.swing.JTextField txtComentarios;
    private javax.swing.JTextField txtFecha;
    public static javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtInteres;
    public javax.swing.JTextField txtMonto;
    public static javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiarEntradas() {

        txtIdCliente.setText("");
        txtNombre.setText("");
        txtFecha.setText("");
        txtMonto.setText("");
        txtComentarios.setText("");
    }

    public void cargarFecha() {
        txtFecha.setText(fechaActual());
    }

    public String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("YYYY-MM-dd");
        return formatofecha.format(fecha);
    }

    private void actualizarFechaVencimiento(String fecha, int idcliente) throws ParseException {

        try {
            Date nuevaFecha = sumarMesFechaVencimiento(fecha);
            System.out.println("sistema.Pagos.actualizarFechaVencimiento()" + nuevaFecha);
            
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fechaBD = formatoFecha.format(nuevaFecha);
            System.out.println("fecha" + fechaBD);
            PreparedStatement ps = cn.prepareStatement("Update clientes set fecha_vencimiento=? where ID=?");
            ps.setString(1, fechaBD);
            ps.setInt(2, idcliente);
            System.out.println(ps);
            ps.executeUpdate();
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }

    }

    public Date sumarMesFechaVencimiento(String fecha) throws ParseException {
        Date dt = new SimpleDateFormat("yyyy/MM/dd").parse(fecha.replace("-", "/"));
        System.out.println("Fecha Actual:" + dt);
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.MONTH, 1);
        System.out.println("Nueva Fecha 1 :" + c.getTime());
        dt = c.getTime(); 
         System.out.println("Nueva Fecha 2 :" + dt);
        Date nf = c.getTime();
        System.out.println("Nueva Fecha 2:" + nf);
        return nf;
    }
   
    public double calcularInteres(double dias,double monto){
     double montoInteres=(dias*1000)+monto;
      return montoInteres;
    }
    
    public void CalcularDiasInteres()  {
        String d1 = txtFecha.getText();
        String d2 = fechavencimiento.getText();
        
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
 
        try {
            Date date1 = sdf.parse(d1);
            Date date2 = sdf.parse(d2);
 
            // obtener la diferencia entre dos fechas en minutos
            long elapsedms = date1.getTime() - date2.getTime();
            long diff = TimeUnit.MINUTES.convert(elapsedms, TimeUnit.MILLISECONDS);
            //Conversion minutos a dias
            long convert=diff/1440;
            System.out.println(convert);
            
            String dI = ""+convert;
            
            txtInteres.setText(dI);

        }
        catch (ParseException e) {
            System.out.println("error: "+e);
        }  
    }
    
    public void limpiarDatoInteres(){
        txtInteres.setText("");
    }

 
    
}
