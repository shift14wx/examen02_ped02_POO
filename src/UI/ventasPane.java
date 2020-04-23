/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import Clases.*;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author raulh
 */
public class ventasPane extends javax.swing.JFrame {

    public ventasPane() {

        initComponents();
        DefaultTableModel mdProveedor = new DefaultTableModel();
        ArrayList<Object> lCabeza = new ArrayList<>();
        lCabeza.add("Cliente");
        lCabeza.add("Producto");
        lCabeza.add("Cantidad");
        lCabeza.add("Vendedor");
        lCabeza.add("Total");
        for (Object object : lCabeza) {
            mdProveedor.addColumn(object);
        }
        tbVentas.setModel(mdProveedor);
        this.SetVendedoresCb();
        this.lblCompras.setText("$" + this.compras + "");
        this.lblVentas.setText("$" + this.ventas);

    }

    void llenarTabla() {

        mdVentas = new DefaultTableModel();
        ArrayList<Object> lCabeza = new ArrayList<>();
        lCabeza.add("Cliente");
        lCabeza.add("Producto");
        lCabeza.add("Cantidad");
        lCabeza.add("Vendedor");
        lCabeza.add("Total");
        for (Object object : lCabeza) {
            mdVentas.addColumn(object);
        }
        tbVentas.setModel(mdVentas);
        tbVentas.setModel(mdVentas);
        lVentas.forEach(rows -> {
            String[] rowsTabla = {
                rows.nombre,
                rows.producto,
                rows.cantidad + "",
                rows.Vendedor,
                rows.total + ""
            };
            mdVentas.addRow(rowsTabla);
        });
        tbVentas.setModel(mdVentas);
    }
    public Double compras = 0.0;
    public Double ventas = 0.0;
    public DefaultTableModel mdVentas;

    public void ActializarCb(String componenteAactualizar) {
        switch (componenteAactualizar) {
            case "cbVendedores":
                this.SetVendedoresCb();
                break;
            case "cbProducto":
                this.setProductosCb();
                this.lblCompras.setText(this.compras + "");
                break;
        }
    }
    ArrayList<Cliente> lClientes = new ArrayList<>();
    ArrayList<Proveedor> lProveedores = new ArrayList<Proveedor>();
    ArrayList<Vendedor> lVendedor = new ArrayList<Vendedor>();
    ArrayList<Producto> lProductos = new ArrayList<Producto>();
    ArrayList<Ventas> lVentas = new ArrayList<Ventas>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbVentas = new javax.swing.JTable();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spCantidad = new javax.swing.JSpinner();
        btnAgregar = new javax.swing.JButton();
        cbVendedores = new javax.swing.JComboBox<>();
        cbProducto = new javax.swing.JComboBox<>();
        jtContacto = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblVentas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCompras = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAñadir = new javax.swing.JMenu();
        jmProductos = new javax.swing.JMenu();
        jmProveedor = new javax.swing.JMenu();
        jmVendedor = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema  Farmacia");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Ventas"));

        tbVentas.setForeground(new java.awt.Color(0, 0, 0));
        tbVentas.setGridColor(new java.awt.Color(255, 255, 255));
        tbVentas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbVentas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(tbVentas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel1.setkEndColor(new java.awt.Color(222, 222, 222));
        kGradientPanel1.setkStartColor(new java.awt.Color(222, 222, 222));
        kGradientPanel1.setkTransparentControls(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("Contacto:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("Producto");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setText("Vendedor");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setText("Cantidad");

        spCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spCantidad.setBorder(null);

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setText("VENDER");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        cbProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProductoItemStateChanged(evt);
            }
        });
        cbProducto.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                cbProductoAncestorResized(evt);
            }
        });
        cbProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbProductoMouseClicked(evt);
            }
        });
        cbProducto.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                cbProductoCaretPositionChanged(evt);
            }
        });
        cbProducto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbProductoPropertyChange(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ventas");

        lblVentas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblVentas.setText("$");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Compras");

        lblCompras.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCompras.setText("$");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(cbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(cbVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentas)
                    .addComponent(lblCompras))
                .addGap(0, 118, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblVentas))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblCompras))
                        .addGap(24, 24, 24))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAgregar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jmAñadir.setText("Añadir");
        jmAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAñadirActionPerformed(evt);
            }
        });

        jmProductos.setText("Productos");
        jmProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmProductosMouseClicked(evt);
            }
        });
        jmProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductosActionPerformed(evt);
            }
        });
        jmAñadir.add(jmProductos);

        jmProveedor.setText("Proveedores");
        jmProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmProveedorMouseClicked(evt);
            }
        });
        jmProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProveedorActionPerformed(evt);
            }
        });
        jmAñadir.add(jmProveedor);

        jmVendedor.setText("Vendedores");
        jmVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmVendedorMouseClicked(evt);
            }
        });
        jmAñadir.add(jmVendedor);

        jMenu1.setText("Clientes");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jmAñadir.add(jMenu1);

        jMenuBar1.add(jmAñadir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmProductosActionPerformed

    private void jmAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmAñadirActionPerformed

    private void jmProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProveedorActionPerformed

    }//GEN-LAST:event_jmProveedorActionPerformed

    private void jmProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmProveedorMouseClicked
        this.showNewModule(0);
    }//GEN-LAST:event_jmProveedorMouseClicked

    private void jmVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmVendedorMouseClicked
        this.showNewModule(2);
    }//GEN-LAST:event_jmVendedorMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        this.showNewModule(1);      // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jmProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmProductosMouseClicked
        this.showNewModule(3);
    }//GEN-LAST:event_jmProductosMouseClicked

    private void cbProductoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbProductoPropertyChange

    }//GEN-LAST:event_cbProductoPropertyChange

    private void cbProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbProductoMouseClicked

    }//GEN-LAST:event_cbProductoMouseClicked

    private void cbProductoAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_cbProductoAncestorResized

    }//GEN-LAST:event_cbProductoAncestorResized

    private void cbProductoCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cbProductoCaretPositionChanged
        System.out.println(this.cbProducto.getSelectedIndex());

    }//GEN-LAST:event_cbProductoCaretPositionChanged

    private void cbProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProductoItemStateChanged
        try {
            System.out.println(this.lProductos.get(this.cbProducto.getSelectedIndex()).cantidad);
            SpinnerModel value = new SpinnerNumberModel(1, 1, this.lProductos.get(this.cbProducto.getSelectedIndex()).cantidad, 1);
            this.spCantidad.setModel(value);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cbProductoItemStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Cliente cliente = new Cliente();
        cliente.nombre = jtNombre.getText();
        cliente.contacto = jtContacto.getText();
        //Verificar que no se repita
        if (lClientes.size() == 0) {
            lClientes.add(cliente);
        }else {
            boolean repetido = false;
            for (int i = 0; i < lClientes.size(); i++) {
                if (cliente.nombre.equals(lClientes.get(i).nombre) && cliente.contacto.equals(lClientes.get(i).contacto)) {
                    repetido =  true;
                }
            }
            if (repetido == false) {
                lClientes.add(cliente);
            }
        }

        if(this.lProductos.get(this.cbProducto.getSelectedIndex()).cantidad>0){
            Double total = Double.parseDouble(this.spCantidad.getValue().toString()) * this.lProductos.get(this.cbProducto.getSelectedIndex()).precio;
            this.ventas += total;
            this.lblVentas.setText(this.ventas+"");
            lVentas.add(
                new Ventas(cliente.nombre, Double.parseDouble(this.spCantidad.getValue().toString()),this.cbVendedores.getSelectedItem().toString(), total+"", this.cbProducto.getSelectedItem().toString())
            );
            this.lProductos.get(this.cbProducto.getSelectedIndex()).cantidad-=Integer.parseInt(this.spCantidad.getValue()+"");

            SpinnerModel value = new SpinnerNumberModel(0, 0, this.lProductos.get(this.cbProducto.getSelectedIndex()).cantidad , 0);
            this.spCantidad.setModel(value);
            this.llenarTabla();
        }else{
            JOptionPane.showMessageDialog(null,"no hay existencia de este producto");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * FUNCTIONS
     */
    /**
     *
     * @param indexModule
     * @return void
     * @throws New window
     */
    void showNewModule(Integer indexModule) {

        switch (indexModule) {

            case 0: // proveedor
                proveedoresPane pp = new proveedoresPane(lProveedores, this);
                pp.setVisible(true);
                break;
            case 1:// cliente
                clientePane cp = new clientePane(lClientes);
                cp.setVisible(true);
                break;
            case 2: // vendedor
                vendedoresPane vp = new vendedoresPane(lVendedor, this);
                vp.setVisible(true);
                break;
            case 3:
                productoPane pProducto = new productoPane(lProveedores, this);
                pProducto.setVisible(true);
                break;
        }

    }

    /**
     * @return void
     * @see "coloca los nombres de los vendedores"
     */
    void SetVendedoresCb() {
        this.cbVendedores.removeAllItems();
        this.lVendedor.forEach(vendedor -> {
            this.cbVendedores.addItem(vendedor.nombre);
        });

    }

    void setProductosCb() {
        this.cbProducto.removeAllItems();
        this.lProductos.forEach(producto -> {
            this.cbProducto.addItem(producto.nombre + "$: " + producto.precio);
        });

    }

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
            java.util.logging.Logger.getLogger(ventasPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventasPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventasPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventasPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventasPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cbProducto;
    private javax.swing.JComboBox<String> cbVendedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu jmAñadir;
    private javax.swing.JMenu jmProductos;
    private javax.swing.JMenu jmProveedor;
    private javax.swing.JMenu jmVendedor;
    private javax.swing.JTextField jtContacto;
    private javax.swing.JTextField jtNombre;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTable tbVentas;
    // End of variables declaration//GEN-END:variables
}