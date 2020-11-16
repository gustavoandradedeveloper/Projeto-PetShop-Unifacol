
package br.com.isoftware.Interface;

import br.com.isoftware.Calendario.calendario;
import br.com.isoftware.beans.Despesasbeans;
import br.com.isoftware.beans.Produtosbeans;
import br.com.isoftware.control.Despesascontrol;
import br.com.isoftware.control.Produtoscontrol;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Armando
 */
public class MenuDespesas extends javax.swing.JFrame {

   
    ListSelectionModel lsmProdutos; 
    ArrayList<Despesasbeans> listProdutos;  
    Produtosbeans Produtos;
    int salvar, op = 0;
 
 DefaultTableModel  tmDespesas = new DefaultTableModel(null, new String[]{"Cliente","Peso","Quantidade","Total","Data Venda"}); 
   
  
    public MenuDespesas() {
        initComponents();   
        camposhabilitados();
    }
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selecao = new javax.swing.ButtonGroup();
        despesa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btAtualisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDespesas = new javax.swing.JTable();
        btPesquisar = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        cbDespesas = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtDevolucao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtValorrecebido = new javax.swing.JTextField();
        txtValorpago = new javax.swing.JTextField();
        rbDespesa = new javax.swing.JRadioButton();
        rbDespesaeventual = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ATcadasClientes = new javax.swing.JMenuItem();
        ATcadasFuncionarios = new javax.swing.JMenuItem();
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
        setTitle("MENU PRODUTOS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/JASoftware/Imagens/Novoprod_1.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/JASoftware/Imagens/Salvarprod_1.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setEnabled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btAtualisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAtualisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/JASoftware/Imagens/Atualisarprod_1.png"))); // NOI18N
        btAtualisar.setText("Atualisar");
        btAtualisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualisarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/JASoftware/Imagens/Excluirprod_1.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/JASoftware/Imagens/Cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Valor Pago:");

        tbDespesas.setBackground(new java.awt.Color(153, 153, 153));
        tbDespesas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tbDespesas.setModel(tmDespesas);
        tbDespesas.setRowHeight(30);
        jScrollPane1.setViewportView(tbDespesas);

        btPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/JASoftware/Imagens/pesquisar.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("J . A Softwera");
        jLayeredPane2.add(jLabel1);
        jLabel1.setBounds(900, 40, 180, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("PET SHOP - MELHOR AMIGO PELUDO");
        jLayeredPane2.add(jLabel2);
        jLabel2.setBounds(10, 0, 750, 44);

        txtDescricao.setBackground(new java.awt.Color(153, 153, 153));
        txtDescricao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        cbDespesas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cbDespesas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ovos ", "Leite", "Açucar", "Agua", "Luz ", "Telefone", "Gasolina", "Compras", " " }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Valor Recebido:");

        txtDevolucao.setBackground(new java.awt.Color(153, 153, 153));
        txtDevolucao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Devolução:");

        txtValorrecebido.setBackground(new java.awt.Color(153, 153, 153));
        txtValorrecebido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtValorpago.setBackground(new java.awt.Color(153, 153, 153));
        txtValorpago.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        despesa.add(rbDespesa);
        rbDespesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbDespesa.setText("Despesa :");
        rbDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDespesaActionPerformed(evt);
            }
        });

        despesa.add(rbDespesaeventual);
        rbDespesaeventual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbDespesaeventual.setText("Despesa Eventual:");
        rbDespesaeventual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDespesaeventualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btAtualisar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbDespesa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbDespesas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbDespesaeventual)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtValorpago, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtValorrecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(207, 207, 207))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addComponent(btPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbDespesa)
                            .addComponent(rbDespesaeventual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorrecebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValorpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualisar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenu1.setText("Cadastras");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ATcadasClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        ATcadasClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATcadasClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/JASoftware/Imagens/atalho1.png"))); // NOI18N
        ATcadasClientes.setText("Clientes");
        ATcadasClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATcadasClientesActionPerformed(evt);
            }
        });
        jMenu1.add(ATcadasClientes);

        ATcadasFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        ATcadasFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATcadasFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/JASoftware/Imagens/atalho.png"))); // NOI18N
        ATcadasFuncionarios.setText("Funcionários");
        ATcadasFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATcadasFuncionariosActionPerformed(evt);
            }
        });
        jMenu1.add(ATcadasFuncionarios);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1116, 718));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        public void limparcampos(){
        
               txtValorrecebido.setText("");
               txtValorpago.setText(""); 
               txtDescricao.setText(""); 
               txtDevolucao.setText("");
                            
                      
        }
     
      private void camposhabilitados() {

          if(rbDespesa.isSelected() == true){
              
                txtDescricao.setEditable(true);
                txtValorpago.setEditable(true); 
                txtDevolucao.setEditable(false);
                txtValorrecebido.setEditable(false);
                cbDespesas.setEnabled(true);
                
               }else if(rbDespesaeventual.isSelected() == true && tbDespesas.getSelectedRow() != -1 ){
                         
                         txtDevolucao.setEditable(true);
                         txtValorrecebido.setEditable(true);
                         txtDescricao.setEditable(false);
                         txtValorpago.setEditable(false);
                         cbDespesas.setEnabled(false);
                        }else{
                                 JOptionPane.showMessageDialog(null, "SECIONE UM INDICE !!!");
                                 rbDespesa.setSelected(true);
                               }
                
    }
 

    private void desabilitados() {        
        
                 txtValorrecebido.setEditable(false);
                 txtValorpago.setEditable(false);
                 txtDevolucao.setEditable(false);
                 txtDescricao.setEditable(false);                 
               
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
      
       private boolean testarcampos() {

      if (!txtValorpago.getText().trim().equals("")){
          
                   return true;
                  }
                  JOptionPane.showMessageDialog(this, "OBSERVE SE OS CAMPOS FORAM PREENCHIDOS CORRETAMENTE !!!");
                  return false;
          }
      
       private void cadastraDespesasRecebimentos(){

        if (rbDespesa.isSelected() == true ){
           
            if(cbDespesas.getSelectedIndex() != 0 && !txtDescricao.getText().equals("") && !txtValorpago.getText().replace(",","").equals("")){
            
                  /*
                   Produtosbeans  pro = new Produtosbeans();                     
                   pro.setPeso(txtPeso.getText());           
                   pro.setValor(txtValorpago.getText()); 
                   pro.setValorrevenda(txtValorrevenda.getText());
                   Produtoscontrol prod = new Produtoscontrol();
                   prod.cadastraProduto(pro);
                   desabilitados();
                   limparcampos();
               */
                   JOptionPane.showMessageDialog(this, "Pagamentos CADASTRADO COM EXITO !!!");            
                 }
           
           
           }else if (rbDespesa.isSelected() == true ) {                       
                    
                     JOptionPane.showMessageDialog(this, "Recebimentos CADASTRADO COM EXITO !!!");
         
                   }else {
                            JOptionPane.showMessageDialog(this, "OBSERVE SE OS CAMPOS FORAM PREENCHIDOS CORRETAMENTE !!!");
                           }

  }
       
    private void listaProduto() {

          Despesascontrol prod = new Despesascontrol();         
        
                listProdutos = prod.listaDebitos();             
                 limparcampos();
             visualizarProdutos(listProdutos);
    }
     
    private void visualizarProdutos(List<Despesasbeans> despesas ) {

        while (tmDespesas.getRowCount() > 0) {
                tmDespesas.removeRow(0);
        }

        String[] campos = new String[]{null, null,null,null,null};
       

        if (despesas.isEmpty()) {
           
              JOptionPane.showMessageDialog(null, "NENHUM PORDUTO ENCONTRADO !!!");

           } else {          
                 
                 for (int i = 0; i < despesas.size(); i++) {

                      tmDespesas.addRow(campos);
                      tmDespesas.setValueAt(despesas.get(i).getCliente(), i, 0);
                      tmDespesas.setValueAt(despesas.get(i).getPeso(), i, 1); 
                      tmDespesas.setValueAt(despesas.get(i).getQuantidade(), i, 2); 
                      tmDespesas.setValueAt(despesas.get(i).getTotal(), i, 3);
                      tmDespesas.setValueAt(despesas.get(i).getDatavenda(), i, 4); 
                      }                
                   
            

              }
  }      
        
      
   
    private void ATcadasClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATcadasClientesActionPerformed
        visualisaClientes();
    }//GEN-LAST:event_ATcadasClientesActionPerformed

    private void ATcadasFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATcadasFuncionariosActionPerformed
        visualisaFuncionarios();
    }//GEN-LAST:event_ATcadasFuncionariosActionPerformed
   
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        
        listaProduto();
    }//GEN-LAST:event_btPesquisarActionPerformed

     private void atualisaDespesasRecebimentos(){

        if (testarcampos() && rbDespesa.isSelected() == true) {
            
            Produtosbeans  pro = new Produtosbeans();
            
       //   pro.setCodigo(listProdutos.get(tbDespesas.getSelectedRow()).getCodigo());           
   //         pro.setPeso(txtPeso.getText().trim());           
            pro.setValor(txtValorpago.getText().trim());
//            pro.setValorrevenda(txtDescricao.getText().trim());
            Produtoscontrol prod = new Produtoscontrol();
            prod.atualisarProduto(pro);
            desabilitados();
            limparcampos();          
            JOptionPane.showMessageDialog(this, "PRODUTO ATUALISADO COM EXITO !!!");

        }else  if (testarcampos() && rbDespesa.isSelected() == true) {
            
                      Produtosbeans  pro = new Produtosbeans();
//                      pro.setCodigo(listProdutos.get(tbDespesas.getSelectedRow()).getCodigo());           
                   //   pro.setPeso(txtPeso.getText().trim());           
                      pro.setValor(txtValorpago.getText().trim());
               //       pro.setValorrevenda(txtValorrevenda.getText().trim());
                      Produtoscontrol prod = new Produtoscontrol();
//                      prod.atualisarLanches(pro);
                      desabilitados();
                      limparcampos();          
                      JOptionPane.showMessageDialog(this, "PRODUTO ATUALISADO COM EXITO !!!");
                      
                     }
     }
    
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        
            if (salvar == 1){
               cadastraDespesasRecebimentos();  
               /*
               op = 0;              
               btNovo.setEnabled(true); 
               btSalvar.setEnabled(false);
               btPesquisar.setEnabled(true);
               tbDespesas.setEnabled(true);
               tbDespesas.setEnabled(true);
               desabilitados();
               limparcampos();
               */
              }
              else
                  if(salvar == 2){                     
                      atualisaDespesasRecebimentos(); 
                      btNovo.setEnabled(true); 
                      btSalvar.setEnabled(false);
                      btPesquisar.setEnabled(true);
                      tbDespesas.setEnabled(true);
                      limparcampos();
                      desabilitados();
                      op = 0;
                     }
        
        
      
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        
     // while (tmDespesas.getRowCount() > 0){
      //          tmDespesas.removeRow(0);
     //   }
           if (op == 0 || op == 1) {
                   op = 1;
                   salvar = 1;
                //   btAtualisar.setEnabled(false); 
                   btSalvar.setEnabled(true);
                //   btPesquisar.setEnabled(false);
                //   tbDespesas.setEnabled(false);
               //    limparcampos();
             
                   }
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
      
        while (tmDespesas.getRowCount() > 0) {
                tmDespesas.removeRow(0);
        }
         limparcampos();
               salvar = 0;
               op = 0;
           
               btAtualisar.setEnabled(true);
               btNovo.setEnabled(true);
               btPesquisar.setEnabled(true);          
               tbDespesas.setEnabled(true);
               btSalvar.setEnabled(false);
               desabilitados();
               limparcampos();
    }//GEN-LAST:event_btCancelarActionPerformed

         
    private void excluirProdutos(){        
        
        
        if (tbDespesas.getSelectedRow() != -1) { 
            
             int op = JOptionPane.showConfirmDialog(this,"DESEJAS EXCLUIR O PRODUTO SELECIONADO ???","CONFIRMAÇÃO",JOptionPane.YES_NO_OPTION);             
             desabilitados(); 
              if(op == 0){                  
                   
                  Produtosbeans  pro = new Produtosbeans();                 
            //      pro.setCodigo(listProdutos.get(tbDespesas.getSelectedRow()).getCodigo());
                  Produtoscontrol prod = new Produtoscontrol();
                  prod.excluirProduto(pro);                 
                  btNovo.setEnabled(false);
                  btSalvar.setEnabled(true);
                  btAtualisar.setEnabled(true); 
                  tbDespesas.setEnabled(true);
                  btPesquisar.setEnabled(true); 
                  JOptionPane.showMessageDialog(this, "PRODUTO EXCLUIDO COM EXITO !!!"); 
                  listaProduto();
                 }
             
             }
              else 
                 {
                 JOptionPane.showMessageDialog(this, "SELECIONE UM PRODUTO !!!");
                 }    
          
    
    
    }
    
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluirProdutos();
      
    }//GEN-LAST:event_btExcluirActionPerformed

     private void alterarProduto() {

        if (tbDespesas.getSelectedRow() != -1) {
//            camposhabilitados();
            btNovo.setEnabled(false);
            btSalvar.setEnabled(true);
            btAtualisar.setEnabled(true); 
            tbDespesas.setEnabled(true);
            btPesquisar.setEnabled(true);
            }
             else 
                 {
                 JOptionPane.showMessageDialog(this, "SELECIONE UM PRODUTO !!!");
                 }
          }
     
     private void tbProdutosLinhaSelecionada(JTable tb) {

        if (tb.getSelectedRow() != -1 && rbDespesa.isSelected() == true) {             
           
       //     txtPeso.setText(listProdutos.get(tb.getSelectedRow()).getPeso().replace(".",","));
    //        txtValorpago.setText(listProdutos.get(tb.getSelectedRow()).getValor().replace(".",",")); 
     //       txtValorrevenda.setText(listProdutos.get(tb.getSelectedRow()).getValorrevenda().replace(".",","));
         
        } else if(tb.getSelectedRow() != -1 && rbDespesa.isSelected() == true) {
                   
//                  txtDescricao.setText(listProdutos.get(tb.getSelectedRow()).getDescricao().replace(".",","));
               //   txtPreco.setText(listProdutos.get(tb.getSelectedRow()).getPreco().replace(".",","));          
                 
                }else{
                        limparcampos();                       
                      }
               
    }
    
    private void btAtualisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualisarActionPerformed
       
         if (op == 0 || op == 2) {
                  op = 2;
                  salvar = 2;                
                  alterarProduto();
                 }
    }//GEN-LAST:event_btAtualisarActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         try {
          
                Runtime.getRuntime().exec("calc.exe");
              } catch (Exception ex) {
                         ex.printStackTrace();
                        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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

      MenuRelatorios Relatorios; 
      
    private void miVendasavistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendasavistaActionPerformed
        String args = "Relatorio de Vendas Avista";
        Relatorios.main(1 , args);
        dispose();
    }//GEN-LAST:event_miVendasavistaActionPerformed

    private void miVendasaprazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendasaprazoActionPerformed
        String args = "Relatorio de Vendas Aprazo";
        Relatorios.main(2 , args);
        dispose();
    }//GEN-LAST:event_miVendasaprazoActionPerformed

    private void miVendaslanchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaslanchesActionPerformed
        String args ="Relatorio de Vendas de Lanchas";
        Relatorios.main(3 , args);
        dispose();
    }//GEN-LAST:event_miVendaslanchesActionPerformed

    private void rbDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDespesaActionPerformed
        txtDescricao.setEditable(false);
        cbDespesas.setEnabled(true);
    }//GEN-LAST:event_rbDespesaActionPerformed

    private void rbDespesaeventualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDespesaeventualActionPerformed
        cbDespesas.setEnabled(false);
        txtDescricao.setEditable(true);
    }//GEN-LAST:event_rbDespesaeventualActionPerformed

  
    
       
       
      
        
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDespesas().setVisible(true);
            }
        });
        
   
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ATcadasClientes;
    private javax.swing.JMenuItem ATcadasFuncionarios;
    private javax.swing.JButton btAtualisar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbDespesas;
    private javax.swing.ButtonGroup despesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JRadioButton rbDespesa;
    private javax.swing.JRadioButton rbDespesaeventual;
    private javax.swing.ButtonGroup selecao;
    private javax.swing.JTable tbDespesas;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDevolucao;
    private javax.swing.JTextField txtValorpago;
    private javax.swing.JTextField txtValorrecebido;
    // End of variables declaration//GEN-END:variables
}
