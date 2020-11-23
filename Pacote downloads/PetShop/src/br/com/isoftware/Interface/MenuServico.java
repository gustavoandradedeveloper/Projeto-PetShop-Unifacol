package br.com.isoftware.Interface;

import br.com.isoftware.Calendario.calendario;
import br.com.isoftware.beans.Animalbeans;
import br.com.isoftware.beans.Funcionariobeans;
import br.com.isoftware.beans.Pessoasbeans;
import br.com.isoftware.beans.Servicosbeans;
import br.com.isoftware.control.Animalcontrol;
import br.com.isoftware.control.PessoasControl;
import br.com.isoftware.control.Servicocontrol;
import java.io.IOException;
import java.util.ArrayList;
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
public class MenuServico extends javax.swing.JFrame {
   
    public MenuServico() {
        initComponents();
        cbAnimais.removeAllItems();
    }
    
   ListSelectionModel lsmAmimal; 
   ArrayList<Animalbeans> listObjAnimal = new ArrayList();
   ArrayList<Funcionariobeans> listObjFuncionarios = new ArrayList();
   ArrayList<Servicosbeans> listObjServicos = new ArrayList();
   
   Servicosbeans ObjBeans = new Servicosbeans();
   int salvar, op = 0;
   String[] opServicos = new String[]{"Banho", "Banho"};  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoPessoa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbServicos = new javax.swing.JTable();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btAtualisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtDataservicos = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbAnimais = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        cbFuncionaros = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cbServicos = new javax.swing.JComboBox();
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
        setTitle("MENU SERVIÇOS");

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 680));

        tbServicos.setBackground(new java.awt.Color(153, 153, 153));
        tbServicos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tbServicos.setModel(tmAnimal);
        tbServicos.setRowHeight(30);
        tbServicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmAmimal = tbServicos .getSelectionModel();
        lsmAmimal.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {

                if(! e.getValueIsAdjusting() ){

                    tbFuncionarioLinhaSelecionada(tbServicos);

                }
            }
        });
        jScrollPane1.setViewportView(tbServicos);

        btNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/new.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/save.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setEnabled(false);
        btSalvar.setFocusCycleRoot(true);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btAtualisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAtualisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/atualizar.png"))); // NOI18N
        btAtualisar.setText("Atualisar");
        btAtualisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualisarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/cancelar1.png"))); // NOI18N
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

        txtPesquisar.setBackground(new java.awt.Color(153, 153, 153));
        txtPesquisar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/pesquisar1.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Preço:");

        txtPreco.setEditable(false);
        txtPreco.setBackground(new java.awt.Color(153, 153, 153));
        txtPreco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtDataservicos.setBackground(new java.awt.Color(153, 153, 153));
        txtDataservicos.setEnabled(false);
        txtDataservicos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDataservicos.setPreferredSize(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Data:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Animal: ");

        cbAnimais.setBackground(new java.awt.Color(153, 153, 153));
        cbAnimais.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cbAnimais.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Funcionário: ");

        cbFuncionaros.setBackground(new java.awt.Color(153, 153, 153));
        cbFuncionaros.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cbFuncionaros.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Serviços: ");

        cbServicos.setBackground(new java.awt.Color(153, 153, 153));
        cbServicos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cbServicos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Banho", "Tosa" }));
        cbServicos.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane2)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(cbServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(txtDataservicos, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(cbAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(cbFuncionaros, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE)))
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
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFuncionaros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDataservicos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
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

     DefaultTableModel tmAnimal = new DefaultTableModel(null, new String[]{"Serviço", "Preço", "Funcionário", "Animal"});     
     
      private void limparcampos() {
          
                // txtNome.setText("");
                 txtPreco.setText("");
    }
    
    private void camposhabilitados() {
                                  
                txtPreco.setEditable(true);
                cbServicos.setEnabled(true);
                cbAnimais.setEnabled(true);
                cbFuncionaros.setEnabled(true);
                txtDataservicos.setEnabled(true);
    }

    private void desabilitados() {
                
                txtPreco.setEditable(false);
                txtDataservicos.setCalendar(null);
                cbAnimais.setEnabled(false);
                cbFuncionaros.setEnabled(false);
                cbServicos.setEnabled(false);
                btAtualisar.setEnabled(true);
                btNovo.setEnabled(true);
                btPesquisar.setEnabled(true);
                tbServicos.setEnabled(true);
                btSalvar.setEnabled(false);
    }
    
    public void carregaCBs(){
        
        if(cbFuncionaros.getSelectedIndex() < 0){
            Animalcontrol animal = new Animalcontrol();
            PessoasControl   funci = new PessoasControl();

            listObjAnimal = animal.listaAnimais("%%");
            listObjFuncionarios = funci.listarFuncionarios("%%");

            for (Animalbeans listObjAnimal1 : listObjAnimal) {
                cbAnimais.addItem(listObjAnimal1.getNome());
            }
            for (Pessoasbeans listObjFun : listObjFuncionarios) {
                cbFuncionaros.addItem(listObjFun.getNome());
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
      
     MenuServico Produtos;    
 
      private void visualisaProdutos(){
    
         if(Produtos == null){
         
            Produtos = new MenuServico();
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
        listarServicos();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        while (tmAnimal.getRowCount() > 0) {
            tmAnimal.removeRow(0);
        }
        limparcampos();
        salvar = 0;
        op = 0;
        btAtualisar.setEnabled(true);
        btNovo.setEnabled(true);
        btExcluir.setEnabled(true);
        btPesquisar.setEnabled(true);
        txtPesquisar.setEditable(true);
        tbServicos.setEnabled(true);
        btSalvar.setEnabled(false);
        cbAnimais.removeAllItems();
        cbFuncionaros.removeAllItems();
        desabilitados();
    }//GEN-LAST:event_btCancelarActionPerformed
    
    private void excluirServicos(int codigo){
        Servicocontrol servico = new Servicocontrol();
        if(servico.excluirProduto(codigo)){
            JOptionPane.showMessageDialog(this, "SERVIÇO EXCLUIDO COM SUCESSO !!!");
            listarServicos();
        }else{
            JOptionPane.showMessageDialog(this, "SERVIÇO NÃO EXCLUIDO !!!");
        }
    }
    
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        
        if (tbServicos.getSelectedRow() != -1) {
            
            int resposta = JOptionPane.showConfirmDialog(this,"DESEJA EXCLUIR ESTE SERVIÇO?", "Confirmação", JOptionPane.YES_NO_OPTION);  
            if(resposta == JOptionPane.YES_OPTION){
                excluirServicos(listObjServicos.get(tbServicos.getSelectedRow()).getCodigo());
            }
        }else{
            JOptionPane.showMessageDialog(this, "SELECIONE UM SERVIÇO !!!");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAtualisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualisarActionPerformed
        
        if (tbServicos.getSelectedRow() != -1) {
            if (op == 0 || op == 2) {
                op = 2;
                salvar = 2;
                AlterarProduto();
            }     
        }else{
            JOptionPane.showMessageDialog(this, "SELECIONE UM SERVIÇO !!!");
        }
    }//GEN-LAST:event_btAtualisarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       
        if(testarcampos()){     
            if (salvar == 1) {

                cadastraServicos();               
            }
            else if (salvar == 2) {
                
                atualisarProduto();               
            }            
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed

        while (tmAnimal.getRowCount() > 0) {
            tmAnimal.removeRow(0);
        }
        if (op == 0 || op == 1) {
            op = 1;
            salvar = 1;
            novoProduto();
        }
    }//GEN-LAST:event_btNovoActionPerformed
    
    MenuRelatorios Relatorios; 
    private void novoProduto() {
        carregaCBs();
        btAtualisar.setEnabled(false);
        btSalvar.setEnabled(true);
        btExcluir.setEnabled(false);
        btPesquisar.setEnabled(false);
        tbServicos.setEnabled(false);
        cbAnimais.setSelectedIndex(0);
        cbFuncionaros.setSelectedIndex(0);
        camposhabilitados();
    }
    
    private boolean testarcampos() {

        if (testaValor(txtPreco.getText().trim())){
            return true;
        }
        JOptionPane.showMessageDialog(this, "OBSERVE SE OS CAMPOS FORAM PREENCHIDOS CORRETAMENTE !!!");
        return false;
    }
    
    private void cadastraServicos(){
            
        ObjBeans = new Servicosbeans();
        Servicocontrol servicocontrol = new Servicocontrol();

        String[] servico = new String[]{"Banho", "Tosa"};
        ObjBeans.setServico(servico[cbServicos.getSelectedIndex()]);          
        ObjBeans.setPreco(txtPreco.getText().trim());
        ObjBeans.setDataservico(txtDataservicos.getDate());
        ObjBeans.setAnimalPK(listObjAnimal.get(cbAnimais.getSelectedIndex()).getCodigo());
        ObjBeans.setFuncionarioPK(listObjFuncionarios.get(cbFuncionaros.getSelectedIndex()).getFuncionarioPK());
        if(servicocontrol.cadastraServico(ObjBeans)){
            op = 0;
            txtPesquisar.setEditable(true);
            btPesquisar.setEnabled(true);
            tbServicos.setEnabled(true);
            desabilitados();
            limparcampos();
            JOptionPane.showMessageDialog(this, "SERVIÇO CADASTRADO COM EXITO !!!");
        }else{

            JOptionPane.showMessageDialog(null, "SERVIÇO NÃO CADASTRADO !!!");  
        }
    }
    
    
    private void atualisarProduto(){

        Servicocontrol servicocontrol = new Servicocontrol();
        String[] servico = new String[]{"Banho", "Tosa"};

        ObjBeans.setPreco(txtPreco.getText());
        ObjBeans.setDataservico(txtDataservicos.getDate());            
        ObjBeans.setServico(servico[cbServicos.getSelectedIndex()]);
        ObjBeans.setFuncionarioPK(listObjServicos.get(cbFuncionaros.getSelectedIndex()).getFuncionarioPK());
        ObjBeans.setAnimalPK(listObjServicos.get(cbAnimais.getSelectedIndex()).getAnimalPK());
        ObjBeans.setCodigo(listObjServicos.get(tbServicos.getSelectedRow()).getCodigo());

        if(servicocontrol.atualisaServico(ObjBeans)){
            
            op = 0;
            listarServicos();
            limparcampos();
            desabilitados();
            JOptionPane.showMessageDialog(this, "SERVIÇO ATUALIZADO COM EXITO !!!");
        }else{
            JOptionPane.showMessageDialog(null, "SERVIÇO NÃO ATUALIZADO !!!");  
        }
    }
     
     private void AlterarProduto() {

        if (tbServicos.getSelectedRow() != -1) {
                camposhabilitados();
                btNovo.setEnabled(false);
                tbServicos.setEnabled(false);
                btExcluir.setEnabled(false);
                btSalvar.setEnabled(true);           
            }else{
                JOptionPane.showMessageDialog(this, "SELECIONE UM SERVIÇO !!!");
            }
        }    
    
    private void listarServicos() {

           Servicocontrol servicos = new Servicocontrol();

           listObjServicos = servicos.listaServicos("%" + txtPesquisar.getText().trim() + "%");
           carregaCBs();
           visualizarServicos(listObjServicos);
       }
       
    private void visualizarServicos(ArrayList<Servicosbeans > servicos) {

        while (tmAnimal.getRowCount() > 0) {
                tmAnimal.removeRow(0);
                }

        String[] campos = new String[]{null, null, null, null};

        if (servicos.isEmpty()) {
            
                txtPesquisar.setText("");
                JOptionPane.showMessageDialog(null, "NENHUM SERVIÇO ENCONTRADO!!!");
        }else{

             for (int i = 0; i < servicos.size(); i++) {

                tmAnimal.addRow(campos);
                tmAnimal.setValueAt(servicos.get(i).getServico(), i, 0);
                tmAnimal.setValueAt(servicos.get(i).getPreco(), i, 1);
                tmAnimal.setValueAt(servicos.get(i).getFuncionario(), i, 2);
                tmAnimal.setValueAt(servicos.get(i).getAnimal(), i, 3);
            }
        }
    }     
      
    private void tbFuncionarioLinhaSelecionada(JTable tb) {      
       
        if (tb.getSelectedRow() != -1) {
             
            int servico = Integer.parseInt(listObjServicos.get(tb.getSelectedRow()).getServico().replace("Banho", "0").replace("Tosa", "1"));
            txtPreco.setText(listObjServicos.get(tb.getSelectedRow()).getPreco());                 
            txtDataservicos.setDate(listObjServicos.get(tb.getSelectedRow()).getDataservico());
            cbAnimais.setSelectedIndex(retornaAnimal(listObjServicos.get(tb.getSelectedRow()).getAnimal()));
            cbFuncionaros.setSelectedIndex(retornaFuncionario(listObjServicos.get(tb.getSelectedRow()).getFuncionario()));
            cbServicos.setSelectedIndex(servico); 
        }else{
            limparcampos();
        }
    }
    private int retornaAnimal(String animal){
      
        for (int i= 0; i < listObjAnimal.size(); i++ ) {
            if(listObjAnimal.get(i).getNome().equals(animal)){              
                return i;
            }
        }
        return 0;
    }
    private int retornaFuncionario(String Funcionario){
      
        for (int i = 0; i < listObjFuncionarios.size(); i++ ) {
            if(listObjFuncionarios.get(i).getNome().equals(Funcionario)){              
                return i;
            }
        }
        return 0;
    }
    private boolean testaValor(String digitos){
   
       if(!digitos.equals("")){
         
           int retono = 0,tamanho = digitos.length();
           String caracteres="";
       
           for(int i = 0;i < tamanho;i ++){
      
                 char valor  =  digitos.charAt(i);  
                 
                 if(valor == '0' ||valor == '1' || valor == '2' || valor == '3' || valor == '4' || valor == '5' || valor == '6' || valor == '7' || valor == '8' || valor == '9' || valor == ','){            
                    }else{                          
                           caracteres = caracteres + valor;
                           retono = 1; 
                          }
                }      
                if(retono == 0){
                    return true;
                }else{
                    if(caracteres.length()<= 1){
                        for (int i = 0; i < caracteres.length(); i++){
                            digitos = digitos.replace(String.valueOf(caracteres.charAt(i)), "");
                        }
                        JOptionPane.showMessageDialog(null, "O CARACTER DIGITADO -> "+caracteres+" <- NÃO É PERMITIDO !!!");
                    }else {

                        digitos = digitos.replace(caracteres, "");
                        JOptionPane.showMessageDialog(null, "OS CARACTERES DIGITADOS  -> "+caracteres+" <- NÃO SÃO PERMITIDO !!!");
                    }
                    txtPreco.setText(digitos);
                    return false;
                }
       }else {
            JOptionPane.showMessageDialog(null, "O CAMPO VALOR PAGO ESTA VAZIO !!!");
            return false;                 
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
            java.util.logging.Logger.getLogger(MenuServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new MenuServico().setVisible(true);
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
    private javax.swing.JComboBox cbAnimais;
    private javax.swing.JComboBox cbFuncionaros;
    private javax.swing.JComboBox cbServicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JMenuItem miVendasaprazo;
    private javax.swing.JMenuItem miVendasavista;
    private javax.swing.JMenuItem miVendaslanches;
    private javax.swing.JTable tbServicos;
    private com.toedter.calendar.JDateChooser txtDataservicos;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
