/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isoftware.Interface;

import br.com.isoftware.Calendario.calendario;
import br.com.isoftware.beans.Pessoasbeans;
import br.com.isoftware.beans.Funcionariobeans;
import br.com.isoftware.control.PessoasControl;
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
public class MenuFuncionarios extends javax.swing.JFrame {

   
    public MenuFuncionarios() {
        initComponents();
    }
    
   ListSelectionModel lsmClientes; 
   ArrayList<Funcionariobeans> listObjForm = new ArrayList();
   Funcionariobeans ObjBeans = new Funcionariobeans();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtLogradouro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        txtDatanasc = new com.toedter.calendar.JDateChooser();
        txtNumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDD = new javax.swing.JFormattedTextField();
        txtContato = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        txtFuncao = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
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
        setTitle("MENU FUNCIONÁRIOS");

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Contato:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Salário:");

        txtNome.setEditable(false);
        txtNome.setBackground(new java.awt.Color(153, 153, 153));
        txtNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nome:");

        txtBairro.setEditable(false);
        txtBairro.setBackground(new java.awt.Color(153, 153, 153));
        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtLogradouro.setEditable(false);
        txtLogradouro.setBackground(new java.awt.Color(153, 153, 153));
        txtLogradouro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Logradouro:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("CEP:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Bairro:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("UF:");

        txtUF.setEditable(false);
        txtUF.setBackground(new java.awt.Color(153, 153, 153));
        txtUF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtCidade.setBackground(new java.awt.Color(153, 153, 153));
        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Cidade");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Data Nascimento:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("DD:");

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

        txtDatanasc.setEnabled(false);
        txtDatanasc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtNumero.setEditable(false);
        txtNumero.setBackground(new java.awt.Color(153, 153, 153));
        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Numero");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("CPF:");

        txtDD.setEditable(false);
        txtDD.setBackground(new java.awt.Color(153, 153, 153));
        try {
            txtDD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDD.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDD.setPreferredSize(null);

        txtContato.setEditable(false);
        txtContato.setBackground(new java.awt.Color(153, 153, 153));
        try {
            txtContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(####-####)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtContato.setPreferredSize(null);

        txtCep.setEditable(false);
        txtCep.setBackground(new java.awt.Color(153, 153, 153));
        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCep.setPreferredSize(null);

        txtCPF.setEditable(false);
        txtCPF.setBackground(new java.awt.Color(153, 153, 153));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Função:");

        txtFuncao.setEditable(false);
        txtFuncao.setBackground(new java.awt.Color(153, 153, 153));
        txtFuncao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtSalario.setBackground(new java.awt.Color(153, 153, 153));
        txtSalario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

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
                                .addGap(0, 575, Short.MAX_VALUE)
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txtDatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
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
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel3))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtDD, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel16)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAtualisar, btCancelar, btExcluir, btNovo, btSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPesquisar))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(46, 46, 46))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(11, 11, 11)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDatanasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNome)
                                    .addComponent(txtCPF)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(46, 46, 46))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
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

     DefaultTableModel tmFuncionaros = new DefaultTableModel(null, new String[]{"Código", "Nome", "CPF", "Data"});     
     
      private void limparcampos() {
            
                 txtNome.setText("");
                 txtFuncao.setText("");
                 txtCPF.setText("");
                 txtDatanasc.setDate(null);
                 txtLogradouro.setText("");
                 txtBairro.setText("");
                 txtNumero.setText("");
                 txtCidade.setText("");
                 txtCep.setText("");
                 txtUF.setText("");
                 txtSalario.setText("");
                 txtDD.setText("");
                 txtContato.setText("");
                 txtSalario.setText("");
               
    }
    
    private void camposhabilitados() {

                 txtNome.setEditable(true);
                 txtFuncao.setEditable(true);
                 txtCPF.setEditable(true);
                 txtDatanasc.setEnabled(true);
                 txtBairro.setEditable(true);
                 txtCidade.setEditable(true);
                 txtNumero.setEditable(true);
                 txtLogradouro.setEditable(true);
                 txtCep.setEditable(true);
                 txtUF.setEditable(true);
                 txtSalario.setEditable(true);
                 txtDD.setEditable(true);
                 txtContato.setEditable(true);                
                 txtSalario.setEditable(true);                
    }

    private void desabilitados() {

                 txtNome.setEditable(false);
                 txtFuncao.setEditable(false);
                 txtCPF.setEditable(false);
                 txtDatanasc.setEnabled(false);
                 txtBairro.setEditable(false);
                 txtCidade.setEditable(false);
                 txtNumero.setEditable(false);
                 txtLogradouro.setEditable(false);
                 txtCep.setEditable(false);
                 txtUF.setEditable(false);
                 txtSalario.setEditable(false);
                 txtDD.setEditable(false);
                 txtContato.setEditable(false);
                 txtSalario.setEditable(false);
                 
                
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

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        listaCliente();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        while (tmFuncionaros.getRowCount() > 0) {
            tmFuncionaros.removeRow(0);
        }
        limparcampos();
        salvar = 0;
        op = 0;
        txtDatanasc.setEnabled(false);
        txtDatanasc.setEnabled(false);
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
            AlterarFuncionario();
        }

    }//GEN-LAST:event_btAtualisarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (salvar == 1) {

            cadastraFuncionario();
            op = 0;
            txtPesquisar.setEditable(true);
            btPesquisar.setEnabled(true);
            tbFuncionarios.setEnabled(true);
        }
        else if (salvar == 2) {

            atualisarFuncionarios();
            listaCliente();
            limparcampos();
            op = 0;
        }
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
            novoCliente();
        }
    }//GEN-LAST:event_btNovoActionPerformed

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
    
    MenuRelatorios Relatorios; 
     private void novoCliente() {
              camposhabilitados();
              }
    
      private boolean testarcampos() {

      if (!txtNome.getText().trim().equals("")  && !txtUF.getText().trim().equals("") && txtUF.getText().trim().length() <= 2
          && txtCPF.getText().trim().length() == 14)
          {
                   return true;
                  }
                  JOptionPane.showMessageDialog(this, "OBSERVE SE OS CAMPOS FORAM PREENCHIDOS CORRETAMENTE !!!");
                  return false;
          }
    
     private void cadastraFuncionario(){

        if ( testarcampos() ) {
            
            ObjBeans = new Funcionariobeans();
            ObjBeans.setNome(txtNome.getText().trim());
            ObjBeans.setFuncao(txtFuncao.getText().trim());
            ObjBeans.setCPF(txtCPF.getText().trim());
            ObjBeans.setDatanasc(txtDatanasc.getDate());
            ObjBeans.setLogradouro(txtLogradouro.getText().trim());          
            ObjBeans.setBairro(txtBairro.getText().trim());
            ObjBeans.setNumero(txtNumero.getText().trim());
            ObjBeans.setCidade(txtCidade.getText().trim());
            ObjBeans.setCEP(txtCep.getText().trim());
            ObjBeans.setUF(txtUF.getText().trim());
            ObjBeans.setSalario(txtSalario.getText().trim());
            ObjBeans.setFone(txtContato.getText().trim());
            ObjBeans.setDD(txtDD.getText().trim());
           
            PessoasControl cli = new PessoasControl();
            cli.cadastroFuncionario(ObjBeans);
            desabilitados();
            limparcampos();
            
            JOptionPane.showMessageDialog(this, "FUNCIONARIO CADASTRADO COM EXITO !!!");
           }
        
    }
    
    
      private void atualisarFuncionarios(){

        if (testarcampos()){          
            
            PessoasControl func = new PessoasControl();
            
            ObjBeans.setNome(txtNome.getText());
            ObjBeans.setFuncao(txtFuncao.getText());
            ObjBeans.setCPF(txtCPF.getText());
            ObjBeans.setDatanasc(txtDatanasc.getDate());
            ObjBeans.setNumero(txtNumero.getText()); 
            ObjBeans.setLogradouro(txtLogradouro.getText());            
            ObjBeans.setBairro(txtBairro.getText());
            ObjBeans.setCidade(txtCidade.getText());
            ObjBeans.setCEP(txtCep.getText());
            ObjBeans.setUF(txtUF.getText());
            ObjBeans.setSalario(txtSalario.getText());
            ObjBeans.setDD(txtDD.getText());                  
            ObjBeans.setFone(txtContato.getText());
            ObjBeans.setFuncionarioPK(listObjForm.get(tbFuncionarios.getSelectedRow()).getFuncionarioPK());
            
            func.atualisarFuncionario(ObjBeans);
           
            desabilitados();
            limparcampos();
            JOptionPane.showMessageDialog(this, "FUNCIONARIO ATUALISADO COM EXITO !!!");
          }
      }
     
     private void AlterarFuncionario() {

        if (tbFuncionarios.getSelectedRow() != -1) {
            camposhabilitados();
            btNovo.setEnabled(false);
            btSalvar.setEnabled(true);           
            }
             else 
                 {
                 JOptionPane.showMessageDialog(this, "SELECIONE UM FUNCIONARIO !!!");
                 }
          }
    
    
 private void listaCliente() {

        PessoasControl   funci = new PessoasControl();

        listObjForm = funci.listarFuncionarios("%" + txtPesquisar.getText().trim() + "%");

        visualizarFuncionario(listObjForm);

        }
       
  private void visualizarFuncionario(ArrayList<Funcionariobeans > Funcionario) {

        while (tmFuncionaros.getRowCount() > 0) {
                tmFuncionaros.removeRow(0);
                }

        String[] campos = new String[]{null, null, null, null};

        if (Funcionario.size() == 0) {
            
            txtPesquisar.setText("");
            JOptionPane.showMessageDialog(null, "NENHUM FUNCIONARIO ENCONTRADO !!!");
           }
           else {

                for (int i = 0; i < Funcionario.size(); i++) {

                      tmFuncionaros.addRow(campos);
                      tmFuncionaros.setValueAt(Funcionario.get(i).getFuncionarioPK(), i, 0);
                      tmFuncionaros.setValueAt(Funcionario.get(i).getNome(), i, 1);
                      tmFuncionaros.setValueAt(Funcionario.get(i).getCPF(), i, 2);
                      tmFuncionaros.setValueAt(Funcionario.get(i).getDatanasc(), i, 3);
                     }

               }
       }     
    
  
     private void tbFuncionarioLinhaSelecionada(JTable tb) {
      
       
         if (tb.getSelectedRow() != -1) {                
           
                  txtNome.setText(listObjForm.get(tb.getSelectedRow()).getNome());
                  txtFuncao.setText(listObjForm.get(tb.getSelectedRow()).getFuncao());
                  txtCPF.setText(listObjForm.get(tb.getSelectedRow()).getCPF());
                  txtDatanasc.setDate(listObjForm.get(tb.getSelectedRow()).getDatanasc());
                  txtLogradouro.setText(listObjForm.get(tb.getSelectedRow()).getLogradouro());
                  txtBairro.setText(listObjForm.get(tb.getSelectedRow()).getBairro());
                  txtNumero.setText(listObjForm.get(tb.getSelectedRow()).getNumero());
                  txtCidade.setText(listObjForm.get(tb.getSelectedRow()).getCidade());
                  txtCep.setText(listObjForm.get(tb.getSelectedRow()).getCEP());
                  txtUF.setText(listObjForm.get(tb.getSelectedRow()).getUF());
                  txtSalario.setText(listObjForm.get(tb.getSelectedRow()).getSalario());
                  txtDD.setText(listObjForm.get(tb.getSelectedRow()).getDD());
                  txtContato.setText(listObjForm.get(tb.getSelectedRow()).getFone());              
                
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
            java.util.logging.Logger.getLogger(MenuFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFuncionarios().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JMenuItem miVendasaprazo;
    private javax.swing.JMenuItem miVendasavista;
    private javax.swing.JMenuItem miVendaslanches;
    private javax.swing.JTable tbFuncionarios;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtContato;
    private javax.swing.JFormattedTextField txtDD;
    private com.toedter.calendar.JDateChooser txtDatanasc;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}
