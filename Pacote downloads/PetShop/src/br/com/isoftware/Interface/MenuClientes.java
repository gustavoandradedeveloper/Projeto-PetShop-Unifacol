
package br.com.isoftware.Interface;

import br.com.isoftware.Calendario.calendario;
import br.com.isoftware.beans.Clientebeans;
import br.com.isoftware.control.PessoasControl;
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
public class MenuClientes extends javax.swing.JFrame {

   
    public MenuClientes() {
        
        initComponents();
    }
    
  ListSelectionModel lsmClientes; 
  ArrayList<Clientebeans> listObjForm = new ArrayList();
    Clientebeans ObjBeans = new Clientebeans();
 
    int salvar, op = 0;   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoPessoa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btAtualisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        txtCep = new javax.swing.JFormattedTextField();
        txtDD = new javax.swing.JFormattedTextField();
        txtContato = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ATcadasFuncionarios = new javax.swing.JMenuItem();
        ATcadasProdutos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU CLIENTES");

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 680));

        tbClientes.setBackground(new java.awt.Color(153, 153, 153));
        tbClientes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tbClientes.setModel(tmClientes);
        tbClientes.setRowHeight(30);
        tbClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmClientes = tbClientes .getSelectionModel();
        lsmClientes.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {

                if(! e.getValueIsAdjusting() ){

                    tbClientesLinhaSelecionada(tbClientes);

                }
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        btNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/novo.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/save.png"))); // NOI18N
        btSalvar.setText("Salvar");
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
        jLabel2.setBounds(10, 0, 630, 44);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Contato:");

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

        txtCidade.setEditable(false);
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
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isoftware/Imagens/pesquisar1.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        txtDatanasc.setBackground(new java.awt.Color(153, 153, 153));
        txtDatanasc.setEnabled(false);
        txtDatanasc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDatanasc.setPreferredSize(null);

        txtNumero.setEditable(false);
        txtNumero.setBackground(new java.awt.Color(153, 153, 153));
        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Numero:");

        txtCep.setEditable(false);
        txtCep.setBackground(new java.awt.Color(153, 153, 153));
        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCep.setPreferredSize(null);

        txtDD.setEditable(false);
        txtDD.setBackground(new java.awt.Color(153, 153, 153));
        try {
            txtDD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDD.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtContato.setEditable(false);
        txtContato.setBackground(new java.awt.Color(153, 153, 153));
        try {
            txtContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(####-####)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtContato.setPreferredSize(null);

        txtCPF.setEditable(false);
        txtCPF.setBackground(new java.awt.Color(153, 153, 153));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("CPF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtDatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(262, 262, 262))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDD, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(584, 584, 584)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btAtualisar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome)
                    .addComponent(txtCPF)
                    .addComponent(txtDatanasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero)
                            .addComponent(txtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel14))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualisar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jMenu1.setText("Cadastras");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1157, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1116, 718));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel tmClientes = new DefaultTableModel(null, new String[]{"Nome", "CPF", "Logradouro", "Contato"});
     
      private void limparcampos() {
            
                 txtNome.setText("");
                 txtCPF.setText("");
                 txtDatanasc.setDate(null);
                 txtLogradouro.setText("");
                 txtBairro.setText("");
                 txtNumero.setText("");
                 txtCidade.setText("");
                 txtCep.setText("");
                 txtUF.setText("");
                 txtDD.setText("");
                 txtContato.setText("");
               
                 }
    
    private void camposhabilitados() {

                 txtNome.setEditable(true);
                 txtCidade.setEditable(true);
                 txtDatanasc.setEnabled(true);
                 txtBairro.setEditable(true);
                 txtCPF.setEditable(true);
                 txtNumero.setEditable(true);
                 txtLogradouro.setEditable(true);
                 txtCep.setEditable(true);
                 txtUF.setEditable(true);
                 txtDD.setEditable(true);
                 txtDD.setEditable(true);
                 txtContato.setEditable(true); 
                
    }

    private void desabilitados() {

                 txtNome.setEditable(false);
                 txtCidade.setEditable(false);
                 txtDatanasc.setEnabled(false);
                 txtBairro.setEditable(false);
                 txtCPF.setEditable(false);
                 txtNumero.setEditable(false);
                 txtLogradouro.setEditable(false);
                 txtCep.setEditable(false);
                 txtUF.setEditable(false);
                 txtDD.setEditable(false);
                 txtContato.setEditable(false);
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
    
    
    private void ATcadasFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATcadasFuncionariosActionPerformed
        visualisaFuncionarios();
    }//GEN-LAST:event_ATcadasFuncionariosActionPerformed

    private void ATcadasProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATcadasProdutosActionPerformed
        visualisaProdutos();
    }//GEN-LAST:event_ATcadasProdutosActionPerformed

    
     
     private void novoCliente() {
              camposhabilitados();
              }
    
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed

        
        while (tmClientes.getRowCount() > 0) {
               tmClientes.removeRow(0);
               }
               if (op == 0 || op == 1) {
                   op = 1;
                   salvar = 1;
                   btAtualisar.setEnabled(false); 
                   btSalvar.setEnabled(true);                   
                   btPesquisar.setEnabled(false);
                   tbClientes.setEnabled(false);
                   novoCliente();
                   }
    }//GEN-LAST:event_btNovoActionPerformed

      private boolean testarcampos() {

      if (!txtNome.getText().trim().equals("")  && !txtUF.getText().trim().equals("") && txtUF.getText().trim().length() <= 2
          && txtCPF.getText().trim().length() == 14)
          {
                   return true;
                  }
                  JOptionPane.showMessageDialog(this, "OBSERVE SE OS CAMPOS FORAM PREENCHIDOS CORRETAMENTE !!!");
                  return false;
          }
    
     private void cadastraCliente(){

        if ( testarcampos()) {
            
            ObjBeans = new Clientebeans();
            ObjBeans.setNome(txtNome.getText().trim());
            ObjBeans.setCPF(txtCPF.getText().trim().replace(".","").replace("-",""));
            ObjBeans.setDatanasc(txtDatanasc.getDate());
            ObjBeans.setLogradouro(txtLogradouro.getText().trim());          
            ObjBeans.setBairro(txtBairro.getText().trim());
            ObjBeans.setNumero(txtNumero.getText().trim());
            ObjBeans.setCidade(txtCidade.getText().trim());
            ObjBeans.setCEP(txtCep.getText().trim().replace("-",""));
            ObjBeans.setUF(txtUF.getText().trim());
            ObjBeans.setFone(txtContato.getText().trim());
            ObjBeans.setDD(txtDD.getText().trim());
            ObjBeans.setClientePK(1);
            PessoasControl cli = new PessoasControl();
            if(cli.cadastroCliente(ObjBeans)){
                desabilitados();
                limparcampos();            
                JOptionPane.showMessageDialog(this, "CLIENTE CADASTRADO COM SUCESSO !!!");
            }else{
                JOptionPane.showMessageDialog(this, "CLIENTE NÃO CADASTRADO !!!");
            }
        }
  }
    
    
      private void atualisarCliente(){

        if (testarcampos()){          
            
            PessoasControl cli = new PessoasControl();                  
            ObjBeans.setNome(txtNome.getText());   
            ObjBeans.setCPF(txtCPF.getText());
            ObjBeans.setDatanasc(txtDatanasc.getDate());
            ObjBeans.setNumero(txtNumero.getText()); 
            ObjBeans.setLogradouro(txtLogradouro.getText());            
            ObjBeans.setBairro(txtBairro.getText());
            ObjBeans.setCidade(txtCidade.getText());
            ObjBeans.setCEP(txtCep.getText());
            ObjBeans.setUF(txtUF.getText());
            ObjBeans.setDD(txtDD.getText());                  
            ObjBeans.setFone(txtContato.getText());  
            ObjBeans.setClientePK(listObjForm.get(tbClientes.getSelectedRow()).getClientePK());
            
            if(cli.atualisarClientes(ObjBeans)){
                desabilitados();
                limparcampos();
                JOptionPane.showMessageDialog(this, "CLIENTE ATUALISADO COM SUCESSO !!!");
            }else{
                JOptionPane.showMessageDialog(this, "CLIENTE NÃO ATUALISADO !!!");
            }
            
        }
    }
     
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        
        if (salvar == 1) {
          
             cadastraCliente();           
             op = 0;
             txtPesquisar.setEditable(true);
             btPesquisar.setEnabled(true);
             tbClientes.setEnabled(true);
             desabilitados();
             }
              else if (salvar == 2) {
           
                       atualisarCliente();
                       listaCliente();           
                       limparcampos();
                       op = 0;
                      }
    }//GEN-LAST:event_btSalvarActionPerformed

     private void AlterarCliente() {

        if (tbClientes.getSelectedRow() != -1) {
            camposhabilitados();
            btNovo.setEnabled(false);
            btSalvar.setEnabled(true);           
        }
         else{
             JOptionPane.showMessageDialog(this, "SELECIONE UM CLIENTE !!!");
        }
    }
    
    
    private void btAtualisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualisarActionPerformed
       
           if (op == 0 || op == 2) {
                  op = 2;
                  salvar = 2;                
                  AlterarCliente();
            }
        
    }//GEN-LAST:event_btAtualisarActionPerformed

    private void excluirCliente(int codigo){
        
        PessoasControl cliente = new PessoasControl();
        if(cliente.excluirPessoa(codigo, 0)){
            JOptionPane.showMessageDialog(this, "CLIENTE EXCLUIDO COM SUCESSO !!!");
            listaCliente();
            desabilitados();
        }else{
            JOptionPane.showMessageDialog(this, "CLIENTE NÃO EXCLUIDO !!!");
        }
    }
    
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
         
        if (tbClientes.getSelectedRow() != -1) {
            
            int resposta = JOptionPane.showConfirmDialog(this,"DESEJA EXCLUIR ESTE CLIENTE?", "Confirmação", JOptionPane.YES_NO_OPTION);  
            if(resposta == JOptionPane.YES_OPTION){
                excluirCliente(listObjForm.get(tbClientes.getSelectedRow()).getClientePK());
                listaCliente();
            }
        }else{
            JOptionPane.showMessageDialog(this, "SELECIONE UM CLIENTE !!!");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
             
        while (tmClientes.getRowCount() > 0) {
            tmClientes.removeRow(0);
            }
            limparcampos();
            salvar = 0;
            op = 0;
           
            txtDatanasc.setEnabled(false);
            btAtualisar.setEnabled(true);
            btNovo.setEnabled(true);
            btPesquisar.setEnabled(true);
            txtPesquisar.setEditable(true);
            tbClientes.setEnabled(true);
            btSalvar.setEnabled(false);
            desabilitados();
    }//GEN-LAST:event_btCancelarActionPerformed

 private void listaCliente() {

        PessoasControl   cli = new PessoasControl();

        listObjForm = cli.listarClientes("%" + txtPesquisar.getText().trim() + "%");

        visualizarClientes(listObjForm);

        }
       
  private void visualizarClientes(ArrayList<Clientebeans > clientes) {

        while (tmClientes.getRowCount() > 0) {
                tmClientes.removeRow(0);
                }

        String[] campos = new String[]{null, null, null, null};

        if (clientes.isEmpty()){
            
            txtPesquisar.setText("");
            JOptionPane.showMessageDialog(null, "NENHUM CLIENTE ENCONTRADO !!!");
           }
           else {

                for (int i = 0; i < clientes.size(); i++) {

                      tmClientes.addRow(campos);
                      tmClientes.setValueAt(clientes.get(i).getNome(), i, 0);
                      tmClientes.setValueAt(clientes.get(i).getCPF(), i, 1);
                      tmClientes.setValueAt(clientes.get(i).getLogradouro(), i, 2);
                      tmClientes.setValueAt(clientes.get(i).getFone(), i, 3);
                }
            }
       }     
    
  
     private void tbClientesLinhaSelecionada(JTable tb) {
       
        if (tb.getSelectedRow() != -1) {                
           
            txtNome.setText(listObjForm.get(tb.getSelectedRow()).getNome());
            txtCPF.setText(listObjForm.get(tb.getSelectedRow()).getCPF());
            txtDatanasc.setDate(listObjForm.get(tb.getSelectedRow()).getDatanasc());
            txtLogradouro.setText(listObjForm.get(tb.getSelectedRow()).getLogradouro());
            txtBairro.setText(listObjForm.get(tb.getSelectedRow()).getBairro());
            txtNumero.setText(listObjForm.get(tb.getSelectedRow()).getNumero());
            txtCidade.setText(listObjForm.get(tb.getSelectedRow()).getCidade());
            txtCep.setText(listObjForm.get(tb.getSelectedRow()).getCEP());
            txtUF.setText(listObjForm.get(tb.getSelectedRow()).getUF());
            txtDD.setText(listObjForm.get(tb.getSelectedRow()).getDD());
            txtContato.setText(listObjForm.get(tb.getSelectedRow()).getFone());                

            desabilitados();                     
        }else { 
             
            limparcampos();
        }
    }
  
  
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
      listaCliente();
    }//GEN-LAST:event_btPesquisarActionPerformed

      
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            Runtime.getRuntime().exec("calc.exe");
        } catch (Exception ex) {
            ex.printStackTrace();
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
        //</editor-fold>
         
        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuClientes().setVisible(true);
              
            }
        });
        
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ATcadasFuncionarios;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtContato;
    private javax.swing.JFormattedTextField txtDD;
    private com.toedter.calendar.JDateChooser txtDatanasc;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}
