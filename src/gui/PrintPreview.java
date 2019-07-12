package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Article;

public class PrintPreview extends javax.swing.JFrame {

    public PrintPreview() {
        initComponents();
        this.setTitle("ŠtampajRačun - Print preview");
    }

    // *********************** Printing *****************************************
    public static void printMyPage() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Štampam račun");
        job.setPrintable(new Printable() {
            public int print(Graphics pg, PageFormat pf, int pageNum) {
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2 = (Graphics2D) pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.65, 0.65);
                mainPreviewPanel.paint(g2);
                return Printable.PAGE_EXISTS;
            }
        });
        boolean ok = job.printDialog();
        if (ok) {
            try {
                job.print();
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "Nešto nije u redu :(((");
                Logger.getLogger(MainUi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    // *********************** End Printing *************************************** 
    
    // *********************** Fill table******************************************
    public void tableSet(List<Article> la){
        DefaultTableModel model2 = (DefaultTableModel) mainTable.getModel();
        model2.setRowCount(0);
        int count = 1;

        for (Article art : la) {
            Object[] rowObj = {count++, art.ean, art.name, art.unit, art.qty, art.priceWithoutTaxPerPiece, (art.priceWithoutTaxPerPiece * art.qty), art.tax, art.taxAllPieces, art.priceWithTaxAllPieces};
            model2.addRow(rowObj);
            mainTable.repaint();
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPreviewPanel = new javax.swing.JPanel();
        labelMyName = new javax.swing.JLabel();
        labelMyAddress = new javax.swing.JLabel();
        labelMyPhone = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        labelMyPibAcc = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelReciptNo = new javax.swing.JLabel();
        labelDateToday = new javax.swing.JLabel();
        labelDateSell = new javax.swing.JLabel();
        labelDateValute = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCustomer = new javax.swing.JLabel();
        labelCustomerAddress = new javax.swing.JLabel();
        labelCustomerPib = new javax.swing.JLabel();
        labelCustId = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelFixed1 = new javax.swing.JLabel();
        labelFixed2 = new javax.swing.JLabel();
        labelBasicTax = new javax.swing.JLabel();
        labelFixed3 = new javax.swing.JLabel();
        labelTotalTax = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelRootTax = new javax.swing.JLabel();
        labelJustTax = new javax.swing.JLabel();
        labelTaxForPay = new javax.swing.JLabel();
        labelTotalForPay = new javax.swing.JLabel();
        labelFixed4 = new javax.swing.JLabel();
        labelFixed5 = new javax.swing.JLabel();
        labelFixed6 = new javax.swing.JLabel();
        labelFixed7 = new javax.swing.JLabel();
        labelFixed8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);

        mainPreviewPanel.setBackground(java.awt.Color.white);

        labelMyName.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        labelMyName.setText("NAZIV");

        labelMyAddress.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        labelMyAddress.setText("ADRESA");

        labelMyPhone.setText("jLabel3");

        jScrollPane1.setBackground(java.awt.Color.white);

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RBR", "Šifra", "Naziv", "JM", "kol.", "Cena bez PDV", "Iznos bez PDV", "Stopa PDV", "Iznos PDV", "UKUPNO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mainTable);
        if (mainTable.getColumnModel().getColumnCount() > 0) {
            mainTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            mainTable.getColumnModel().getColumn(1).setPreferredWidth(35);
            mainTable.getColumnModel().getColumn(3).setResizable(false);
            mainTable.getColumnModel().getColumn(3).setPreferredWidth(30);
            mainTable.getColumnModel().getColumn(4).setResizable(false);
            mainTable.getColumnModel().getColumn(4).setPreferredWidth(25);
            mainTable.getColumnModel().getColumn(5).setResizable(false);
            mainTable.getColumnModel().getColumn(6).setResizable(false);
            mainTable.getColumnModel().getColumn(7).setResizable(false);
            mainTable.getColumnModel().getColumn(7).setPreferredWidth(50);
            mainTable.getColumnModel().getColumn(8).setResizable(false);
            mainTable.getColumnModel().getColumn(9).setResizable(false);
        }

        labelMyPibAcc.setText("jLabel1");

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelReciptNo.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        labelReciptNo.setText("jLabel1");

        labelDateToday.setText("jLabel1");

        labelDateSell.setText("jLabel1");

        labelDateValute.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelReciptNo)
                    .addComponent(labelDateToday)
                    .addComponent(labelDateSell)
                    .addComponent(labelDateValute))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelReciptNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDateToday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDateSell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDateValute)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(248, 248, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCustomer.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        labelCustomer.setText("jLabel1");

        labelCustomerAddress.setText("jLabel1");

        labelCustomerPib.setText("jLabel1");

        labelCustId.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCustomer)
                    .addComponent(labelCustomerAddress)
                    .addComponent(labelCustomerPib)
                    .addComponent(labelCustId))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCustomerAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCustomerPib)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCustId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(248, 248, 248));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelFixed1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        labelFixed1.setText("POREZ                                  IZNOS");

        labelFixed2.setFont(new java.awt.Font("Noto Sans", 2, 12)); // NOI18N
        labelFixed2.setText("Naziv poreza - PDV");

        labelBasicTax.setText("jLabel3");

        labelFixed3.setText("Preska stopa niža: 8%                  0,00");

        labelTotalTax.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        labelTotalTax.setText("jLabel4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFixed1)
                    .addComponent(labelFixed2)
                    .addComponent(labelBasicTax)
                    .addComponent(labelFixed3)
                    .addComponent(labelTotalTax))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFixed1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFixed2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBasicTax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFixed3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotalTax)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(248, 248, 248));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelRootTax.setText("jLabel4");

        labelJustTax.setText("jLabel4");

        labelTaxForPay.setText("jLabel4");

        labelTotalForPay.setText("jLabel4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRootTax)
                    .addComponent(labelJustTax)
                    .addComponent(labelTaxForPay)
                    .addComponent(labelTotalForPay))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRootTax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelJustTax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTaxForPay)
                .addGap(18, 18, 18)
                .addComponent(labelTotalForPay)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        labelFixed4.setText("Broj fiskalnog računa:____________________");

        labelFixed5.setText("Fakturisao:________________________________");

        labelFixed6.setText("Broj lične karte:___________________________");

        labelFixed7.setText("Robu i račun preuzeo:________________________________");

        labelFixed8.setText("Broj lične karte:_______________________________________");

        javax.swing.GroupLayout mainPreviewPanelLayout = new javax.swing.GroupLayout(mainPreviewPanel);
        mainPreviewPanel.setLayout(mainPreviewPanelLayout);
        mainPreviewPanelLayout.setHorizontalGroup(
            mainPreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPreviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPreviewPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPreviewPanelLayout.createSequentialGroup()
                        .addGroup(mainPreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMyName)
                            .addComponent(labelMyAddress)
                            .addComponent(labelMyPhone)
                            .addComponent(labelMyPibAcc)
                            .addComponent(labelFixed4)
                            .addGroup(mainPreviewPanelLayout.createSequentialGroup()
                                .addGap(379, 379, 379)
                                .addGroup(mainPreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFixed8)
                                    .addComponent(labelFixed7)))
                            .addComponent(labelFixed6)
                            .addComponent(labelFixed5))
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addGroup(mainPreviewPanelLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPreviewPanelLayout.setVerticalGroup(
            mainPreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPreviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMyName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMyAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMyPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMyPibAcc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(mainPreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelFixed4)
                .addGap(18, 18, 18)
                .addGroup(mainPreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFixed5)
                    .addComponent(labelFixed7))
                .addGap(18, 18, 18)
                .addGroup(mainPreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFixed6)
                    .addComponent(labelFixed8))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPreviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPreviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PrintPreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintPreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintPreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintPreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintPreview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labelBasicTax;
    public javax.swing.JLabel labelCustId;
    public javax.swing.JLabel labelCustomer;
    public javax.swing.JLabel labelCustomerAddress;
    public javax.swing.JLabel labelCustomerPib;
    public javax.swing.JLabel labelDateSell;
    public javax.swing.JLabel labelDateToday;
    public javax.swing.JLabel labelDateValute;
    private javax.swing.JLabel labelFixed1;
    private javax.swing.JLabel labelFixed2;
    private javax.swing.JLabel labelFixed3;
    private javax.swing.JLabel labelFixed4;
    private javax.swing.JLabel labelFixed5;
    private javax.swing.JLabel labelFixed6;
    private javax.swing.JLabel labelFixed7;
    private javax.swing.JLabel labelFixed8;
    public javax.swing.JLabel labelJustTax;
    public javax.swing.JLabel labelMyAddress;
    public javax.swing.JLabel labelMyName;
    public javax.swing.JLabel labelMyPhone;
    public javax.swing.JLabel labelMyPibAcc;
    public javax.swing.JLabel labelReciptNo;
    public javax.swing.JLabel labelRootTax;
    public javax.swing.JLabel labelTaxForPay;
    public javax.swing.JLabel labelTotalForPay;
    public javax.swing.JLabel labelTotalTax;
    private static javax.swing.JPanel mainPreviewPanel;
    public javax.swing.JTable mainTable;
    // End of variables declaration//GEN-END:variables
}
