/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.util.view.view;

import hiber.util.view.dao.BookCatdao;
import hiber.util.view.dao.bookDao;
import hiber.util.view.pojo.Book;
import hiber.util.view.pojo.Bookcat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mazinad
 */
public class Books extends javax.swing.JInternalFrame {

    bookDao bkd;
    BookCatdao dao;
    DefaultTableModel model;
    DefaultTableModel mode;

    public Books() {
        initComponents();
        bkd = new bookDao();
        dao = new BookCatdao();
        model = (DefaultTableModel) booktable.getModel();
        mode = (DefaultTableModel) tablecategory.getModel();
        populatetable();
        populatetable1();
        combobox();
    }

    public void populatetable() {
        List<Book> books = bkd.databook();
        for (Book book : books) {
            model.insertRow(model.getRowCount(), new Object[]{
                book.getBookid(),
                book.getTitle(),
                book.getPublishinghouse(),
                book.getDateofpub(),
                book.getAuthor(),
                book.getPages(),
                book.getBookcat().getCategoid()

            });
        }
    }

    public void populatetable1() {
        List<Bookcat> cat = dao.databookcat();
        for (Bookcat bck : cat) {
            mode.insertRow(mode.getRowCount(), new Object[]{
                bck.getCategoid(),
                bck.getCategoname()
            });
        }
    }

    public void combobox() {
        List<Bookcat> bvd = dao.databookcat();
        for (Bookcat boo : bvd) {
            cb_category.addItem(String.valueOf(boo.getCategoid()));

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_bookid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_title = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_publishing = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_author = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_pages = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_category = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booktable = new javax.swing.JTable();
        btn_saved = new javax.swing.JButton();
        btn_updates = new javax.swing.JButton();
        btn_deletes = new javax.swing.JButton();
        btn_clears = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_categoid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_categoname = new javax.swing.JTextField();
        btn_saves = new javax.swing.JButton();
        btn_up = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablecategory = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("BookId");

        jLabel2.setText("Title");

        jLabel3.setText("Publishing");

        jLabel4.setText("Date");

        jLabel5.setText("Author");

        jLabel6.setText("Pages");

        jLabel7.setText("Category");

        jLabel10.setText("YYYY-MM-dd");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_category, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_pages, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_author, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_publishing, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_title, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_bookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_publishing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_pages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        booktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookId", "Title", "publishing", "Date", "Author", "Pages", "Category"
            }
        ));
        booktable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booktableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booktable);

        btn_saved.setText("Save");
        btn_saved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_savedActionPerformed(evt);
            }
        });

        btn_updates.setText("Update");
        btn_updates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updatesActionPerformed(evt);
            }
        });

        btn_deletes.setText("Delete");
        btn_deletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletesActionPerformed(evt);
            }
        });

        btn_clears.setText("Clear");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_saved)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_updates)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_deletes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_clears)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_saved)
                    .addComponent(btn_updates)
                    .addComponent(btn_deletes)
                    .addComponent(btn_clears))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Book", jPanel1);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("CategoId");

        jLabel9.setText("CategoName");

        btn_saves.setText("Save");
        btn_saves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_savesActionPerformed(evt);
            }
        });

        btn_up.setText("Update");
        btn_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upActionPerformed(evt);
            }
        });

        btn_del.setText("Delete");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_categoid)
                            .addComponent(txt_categoname, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_saves)
                        .addGap(18, 18, 18)
                        .addComponent(btn_up)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_del)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_categoid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_categoname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_saves)
                    .addComponent(btn_up)
                    .addComponent(btn_del))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        tablecategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CategoId", "CategoName"
            }
        ));
        tablecategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablecategoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablecategory);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Book category", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_savedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_savedActionPerformed
        // TODO add your handling code here:
        Book bck = new Book();
        bck.setBookid(txt_bookid.getText());
        bck.setTitle(txt_title.getText());
        bck.setPublishinghouse(txt_publishing.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            bck.setDateofpub(sdf.parse(txt_date.getText()));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        bck.setAuthor(txt_author.getText());
        bck.setPages(Integer.parseInt(txt_pages.getText()));
        Bookcat bc = new Bookcat();
        bc.setCategoid(cb_category.getSelectedItem().toString());
        bck.setBookcat(bc);
        bkd.addBook(bck);
        model.setRowCount(0);
        populatetable();
    }//GEN-LAST:event_btn_savedActionPerformed

    private void btn_savesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_savesActionPerformed
        // TODO add your handling code here:
        Bookcat bcd = new Bookcat();
        bcd.setCategoid(txt_categoid.getText());
        bcd.setCategoname(txt_categoname.getText());
        dao.addCategory(bcd);
        mode.setRowCount(0);
        populatetable1();
        cb_category.removeAllItems();
        combobox();
    }//GEN-LAST:event_btn_savesActionPerformed

    private void btn_updatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updatesActionPerformed
        // TODO add your handling code here:\
        Book bck = new Book();
        bck.setBookid(txt_bookid.getText());
        bck.setTitle(txt_title.getText());
        bck.setPublishinghouse(txt_publishing.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            bck.setDateofpub(sdf.parse(txt_date.getText()));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        bck.setAuthor(txt_author.getText());
        bck.setPages(Integer.parseInt(txt_pages.getText()));
        Bookcat bc = new Bookcat();
        bc.setCategoid(cb_category.getSelectedItem().toString());
        bck.setBookcat(bc);
        bkd.updateBook(bck);
        model.setRowCount(0);
        populatetable();
    }//GEN-LAST:event_btn_updatesActionPerformed

    private void btn_deletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletesActionPerformed
        // TODO add your handling code here:

        bkd.deleteBook(txt_bookid.getText());
        model.setRowCount(0);
        populatetable();
    }//GEN-LAST:event_btn_deletesActionPerformed

    private void btn_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upActionPerformed
        // TODO add your handling code here:
         Bookcat bcd = new Bookcat();
        bcd.setCategoid(txt_categoid.getText());
        bcd.setCategoname(txt_categoname.getText());
        dao.updatecategory(bcd);
        mode.setRowCount(0);
        populatetable1();
        cb_category.removeAllItems();
        combobox();
    }//GEN-LAST:event_btn_upActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        // TODO add your handling code here:
        dao.deletecategory(txt_categoid.getText());
        mode.setRowCount(0);
        populatetable1();
    }//GEN-LAST:event_btn_delActionPerformed

    private void booktableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booktableMouseClicked
        // TODO add your handling code here:
        int row=booktable.getSelectedRow();
        txt_bookid.setText(model.getValueAt(row, 0).toString());
        txt_title.setText(model.getValueAt(row, 1).toString());
        txt_publishing.setText(model.getValueAt(row,2).toString());
        txt_date.setText(model.getValueAt(row, 3).toString());
        txt_author.setText(model.getValueAt(row, 4).toString());
        txt_pages.setText(model.getValueAt(row, 5).toString());
        cb_category.setSelectedItem(model.getValueAt(row, 6).toString());
    }//GEN-LAST:event_booktableMouseClicked

    private void tablecategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecategoryMouseClicked
        // TODO add your handling code here:
        int row=tablecategory.getSelectedRow();
        txt_categoid.setText(mode.getValueAt(row,0).toString());
        txt_categoname.setText(mode.getValueAt(row,1).toString());
    }//GEN-LAST:event_tablecategoryMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable booktable;
    private javax.swing.JButton btn_clears;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_deletes;
    private javax.swing.JButton btn_saved;
    private javax.swing.JButton btn_saves;
    private javax.swing.JButton btn_up;
    private javax.swing.JButton btn_updates;
    private javax.swing.JComboBox<String> cb_category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablecategory;
    private javax.swing.JTextField txt_author;
    private javax.swing.JTextField txt_bookid;
    private javax.swing.JTextField txt_categoid;
    private javax.swing.JTextField txt_categoname;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_pages;
    private javax.swing.JTextField txt_publishing;
    private javax.swing.JTextField txt_title;
    // End of variables declaration//GEN-END:variables
}
