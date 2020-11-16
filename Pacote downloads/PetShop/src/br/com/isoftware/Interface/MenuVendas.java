package br.com.isoftware.Interface;



import br.com.isoftware.Calendario.calendario;
import br.com.isoftware.beans.Pessoasbeans;
import br.com.isoftware.beans.Produtosbeans;
import br.com.isoftware.beans.Vendasbeans;
import br.com.isoftware.control.Produtoscontrol;
import br.com.isoftware.control.Vendascontrol;
import java.text.DecimalFormat;
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
public class MenuVendas extends javax.swing.JFrame {
    
   ArrayList<Pessoasbeans> listObjCli = new ArrayList(); 
   ArrayList<Pessoasbeans> listObjFunci = new ArrayList();
   ArrayList<Vendasbeans> listObjVendas = new ArrayList();
   ArrayList<Produtosbeans> produtos = new ArrayList(); 
   ListSelectionModel lsmItens;
   ListSelectionModel lsmProdutos;
   int linhas;
   Double totalgaral = null,Valor = null;  
   Double Valorpago = null;  
      
    public MenuVendas() {
        initComponents();
        listarProduto();
    }
  
    DefaultTableModel tmItens = new DefaultTableModel(null, new String[]{"Código", "Descricão","Quantidade"});
    DefaultTableModel tmProdutos = new DefaultTableModel(null, new String[]{"Descrição", "Preço"});
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoPreco = new javax.swing.ButtonGroup();
        tipoVenda = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbItens = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btIncluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btFinalizar = new javax.swing.JButton();
        lbValortotal = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        lbValortroco = new javax.swing.JLabel();
        lbTroco = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtQuantidade = new JFormattedTextField(NumberFormat.getInstance());
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtValorpago = new JFormattedTextField(NumberFormat.getInstance());
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU VENDAS");

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        tbItens.setAutoCreateRowSorter(true);
        tbItens.setBackground(new java.awt.Color(204, 204, 255));
        tbItens.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tbItens.setModel(tmItens);
        tbItens.setDropMode(javax.swing.DropMode.INSERT_ROWS);
        tbItens.setRowHeight(24);
        tbItens.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmItens = tbItens.getSelectionModel();
        lsmItens.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {

                if(! e.getValueIsAdjusting() ){

                    tbItensLinhaSelecionada(tbItens);
                }
            }
        });
        jScrollPane1.setViewportView(tbItens);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ISoftware");
        jLayeredPane2.add(jLabel1);
        jLabel1.setBounds(900, 40, 180, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("PET SHOP - MELHOR AMIGO PELUDO");
        jLayeredPane2.add(jLabel2);
        jLabel2.setBounds(10, 0, 750, 44);

        btIncluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Novoprod_1.png"))); // NOI18N
        btIncluir.setText("Incluir");
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Cancelarprod_1.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btFinalizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/Salvarprod_1.png"))); // NOI18N
        btFinalizar.setText("Finalizar");
        btFinalizar.setEnabled(false);
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });

        lbValortotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbValortotal.setForeground(new java.awt.Color(0, 0, 204));

        lbTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTotal.setText("Total :");

        lbValortroco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbValortroco.setForeground(new java.awt.Color(255, 0, 0));

        lbTroco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTroco.setText("Troco :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Itens do Pedido:");

        tbProdutos.setBackground(new java.awt.Color(153, 153, 153));
        tbProdutos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tbProdutos.setModel(tmProdutos);
        tbProdutos.setRowHeight(30);
        tbProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmProdutos = tbProdutos.getSelectionModel();
        lsmProdutos.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {

                if(! e.getValueIsAdjusting() ){

                    tbProdutosLinhaSelecionada(tbProdutos);
                }
            }
        });
        jScrollPane2.setViewportView(tbProdutos);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Produtos:");

        txtQuantidade.setBackground(new java.awt.Color(153, 153, 153));
        txtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Quantidade: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Valor pago: ");

        txtValorpago.setBackground(new java.awt.Color(153, 153, 153));
        txtValorpago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbTroco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbValortroco, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(lbTotal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbValortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorpago, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorpago, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addComponent(btFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbValortotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbValortroco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTroco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btCancelar, btFinalizar, btIncluir});

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1116, 718));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void listarProduto() {

            Produtoscontrol   forn = new Produtoscontrol();

            produtos = forn.listaProdutos("%%");
          
            while (tmProdutos.getRowCount() > 0) {
                    tmProdutos.removeRow(0);
                }

        String[] campos = new String[]{null, null, null, null};

        if (produtos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "NENHUM FUNCIONARIO ENCONTRADO!!!");
           }
           else {

                for (int i = 0; i < produtos.size(); i++) {

                        tmProdutos.addRow(campos);
                        tmProdutos.setValueAt(produtos.get(i).getDescricao(), i, 0);
                        tmProdutos.setValueAt(produtos.get(i).getValor(), i, 1);
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
    
  public void carregaCBs(){
  
      listObjCli = new Vendascontrol().listaCBClientes("%%");
  } 
  
       private void camposhabilitados() {
                              
                totalgaral = 0.0;
    }
     
    private void desabilitados() {

    }
    
 
     private String FormataPreco(Double numero) {                              
       
       DecimalFormat df = new DecimalFormat("###,###,##0.00");  
       String valor = df.format(numero);
       
       return valor;
     }    
      
      private String FormataPeso(Double numero) {                              
       
       DecimalFormat df = new DecimalFormat("#,##0.000");  
       String valor = df.format(numero);
       
       return valor;
     }    
      
    private void ATcadasFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATcadasFuncionariosActionPerformed
        visualisaFuncionarios();
    }//GEN-LAST:event_ATcadasFuncionariosActionPerformed

    private void ATcadasProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATcadasProdutosActionPerformed
        visualisaProdutos();
    }//GEN-LAST:event_ATcadasProdutosActionPerformed
    
    private void tbProdutosLinhaSelecionada(JTable tb) {      
         
        if(testeQuantidade()){ 
            String[] campos = new String[]{null, null, null};
            if (tb.getSelectedRow() != -1) {

                       tmItens.addRow(campos);
                       tmItens.setValueAt(produtos.get(tb.getSelectedRow()).getCodigo(), linhas, 0);
                       tmItens.setValueAt(produtos.get(tb.getSelectedRow()).getValor(), linhas, 1);
                       tmItens.setValueAt(txtQuantidade.getText(), linhas, 2);                       
                       txtQuantidade.setText("");
                   } 
                    else { 

                           //limparcampos();
                          }
            linhas++;
        }
      }
    // int resposta = JOptionPane.showConfirmDialog(frame,"escolha um", "escolha dois", JOptionPane.YES_NO_OPTION);
    private boolean testeQuantidade() {
         JFrame frame = new JFrame("Digite a quantidade:");
         String m = JOptionPane.showInputDialog(frame, "Quantidade", "Menu Vendas:", JOptionPane.INFORMATION_MESSAGE); 
         tbProdutos.clearSelection();
       return false;
    }
    
    private boolean removerItens() {
         
        JFrame frame = new JFrame("JOptionPane exemplo");
        int resposta = JOptionPane.showConfirmDialog(frame,"escolha um", "escolha dois", JOptionPane.YES_NO_OPTION);
        if(resposta == JOptionPane.YES_OPTION){
            return true;
        }else{
            tbProdutos.clearSelection();
            JOptionPane.showMessageDialog(null, "O CAMPO QUANTIDADE VAZIO!!!");
            return false;
        }  
    }
    
    private void tbItensLinhaSelecionada(JTable tb) {      
       
        if(removerItens()){
         if (tb.getSelectedRow() != -1) {
             
                   // txtDescicao.setText(listObjForm.get(tb.getSelectedRow()).getDescricao());
                    //txtValor.setText(listObjForm.get(tb.getSelectedRow()).getValor());                 
                   // txtQuantidade.setText(listObjForm.get(tb.getSelectedRow()).getQuantidade());
                   // cbFornecedores.setSelectedIndex(listObjForm.get(tb.getSelectedRow()).getFornecedorPK() -1);
                    desabilitados();                     
                } 
                 else { 

                       // limparcampos();
                       }
        }
      }    
    
      public void incluiPedido(){ 
       
  // if(!txtQuantidade.getText().equals("")){
          
        Integer Qtde = Integer.parseInt(String.valueOf(txtQuantidade.getText().replace(".", "")));       
      /*    
        if(Qtde > 0){              

            Vendasbeans ObjVendas = new Vendasbeans();
           // Integer Qtdelinhas = tmVendas.getRowCount();       
           // ObjVendas.setProdutoFK(produtos.get(cbProdutos.getSelectedIndex()).getCodigo());                  
           // ObjVendas.setFuncionarioFK(listObjFunci.get(cbFuncionarios.getSelectedIndex()).getFuncionarioPK());

            if(rbPudim.isSelected() == true ){

                if(cbClientes.getSelectedIndex() != 0){

                   //ObjVendas.setClienteFK(listObjCli.get(cbClientes.getSelectedIndex()-1).getClientePK());

                   }
                   if(rbGrosso.isSelected() == true){

                      // ObjVendas.setValor(Double.parseDouble(produtos.get(cbProdutos.getSelectedIndex()).getValorrevenda().replace(",","."))*Qtde);
                    //   totalgaral = totalgaral + (Double.parseDouble(produtos.get(cbProdutos.getSelectedIndex()).getValorrevenda().replace(",","."))*Qtde);
                       ObjVendas.setQuantidade(Qtde);                      
                       listObjVendas.add(ObjVendas);
                       String[] campos = new String[]{null, null,null,null,null};
                       tmItens.addRow(campos);
                       tmItens.setValueAt(produtos.get(0).getCodigo(), 0, 0);
                    //   tmVendas.setValueAt(produtos.get(cbProdutos.getSelectedIndex()).getPeso(), Qtdelinhas, 1);
                     //  tmVendas.setValueAt(FormataPreco(Double.valueOf(produtos.get(cbProdutos.getSelectedIndex()).getValorrevenda().replace(",","."))), Qtdelinhas, 2); 
                       tmItens.setValueAt(Qtde, 0, 3);
                     //  tmVendas.setValueAt(FormataPreco((Double.valueOf((produtos.get(cbProdutos.getSelectedIndex()).getValorrevenda().replace(",",".")))*Qtde)), Qtdelinhas, 4);
                       lbValortotal.setText(FormataPreco(totalgaral)); 
                        btFinalizar.setEnabled(true);

                      }else if(rbVarejo.isSelected() == true){
                            ObjVendas.setValor(Double.parseDouble(produtos.get(cbProdutos.getSelectedIndex()).getValor().replace(",","."))*Qtde);
                            totalgaral = totalgaral + (Double.parseDouble(produtos.get(cbProdutos.getSelectedIndex()).getValor().replace(",","."))*Qtde);
                            ObjVendas.setQuantidade(Qtde); 
                            listObjVendas.add(ObjVendas);
                            String[] campos = new String[]{null, null,null,null,null};
                            tmVendas.addRow(campos);
                            tmVendas.setValueAt(produtos.get(cbProdutos.getSelectedIndex()).getCodigo(), Qtdelinhas, 0);
                         //   tmVendas.setValueAt(produtos.get(cbProdutos.getSelectedIndex()).getPeso(), Qtdelinhas, 1);
                            tmVendas.setValueAt(FormataPreco(Double.valueOf(produtos.get(cbProdutos.getSelectedIndex()).getValor().replace(",","."))), Qtdelinhas, 2); 
                            tmVendas.setValueAt(Qtde, Qtdelinhas, 3);                          
                            tmVendas.setValueAt(FormataPreco((Double.valueOf((produtos.get(cbProdutos.getSelectedIndex()).getValor().replace(",",".")))*Qtde)), Qtdelinhas, 4);
                            lbValortotal.setText(FormataPreco(totalgaral));
                            btFinalizar.setEnabled(true);
                          }   
              }else{
  //                   ObjVendas.setValor(Double.parseDouble(produtos.get(cbProdutos.getSelectedIndex()).getPreco().replace(",","."))*Qtde);
                //     totalgaral = totalgaral + (Double.parseDouble(produtos.get(cbProdutos.getSelectedIndex()).getPreco().replace(",","."))*Qtde);
                     ObjVendas.setQuantidade(Qtde); 
                     listObjVendas.add(ObjVendas);
                     String[] campos = new String[]{null, null,null,null,null};
                     tmItens.addRow(campos);
                     tmItens.setValueAt(produtos.get(cbProdutos.getSelectedIndex()).getCodigo(), Qtdelinhas, 0);
                     tmItens.setValueAt(produtos.get(cbProdutos.getSelectedIndex()).getDescricao(), Qtdelinhas, 1);
               //      tmVendas.setValueAt(FormataPreco(Double.valueOf(produtos.get(cbProdutos.getSelectedIndex()).getPreco().replace(",","."))), Qtdelinhas, 2); 
                     tmItens.setValueAt(Qtde, 0 , 3);
  //                   tmVendas.setValueAt(FormataPreco((Double.valueOf((produtos.get(cbProdutos.getSelectedIndex()).getPreco().replace(",",".")))*Qtde)), Qtdelinhas, 4);
                     lbValortotal.setText(FormataPreco(totalgaral));
                     btFinalizar.setEnabled(true);
                    }
                  }else{

                         JOptionPane.showMessageDialog(null,"QUANTIDADE NÃO É VALIDA !!!");
                        }
            
           }else{
             
                     JOptionPane.showMessageDialog(null,"O CAMPO QUANTIDADE ESTA VAZIO !!!");
                    }
           */         
   }
    public void novoPedido(){
       
        if(btFinalizar.isEnabled() == false ){
          
            lbValortotal.setText("");
            lbValortroco.setText("");
            Valor = 0.0;
            Valor = 0.0;
            totalgaral = 0.0;
            
             while (tmItens.getRowCount() > 0) {              
                   tmItens.removeRow(0);                                
                  } 
            }
   }
    
    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
        novoPedido();
        incluiPedido();
        
    }//GEN-LAST:event_btIncluirActionPerformed

     public void finalizarPedido(ArrayList<Vendasbeans> Pedidos){
     /*
     if(tmItens.getRowCount() > 0){               
                
         if(rbPudim.isSelected() == true){
         
             if(cbPagamento.getSelectedIndex() == 0){
                
                  if(testaValor(txtValorpago.getText())){
                          
                         Valorpago = Double.parseDouble(txtValorpago.getText().trim());                         
                        
                          if(Valorpago >= totalgaral){ 
                              
                                    int resposta = JOptionPane.showConfirmDialog(this,"DESEJA FINALISAR ESTE PEDIDO ?\n\n"+"VENDA DE PUDIM\n\n "
                                           + "TOTAL DA COMPRA: "+FormataPreco(totalgaral)+"\n\nVALOR PAGO: "+FormataPreco(Valorpago),"Confirmação",JOptionPane.YES_NO_OPTION);  
               
                                    if(resposta == JOptionPane.YES_NO_OPTION){
                                    
                                          Vendascontrol venCon = new Vendascontrol(); 
                                     //     venCon.cadastraPedidoAvista(Pedidos,totalgaral ); 
                                          Valorpago =  (Valorpago  - totalgaral);                                           
                                          lbValortroco.setText(String.valueOf(FormataPreco(Valorpago)));                                         
                                          esvasialista();
                                          carregaCBProdutos();
                                          carregaCBs(); 
                                          btFinalizar.setEnabled(false);
                                          JOptionPane.showMessageDialog(null, "COMPRA REALISADA COM SUCESSO !!!"); 
                                         }                                   
                                      }else{
                                              JOptionPane.showMessageDialog(null, "O VALOR PAGO É MENOR QUE A COMPRA !!!");
                                              }
                                    }
                         }else{
                                if(cbPagamento.getSelectedIndex() != 0 && cbClientes.getSelectedIndex() != 0){
                                      
                                    int resposta = JOptionPane.showConfirmDialog(this,"DESEJA FINALISAR ESTE PEDIDO ???\n\nVENDA DE PUDIM\n\nCLIENTE: "
                                          +listObjCli.get(cbClientes.getSelectedIndex()-1).getNome()+"\n\nCOMPRA: A PRAZO \n\n"
                                          + "TOTAL DA COMPRA: "+totalgaral,"Confirmação",JOptionPane.YES_NO_OPTION);  
                                   
                                    if(resposta == JOptionPane.YES_NO_OPTION){                                     
                                       
                                           Vendascontrol venCon = new Vendascontrol(); 
                                     //      venCon.cadastraPedidoAprazo(Pedidos,totalgaral );    
                                           esvasialista();
                                           carregaCBProdutos();
                                           carregaCBs();                                       
                                           btFinalizar.setEnabled(false);
                                          }
                                        }else{
                                               JOptionPane.showMessageDialog(null, "O TIPO DE PAGAMENTO NÃO É PERMITIDO !!!");
                                               }                                
                                      }           
              
             }else{   
                    if(cbPagamento.getSelectedIndex() == 0 && rbLanches.isSelected() == true){
                    
                        if(testaValor(txtValorpago.getText())){
                          
                                Valorpago = Double.parseDouble(txtValorpago.getText().trim());
                               
                               if(Valorpago >= totalgaral){ 
                                   int resposta = JOptionPane.showConfirmDialog(this,"DESEJA FINALISAR ESTE PEDIDO ?\n\n"+"VENDA DE LANCHES\n\n "
                                           + "TOTAL: "+FormataPreco(totalgaral)+"\n\nVALOR PAGO: "+FormataPreco(Valorpago),"Confirmação",JOptionPane.YES_NO_OPTION);  
               
                                    if(resposta == JOptionPane.YES_NO_OPTION){
                                    
                                          Vendascontrol venCon = new Vendascontrol(); 
                                //          venCon.cadastraPedido(Pedidos,totalgaral);  
                                          Valorpago =  (Valorpago  - totalgaral);                                         
                                          lbValortroco.setText(String.valueOf(FormataPreco(Valorpago)));                                      
                                          btFinalizar.setEnabled(false); 
                                          esvasialista();
                                          carregaCBProdutos();
                                          carregaCBs();                                        
                                          JOptionPane.showMessageDialog(null, "COMPRA REALISADA COM SUCESSO !!!"); 
                                         }                                   
                                       }else{
                                              JOptionPane.showMessageDialog(null, "O VALOR PAGO É MENOR QUE A COMPRA !!!");
                                              }
                                    }                
                                 }else{
                                          JOptionPane.showMessageDialog(null, "O TIPO DE PAGAMENTO NÃO É PERMITIDO !!!");
                                         }        
                        }

         }else{
                 JOptionPane.showMessageDialog(null, "A LISTA DE PEDIDOS ESTA VAZIA !!!");
                }
    */
   }
 
     public Boolean testaValor(String digitos){
   
       if(!digitos.equals("")){
         
           int retono = 0,tamanho = digitos.length();
           String caracteres="";
       
           for(int i = 0;i < tamanho;i ++){
      
                 char valor  =  digitos.charAt(i);  
                 
                 if(valor == '0' ||valor == '1' || valor == '2' || valor == '3' || valor == '4' || valor == '5' || valor == '6' || valor == '7' || valor == '8' || valor == '9'){            
                    }else{                          
                           caracteres = caracteres + valor;
                           retono = 1; 
                          }
                }      
                 if(retono == 0){
                      return true;
                     }else{
                             if(caracteres.length()<= 1){
                                  JOptionPane.showMessageDialog(null, "O CARACTER DIGITADO -> "+caracteres+" <- NÃO É PERMITIDO !!!");
                                }else {
                                         JOptionPane.showMessageDialog(null, "OS CARACTERES DIGITADOS  -> "+caracteres+" <- NÃO SÃO PERMITIDO !!!");
                                       }
                            
                             return false;
                            }
       }else {
                 JOptionPane.showMessageDialog(null, "O CAMPO VALOR PAGO ESTA VAZIO !!!");
                 return false;                 
               }
  
  }       
    
    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
     
        finalizarPedido(listObjVendas);
    }//GEN-LAST:event_btFinalizarActionPerformed

      private void excluiItem() {
  
          if(btFinalizar.isEnabled() == true){
    
              if (tbItens.getSelectedRow() != -1) {
            
                    totalgaral = totalgaral - (listObjVendas.get(tbItens.getSelectedRow()).getValor());
                    lbValortotal.setText(FormataPreco(totalgaral));
                    listObjVendas.remove(listObjVendas.get(tbItens.getSelectedRow())); 
                    tmItens.removeRow(tbItens.getSelectedRow());
             
                    if(listObjVendas.isEmpty()){  
                 
                        lbValortotal.setText("");
                        totalgaral = 0.0;
                        JOptionPane.showMessageDialog(null,"LISTA ESTA VAZIA ");                  
                        camposhabilitados();
                        btFinalizar.setEnabled(false);
                       }            
                   }else{
                           JOptionPane.showMessageDialog(null,"TABELA ESTA VAZIA OU NENHUM ITEM FOI SELECIONADO !!!"); 
                          }
                 }       
    }
    
    
     public void esvasialista(){ 
 
               for(int i = 0;i < listObjVendas.size();i ++){
                   
                    listObjVendas.removeAll(listObjVendas);                     
                   }   
                   camposhabilitados();
     }
         
    
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
          
        while (tmItens.getRowCount() > 0) {              
                   tmItens.removeRow(0);                                
                  } 
                  lbValortotal.setText("");
                  esvasialista();
                  carregaCBProdutos();
                  carregaCBs(); 
                  camposhabilitados();
    }//GEN-LAST:event_btCancelarActionPerformed

    public void carregaCBProdutos(){
  /*
       produtos = new Vendascontrol().listaProdutos(); 
         
       if(rbPudim.isSelected() == true){
       
           if(rbGrosso.isSelected() == true){    
                
                 for(int i = 0;i < produtos.size() ;i ++){                     
                    
                 //     cbProdutos.addItem("Peso : "+produtos.get(i).getPeso()+" * | * Valor Unitario : "+produtos.get(i).getValorrevenda());        
                      }  
                     
                } else{    
                
                       for(int i = 0;i < produtos.size() ;i ++){                     
                    
                           // cbProdutos.addItem("Peso : "+produtos.get(i).getPeso()+" * | * Valor Unitario : "+produtos.get(i).getValor());        
                           }  
                         
                       }
       
               }else if(rbLanches.isSelected() == true){
       
                         //    produtos = new Produtoscontrol().listaLanches();                
                             cbProdutos.removeAllItems();
                 
                             for(int i = 0;i < produtos.size() ;i ++){                     
                    
                              //    cbProdutos.addItem(produtos.get(i).getDescricao()+" * | * R$: "+produtos.get(i).getPreco());        
                                 }  
                            }           
      */       
  } 
   
  
    
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

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
           try {
                 Runtime.getRuntime().exec("calc.exe");
                 } catch (Exception ex) {
                      ex.printStackTrace() ;
                    }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void ATcadasClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATcadasClientesActionPerformed
        visualisaClientes();
    }//GEN-LAST:event_ATcadasClientesActionPerformed

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

    MenuRelatorios Relatorios; 
    
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
            java.util.logging.Logger.getLogger(MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuClientes().setVisible(true);
            }
        });
        
     
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ATcadasClientes;
    private javax.swing.JMenuItem ATcadasFuncionarios;
    private javax.swing.JMenuItem ATcadasProdutos;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btIncluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbTroco;
    private javax.swing.JLabel lbValortotal;
    private javax.swing.JLabel lbValortroco;
    private javax.swing.JMenuItem miVendasaprazo;
    private javax.swing.JMenuItem miVendasavista;
    private javax.swing.JMenuItem miVendaslanches;
    private javax.swing.JTable tbItens;
    private javax.swing.JTable tbProdutos;
    private javax.swing.ButtonGroup tipoPreco;
    private javax.swing.ButtonGroup tipoVenda;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorpago;
    // End of variables declaration//GEN-END:variables
}
