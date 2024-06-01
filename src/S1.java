import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
public class S1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form S1
     */
    public S1() {
        initComponents();
        Switch newClass = new Switch();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        button11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        numberTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel1.setText("ARITHMETIC");

        button11.setText("X");
        button11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("7,15, 31, .....");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 1", "Level 2", "Level 3", "Level 4", "Level 5" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 106));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        numberTextField.setMinimumSize(new java.awt.Dimension(72, 23));
        numberTextField.setPreferredSize(new java.awt.Dimension(150, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 13);
        jPanel2.add(numberTextField, gridBagConstraints);

        jButton1.setText("Hint");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new java.awt.GridBagConstraints());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setAutoscrolls(true);
        jPanel3.setPreferredSize(new java.awt.Dimension(160, 100));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        button1.setText("1");
        button1.setMaximumSize(new java.awt.Dimension(93, 53));
        button1.setMinimumSize(new java.awt.Dimension(45, 25));
        button1.setPreferredSize(new java.awt.Dimension(45, 25));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        jPanel3.add(button1, gridBagConstraints);

        button2.setText("2");
        button2.setMaximumSize(new java.awt.Dimension(45, 25));
        button2.setMinimumSize(new java.awt.Dimension(45, 25));
        button2.setPreferredSize(new java.awt.Dimension(45, 25));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        jPanel3.add(button2, gridBagConstraints);

        button3.setText("3");
        button3.setMaximumSize(new java.awt.Dimension(45, 25));
        button3.setMinimumSize(new java.awt.Dimension(45, 25));
        button3.setPreferredSize(new java.awt.Dimension(45, 25));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        jPanel3.add(button3, gridBagConstraints);

        button4.setText("4");
        button4.setMaximumSize(new java.awt.Dimension(45, 25));
        button4.setMinimumSize(new java.awt.Dimension(45, 25));
        button4.setPreferredSize(new java.awt.Dimension(45, 25));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(11, 15, 9, 15);
        jPanel3.add(button4, gridBagConstraints);

        button5.setText("5");
        button5.setMaximumSize(new java.awt.Dimension(45, 25));
        button5.setMinimumSize(new java.awt.Dimension(45, 25));
        button5.setPreferredSize(new java.awt.Dimension(45, 25));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 8, 15);
        jPanel3.add(button5, gridBagConstraints);

        button6.setText("6");
        button6.setMaximumSize(new java.awt.Dimension(45, 25));
        button6.setMinimumSize(new java.awt.Dimension(45, 25));
        button6.setPreferredSize(new java.awt.Dimension(45, 25));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 8, 15);
        jPanel3.add(button6, gridBagConstraints);

        button7.setText("7");
        button7.setMaximumSize(new java.awt.Dimension(45, 25));
        button7.setMinimumSize(new java.awt.Dimension(45, 25));
        button7.setPreferredSize(new java.awt.Dimension(45, 25));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        jPanel3.add(button7, gridBagConstraints);

        button8.setText("8");
        button8.setMaximumSize(new java.awt.Dimension(45, 25));
        button8.setMinimumSize(new java.awt.Dimension(45, 25));
        button8.setPreferredSize(new java.awt.Dimension(45, 25));
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        jPanel3.add(button8, gridBagConstraints);

        button9.setText("9");
        button9.setMaximumSize(new java.awt.Dimension(45, 25));
        button9.setMinimumSize(new java.awt.Dimension(45, 25));
        button9.setPreferredSize(new java.awt.Dimension(45, 25));
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        jPanel3.add(button9, gridBagConstraints);

        button0.setText("0");
        button0.setMaximumSize(new java.awt.Dimension(72, 23));
        button0.setMinimumSize(new java.awt.Dimension(72, 23));
        button0.setPreferredSize(new java.awt.Dimension(72, 23));
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });
        jPanel3.add(button0, new java.awt.GridBagConstraints());

        button10.setText("Clear");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        jPanel3.add(button10, gridBagConstraints);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        jPanel3.add(submitButton, gridBagConstraints);

        jRadioButton1.setText("Skip");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(button11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jLabel3)
                .addGap(19, 19, 19)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        JOptionPane.showMessageDialog(this, "Closing the Program");
        this.dispose();
    }//GEN-LAST:event_button11ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String answer = "63";
        String hintMessage = "Need Hint?";
        int option = JOptionPane.showConfirmDialog(null, hintMessage, "Hint", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            String confirmMessage = "*2, +1";
            Object[] options = {"Got it!", "Other Hint Please.."};
            int confirmOption = JOptionPane.showOptionDialog(null, confirmMessage, "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (confirmOption == JOptionPane.NO_OPTION) {
                String hinMessage = "it's already clear!";
                Object[] optionss = {"Got it!", "Just Show Me The Answer!"};
                int confirm1Option = JOptionPane.showOptionDialog(null, hinMessage, "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionss, optionss[1]);
                if (confirm1Option == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
                }
            }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        numberTextField.setText(numberTextField.getText() + "1");
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        numberTextField.setText(numberTextField.getText() + "2");
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        numberTextField.setText(numberTextField.getText() + "3");
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        numberTextField.setText(numberTextField.getText() + "4");
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        numberTextField.setText(numberTextField.getText() + "5");
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        numberTextField.setText(numberTextField.getText() + "6");
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        numberTextField.setText(numberTextField.getText() + "7");
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        numberTextField.setText(numberTextField.getText() + "8");
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        numberTextField.setText(numberTextField.getText() + "9");
    }//GEN-LAST:event_button9ActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        numberTextField.setText(numberTextField.getText() + "0");
    }//GEN-LAST:event_button0ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
        numberTextField.setText("");
    }//GEN-LAST:event_button10ActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String input = numberTextField.getText();
        int answer = 63;
        if (input.equals(String.valueOf(answer))) {
            JOptionPane.showMessageDialog(null, "Correct!");
            Switch myClass = new Switch();
            myClass.switchToA2(this);
        } else {
            JOptionPane.showMessageDialog(null, "Wrong answer.");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String change = (String)jComboBox1.getSelectedItem();
        Switch myClass = new Switch();
        switch(change){
            case "Level 1":
                myClass.switchToS1(this);
                break;
            case "Level 2":
                myClass.switchToS2(this);
                break;
            case "Level 3":
                myClass.switchToS3(this);
                break;
            case "Level 4":
                myClass.switchToS4(this);
                break;
            case "Level 5":
                myClass.switchToS5(this);
                break;
                
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        Switch myClass = new Switch();
            myClass.switchToA2(this);
            
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
