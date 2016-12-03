/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc.coursework;

import javax.swing.JOptionPane;

/**
 *
 * @author up790070
 */
public class GUI extends javax.swing.JFrame {

    Order order = new Order();

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabelDimHeader = new javax.swing.JLabel();
        widthSpinner = new javax.swing.JSpinner();
        jLabelWidth = new javax.swing.JLabel();
        lengthSpinner = new javax.swing.JSpinner();
        jLabelLength = new javax.swing.JLabel();
        jLabelHeight = new javax.swing.JLabel();
        heightSpinner = new javax.swing.JSpinner();
        cardGradeCombo = new javax.swing.JComboBox<>();
        jLabelCardGrade = new javax.swing.JLabel();
        jLabelColours = new javax.swing.JLabel();
        coloursCombo = new javax.swing.JComboBox<>();
        bottomReinChckBx = new javax.swing.JCheckBox();
        sealableChckBx = new javax.swing.JCheckBox();
        cornerReinChckBx = new javax.swing.JCheckBox();
        jLabelQuantity = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        addToOrderBttn = new javax.swing.JButton();
        clearBttn = new javax.swing.JButton();
        clearOrderBttn = new javax.swing.JButton();
        PlaceOrderBttn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BuyABox");
        setLocation(new java.awt.Point(250, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDimHeader.setText("Dimensions (cm)");
        getContentPane().add(jLabelDimHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, -1, -1));

        widthSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        widthSpinner.setToolTipText("enter box width in cm");
        widthSpinner.setFocusCycleRoot(true);
        widthSpinner.setName(""); // NOI18N
        widthSpinner.setNextFocusableComponent(lengthSpinner);
        getContentPane().add(widthSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 22, 65, -1));

        jLabelWidth.setText("Width: ");
        getContentPane().add(jLabelWidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 25, -1, -1));

        lengthSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        lengthSpinner.setToolTipText("enter box length in cm");
        getContentPane().add(lengthSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 50, 65, -1));

        jLabelLength.setText("Length: ");
        getContentPane().add(jLabelLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 51, -1, -1));

        jLabelHeight.setText("Height: ");
        getContentPane().add(jLabelHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 79, -1, -1));

        heightSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        heightSpinner.setToolTipText("enter box height in cm");
        getContentPane().add(heightSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 76, 65, -1));

        cardGradeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5" }));
        cardGradeCombo.setToolTipText("choose the desired grade of card");
        cardGradeCombo.setName(""); // NOI18N
        getContentPane().add(cardGradeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 79, -1));

        jLabelCardGrade.setText("Card Grade:");
        getContentPane().add(jLabelCardGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabelColours.setText("Colours:");
        getContentPane().add(jLabelColours, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        coloursCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Colour", "One Colour", "Two Colour" }));
        coloursCombo.setToolTipText("choose amount of colours");
        getContentPane().add(coloursCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        bottomReinChckBx.setText("Bottom Reinforcement");
        getContentPane().add(bottomReinChckBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 112, -1, -1));

        sealableChckBx.setText("Sealable Top");
        getContentPane().add(sealableChckBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 138, -1, -1));

        cornerReinChckBx.setText("Corner Reinforcement");
        getContentPane().add(cornerReinChckBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabelQuantity.setText("Quantity");
        getContentPane().add(jLabelQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 40, -1));

        addToOrderBttn.setText("Add To Order");
        addToOrderBttn.setToolTipText("add this box to the order");
        addToOrderBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToOrderBttnActionPerformed(evt);
            }
        });
        getContentPane().add(addToOrderBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        clearBttn.setText("Clear");
        clearBttn.setToolTipText("clear all of the current fields");
        clearBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBttnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        clearOrderBttn.setText("Clear Order");
        clearOrderBttn.setToolTipText("clear the current order");
        clearOrderBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearOrderBttnActionPerformed(evt);
            }
        });
        getContentPane().add(clearOrderBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        PlaceOrderBttn.setText("Place Order");
        PlaceOrderBttn.setToolTipText("get a quote on the current order");
        PlaceOrderBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderBttnActionPerformed(evt);
            }
        });
        getContentPane().add(PlaceOrderBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        pack();
    }// </editor-fold>                        

    private void addToOrderBttnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        if (validateInputs()) {
            int grade = cardGradeCombo.getSelectedIndex();
            int colour = coloursCombo.getSelectedIndex();
            int w = (Integer) widthSpinner.getValue();
            int h = (Integer) heightSpinner.getValue();
            int l = (Integer) lengthSpinner.getValue();
            int quantity = (Integer) quantitySpinner.getValue();
            boolean bottom = bottomReinChckBx.isSelected();
            boolean corner = cornerReinChckBx.isSelected();
            boolean top = sealableChckBx.isSelected();

            order.addToOrder(grade, colour, w, h, l, quantity, bottom, corner, top);
        } else {
            System.out.println("Invalid box, not added to order");
            JOptionPane.showMessageDialog(null, "That box is not valid. \nEnsure size and card grade are entered.");
        }
    }                                              

    private boolean validateInputs() {
        int w = (Integer) widthSpinner.getValue();
        int h = (Integer) heightSpinner.getValue();
        int l = (Integer) lengthSpinner.getValue();
        int q = (Integer) quantitySpinner.getValue();

        boolean validity = true;
        if (cardGradeCombo.getSelectedIndex() == 0) {
            validity = false;
        }
        if (h == 0 || w == 0 || l == 0 || q == 0) {
            validity = false;
        }

        return validity;
    }
    
    private void clearBttnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        widthSpinner.setValue(0);
        lengthSpinner.setValue(0);
        heightSpinner.setValue(0);
        quantitySpinner.setValue(0);
        bottomReinChckBx.setSelected(false);
        cornerReinChckBx.setSelected(false);
        sealableChckBx.setSelected(false);
        cardGradeCombo.setSelectedItem("Choose");
        coloursCombo.setSelectedItem("No Colour");
    }                                         

    private void clearOrderBttnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want \nto remove this order?", "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            order.clearOrder();
        }

    }                                              

    private void PlaceOrderBttnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        order.displayOrder();
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton PlaceOrderBttn;
    private javax.swing.JButton addToOrderBttn;
    private javax.swing.JCheckBox bottomReinChckBx;
    private javax.swing.JComboBox<String> cardGradeCombo;
    private javax.swing.JButton clearBttn;
    private javax.swing.JButton clearOrderBttn;
    private javax.swing.JComboBox<String> coloursCombo;
    private javax.swing.JCheckBox cornerReinChckBx;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JSpinner heightSpinner;
    private javax.swing.JLabel jLabelCardGrade;
    private javax.swing.JLabel jLabelColours;
    private javax.swing.JLabel jLabelDimHeader;
    private javax.swing.JLabel jLabelHeight;
    private javax.swing.JLabel jLabelLength;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JLabel jLabelWidth;
    private javax.swing.JSpinner lengthSpinner;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JCheckBox sealableChckBx;
    private javax.swing.JSpinner widthSpinner;
    // End of variables declaration                   
}
