package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import service.AllCompanies;
import model.Article;
import model.Customer;
import utilities.DateUtility;
import utilities.NumberUtility;
import model.Company;
import model.Recipt;
import service.CompanyService;
import service.CustormerService;
import service.ReciptService;
import utilities.FileUtility;

/**
 *
 * @author gvozden.zavisic@gmail.com
 */
public class MainUi
        extends javax.swing.JFrame {

    public List<Article> listOfArticles = new ArrayList<>();
    public List<Customer> listOfCompanies = new ArrayList<>();
    public static DefaultComboBoxModel DLM;
    public int count = 1;
    public String jm;
    public LocalDate ldate = LocalDate.now();

    public MainUi() {
        initComponents();
        FileUtility.createMainFolder();
        paintHeader();
        setComboModel();
        setSettingsDisabled();
        printButtonOff();
        this.setTitle("ŠtampajRačun v.1.0.2 Beta");
        textDateOfSell.setText(DateUtility.now());
        textValuteDate.setText(DateUtility.now());
        textReciptCity.setText(lblCity.getText());

        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent we) {
                int result = JOptionPane.showConfirmDialog(null,
                        "Napuštanje programa! Da li si siguran?",
                        "IZLAZ",
                        JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHead = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblAdd = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblPibAndAcc = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        lblCity = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        textReciptNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textCustomer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textCustomerAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textTown = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textCustomerPib = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textCustomerId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textDateOfSell = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textValuteDate = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        checkToSave = new javax.swing.JCheckBox();
        textReciptCity = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btnSaveCustomer = new javax.swing.JButton();
        comboCustomers = new javax.swing.JComboBox<>();
        btnLoadCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        btnUpdateCustomer = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        textArticleCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textArticleName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        spinnerQty = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        textPdv = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        textPrice = new javax.swing.JTextField();
        btnInsert = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        textJm = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        btnDeleteAll = new javax.swing.JToggleButton();
        btnCheck = new javax.swing.JButton();
        btnPrint = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textAddress = new javax.swing.JTextField();
        textPhone = new javax.swing.JTextField();
        textPib = new javax.swing.JTextField();
        textAccNo = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnAccept = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        textPDVrate = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        textMeasure = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        textCity = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelHead.setBackground(java.awt.Color.gray);
        panelHead.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblName.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lblName.setForeground(java.awt.Color.white);
        lblName.setText("-----");

        lblAdd.setForeground(java.awt.Color.white);
        lblAdd.setText("----");

        lblTel.setForeground(java.awt.Color.white);
        lblTel.setText("---");

        lblPibAndAcc.setForeground(java.awt.Color.white);
        lblPibAndAcc.setText("----");

        separator1.setBackground(java.awt.Color.white);

        lblCity.setForeground(java.awt.Color.white);
        lblCity.setText("---");

        javax.swing.GroupLayout panelHeadLayout = new javax.swing.GroupLayout(panelHead);
        panelHead.setLayout(panelHeadLayout);
        panelHeadLayout.setHorizontalGroup(
            panelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator1)
                    .addGroup(panelHeadLayout.createSequentialGroup()
                        .addGroup(panelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblTel)
                            .addComponent(lblPibAndAcc)
                            .addGroup(panelHeadLayout.createSequentialGroup()
                                .addComponent(lblAdd)
                                .addGap(26, 26, 26)
                                .addComponent(lblCity)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelHeadLayout.setVerticalGroup(
            panelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeadLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdd)
                    .addComponent(lblCity))
                .addGap(1, 1, 1)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblTel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPibAndAcc)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Broj računa");

        jLabel7.setText("Kupac");

        jLabel10.setText("Adresa");

        textTown.setText("Požarevac");

        jLabel11.setText("Mesto");

        textCustomerPib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCustomerPibActionPerformed(evt);
            }
        });

        jLabel12.setText("PIB");

        jLabel13.setText("Mat. br.");

        jLabel14.setText("Datum prodaje");

        jLabel15.setText("Datum valute");

        checkToSave.setText("Zapamti račun");

        jLabel23.setText("Mesto izdavanja");

        btnSaveCustomer.setText("Snimi podatke");
        btnSaveCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCustomerActionPerformed(evt);
            }
        });

        btnLoadCustomer.setText("Učitaj podatke");
        btnLoadCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadCustomerActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setForeground(java.awt.Color.red);
        btnDeleteCustomer.setText("Obriši kupca");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        btnUpdateCustomer.setText("Izmeni podatke");
        btnUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustomerActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Noto Sans", 3, 12)); // NOI18N
        jLabel24.setText("Izaberi snimljenog kupca");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel23)
                            .addComponent(checkToSave))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textReciptCity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textValuteDate)
                            .addComponent(textDateOfSell)
                            .addComponent(textCustomerId)
                            .addComponent(textCustomerPib)
                            .addComponent(textTown, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(textCustomerAddress)
                            .addComponent(textCustomer)
                            .addComponent(textReciptNo)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoadCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeleteCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textReciptNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCustomerPib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDateOfSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textValuteDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textReciptCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(checkToSave)
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSaveCustomer)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnUpdateCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeleteCustomer)
                            .addComponent(btnLoadCustomer)))
                    .addComponent(comboCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Šifra");

        jLabel9.setText("Naziv proizvoda");

        jLabel16.setText("Kolicina");

        jLabel17.setText("PDV");

        textPdv.setText("20");

        jLabel18.setText("Cena");

        btnInsert.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        btnInsert.setText("UNESI");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "R.br.", "Šifra", "Naziv artikla", "J.M.", "Kol.", "Cena bez PDV-a", "Iznos bez PDV-a", "Stopa PDV", "Iznos PDV", "UKUPNO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(150);
        }

        btnDelete.setForeground(java.awt.Color.red);
        btnDelete.setText("OBRIŠI");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel21.setText("J.M.");

        jToggleButton2.setText("OTVORI");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        btnDeleteAll.setForeground(java.awt.Color.red);
        btnDeleteAll.setText("PONIŠTI");
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });

        btnCheck.setText("PROVERI");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnPrint.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        btnPrint.setText("ŠTAMPAJ");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textArticleCode, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textArticleName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textJm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCheck)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textArticleCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(textArticleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(spinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(textPdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert)
                    .addComponent(btnDelete)
                    .addComponent(textJm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2)
                    .addComponent(btnDeleteAll)
                    .addComponent(btnCheck)
                    .addComponent(btnPrint))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(292, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Račun", jPanel1);

        jLabel1.setText("Unesi naziv firme");

        jLabel2.setText("Unesi adresu firme");

        jLabel3.setText("Unesi broj telefona");

        jLabel4.setText("Unesi PIB");

        jLabel5.setText("Unesi broj računa");

        jCheckBox1.setText("Uključi editor");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btnAccept.setText("Potvrdi promene");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnCancel.setForeground(java.awt.Color.red);
        btnCancel.setText("Poništi promene");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        textPDVrate.setText("20");

        jLabel19.setText("Unesi stopu PDV-a");

        textMeasure.setText("kom.");

        jLabel20.setText("Unesi jedinicu mere");

        jLabel22.setText("Unesi mesto");

        jToggleButton1.setFont(new java.awt.Font("Noto Sans", 2, 12)); // NOI18N
        jToggleButton1.setForeground(java.awt.Color.blue);
        jToggleButton1.setText("O programu");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel19)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel22)
                    .addComponent(jLabel3)
                    .addComponent(btnAccept))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(jToggleButton1))
                    .addComponent(textAddress)
                    .addComponent(textPhone)
                    .addComponent(textPib)
                    .addComponent(textAccNo)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(textPDVrate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(textMeasure, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textCity)
                    .addComponent(textName))
                .addContainerGap(919, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textPib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPDVrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMeasure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnCancel)
                    .addComponent(jToggleButton1))
                .addContainerGap(415, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Postavke", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        JOptionPane.showMessageDialog(null,
                "Program: 'ŠtampajRačun'\n========================\nVersion: 1.0.2 Beta\nDeveloped by: gvozden.zavisic@gmail.com\nDeveloped for: CustomSoft-Belgrade, Serbia\nMarch, 2019.");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        int result = JOptionPane.showConfirmDialog(null,
                "Da li si siguran?",
                "BRISANJE POSTAVKI",
                JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            textName.setText("");
            textAddress.setText("");
            textPhone.setText("");
            textCity.setText("");
            textPib.setText("");
            textAccNo.setText("");
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed

        if (textName.getText().
                isEmpty() || textAccNo.getText().
                        isEmpty()
                || textAddress.getText().
                        isEmpty() || textPhone.getText().
                        isEmpty()
                || textPib.getText().
                        isEmpty() || textPDVrate.getText().
                        isEmpty()
                || textMeasure.getText().
                        isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Sva polja moraju biti popunjena!",
                    "GREŠKA",
                    2);
        } else if (!utilities.NumberUtility.isInteger(textPDVrate.getText())) {
            JOptionPane.showMessageDialog(null,
                    "Poreska stopa mora biti numerička vrednost!",
                    "GREŠKA",
                    2);
        } else {

            Company fd = new Company(textName.getText(),
                    textAddress.getText(),
                    textCity.getText(),
                    textPib.getText(),
                    textAccNo.getText(),
                    textPhone.getText(),
                    textPDVrate.getText(),
                    textMeasure.getText());
            try {
                CompanyService.saveCompany(fd);
            } catch (IOException ex) {
                Logger.getLogger(MainUi.class.getName()).
                        log(Level.SEVERE,
                                null,
                                ex);
            }
            jm = textMeasure.getText();
            textJm.setText(textMeasure.getText());
            textPdv.setText(textPDVrate.getText());
            textReciptCity.setText(textCity.getText());
            paintHeader();
            jCheckBox1.setSelected(false);
            setSettingsDisabled();
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            setSettingsEnabled();
        } else if (!jCheckBox1.isSelected()) {
            setSettingsDisabled();
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int rowNo = jTable1.getSelectedRow();
        if (rowNo > -1) {
            int value = (int) jTable1.getModel().
                    getValueAt(rowNo,
                            0);
            listOfArticles.remove(value - 1);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            int counter = 1;

            for (Article listOfArticle : listOfArticles) {
                Object[] rowObj = {counter++, listOfArticle.ean, listOfArticle.name, listOfArticle.unit, listOfArticle.qty, listOfArticle.priceWithoutTaxPerPiece, (listOfArticle.priceWithoutTaxPerPiece * listOfArticle.qty), listOfArticle.tax, listOfArticle.taxAllPieces, listOfArticle.priceWithTaxAllPieces};
                model.addRow(rowObj);
                jTable1.repaint();
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Nije selektovan ni jedan artikal!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        try {
            if (NumberUtility.isInteger(textArticleCode.getText()) && Integer.
                    parseInt(spinnerQty.getValue().
                            toString()) > 0 && Double.parseDouble(textPrice.
                            getText()) > 0 && Integer.
                            parseInt(textPdv.getText()) >= 0 && NumberUtility.
                    isDouble(textPrice.getText())) {

                Article art = new Article(Integer.parseInt(textArticleCode.
                        getText()),
                        textArticleName.getText(),
                        textJm.getText(),
                        Integer.parseInt(spinnerQty.getValue().
                                toString()),
                        Double.parseDouble(textPrice.getText()),
                        Integer.parseInt(textPdv.getText()));
                listOfArticles.add(art);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                count = 1;

                for (Article listOfArticle : listOfArticles) {
                    Object[] rowObj = {count++, listOfArticle.ean, listOfArticle.name, listOfArticle.unit, listOfArticle.qty, listOfArticle.priceWithoutTaxPerPiece, (listOfArticle.priceWithoutTaxPerPiece * listOfArticle.qty), listOfArticle.tax, listOfArticle.taxAllPieces, listOfArticle.priceWithTaxAllPieces};
                    model.addRow(rowObj);
                    jTable1.repaint();
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Vrednosti unosa nisu ispravne!");
            }
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null,
                    "Neka vrednost nije numerička!");
        } catch (Exception exp) {
            JOptionPane.showMessageDialog(null,
                    "Unos nije ispravan!");
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnSaveCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCustomerActionPerformed

        if (!textCustomer.getText().
                isEmpty() && !textCustomerPib.getText().
                        isEmpty()
                && !textCustomerId.getText().
                        isEmpty()) {
            ArrayList allCompanies = (ArrayList) AllCompanies.getCompanies();
            boolean isOK = false;
            if (allCompanies.isEmpty()) {
                isOK = true;
            } else {
                for (int i = 0; i < allCompanies.size(); i++) {
                    Customer cdl = (Customer) allCompanies.get(i);
                    if (!cdl.customerId.equals(textCustomerId.getText()) && !cdl.customerPib.
                            equals(textCustomerPib.getText())) {
                        isOK = true;
                    } else {
                        isOK = false;
                        break;
                    }
                }
            }
            if (isOK) {
                Customer saveNew = new Customer(textCustomer.
                        getText(),
                        textCustomerAddress.getText(),
                        textTown.getText(),
                        textCustomerPib.getText(),
                        textCustomerId.getText());
                try {
                     CustormerService.saveCustomer(saveNew);
                    allCompanies = (ArrayList) AllCompanies.getCompanies();
                    setComboModel();
                    comboCustomers.revalidate();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Nešto nije u redu sa imenom kompanije.\nNije moguće snimiti.");
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Postoji kupac sa istim PIB ili Maticnim brojem");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Neke vrednosti su nepopunjene!");
        }
    }//GEN-LAST:event_btnSaveCustomerActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        JFileChooser jfc = new JFileChooser();
        File path = new File(FileUtility.firmPath + FileUtility.separator + "rcpts");
        jfc.setDialogTitle("Otvori postojeći račun");
        //************************FILTER FILE****************************
        FileFilter ff = new FileFilter() {
            public boolean accept(File f) {
                return f.getName().
                        startsWith("R-");
            }

            @Override
            public String getDescription() {
                return "Računi";
            }
        };
        jfc.setFileFilter(ff); 
        //*************************END FILTER***
        jfc.setCurrentDirectory(path);
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int result = jfc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            try {
                Recipt rdl = ReciptService.getRecipt(selectedFile);
                textReciptNo.setText(rdl.reciptNo);
                textCustomer.setText(rdl.customer);
                textCustomerAddress.setText(rdl.custAddress);
                textTown.setText(rdl.custCity);
                textCustomerPib.setText(rdl.custPIB);
                textCustomerId.setText(rdl.custId);
                textDateOfSell.setText(rdl.dateOfSell);
                textValuteDate.setText(rdl.dateValute);
                textReciptCity.setText(rdl.reciptCity);

                DefaultTableModel model2 = (DefaultTableModel) jTable1.
                        getModel();
                model2.setRowCount(0);
                int count = 1;

                for (Article art : rdl.articles) {
                    Object[] rowObj = {count++, art.ean, art.name, art.unit, art.qty, art.priceWithoutTaxPerPiece, (art.priceWithoutTaxPerPiece * art.qty), art.tax, art.taxAllPieces, art.priceWithTaxAllPieces};
                    model2.addRow(rowObj);
                    jTable1.repaint();
                    listOfArticles.add(art);
                }
            } catch (IOException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null,
                        "Izabrani fajl nije ispravan.");
            }
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        textReciptNo.setText("");
        textCustomer.setText("");
        textCustomerAddress.setText("");
        textTown.setText("");
        textCustomerPib.setText("");
        textCustomerId.setText("");
        textDateOfSell.setText("");
        textValuteDate.setText("");
        textReciptCity.setText("");
    }//GEN-LAST:event_btnDeleteAllActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        PrintPreview.printMyPage();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        Recipt rdt = new Recipt(textReciptNo.getText(),
                textCustomer.getText(),
                textCustomerAddress.getText(),
                textTown.getText(),
                textCustomerPib.getText(),
                textCustomerId.getText(),
                textReciptCity.getText(),
                textDateOfSell.getText(),
                textValuteDate.getText(),
                listOfArticles);
        PrintPreview pp = new PrintPreview();
        pp.tableSet(listOfArticles);
        pp.setVisible(true);
        //HEADER BOX
        pp.labelMyName.setText(lblName.getText());
        pp.labelMyAddress.setText(lblAdd.getText() + ", " + lblCity.getText());
        pp.labelMyPhone.setText(lblTel.getText());
        pp.labelMyPibAcc.setText(lblPibAndAcc.getText());
        //TOP-LEFT BOX
        pp.labelReciptNo.setText("Račun br.   " + textReciptNo.getText());
        pp.labelDateToday.setText("Datum: " + DateUtility.now());
        pp.labelDateSell.setText("Datum prodaje: " + textDateOfSell.getText());
        pp.labelDateValute.setText("Datum valute: " + textValuteDate.getText());
        //TOP-RIGHT BOX
        pp.labelCustomer.setText("Kupac: " + textCustomer.getText());
        pp.labelCustomerAddress.setText("Adresa: " + textCustomerAddress.
                getText() + ", " + textTown.getText());
        pp.labelCustomerPib.setText("PIB: " + textCustomerPib.getText());
        pp.labelCustId.setText("Matični broj: " + textCustomerId.getText());
        //CENTER-LEFT
        double justPdvSum = 0;
        double priceWithoutTaxSum = 0;
        for (Article listOfArticle : listOfArticles) {
            justPdvSum += listOfArticle.taxAllPieces;
            priceWithoutTaxSum += listOfArticle.priceWithoutTaxPerPiece * listOfArticle.qty;
        }
        pp.labelBasicTax.setText(
                "Poreska stopa opšta: " + textPdv.getText() + "%       " + String.
                format("%.2f",
                        justPdvSum));
        pp.labelTotalTax.setText("UKUPNO PDV:                   " + String.
                format("%.2f",
                        justPdvSum));
        //CENTER-RIGHT
        pp.labelRootTax.setText("Osnovica za obračun PDV:     " + String.format(
                "%.2f",
                priceWithoutTaxSum));
        pp.labelJustTax.setText("Iznos obračunatog PDV:          " + String.
                format("%.2f",
                        justPdvSum));
        pp.labelTaxForPay.setText(
                "PDV za naplatu:                      " + String.format("%.2f",
                        justPdvSum));
        pp.labelTotalForPay.setText("UKUPNO ZA UPLATU:            " + String.
                format("%.2f",
                        (justPdvSum + priceWithoutTaxSum)));

        if (checkToSave.isSelected()) {
            if (!textReciptNo.getText().
                    isEmpty() && NumberUtility.
                            isInteger(textReciptNo.getText())) {
                try {
                    ReciptService.saveRecipt(rdt);
                    JOptionPane.showMessageDialog(null,
                            "Račun je uspešno snimljen");
                } catch (IOException ex) {
                    Logger.getLogger(MainUi.class.getName()).
                            log(Level.SEVERE,
                                    null,
                                    ex);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Za snimanje računa mora postojati ispravan broj računa!\nRačun neće biti snimljen!");
            }

        }

        printButtonOn();
    }//GEN-LAST:event_btnCheckActionPerformed

    private void textCustomerPibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCustomerPibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCustomerPibActionPerformed

    private void btnLoadCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadCustomerActionPerformed
        ArrayList allCompanies = (ArrayList) AllCompanies.getCompanies();
        if (allCompanies.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Nema snimljenih podataka!");
        } else {
            for (int i = 0; i < allCompanies.size(); i++) {
                Customer cdl = (Customer) allCompanies.get(i);
            }

            int k = comboCustomers.getSelectedIndex();
            Customer cdl = (Customer) allCompanies.get(k);
            textCustomer.setText(cdl.customerName);
            textCustomerAddress.setText(cdl.customerAddress);
            textCustomerPib.setText(cdl.customerPib);
            textTown.setText(cdl.customerCity);
            textCustomerId.setText(cdl.customerId);
        }
    }//GEN-LAST:event_btnLoadCustomerActionPerformed

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed

        ArrayList allCompanies = (ArrayList) AllCompanies.getCompanies();
        if (allCompanies.size() > 0) {
            int result = JOptionPane.showConfirmDialog(null,
                    "Da li si siguran?",
                    "BRISANJE KOMPANIJE",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                int c = comboCustomers.getSelectedIndex();
                Customer cc = (Customer) allCompanies.get(c);
                String company = cc.customerName;
                AllCompanies.deleteCompany(company);
                setComboModel();
                comboCustomers.revalidate();
            }

        } else {
            JOptionPane.showMessageDialog(null,
                    "Nema podataka za brisanje!");
        }
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void btnUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustomerActionPerformed
        ArrayList allCompanies = (ArrayList) AllCompanies.getCompanies();
        int result = JOptionPane.showConfirmDialog(null,
                "Da li si siguran?",
                "IZMENA PODATAKA KOMPANIJE",
                JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            boolean isOK = false;
            for (int i = 0; i < allCompanies.size(); i++) {
                Customer cdl = (Customer) allCompanies.get(i);
                if (!cdl.customerId.equals(textCustomerId.getText()) && !cdl.customerPib.
                        equals(textCustomerPib.getText())) {
                    isOK = true;
                } else {
                    isOK = false;
                    break;
                }
            }
            if (isOK) {

                JOptionPane.showMessageDialog(null,
                        "Nepostoji kupac sa ovim PIB ili Maticnim brojem\nNije moguće izmeniti.");

            } else {
                Customer updateCustomer = new Customer(
                        textCustomer.getText(),
                        textCustomerAddress.getText(),
                        textTown.getText(),
                        textCustomerPib.getText(),
                        textCustomerId.getText());
                try {
                    CustormerService.saveCustomer(updateCustomer);
                    setComboModel();
                    comboCustomers.revalidate();

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Nešto nije u redu sa imenom kompanije.\nNije moguće snimiti.");
                }
            }

        }
    }//GEN-LAST:event_btnUpdateCustomerActionPerformed

    public void paintHeader() {

        try {
            Company fd = CompanyService.getCompany();
            lblName.setText(fd.name);
            lblAdd.setText(fd.address);
            lblCity.setText(fd.city);
            lblTel.setText("Tel/Fax: " + fd.phone);
            lblPibAndAcc.setText(
                    "PIB: " + fd.pib + "  -  Broj računa: " + fd.accountNo);
            textJm.setText(fd.unitSet);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Molim izvršite postavke programa.");
            jTabbedPane1.setSelectedIndex(1);
        }

    }

    public static void setComboModel() {

        File f = FileUtility.createCompaniesFolder();
        ArrayList<String> names = new ArrayList<>(Arrays.asList(f.list()));
        DLM = new DefaultComboBoxModel();
        names.forEach((name) -> {
            DLM.addElement(name.replaceFirst("[.][^.]+$",
                    ""));
        });
        comboCustomers.setModel(DLM);
    }

    public void printButtonOff() {
        btnPrint.setEnabled(false);
    }

    public void printButtonOn() {
        btnPrint.setEnabled(true);
    }

    public void saveButtonOn() {
        btnSaveCustomer.setEnabled(true);
    }

    public void saveButtonOff() {
        btnSaveCustomer.setEnabled(false);
    }

    public void setSettingsEnabled() {
        textAccNo.setEnabled(true);
        textAddress.setEnabled(true);
        textName.setEnabled(true);
        textPhone.setEnabled(true);
        textPib.setEnabled(true);
        textPDVrate.setEnabled(true);
        textMeasure.setEnabled(true);
        textCity.setEnabled(true);
        btnAccept.setEnabled(true);
        btnCancel.setEnabled(true);
    }

    public void setSettingsDisabled() {
        textAccNo.setEnabled(false);
        textAddress.setEnabled(false);
        textName.setEnabled(false);
        textPhone.setEnabled(false);
        textPib.setEnabled(false);
        textPDVrate.setEnabled(false);
        textMeasure.setEnabled(false);
        textCity.setEnabled(false);
        btnAccept.setEnabled(false);
        btnCancel.setEnabled(false);
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.
                    getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUi.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUi.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUi.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUi.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnDelete;
    private javax.swing.JToggleButton btnDeleteAll;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JToggleButton btnInsert;
    private javax.swing.JButton btnLoadCustomer;
    private javax.swing.JToggleButton btnPrint;
    private javax.swing.JButton btnSaveCustomer;
    private javax.swing.JButton btnUpdateCustomer;
    private javax.swing.JCheckBox checkToSave;
    private static javax.swing.JComboBox<String> comboCustomers;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPibAndAcc;
    private javax.swing.JLabel lblTel;
    private javax.swing.JPanel panelHead;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSpinner spinnerQty;
    private javax.swing.JTextField textAccNo;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextField textArticleCode;
    private javax.swing.JTextField textArticleName;
    private javax.swing.JTextField textCity;
    private javax.swing.JTextField textCustomer;
    private javax.swing.JTextField textCustomerAddress;
    private javax.swing.JTextField textCustomerId;
    private javax.swing.JTextField textCustomerPib;
    private javax.swing.JTextField textDateOfSell;
    private javax.swing.JTextField textJm;
    private javax.swing.JTextField textMeasure;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPDVrate;
    private javax.swing.JTextField textPdv;
    private javax.swing.JTextField textPhone;
    private javax.swing.JTextField textPib;
    private javax.swing.JTextField textPrice;
    private javax.swing.JTextField textReciptCity;
    private javax.swing.JTextField textReciptNo;
    private javax.swing.JTextField textTown;
    private javax.swing.JTextField textValuteDate;
    // End of variables declaration//GEN-END:variables
}
