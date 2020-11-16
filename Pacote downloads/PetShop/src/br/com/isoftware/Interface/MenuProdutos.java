/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isoftware.Interface;

import br.com.isoftware.Calendario.calendario;
import br.com.isoftware.beans.Fornecedorbeans;
import br.com.isoftware.beans.Produtosbeans;
import br.com.isoftware.control.PessoasControl;
import br.com.isoftware.control.Produtoscontrol;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Armando
 */
public class MenuProdutos extends javax.swing.JFrame {

   
    public MenuProdutos() {
        initComponents();
        cbFornecedores.removeAllItems();
    }
    
   ListSelectionModel lsmClientes; 
   ArrayList<Produtosbeans> listObjForm = new ArrayList();
   Produtosbeans ObjBeans = new Produtosbeans();
   int salvar, op = 0;
      
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoPessoa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncionarios = new javax.swing.JTable();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btAtualisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new JFormattedTextField(NumberFormat.getInstance());
        txtDescicao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtQuantidade = new JFormattedTextField(NumberFormat.getInstance());
        jLabel12 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        cbFornecedores = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ATcadasClientes = new javax.swing.JMenuItem();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU FORNECEDOR");

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 680));

        tbFuncionarios.setBackground(new java.awt.Color(153, 153, 153));
        tbFuncionarios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tbFuncionarios.setModel(tmFuncionaros);
        tbFuncionarios.setRowHeight(30);
        tbFuncionarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmClientes = tbFuncionarios .getSelectionModel();
        lsmClientes.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {

                if(! e.getValueIsAdjusting() ){

                    tbFuncionarioLinhaSelecionada(tbFuncionarios);

                }
            }
        });
        jScrollPane1.setViewportView(tbFuncionarios);

        btNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Novoprod_1.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Salvarprod_1.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setEnabled(false);
        btSalvar.setFocusCycleRoot(true);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btAtualisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAtualisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Atualisarprod_1.png"))); // NOI18N
        btAtualisar.setText("Atualisar");
        btAtualisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualisarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Excluirprod_1.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ISoftware");
        jLayeredPane2.add(jLabel1);
        jLabel1.setBounds(900, 40, 180, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("PET SHOP - MELHOR AMIGO PELUDO");
        jLayeredPane2.add(jLabel2);
        jLabel2.setBounds(10, 0, 750, 44);

        txtValor.setEditable(false);
        txtValor.setBackground(new java.awt.Color(153, 153, 153));
        txtValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtDescicao.setEditable(false);
        txtDescicao.setBackground(new java.awt.Color(153, 153, 153));
        txtDescicao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Descrição:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Preço:");

        txtQuantidade.setBackground(new java.awt.Color(153, 153, 153));
        txtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Quantidade");

        txtPesquisar.setBackground(new java.awt.Color(153, 153, 153));
        txtPesquisar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/pesquisar.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        cbFornecedores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbFornecedores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbFornecedores.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Fornededores:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAtualisar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtDescicao, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtQuantidade))))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane2)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 575, Short.MAX_VALUE)
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAtualisar, btCancelar, btExcluir, btNovo, btSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAtualisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAtualisar, btCancelar, btExcluir, btNovo, btSalvar});

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
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem4.setText("Calculadora");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem5.setText("Calendário");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1116, 718));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     DefaultTableModel tmFuncionaros = new DefaultTableModel(null, new String[]{"Fornecedor", "Descrição", "Preço", "Quantidade"});     
     
      private void limparcampos() {
          
                 txtDescicao.setText("");
                 txtValor.setText("");                 
                 txtQuantidade.setText("");
    }
    
    private void camposhabilitados() {
                 
                 txtValor.setEditable(true);
                 txtQuantidade.setEditable(true);                
                 txtDescicao.setEditable(true);
                 cbFornecedores.setEnabled(true);
                 carregaCB();
    }

    private void desabilitados() {
                
                 txtValor.setEditable(false);
                 txtQuantidade.setEditable(false);
                 txtDescicao.setEditable(false);
                 cbFornecedores.setEnabled(false);
    }
    
    private void carregaCB(){
    
        if(cbFornecedores.getSelectedIndex() == -1){
            
            PessoasControl   forn = new PessoasControl();

            ArrayList<Fornecedorbeans> listObjForm = forn.listarFornecedores("%" + txtPesquisar.getText().trim() + "%");
            for (Fornecedorbeans listObjForm1 : listObjForm) {
                cbFornecedores.addItem(listObjForm1.getEmpresa());
            }
        }
    }
    
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
    
    
    private void ATcadasProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATcadasProdutosActionPerformed
        visualisaProdutos();
    }//GEN-LAST:event_ATcadasProdutosActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         
        try {
                Runtime.getRuntime().exec("calc.exe");
               } catch (IOException ex) {
                          ex.printStackTrace();
                         }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void ATcadasClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATcadasClientesActionPerformed
        visualisaClientes();
    }//GEN-LAST:event_ATcadasClientesActionPerformed

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

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
         JOptionPane.showMessageDialog(null, "SISTEMA DESENVOLVIDO POR ISOFTWARE LTDA.");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void miVendasavistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendasavistaActionPerformed
        String args = "Relatorio de vendas Avista";
        Relatorios.main(1 , args);
        dispose();
    }//GEN-LAST:event_miVendasavistaActionPerformed

    private void miVendasaprazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendasaprazoActionPerformed
        String args = "Relatorio de vendas Aprazo";
        Relatorios.main(2 , args);
        dispose();
    }//GEN-LAST:event_miVendasaprazoActionPerformed

    private void miVendaslanchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaslanchesActionPerformed
        String args ="Relatorio de vendas de Lanchas";
        Relatorios.main(3 , args);
        dispose();
    }//GEN-LAST:event_miVendaslanchesActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        listarProduto();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        while (tmFuncionaros.getRowCount() > 0) {
            tmFuncionaros.removeRow(0);
        }
        limparcampos();
        salvar = 0;
        op = 0;
        btAtualisar.setEnabled(true);
        btNovo.setEnabled(true);
        btPesquisar.setEnabled(true);
        txtPesquisar.setEditable(true);
        tbFuncionarios.setEnabled(true);
        btSalvar.setEnabled(false);
        desabilitados();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAtualisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualisarActionPerformed

        if (op == 0 || op == 2) {
            op = 2;
            salvar = 2;
            AlterarProduto();
        }
    }//GEN-LAST:event_btAtualisarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (salvar == 1) {

            cadastraProduto();
            op = 0;
            txtPesquisar.setEditable(true);
            btPesquisar.setEnabled(true);
            tbFuncionarios.setEnabled(true);
        }
        else if (salvar == 2) {

            atualisarProduto();
            listarProduto();
            limparcampos();
            op = 0;
        }
        btAtualisar.setEnabled(true);
        btNovo.setEnabled(true);
        btPesquisar.setEnabled(true);
        txtPesquisar.setEditable(true);
        tbFuncionarios.setEnabled(true);
        btSalvar.setEnabled(false);
        desabilitados();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed

        while (tmFuncionaros.getRowCount() > 0) {
            tmFuncionaros.removeRow(0);
        }
        if (op == 0 || op == 1) {
            op = 1;
            salvar = 1;

            btAtualisar.setEnabled(false);
            btSalvar.setEnabled(true);
            btPesquisar.setEnabled(false);
            tbFuncionarios.setEnabled(false);
            novoProduto();
        }
    }//GEN-LAST:event_btNovoActionPerformed
    
    MenuRelatorios Relatorios; 
     private void novoProduto() {
              carregaCB();
              cbFornecedores.setSelectedIndex(0);
              camposhabilitados();
              }
    
      private boolean testarcampos() {

            if (!txtDescicao.getText().trim().equals("")  && !txtValor.getText().trim().equals("") && !txtQuantidade.getText().trim().equals("")){
                         return true;
              }
              JOptionPane.showMessageDialog(this, "OBSERVE SE OS CAMPOS FORAM PREENCHIDOS CORRETAMENTE !!!");
              return false;
       }
    
     private void cadastraProduto(){

        if ( testarcampos() ) {
            
            ObjBeans = new Produtosbeans();
            Produtoscontrol forn = new Produtoscontrol();
            
            ObjBeans.setDescricao(txtDescicao.getText().trim());          
            ObjBeans.setValor(txtValor.getText().trim());
            ObjBeans.setQuantidade(txtQuantidade.getText().trim());
            ObjBeans.setFornecedorPK(cbFornecedores.getSelectedIndex() +1);
            forn.cadastraProduto(ObjBeans);
            desabilitados();
            limparcampos();
            
            JOptionPane.showMessageDialog(this, "FUNCIONARIO CADASTRADO COM EXITO !!!");
           }
        
    }
    
    
      private void atualisarProduto(){

        if (testarcampos()){          
            
            Produtoscontrol forn = new Produtoscontrol();
                        
            ObjBeans.setDescricao(txtDescicao.getText());            
            ObjBeans.setValor(txtValor.getText());
            ObjBeans.setQuantidade(txtQuantidade.getText());
            ObjBeans.setFornecedorPK(cbFornecedores.getSelectedIndex() +1);
            ObjBeans.setCodigo(listObjForm.get(tbFuncionarios.getSelectedRow()).getCodigo());
            
            forn.atualisarProduto(ObjBeans);
           
            desabilitados();
            limparcampos();
            JOptionPane.showMessageDialog(this, "FUNCIONARIO ATUALISADO COM EXITO !!!");
        }
      }
     
     private void AlterarProduto() {

        if (tbFuncionarios.getSelectedRow() != -1) {
                camposhabilitados();
                btNovo.setEnabled(false);
                tbFuncionarios.setEnabled(false);
                btSalvar.setEnabled(true);           
            }
             else 
                 {
                 JOptionPane.showMessageDialog(this, "SELECIONE UM FUNCIONARIO !!!");
                 }
          }    
    
 private void listarProduto() {

            Produtoscontrol   forn = new Produtoscontrol();

            listObjForm = forn.listaProdutos("%" + txtPesquisar.getText().trim() + "%");
            carregaCB();
            visualizarProdutos(listObjForm);

        }
       
  private void visualizarProdutos(ArrayList<Produtosbeans > Produtos) {

        while (tmFuncionaros.getRowCount() > 0) {
                tmFuncionaros.removeRow(0);
                }

        String[] campos = new String[]{null, null, null, null};

        if (Produtos.isEmpty()) {
            
                txtPesquisar.setText("");
                JOptionPane.showMessageDialog(null, "NENHUM FUNCIONARIO ENCONTRADO!!!");
           }
           else {

                for (int i = 0; i < Produtos.size(); i++) {

                        tmFuncionaros.addRow(campos);
                        tmFuncionaros.setValueAt(Produtos.get(i).getCodigo(), i, 0);
                        tmFuncionaros.setValueAt(Produtos.get(i).getDescricao(), i, 1);
                        tmFuncionaros.setValueAt(Produtos.get(i).getValor(), i, 2);
                        tmFuncionaros.setValueAt(Produtos.get(i).getQuantidade(), i, 3);
                    }

               }
       }     
      
     private void tbFuncionarioLinhaSelecionada(JTable tb) {      
       
         if (tb.getSelectedRow() != -1) {
             
                    txtDescicao.setText(listObjForm.get(tb.getSelectedRow()).getDescricao());
                    txtValor.setText(listObjForm.get(tb.getSelectedRow()).getValor());                 
                    txtQuantidade.setText(listObjForm.get(tb.getSelectedRow()).getQuantidade());
                    cbFornecedores.setSelectedIndex(listObjForm.get(tb.getSelectedRow()).getFornecedorPK() -1);
                    desabilitados();                     
                } 
                 else { 

                        limparcampos();
                       }
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
            java.util.logging.Logger.getLogger(MenuProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuProdutos().setVisible(true);
            }
        });
        
   
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ATcadasClientes;
    private javax.swing.JMenuItem ATcadasProdutos;
    private javax.swing.ButtonGroup TipoPessoa;
    private javax.swing.JButton btAtualisar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbFornecedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem miVendasaprazo;
    private javax.swing.JMenuItem miVendasavista;
    private javax.swing.JMenuItem miVendaslanches;
    private javax.swing.JTable tbFuncionarios;
    private javax.swing.JTextField txtDescicao;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
