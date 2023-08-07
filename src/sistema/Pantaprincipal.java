
package sistema;

import javax.swing.ImageIcon;

public class Pantaprincipal extends javax.swing.JFrame {

    /**
     * Creates new form Pantaprincipal
     */
    public Pantaprincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Icono del JFrame
        setIconImage(new ImageIcon(getClass().getResource("/images/ballet.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PantaPrincipal = new javax.swing.JPanel();
        ContenedorBtns = new javax.swing.JPanel();
        containerbtnclientes = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        containerbtnvencidos = new javax.swing.JPanel();
        btnVencidos = new javax.swing.JButton();
        containerDetalles = new javax.swing.JPanel();
        btnDetallesPagos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnInicioClient = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);

        PantaPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        ContenedorBtns.setBackground(new java.awt.Color(255, 255, 255));

        containerbtnclientes.setBackground(new java.awt.Color(153, 102, 255));

        btnClientes.setBackground(new java.awt.Color(153, 102, 255));
        btnClientes.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(0, 0, 0));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/danza (1).png"))); // NOI18N
        btnClientes.setText("Alumnos");
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setFocusPainted(false);
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.setIconTextGap(14);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerbtnclientesLayout = new javax.swing.GroupLayout(containerbtnclientes);
        containerbtnclientes.setLayout(containerbtnclientesLayout);
        containerbtnclientesLayout.setHorizontalGroup(
            containerbtnclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );
        containerbtnclientesLayout.setVerticalGroup(
            containerbtnclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        containerbtnvencidos.setBackground(new java.awt.Color(153, 153, 255));
        containerbtnvencidos.setForeground(new java.awt.Color(0, 0, 0));

        btnVencidos.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnVencidos.setForeground(new java.awt.Color(0, 0, 0));
        btnVencidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fecha-de-vencimiento (1).png"))); // NOI18N
        btnVencidos.setText("Cuotas Vencidas");
        btnVencidos.setContentAreaFilled(false);
        btnVencidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVencidos.setFocusPainted(false);
        btnVencidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVencidos.setIconTextGap(14);
        btnVencidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVencidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerbtnvencidosLayout = new javax.swing.GroupLayout(containerbtnvencidos);
        containerbtnvencidos.setLayout(containerbtnvencidosLayout);
        containerbtnvencidosLayout.setHorizontalGroup(
            containerbtnvencidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVencidos, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        containerbtnvencidosLayout.setVerticalGroup(
            containerbtnvencidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVencidos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE)
        );

        containerDetalles.setBackground(new java.awt.Color(255, 153, 255));

        btnDetallesPagos.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnDetallesPagos.setForeground(new java.awt.Color(0, 0, 0));
        btnDetallesPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informes (1).png"))); // NOI18N
        btnDetallesPagos.setText("Informes de pagos");
        btnDetallesPagos.setContentAreaFilled(false);
        btnDetallesPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetallesPagos.setFocusPainted(false);
        btnDetallesPagos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDetallesPagos.setIconTextGap(14);
        btnDetallesPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesPagosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerDetallesLayout = new javax.swing.GroupLayout(containerDetalles);
        containerDetalles.setLayout(containerDetallesLayout);
        containerDetallesLayout.setHorizontalGroup(
            containerDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDetallesPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        containerDetallesLayout.setVerticalGroup(
            containerDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerDetallesLayout.createSequentialGroup()
                .addComponent(btnDetallesPagos)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContenedorBtnsLayout = new javax.swing.GroupLayout(ContenedorBtns);
        ContenedorBtns.setLayout(ContenedorBtnsLayout);
        ContenedorBtnsLayout.setHorizontalGroup(
            ContenedorBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorBtnsLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(ContenedorBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorBtnsLayout.createSequentialGroup()
                        .addComponent(containerbtnvencidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorBtnsLayout.createSequentialGroup()
                        .addComponent(containerDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorBtnsLayout.createSequentialGroup()
                        .addComponent(containerbtnclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        ContenedorBtnsLayout.setVerticalGroup(
            ContenedorBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorBtnsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(containerbtnclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(containerbtnvencidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(containerDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        btnUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar-usuario_2.png"))); // NOI18N
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setName(""); // NOI18N
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Principal.png"))); // NOI18N

        btnInicioClient.setBackground(new java.awt.Color(255, 255, 255));
        btnInicioClient.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnInicioClient.setForeground(new java.awt.Color(255, 255, 255));
        btnInicioClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-atras (1).png"))); // NOI18N
        btnInicioClient.setContentAreaFilled(false);
        btnInicioClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicioClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioClientActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Desarrolado por CM TECHNOLOGIES");

        javax.swing.GroupLayout PantaPrincipalLayout = new javax.swing.GroupLayout(PantaPrincipal);
        PantaPrincipal.setLayout(PantaPrincipalLayout);
        PantaPrincipalLayout.setHorizontalGroup(
            PantaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenedorBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PantaPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnInicioClient, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PantaPrincipalLayout.setVerticalGroup(
            PantaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantaPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ContenedorBtns, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PantaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantaPrincipalLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnUsuarios)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PantaPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInicioClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PantaPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PantaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PantaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
       Clientes clientes = new Clientes ();
       clientes.setVisible(true);
       
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        RegistrarUsuarios usuarios = new RegistrarUsuarios();
        usuarios.setVisible(true);
        
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnVencidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVencidosActionPerformed
         Vencidos ven = new Vencidos();
         ven.setVisible(true);
    }//GEN-LAST:event_btnVencidosActionPerformed

    private void btnDetallesPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesPagosActionPerformed
        InformesPagos ip = new InformesPagos();
        ip.setVisible(true);
    }//GEN-LAST:event_btnDetallesPagosActionPerformed

    private void btnInicioClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioClientActionPerformed
        Login log = new Login();
        log.setVisible(true);     
        this.dispose();
    }//GEN-LAST:event_btnInicioClientActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorBtns;
    private javax.swing.JPanel PantaPrincipal;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnDetallesPagos;
    private javax.swing.JButton btnInicioClient;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVencidos;
    private javax.swing.JPanel containerDetalles;
    private javax.swing.JPanel containerbtnclientes;
    private javax.swing.JPanel containerbtnvencidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}