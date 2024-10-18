/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ajedrez;

import java.util.Stack;

/**
 *
 * @author emmanuel
 */
public class IAjedrez extends javax.swing.JFrame {

    /**
     * Creates new form IAjedrez
     */
    public IAjedrez() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setSize(new java.awt.Dimension(800, 800));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(734, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        
        Tablero t1 = new Tablero(this.getWidth(), this.getHeight());
        t1.dibujar(this.getGraphics(), jPanel1);
        Juego j1 = new Juego();
        //j1.mostrarPiezas();
        Pieza[][] piezas =j1.getPiezas();
        
        t1.dibujar(this.getGraphics(), jPanel1, piezas);
        
        
        
        /*
        imprimirMatriz(piezas);       
        
        
        
        
        
        Movimiento m1 = new Movimiento(j1.getPiezas()[1][0], 2,0);
        Movimiento m2 = new Movimiento(j1.getPiezas()[6][0], 5,0);
        Movimiento m3 = new Movimiento(j1.getPiezas()[0][1], 2,2);
        Movimiento m4 = new Movimiento(j1.getPiezas()[7][1], 5,2);
        
        piezas[2][0] = j1.getPiezas()[1][0];
        piezas[1][0] = new Pieza(1,0);
        j1.getPiezas()[2][0].setPosX(2);
        j1.getPiezas()[2][0].setPosY(0);
        
        
        
        piezas[5][0] = j1.getPiezas()[6][0];
        piezas[6][0] = new Pieza(6,0);
        
        piezas[2][2] = j1.getPiezas()[0][1];
        piezas[0][1] = new Pieza(0,1);
        j1.getPiezas()[2][2].setPosX(2);
        j1.getPiezas()[2][2].setPosY(2);
        
        
        piezas[5][2] = j1.getPiezas()[7][1];
        piezas[7][1] = new Pieza(7,1);
        
        
        imprimirMatriz(piezas);
        Stack<Movimiento> pila = new Stack<Movimiento>();
        pila.push(m1);
        pila.push(m2);
        pila.push(m3);
        pila.push(m4);
        
        
        j1.setPiezas(piezas);
        
       // j1.setMovimientos(pila);
        
        //j1.mostrarMovimientos();
        
        j1.mostrarPiezas();
         
        
        System.out.print(j1.getPiezas()[5][2]);
        */
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(IAjedrez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IAjedrez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IAjedrez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IAjedrez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IAjedrez().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public static void imprimirMatriz(Pieza[][] m){
        System.out.println("_________________________");
        for(int i =0; i<8; i++){
            for(int j =0; j<8; j++){
                System.out.println(m[i][j].getNombre() 
                        + m[i][j].getPosX() +","+ m[i][j].getPosY());
            }
        }
         System.out.println("_________________________");
    }

}


