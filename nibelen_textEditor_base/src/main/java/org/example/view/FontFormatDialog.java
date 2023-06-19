/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/OkCancelDialog.java to edit this template
 */
package org.example.view;

import org.example.model.FontFormat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;

/**
 *
 * @author admin
 */
public class FontFormatDialog extends JDialog {

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;

    /**
     * Creates new form FontFormatDialog
     */
    public FontFormatDialog(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        //fill the JComboBox lists
        fillFontNamesList();
        fillFontStylesList();
        fillFontSizesList();

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFontDialogOk = new JButton();
        btnFontDialogCancel = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        boxFontName = new JComboBox<>();
        btnChoose = new JButton();
        boxFontStyle = new JComboBox<>();
        boxFontSize = new JComboBox<>();
        jLabel5 = new JLabel();

        setResizable(false);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                closeDialog(evt);
            }
        });

        btnFontDialogOk.setText("OK");
        btnFontDialogOk.addActionListener(this::btnFontDialogOkActionPerformed);

        btnFontDialogCancel.setText("Cancel");
        btnFontDialogCancel.addActionListener(this::btnFontDialogCancelActionPerformed);

        jLabel1.setText("Nombre de fuente");

        jLabel2.setText("Estilo de letra");

        jLabel3.setText("Tamaño de letra");

        jLabel4.setText("Color de letra");

        boxFontName.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnChoose.setText("Elige Color");
        btnChoose.addActionListener(this::btnChooseActionPerformed);

        boxFontStyle.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxFontSize.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Modificar la fuente de tu texto:");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boxFontSize, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxFontStyle, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxFontName, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChoose, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40))))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFontDialogOk, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFontDialogCancel)
                .addContainerGap())
        );

        layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnFontDialogCancel, btnFontDialogOk});

        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(boxFontName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(boxFontStyle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(boxFontSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnChoose))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFontDialogCancel)
                    .addComponent(btnFontDialogOk))
                .addContainerGap())
        );

        getRootPane().setDefaultButton(btnFontDialogOk);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFontDialogOkActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnFontDialogOkActionPerformed
        FontFormat.name = Objects.requireNonNull(boxFontName.getSelectedItem()).toString();
        FontFormat.style = FontFormat.fontStylesList.get(Objects.requireNonNull(boxFontStyle.getSelectedItem()).toString());
        FontFormat.size = Integer.valueOf(Objects.requireNonNull(boxFontSize.getSelectedItem()).toString());

        doClose(RET_OK);
    }//GEN-LAST:event_btnFontDialogOkActionPerformed

    private void btnFontDialogCancelActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnFontDialogCancelActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_btnFontDialogCancelActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void btnChooseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        // TODO add your handling code here COLOR:
        var colorSelectorDialog = new ColorSelectorDialog(null, true);
        colorSelectorDialog.setVisible(true);
    }//GEN-LAST:event_btnChooseActionPerformed
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
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
            for (UIManager.LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FontFormatDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FontFormatDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FontFormatDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FontFormatDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */

        EventQueue.invokeLater(() -> {
            FontFormatDialog dialog = new FontFormatDialog(new JFrame(), true);
            dialog.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    private void fillFontNamesList() {
        boxFontName.removeAllItems();
        int index = 0;
        for (int i = 0; i < FontFormat.fontNamesList.length; i++) {
            if (FontFormat.name.equals(FontFormat.fontNamesList[i])) index = i;
            boxFontName.addItem(FontFormat.fontNamesList[i]);
        }
        boxFontName.setSelectedIndex(index);
    }

    private void fillFontStylesList() {
        boxFontStyle.removeAllItems();
        int index = 0;
        int count = 0;
        for (String fontStyle : FontFormat.fontStylesList.keySet()) {
            if (FontFormat.fontStylesList.get(fontStyle) == FontFormat.style) index = count;
            boxFontStyle.addItem(fontStyle);
            count++;
        }
        boxFontStyle.setSelectedIndex(index);
    }

    private void fillFontSizesList() {
        boxFontSize.removeAllItems();
        int index = 0;
        for (int i = 0; i < FontFormat.fontSizesList.length; i++) {
            if (FontFormat.size == FontFormat.fontSizesList[i]) index = i;
            boxFontSize.addItem(String.valueOf(FontFormat.fontSizesList[i]));
        }
        boxFontSize.setSelectedIndex(index);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JComboBox<String> boxFontName;
    private JComboBox<String> boxFontSize;
    private JComboBox<String> boxFontStyle;
    private JButton btnChoose;
    private JButton btnFontDialogCancel;
    private JButton btnFontDialogOk;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
