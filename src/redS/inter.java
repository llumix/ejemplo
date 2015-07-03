/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redS;

import java.awt.Component;
import java.awt.event.ComponentListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
/**
 *
 * @author mmoreno
 */
public class inter extends javax.swing.JFrame {

    /**
     * Creates new form inter
     */
    redSeman rs;
    DefaultComboBoxModel cm;
    public inter() {
        initComponents();
        rs=new redSeman();
        cm=new DefaultComboBoxModel();
    }
    
    @SuppressWarnings("unchecked")
    
    public void borrar(){
    
        rs.limpiar();
        String mensaje[]={"nodos"};
        infe.setModel(new javax.swing.DefaultComboBoxModel(mensaje));
        prop.setModel(new javax.swing.DefaultComboBoxModel(mensaje));
        infe.setSelectedIndex(0);
        prop.setSelectedIndex(0);
        
    }

    public void agregarDatos(String informacionl){
   
        char Caracteres[] = informacionl.toCharArray();
        char Aux[] = new char[10];
        ArrayList<String> palabras = new ArrayList<>();
        int ini = 1, c = 0;
        for (int i = 0; i < Caracteres.length; i=i+1) {
            if (Caracteres[i] != ',') {// si el caracter no es coma se va cargando 
                Aux[c] = Caracteres[i];
                c=c+1;
            } else {  // cuandollega a una coma se forma la palabra 
                c = 0;
                String cc = String.valueOf(Aux);
                Aux = new char[10];
                if (ini == 4) {
                    palabras.add(String.valueOf(Caracteres[i - 1]));
                } else {
                    palabras.add(cc);
                }
                ini=ini+1;
            }
        }
        nodored org=new nodored();
        nodored dest=new nodored();
        
        org.setInfor(palabras.get(0));
        dest.setInfor(palabras.get(2));
        
        
        rs.insertarNodored(org);
        rs.insertarNodored(dest);
        rs.insertarRealcion(org, dest, palabras.get(1), Integer.parseInt(palabras.get(3)));
        //mostar.add(palabras);//.setToolTipText(palabras.toString());
    }
    
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCargar = new java.awt.Button();
        label1 = new java.awt.Label();
        btnRel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        prop = new javax.swing.JComboBox();
        infe = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlRd = new javax.swing.JList();
        list1 = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCargar.setLabel("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        label1.setText("Seleccionar Txt:");

        btnRel.setText("Relaciones");
        btnRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelActionPerformed(evt);
            }
        });

        jLabel1.setText("Propiedad");

        jLabel2.setText("inferencia");

        prop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nodos" }));
        prop.setToolTipText("");
        prop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propActionPerformed(evt);
            }
        });

        infe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nodos" }));
        infe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infeActionPerformed(evt);
            }
        });

        jLabel3.setText("Eliminar Relacion:");

        jButton1.setText("Eliminar");

        jlRd.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlRd);

        scrollPane1.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnRel)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(infe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(32, 32, 32)))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnRel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(infe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelActionPerformed
        // TODO add your handling code here:
        
        DefaultListModel lm = new DefaultListModel(); 
        for (nodored nodo : rs.getNodos()) {
            for (relacion arco : nodo.getRelaciones()) {
                lm.addElement(arco.getOrigen().getInfor() + arco.getInfo() + arco.getDest().getInfor());
                //list1.add(arco.toString());
            }
            
        }
        //mostrar.setModel(lm);
        jlRd.setModel(lm);
        
        //list1.addComponentListener((ComponentListener) listModel);
        
    }//GEN-LAST:event_btnRelActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        borrar();
        
        JFileChooser fc = new JFileChooser();
        BufferedReader entrada;
       int respuesta = fc.showOpenDialog(this);  
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            try {
                File archivoElegido = fc.getSelectedFile(); 
               
                entrada = new BufferedReader(new FileReader(archivoElegido));
                String linea; 
                while (entrada.ready()) {
                    linea = entrada.readLine();
                    agregarDatos(linea); 
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "error de sintaxis");

            }
        }
        for(nodored nod:rs.getNodos()){
        
            prop.addItem(nod.getInfor());
            infe.addItem(nod.getInfor());
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void propActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propActionPerformed

        DefaultListModel ls = new DefaultListModel();
        nodored nodo = new nodored();
        nodo.setInfor(prop.getSelectedItem().toString());

        ArrayList<relacion> rel = rs.busquedaAd(nodo);  
        for (relacion a : rel) {
            ls.addElement(nodo.getInfor() + a.getInfo() + a.getDest().getInfor());
            
        }
        jlRd.setModel(ls);
        //mostrar.setModel(ls);
        //jL.setModel(ls);
    }//GEN-LAST:event_propActionPerformed

    private void infeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infeActionPerformed
        DefaultListModel ls = new DefaultListModel();
        nodored nodo = new nodored();
        nodo.setInfor(infe.getSelectedItem().toString());
        ArrayList<relacion> rel = rs.buscaAt(nodo); 
        for (relacion a : rel) {
            ls.addElement(a.getOrigen().getInfor()+a.getInfo()+nodo.getInfor());
        }
        //mostrar.setModel(ls);
        
        //jL.setModel(ls);
    }//GEN-LAST:event_infeActionPerformed

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
            java.util.logging.Logger.getLogger(inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCargar;
    private javax.swing.JButton btnRel;
    private javax.swing.JComboBox infe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList jlRd;
    private java.awt.Label label1;
    private java.awt.List list1;
    private javax.swing.JComboBox prop;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
