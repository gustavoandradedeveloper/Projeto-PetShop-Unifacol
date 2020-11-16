/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isoftware.Interface;

import br.com.isoftware.Calendario.calendario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando
 */
public class MenuPrincipal extends javax.swing.JFrame {

   
    public MenuPrincipal() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        BTprodutos = new javax.swing.JButton();
        BTvendas = new javax.swing.JButton();
        BTfuncionarios = new javax.swing.JButton();
        BTclientes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTdespesas = new javax.swing.JButton();
        BTrelatorios = new javax.swing.JButton();
        BTmovimentacao = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ATcadasClientes = new javax.swing.JMenuItem();
        ATcadasFuncionarios = new javax.swing.JMenuItem();
        ATcadasProdutos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        miVendasavista = new javax.swing.JMenuItem();
        miVendasaprazo = new javax.swing.JMenuItem();
        miVendaslanches = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BTprodutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTprodutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Produtos1.png"))); // NOI18N
        BTprodutos.setText("Produtos");
        BTprodutos.setMaximumSize(new java.awt.Dimension(200, 110));
        BTprodutos.setMinimumSize(new java.awt.Dimension(200, 110));
        BTprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTprodutosActionPerformed(evt);
            }
        });
        jLayeredPane1.add(BTprodutos);
        BTprodutos.setBounds(440, 260, 230, 110);

        BTvendas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTvendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Conpras1.png"))); // NOI18N
        BTvendas.setText("Vendas");
        BTvendas.setMaximumSize(new java.awt.Dimension(200, 110));
        BTvendas.setMinimumSize(new java.awt.Dimension(200, 110));
        BTvendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTvendasActionPerformed(evt);
            }
        });
        jLayeredPane1.add(BTvendas);
        BTvendas.setBounds(440, 70, 230, 110);

        BTfuncionarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTfuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Funcionarios1.png"))); // NOI18N
        BTfuncionarios.setText("Funcionarios");
        BTfuncionarios.setMaximumSize(new java.awt.Dimension(200, 110));
        BTfuncionarios.setMinimumSize(new java.awt.Dimension(200, 110));
        BTfuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTfuncionariosActionPerformed(evt);
            }
        });
        jLayeredPane1.add(BTfuncionarios);
        BTfuncionarios.setBounds(120, 320, 230, 110);

        BTclientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Cliente.png"))); // NOI18N
        BTclientes.setText("Clientes");
        BTclientes.setMaximumSize(new java.awt.Dimension(200, 110));
        BTclientes.setMinimumSize(new java.awt.Dimension(200, 110));
        BTclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTclientesActionPerformed(evt);
            }
        });
        jLayeredPane1.add(BTclientes);
        BTclientes.setBounds(120, 40, 230, 110);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Fornecedores.png"))); // NOI18N
        jButton1.setText("FORNECEDORES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(120, 180, 230, 110);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ISoftware");
        jLayeredPane2.add(jLabel1);
        jLabel1.setBounds(760, 90, 260, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("PET SHOP - MELHOR AMIGO PELUDO");
        jLayeredPane2.add(jLabel2);
        jLabel2.setBounds(70, 10, 870, 58);

        BTdespesas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTdespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/lucro1.png"))); // NOI18N
        BTdespesas.setText("Despesas");
        BTdespesas.setMaximumSize(new java.awt.Dimension(200, 110));
        BTdespesas.setMinimumSize(new java.awt.Dimension(200, 110));
        BTdespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTdespesasActionPerformed(evt);
            }
        });

        BTrelatorios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTrelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Relatorios1.png"))); // NOI18N
        BTrelatorios.setText("Relatorios");

        BTmovimentacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTmovimentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Dinheiro1.png"))); // NOI18N
        BTmovimentacao.setText("Movimentação");
        BTmovimentacao.setMaximumSize(new java.awt.Dimension(200, 110));
        BTmovimentacao.setMinimumSize(new java.awt.Dimension(200, 110));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTdespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTrelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTmovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(BTdespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(BTrelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(BTmovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Cadastras");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ATcadasClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        ATcadasClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATcadasClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/atalho1.png"))); // NOI18N
        ATcadasClientes.setText("Clientes");
        ATcadasClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATcadasClientesActionPerformed(evt);
            }
        });
        jMenu1.add(ATcadasClientes);

        ATcadasFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        ATcadasFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATcadasFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/atalho.png"))); // NOI18N
        ATcadasFuncionarios.setText("Funcionários");
        ATcadasFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATcadasFuncionariosActionPerformed(evt);
            }
        });
        jMenu1.add(ATcadasFuncionarios);

        ATcadasProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        ATcadasProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATcadasProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/atalho3.png"))); // NOI18N
        ATcadasProdutos.setText("Produtos");
        ATcadasProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATcadasProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(ATcadasProdutos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Utilitarios");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Calculadora");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Calendário");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setText("Sobre o Sistema");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatorios");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenu4.setText("Vendas");

        miVendasavista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        miVendasavista.setText("Vendas Avista");
        miVendasavista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendasavistaActionPerformed(evt);
            }
        });
        jMenu4.add(miVendasavista);

        miVendasaprazo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.ALT_MASK));
        miVendasaprazo.setText("Vendas Aprazo");
        miVendasaprazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendasaprazoActionPerformed(evt);
            }
        });
        jMenu4.add(miVendasaprazo);

        miVendaslanches.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        miVendaslanches.setText("Vendas Lanches");
        miVendaslanches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaslanchesActionPerformed(evt);
            }
        });
        jMenu4.add(miVendaslanches);

        jMenu3.add(jMenu4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(1116, 718));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    MenuClientes Clientes;  
      
      private void visualisaClientes(){
    
         if(Clientes == null){  
            
            Clientes = new MenuClientes();           
            Clientes.setVisible(true);  
         
            }
            else{ 
                  
                  Clientes.setVisible(true);
                  Clientes.setState(JFrame.NORMAL);              
                 } 
    
    }
     
      MenuVendas Vendas;    
 
      private void visualisaVendas(){
    
         if(Vendas == null){
         
             Vendas = new MenuVendas();
             Vendas.setVisible(true);        
             }
             else{
                 Vendas.setVisible(true); 
                  Vendas.setState(JFrame.NORMAL);
                  } 
    
    }
       
      MenuFuncionarios Funcionarios;    
 
      private void visualisaFuncionarios(){
    
         if(Funcionarios == null){
         
            Funcionarios = new MenuFuncionarios();
            Funcionarios.setVisible(true);         
            }
         else{
              Funcionarios.setVisible(true);
              Funcionarios.setState(JFrame.NORMAL);
              } 
    
    }
     MenuFornecedor Fornecedores;  
      
    private void visualisaFornecedores(){
    
         if(Fornecedores == null){
         
            Fornecedores = new MenuFornecedor();
            Fornecedores.setVisible(true);         
            }
         else{
              Fornecedores.setVisible(true);
              Fornecedores.setState(JFrame.NORMAL);
              } 
    
    }  
     MenuProdutos Produtos;    
 
      private void visualisaProdutos(){
    
         if(Produtos == null){
         
            Produtos = new MenuProdutos();
            Produtos.setVisible(true);         
            }
         else{
              Produtos.setVisible(true);
              Produtos.setState(JFrame.NORMAL);
              } 
    
    }  
    
    private void ATcadasClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATcadasClientesActionPerformed
       visualisaClientes();
    }//GEN-LAST:event_ATcadasClientesActionPerformed

    private void ATcadasFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATcadasFuncionariosActionPerformed
        visualisaFuncionarios();
    }//GEN-LAST:event_ATcadasFuncionariosActionPerformed

    private void ATcadasProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATcadasProdutosActionPerformed
        visualisaProdutos(); 
    }//GEN-LAST:event_ATcadasProdutosActionPerformed

    private void BTclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTclientesActionPerformed
       visualisaClientes();
    }//GEN-LAST:event_BTclientesActionPerformed

    private void BTfuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTfuncionariosActionPerformed
        visualisaFuncionarios();
    }//GEN-LAST:event_BTfuncionariosActionPerformed

    private void BTvendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTvendasActionPerformed
         visualisaVendas();
    }//GEN-LAST:event_BTvendasActionPerformed

    private void BTprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTprodutosActionPerformed
       visualisaProdutos();
    }//GEN-LAST:event_BTprodutosActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         try {
            Runtime.getRuntime().exec("calc.exe");
        } catch (IOException ex) {
            Logger.getLogger(MenuClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
         JOptionPane.showMessageDialog(null, "SISTEMA DESENVOLVIDO POR ISOFTWARE LTDA.");
    }//GEN-LAST:event_jMenuItem6ActionPerformed
        calendario calendar;  
      
      private void visualisaCalendario(){
    
         if(calendar == null){  
            
            calendar = new calendario();           
            calendar.setVisible(true);  
         
            }
            else{ 
                  
                  calendar.setVisible(true);
                  calendar.setState(JFrame.NORMAL);              
                 } 
    
    }
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        visualisaCalendario();
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    
    MenuRelatorios Relatorios; 
    
    private void miVendasavistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendasavistaActionPerformed
        String args = "Relatorio de vendas Avista";
        Relatorios.main(1 , args);
      
    }//GEN-LAST:event_miVendasavistaActionPerformed

    private void miVendasaprazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendasaprazoActionPerformed
        String args = "Relatorio de vendas Aprazo";
        Relatorios.main(2 , args);
      
    }//GEN-LAST:event_miVendasaprazoActionPerformed

    private void miVendaslanchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaslanchesActionPerformed
        String args ="Relatorio de vendas de Lanchas";
        Relatorios.main(3 , args);
       
    }//GEN-LAST:event_miVendaslanchesActionPerformed

    MenuDespesas despesas;
    
     private void visualisaDespesas(){
    
         if(despesas == null){  
            
            despesas = new MenuDespesas();           
            despesas.setVisible(true);  
         
            }
            else{ 
                  
                  despesas.setVisible(true);
                  despesas.setState(JFrame.NORMAL);              
                 } 
    
    }
    
    private void BTdespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTdespesasActionPerformed
        visualisaDespesas();
    }//GEN-LAST:event_BTdespesasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        visualisaFornecedores();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    
   
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        
  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ATcadasClientes;
    private javax.swing.JMenuItem ATcadasFuncionarios;
    private javax.swing.JMenuItem ATcadasProdutos;
    private javax.swing.JButton BTclientes;
    private javax.swing.JButton BTdespesas;
    private javax.swing.JButton BTfuncionarios;
    private javax.swing.JButton BTmovimentacao;
    private javax.swing.JButton BTprodutos;
    private javax.swing.JButton BTrelatorios;
    private javax.swing.JButton BTvendas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem miVendasaprazo;
    private javax.swing.JMenuItem miVendasavista;
    private javax.swing.JMenuItem miVendaslanches;
    // End of variables declaration//GEN-END:variables
}
