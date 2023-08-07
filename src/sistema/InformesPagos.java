
package sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

public class InformesPagos extends javax.swing.JFrame {
    ConexionMysql con = new ConexionMysql();
    Connection cn = con.conectar();
    DefaultTableModel tablemodel;
    public InformesPagos() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Icono del JFrame
        setIconImage(new ImageIcon(getClass().getResource("/images/ballet.png")).getImage());
        mostrarDatos();
        poputMenu();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalles = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnInicioUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Informes de Pagos ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Listado de pagos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        tablaDetalles = new javax.swing.JTable(){
            public boolean isCellEditable (int rowIndex,int colIndex){
                return false;
            }
        };
        tablaDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaDetalles.setFocusable(false);
        tablaDetalles.getTableHeader().setResizingAllowed(false);
        tablaDetalles.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaDetalles);

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        btnInicioUser.setBackground(new java.awt.Color(255, 255, 255));
        btnInicioUser.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnInicioUser.setForeground(new java.awt.Color(255, 255, 255));
        btnInicioUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-atras (1).png"))); // NOI18N
        btnInicioUser.setContentAreaFilled(false);
        btnInicioUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicioUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioUserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Desarrolado por CM TECHNOLOGIES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(194, 194, 194)
                        .addComponent(btnInicioUser)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInicioUser)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnInicioUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioUserActionPerformed
     
        this.dispose();
    }//GEN-LAST:event_btnInicioUserActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        String [] titulos = {"ID Pago","ID Cliente","Fecha de pago","Fecha de Vencimiento","Monto","Comentarios"};
        String registros []= new String [50];
        String sql="select * from detalles_pagos WHERE comentarios LIKE '%"+txtBuscar.getText()+"%'";

        DefaultTableModel model = new DefaultTableModel(null,titulos);

        try {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registros[0]=rs.getString("Id_detalle_Pago");
                registros[1]=rs.getString("ID_cliente");
                registros[2]=rs.getString("fecha_pago");
                registros[3]=rs.getString("fecha_vencimiento");
                registros[4]=rs.getString("monto");
                registros[5]=rs.getString("comentarios");
                model.addRow(registros);
            }
            tablaDetalles.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar: "+e);
        }
    }//GEN-LAST:event_txtBuscarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicioUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaDetalles;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatos() {
         DefaultTableModel modelo = new DefaultTableModel ();
         modelo.addColumn("ID Pago");
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Fecha de pago");
        modelo.addColumn("Fecha de vencimiento");
        modelo.addColumn("Monto");
        modelo.addColumn("Comentarios");
        tablaDetalles.setModel(modelo);
        String consultasql = "select*from detalles_pagos";
        String data[]=new String [6];
        
        Statement st;
        try {
         st=(Statement) cn.createStatement();
         ResultSet rs=st.executeQuery(consultasql);
            while (rs.next()) {                
                data[0]=rs.getString(1);
                data[1]=rs.getString(2);
                data[2]=rs.getString(3);
                data[3]=rs.getString(4);
                data[4]=rs.getString(5);
                data[5]=rs.getString(6);
                modelo.addRow(data);
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
            
        }
        
    }  
    
    public int eliminarRegistro(String nc){
        int res =0;
        String sql = "delete from detalles_pagos where Id_detalle_Pago = "+nc;
        try {
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
            res=ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "INFORME DE PAGO ELIMINADO","Eliminar",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar informe: "+e);
        }
        return res;
    }
   
    public void poputMenu(){
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem eliminar = new JMenuItem("Eliminar", new ImageIcon(getClass().getResource("/images/compartimiento.png")));
        JMenuItem imprimir = new JMenuItem("Imprimir Recibo", new ImageIcon(getClass().getResource("/images/impresora.png")));
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int res = 0;
                int row = tablaDetalles.getSelectedRow();
                int fila =tablaDetalles.getSelectedRowCount();
           if(fila<1){
            JOptionPane.showMessageDialog(null, "Seleccione un informe de la tabla","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }else{
            res= eliminarRegistro(tablaDetalles.getValueAt(row, 0).toString());
            if(res>0){
                mostrarDatos();
            }
        }
            }
        });
        
        imprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fila = tablaDetalles.getSelectedRow();
                try {
                    String fechapago , nombre,descripcion,monto;
                    
                    if(fila==-1){
                       JOptionPane.showMessageDialog(null, "Seleccione un informe para imprimir");
                    }else{
                        tablemodel = (DefaultTableModel) tablaDetalles.getModel();
                        fechapago = tablaDetalles.getValueAt(fila, 2).toString();
                        nombre= tablaDetalles.getValueAt(fila, 5).toString();
                        descripcion=tablaDetalles.getValueAt(fila, 3).toString();
                        monto=tablaDetalles.getValueAt(fila, 4).toString(); 
                        Recibo rc = new Recibo ();
                        rc.txtFecha.setText(fechapago);
                        rc.txtnameR.setText(nombre);
                        rc.txtDescripcion.setText("PAGO DE CUOTA DE LA FECHA : "+descripcion);
                        rc.txtMontoR.setText(monto);
                        rc.setVisible(true);
                    }  
                } catch (Exception p) {
                    JOptionPane.showMessageDialog(null, "NO SE PUDO IMPRIMIR");
                    System.out.println("No se pudo Imprimir"+p);
                }
                
            }
        });
        popupMenu.add(eliminar);
        popupMenu.add(imprimir);
        tablaDetalles.setComponentPopupMenu(popupMenu);
    }
    
}
