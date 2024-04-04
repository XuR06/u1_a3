/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u1a3_xu_ricky;

/**
 *
 * @author 343207676
 */
public class oneDimensionalArray extends javax.swing.JFrame {

    
    int[] numList = new int[20]; //creates an array with 20 cells
    int currentIndex; //tells which index is being inputed into the list
    
    /**
     * Creates new form oneDimensionalArray
     */
    public oneDimensionalArray() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        Title = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        outputField = new javax.swing.JTextField();
        sumEven = new javax.swing.JButton();
        sumOdd = new javax.swing.JButton();
        sumAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Summation of Integer");
        setBackground(new java.awt.Color(153, 153, 255));

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        Title.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(102, 102, 255));
        Title.setText("Summation of Integer");

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        sumEven.setText("Sum Even");
        sumEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumEvenActionPerformed(evt);
            }
        });

        sumOdd.setText("Sum Odd");
        sumOdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOddActionPerformed(evt);
            }
        });

        sumAll.setText("Sum All");
        sumAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(addButton)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sumAll, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sumEven)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sumOdd)))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton)
                            .addComponent(deleteButton))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sumAll)
                            .addComponent(sumEven)
                            .addComponent(sumOdd))
                        .addGap(69, 69, 69)
                        .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        outputField.setText("");
        String numAsString = input.getText();
        
        try {
            int numAsInt = Integer.parseInt(numAsString);
                
            if (numAsInt > 0) {

                numList[currentIndex++] = numAsInt;

                String arrayAsString = "";

                for (int i = 0; i < currentIndex; i++) {
                    arrayAsString += numList[i] + "\n";
                    output.setText(arrayAsString);
                }
            } else
                outputField.setText("Try again! Enter a positive number.");
            
        } catch (Exception e){
                
                outputField.setText("Try again! Enter a positive number.");
                input.setText("");
                
        }
        
        
        try {
            
        } catch (ArrayIndexOutOfBoundsException e)
        {
            outputField.setText("The array is full");
        }
        
               
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        outputField.setText("");
        String numAsString = input.getText();
        
        try {
            int numAsInt = Integer.parseInt(numAsString);
            String arrayAsString = "";
            boolean numInList = false;
            
            if (numAsInt > 0) {
                for (int i = 0; i < currentIndex; i++) {
                    if (numList[i] == numAsInt) {
                        numList[i] = 0;
                        numInList = true;
                        break;
                    } 
                }              
                
                if (numInList){    
                    for (int i = 1; i < currentIndex; i++) {
                        if (numList[i - 1] == 0) {
                            numList[i - 1] = numList[i];
                            numList[i] = 0;
                        }
                    }
                    currentIndex--;
                } else{
                    outputField.setText("Number does not exist in array");
                }
                
                 for (int i = 0; i < currentIndex; i++) {
                    arrayAsString += numList[i] + "\n";  
                }
                 output.setText(arrayAsString);
                
            } else
                outputField.setText("Try again! Enter a positive number.");
            
        } catch (Exception e){
                
                outputField.setText("Try again! Enter a positive number.");
                input.setText("");       
        }
        
        for (int i = 0; i < currentIndex; i++){
            if (numList[i-1] == 0){
                numList[i-1] = numList[i];
                numList[i] = 0;
            }
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void sumAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumAllActionPerformed
        // TODO add your handling code here:
        int sumTotal = 0;
        
        for (int i = 0; i < currentIndex; i++){
            sumTotal += numList[i];
        }
        
        outputField.setText("Total Sum: "+sumTotal);
        
    }//GEN-LAST:event_sumAllActionPerformed

    private void sumEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumEvenActionPerformed
        // TODO add your handling code here:
        int sumEven = 0;
        
        for (int i = 0; i < currentIndex; i++){
            if (numList[i]%2 == 0){
                sumEven += numList[i];
            }
        }
        
        outputField.setText("Total Even Sum: "+sumEven);
    }//GEN-LAST:event_sumEvenActionPerformed

    private void sumOddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOddActionPerformed
        // TODO add your handling code here:
        int sumOdd = 0;
        
        for (int i = 0; i < currentIndex; i++){
            if (numList[i]%2 != 0){
                sumOdd += numList[i];
            }
        }
        
        outputField.setText("Total Odd Sum: "+sumOdd);
    }//GEN-LAST:event_sumOddActionPerformed
          
        
        
                         
                                              

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
            java.util.logging.Logger.getLogger(oneDimensionalArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oneDimensionalArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oneDimensionalArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oneDimensionalArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oneDimensionalArray().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField input;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea output;
    private javax.swing.JTextField outputField;
    private javax.swing.JButton sumAll;
    private javax.swing.JButton sumEven;
    private javax.swing.JButton sumOdd;
    // End of variables declaration//GEN-END:variables
}
