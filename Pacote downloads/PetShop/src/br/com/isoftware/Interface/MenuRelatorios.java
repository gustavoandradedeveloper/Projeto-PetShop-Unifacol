
package br.com.isoftware.Interface;

import br.com.isoftware.AcessoBD.AcessoMysql;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Armando
 */
public class MenuRelatorios extends javax.swing.JFrame {

 static String Titulo = "";  
 static int Tipo = 0;   
 
   AcessoMysql mysql = new AcessoMysql();
   
    public MenuRelatorios(){
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Datainicio = new com.toedter.calendar.JDateChooser();
        Datafinal = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar Relatorios");
        setBackground(new java.awt.Color(0, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbTitulo.setText("PET SHOP - MELHOR AMIGO PELUDO");
        lbTitulo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Gerar Relatorio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Data Final:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Data Inicio:");

        Datainicio.setBackground(new java.awt.Color(153, 153, 153));
        Datainicio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Datainicio.setPreferredSize(null);

        Datafinal.setBackground(new java.awt.Color(153, 153, 153));
        Datafinal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Datafinal.setPreferredSize(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ISoftware");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Datainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel2)
                                    .addGap(137, 137, 137))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Datafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Datainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Datafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(666, 403));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public void retatorioVendas(){   
       
         if(Tipo == 1){
            
              try {
              
                     HashMap parametro = new HashMap();
                     parametro.put("Datainicio", new java.sql.Date(Datainicio.getDate().getTime()));
                     parametro.put("Datafim", new java.sql.Date(Datafinal.getDate().getTime()));
                     JasperPrint jp = JasperFillManager.fillReport("../JASoftware/Jasper/VendasAvista.jasper", parametro, mysql.conectar());             
                     JasperExportManager.exportReportToPdfFile(jp, "C:/Users/Armando/Desktop/Vendas Avista.pdf");  
                     JasperViewer jv = new JasperViewer(jp,false); 
                     jv.setVisible(true);
                     jv.setTitle(Titulo);
                    } catch (Exception ex){
                               ex.printStackTrace();
                              }
        
            }else if(Tipo == 2){
                     
                      try {              
                              HashMap parametro = new HashMap();
                              parametro.put("Datainicio", new java.sql.Date(Datainicio.getDate().getTime()));
                              parametro.put("Datafim", new java.sql.Date(Datafinal.getDate().getTime()));
                              JasperPrint jp = JasperFillManager.fillReport("../JASoftware/Jasper/VendasAprazo.jasper", parametro, mysql.conectar());             
                              JasperExportManager.exportReportToPdfFile(jp, "C:/Users/Armando/Desktop/Vendas Aprazo.pdf");  
                              JasperViewer jv = new JasperViewer(jp,false); 
                              jv.setVisible(true);
                              jv.setTitle(Titulo);
                             } catch (Exception ex) {
                                         ex.printStackTrace();
                                       }
                         }else{
                                try {              
                                        HashMap parametro = new HashMap();
                                        parametro.put("Datainicio", new java.sql.Date(Datainicio.getDate().getTime()));
                                        parametro.put("Datafim", new java.sql.Date(Datafinal.getDate().getTime()));
                                        JasperPrint jp = JasperFillManager.fillReport("../JASoftware/Jasper/VendasLanche.jasper", parametro, mysql.conectar());             
                                        JasperExportManager.exportReportToPdfFile(jp, "C:/Users/Armando/Desktop/Vendas Lanches.pdf");  
                                        JasperViewer jv = new JasperViewer(jp,false); 
                                        jv.setVisible(true);
                                        jv.setTitle(Titulo);
                                       } catch (Exception ex) {
                                                  ex.printStackTrace();
                                                 }
                                  }
       
           
     
    } 
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      retatorioVendas();
      dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

  
    public static void main(int tipo , String args){  
        
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
            java.util.logging.Logger.getLogger(MenuRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        Titulo = args;   Tipo = tipo;
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRelatorios().setVisible(true);
                               
;            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Datafinal;
    private com.toedter.calendar.JDateChooser Datainicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
