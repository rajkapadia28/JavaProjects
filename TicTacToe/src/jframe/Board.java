//******************************************************************************
// STUDENT NAME:  5704911
// FIU EMAIL: rkapa006@fiu.edu
// CLASS: COP 2210 – Fall 2016
// ASSIGNMENT # 5
// DATE: 28/11/16
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else, except as outlined in the 
// assignment instructions.
//******************************************************************************

package jframe;



import javax.swing.JOptionPane;

/**
 * Extends to JFrame Form in order to better design GUI.
 * @author Raj
 */
public class Board extends javax.swing.JFrame {

    private String player_1 = "X";
    private int compMove = 0;
    public String player_2 = "O";
    public String name1;
    public String name2;
    
    

   
    /**
     * Creates new form NewJFrame
     */
    public Board() {
        initComponents();
       
        setSize(550, 550);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        welcome();
        
    }
    /**
     * <h1> Determining Position of X or O </h1>
     *  This method allocated X or O to the button that is 
     * selected. 
     * @author Raj
     */

    public void turn() {
        
        if (!player_1.equalsIgnoreCase("X")) {
      
            player_1 = "X";
       
        } else {
            player_1 = "O";
        }

    }
    
  /**
   * 
   * <h1> Welcome Method </h1>
   * This method welcomes the user by asking for 
   * his/her name. This helps to determine who the 
   * winner is in the end. 
   * @author Raj
   */  
    public void welcome(){
  
        name1 = JOptionPane.showInputDialog(null,"Welcome. \n What is your "
                + "name? You are 'X' ",
                "PLayer 1",JOptionPane.INFORMATION_MESSAGE);
        name2 = JOptionPane.showInputDialog(null,"Welcome.\n What is your "
                + "name? You are 'O'",
                "Player 2",JOptionPane.INFORMATION_MESSAGE);
        
        
    }

/**    
 * 
 * <h1> Restart Method </h1>
 * This method consists of a button that allows the user to restart
 * the game whenever the user would like to. 
 * The numbers reappear once the restart button is selected. 
 * @author Raj
 */
    public void restartGame() {

        jButton2.setText("1");// sets elements back to original value which is 
        jButton3.setText("2");// their assigned number
        jButton4.setText("3");
        jButton5.setText("4");
        jButton6.setText("5");
        jButton7.setText("6");
        jButton8.setText("7");
        jButton9.setText("8");
        jButton10.setText("9");

    }
 /**
 *  <h1> PLayer 1 Winner </h1>
 * 
 * This method consists of a JOptionPane that reveals 
 * player 1 as the winner.
 * 
 * @author Raj
 */

    public void player1Wins(){
    
        
       JOptionPane.showMessageDialog(null, name1 + " Wins!"
               + "\n Congratulations! Click the restart button "
               + "to play again.", "Winner",JOptionPane.INFORMATION_MESSAGE); 
        
    
    
    
}/**
 * 
 *  <h1> PLayer 2 Winner </h1>
 * 
 * This method consists of a JOptionPane that reveals 
 * player 2 as the winner.
 * 
 * @author Raj
 * 
 */
    public void player2Wins(){
        
         JOptionPane.showMessageDialog(null, name2 + " Wins!"
               + "\n Congratulations! Click the restart button "
               + "to play again.", "Winner",JOptionPane.INFORMATION_MESSAGE);
        
    }
/**
 * 
 *  <h1> Determining Winner </h1>
 * This method consists of determining who the
 * winner is from both players. 
 * 
 * @author Raj
 */
    public void winner(){
        String button_1 = jButton2.getText();
        String button_2 = jButton3.getText();
        String button_3 = jButton4.getText();
        String button_4 = jButton5.getText();
        String button_5 = jButton6.getText();
        String button_6 = jButton7.getText();
        String button_7 = jButton8.getText();
        String button_8 = jButton9.getText();
        String button_9 = jButton10.getText();
        
        if(((button_1 == "X") && (button_2 == "X") && (button_3 == "X"))|| //possible ways for 'X' to win
           ((button_4== "X") && (button_5 == "X") && (button_6 == "X")) ||
           ((button_7 == "X")&& (button_8 == "X") && (button_9 == "X"))||
           ((button_1 == "X") && (button_5 == "X") && (button_9 =="X"))||
           ((button_3 == "X") && (button_5 == "X") && (button_7 == "X"))||  
           ((button_2 == "X") && (button_5 == "X") && (button_8 == "X"))||
           ((button_1 == "X") && (button_4 == "X") && (button_7 == "X"))||
           ((button_3 == "X") && (button_6 == "X") && (button_9 == "X"))) { 
            
            player1Wins();

    }else if(((button_1 == "O") && (button_2 == "O") && (button_3 == "O"))|| //possible ways for 'O' to win
           ((button_4== "O") && (button_5 == "O") && (button_6 == "O")) ||
           ((button_7 == "O")&& (button_8 == "O") && (button_9 == "O"))||
           ((button_1 == "O") && (button_5 == "O") && (button_9 =="O"))||
           ((button_3 == "O") && (button_5 == "O") && (button_7 == "O"))||  
           ((button_2 == "O") && (button_5 == "O") && (button_8 == "O"))||
           ((button_1 == "O") && (button_4 == "O") && (button_7 == "O"))||
           ((button_3 == "O") && (button_6 == "O") && (button_9 == "O"))){
        
        player2Wins();
    }  
 } 
   /**
    * <h1> Determining Tie Method </h1>
    * This method indicates whether the players 
    * had a tie. 
    * @author Raj
    */
    public void tie(){
        String button_1 = jButton2.getText();// gets X or O
        String button_2 = jButton3.getText();
        String button_3 = jButton4.getText();
        String button_4 = jButton5.getText();
        String button_5 = jButton6.getText();
        String button_6 = jButton7.getText();
        String button_7 = jButton8.getText();
        String button_8 = jButton9.getText();
        String button_9 = jButton10.getText();
        
        if (button_1 != "1" && button_2 != "2" && button_3 != "3"
            && button_4 != "4" && button_5 != "5" && button_6 != "6"
            && button_7 != "7" && button_8 != "8" && button_9 != "9"){
     JOptionPane.showMessageDialog(null,"You have tied!" +
             "\n Click the restart button to play again!",
             "Tie",JOptionPane.INFORMATION_MESSAGE);
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * This part of the code consists of the Buttons that are 
     * placed on a panel in JFrame. Each button has a function to 
     * change either to a 'X' or an 'O', depending on the player's preference.
     * @author Raj
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Grid = new javax.swing.JPanel();
        jPanel_R1C1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel_R1C2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel_R1C3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel_R2C1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel_R2C2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel_R2C3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel_R3C1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel_R3C2 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel_R3C3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic-Tac-Toe");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new java.awt.BorderLayout());

        Grid.setBackground(new java.awt.Color(204, 255, 255));
        Grid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 51), java.awt.Color.black, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        Grid.setLayout(new java.awt.GridLayout(3, 3, 2, 1));

        jPanel_R1C1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 255), null));
        jPanel_R1C1.setLayout(new java.awt.GridLayout(1, 0));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel_R1C1.add(jButton2);

        Grid.add(jPanel_R1C1);

        jPanel_R1C2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 0, 0), null));
        jPanel_R1C2.setLayout(new java.awt.GridLayout(1, 0));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel_R1C2.add(jButton3);

        Grid.add(jPanel_R1C2);

        jPanel_R1C3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 102, 102), null));
        jPanel_R1C3.setLayout(new java.awt.GridLayout(1, 0));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel_R1C3.add(jButton4);

        Grid.add(jPanel_R1C3);

        jPanel_R2C1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(153, 0, 153)));
        jPanel_R2C1.setLayout(new java.awt.GridLayout(1, 0));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton5.setText("4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel_R2C1.add(jButton5);

        Grid.add(jPanel_R2C1);

        jPanel_R2C2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 102, 102), null));
        jPanel_R2C2.setLayout(new java.awt.GridLayout(1, 0));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 102, 255));
        jButton6.setText("5");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel_R2C2.add(jButton6);

        Grid.add(jPanel_R2C2);

        jPanel_R2C3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 51, 51), null));
        jPanel_R2C3.setLayout(new java.awt.GridLayout(1, 0));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 102, 0));
        jButton7.setText("6");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel_R2C3.add(jButton7);

        Grid.add(jPanel_R2C3);

        jPanel_R3C1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 153, 51), null));
        jPanel_R3C1.setLayout(new java.awt.GridLayout(1, 0));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 51, 102));
        jButton8.setText("7");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel_R3C1.add(jButton8);

        Grid.add(jPanel_R3C1);

        jPanel_R3C2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 102, 255), null));
        jPanel_R3C2.setLayout(new java.awt.GridLayout(1, 0));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(204, 51, 0));
        jButton9.setText("8");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel_R3C2.add(jButton9);

        Grid.add(jPanel_R3C2);

        jPanel_R3C3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_R3C3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 0, 255), null));
        jPanel_R3C3.setLayout(new java.awt.GridLayout(1, 0));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(102, 0, 51));
        jButton10.setText("9");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel_R3C3.add(jButton10);

        Grid.add(jPanel_R3C3);

        jPanel1.add(Grid, java.awt.BorderLayout.CENTER);

        jButton11.setBackground(new java.awt.Color(0, 153, 153));
        jButton11.setText("Restart");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(player_1);
        turn();
        winner();
        tie(); //Button 7
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(player_1);
        turn();
        winner();
        tie(); //Button 1
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(player_1);
        turn();
        winner();
        tie(); // Button 3
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(player_1);
        turn();
        winner();
        tie(); // Button 2
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(player_1);
        turn();
        winner();
        tie(); // Button 4
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(player_1);
        turn();
        winner();
        tie(); //Button 5
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(player_1);
        turn();
        winner();
        tie();  //Button 6
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(player_1);
        turn();
        winner();
        tie(); // Button 8
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setText(player_1);
        turn();
        winner();
        tie(); // Button 9
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        restartGame(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Grid;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_R1C1;
    private javax.swing.JPanel jPanel_R1C2;
    private javax.swing.JPanel jPanel_R1C3;
    private javax.swing.JPanel jPanel_R2C1;
    private javax.swing.JPanel jPanel_R2C2;
    private javax.swing.JPanel jPanel_R2C3;
    private javax.swing.JPanel jPanel_R3C1;
    private javax.swing.JPanel jPanel_R3C2;
    private javax.swing.JPanel jPanel_R3C3;
    // End of variables declaration//GEN-END:variables
}
