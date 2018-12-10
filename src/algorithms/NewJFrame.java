/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms;

/**
 *
 * @author pehor9164
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        backgroundJPanel = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        fibonacciLbl = new javax.swing.JLabel();
        fibonacciPromptLbl = new javax.swing.JLabel();
        fibonacciTxtFeild = new javax.swing.JTextField();
        fibonacciBtn = new javax.swing.JButton();
        factorialLbl = new javax.swing.JLabel();
        factorialPromptLbl = new javax.swing.JLabel();
        factorialTxtFeild = new javax.swing.JTextField();
        factorialBtn = new javax.swing.JButton();
        primeNumberLbl = new javax.swing.JLabel();
        primeNumberPromptLbl = new javax.swing.JLabel();
        primeNumberTxtFeild = new javax.swing.JTextField();
        primeNumberBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleLbl.setText("Algorithms");
        backgroundJPanel.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        fibonacciLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fibonacciLbl.setText("Fibonacci:");
        backgroundJPanel.add(fibonacciLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        fibonacciPromptLbl.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        fibonacciPromptLbl.setText("Enter a number to find value of Fibonacci squence: ");
        backgroundJPanel.add(fibonacciPromptLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        fibonacciTxtFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fibonacciTxtFeildActionPerformed(evt);
            }
        });
        backgroundJPanel.add(fibonacciTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 100, -1));

        fibonacciBtn.setText("Fibonacci");
        fibonacciBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fibonacciBtnActionPerformed(evt);
            }
        });
        backgroundJPanel.add(fibonacciBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 100, -1));

        factorialLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        factorialLbl.setText("Factorial:");
        backgroundJPanel.add(factorialLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        factorialPromptLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        factorialPromptLbl.setText("Enter a number to get the facotrial of:");
        backgroundJPanel.add(factorialPromptLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        factorialTxtFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialTxtFeildActionPerformed(evt);
            }
        });
        backgroundJPanel.add(factorialTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 100, -1));

        factorialBtn.setText("Factorial");
        factorialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialBtnActionPerformed(evt);
            }
        });
        backgroundJPanel.add(factorialBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 100, -1));

        primeNumberLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        primeNumberLbl.setText("Prime Numbers:");
        backgroundJPanel.add(primeNumberLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        primeNumberPromptLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        primeNumberPromptLbl.setText("Enter a number to see if it is a prime number:");
        backgroundJPanel.add(primeNumberPromptLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        primeNumberTxtFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeNumberTxtFeildActionPerformed(evt);
            }
        });
        backgroundJPanel.add(primeNumberTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 100, -1));

        primeNumberBtn.setText("Prime Number");
        primeNumberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeNumberBtnActionPerformed(evt);
            }
        });
        backgroundJPanel.add(primeNumberBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fibonacciTxtFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fibonacciTxtFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fibonacciTxtFeildActionPerformed

    private void factorialTxtFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialTxtFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factorialTxtFeildActionPerformed

    private void primeNumberTxtFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeNumberTxtFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primeNumberTxtFeildActionPerformed

    /**
     * A button press that allows the user to calculate the factorial of a number
     * @param evt 
     * @return The total factorial
     */
    private void factorialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialBtnActionPerformed
        
            //Variables
            int num = Integer.parseInt(factorialTxtFeild.getText());
            int total = 1;
            int i = num;

            while (i != 0){
                total = total * i;  
                i = i - 1;
            }
            factorialLbl.setText("Factorial: " + total);
        
        
        
    }//GEN-LAST:event_factorialBtnActionPerformed

    private void primeNumberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeNumberBtnActionPerformed
        //Variables
        int userNum = Integer.parseInt(primeNumberTxtFeild.getText());
        int total;
        boolean prime = true;
        
        for (int i = 2; i <= userNum / 2; i = i + 1){
            total = userNum % i;
            
            if (total == 0){
                prime = false;
                break;
            }
        }
        
        if (prime){
            primeNumberLbl.setText("Prime Numbers: " + "It is prime!");
        }
        else {
            primeNumberLbl.setText("Prime Numbers: " + "It is not prime!");
        }
        
    }//GEN-LAST:event_primeNumberBtnActionPerformed

    private void fibonacciBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fibonacciBtnActionPerformed
        //Variables
        int userNum = Integer.parseInt(fibonacciTxtFeild.getText());
        double a = 0;
        double b = 1;
        
        for (int i = 1; i <= userNum; i++){
        a = a + b;
        b = a - b;
        }
        fibonacciLbl.setText("Fibonacci: The Value Is " + a);
    }//GEN-LAST:event_fibonacciBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundJPanel;
    private javax.swing.JButton factorialBtn;
    private javax.swing.JLabel factorialLbl;
    private javax.swing.JLabel factorialPromptLbl;
    private javax.swing.JTextField factorialTxtFeild;
    private javax.swing.JButton fibonacciBtn;
    private javax.swing.JLabel fibonacciLbl;
    private javax.swing.JLabel fibonacciPromptLbl;
    private javax.swing.JTextField fibonacciTxtFeild;
    private javax.swing.JButton primeNumberBtn;
    private javax.swing.JLabel primeNumberLbl;
    private javax.swing.JLabel primeNumberPromptLbl;
    private javax.swing.JTextField primeNumberTxtFeild;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
