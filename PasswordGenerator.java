package password;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Random;

public class PasswordGenerator extends javax.swing.JFrame {
    public PasswordGenerator() {
        initComponents();
        seticon();
    }

    public void seticon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images11.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numPasswords = new javax.swing.JTextField();
        numCharacters = new javax.swing.JTextField();
        firstNoNumber = new javax.swing.JCheckBox();
        number = new javax.swing.JCheckBox();
        lowerCase = new javax.swing.JCheckBox();
        upperCase = new javax.swing.JCheckBox();
        symbol = new javax.swing.JCheckBox();
        genPassword = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        inputText = new javax.swing.JTextField();
        found = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Generator v1.0");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Password Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel1.setText("Lowercase Characters:");

        jLabel2.setText("Numbers:");

        jLabel3.setText("Begin With A Letter:");

        jLabel9.setText("Number of Passwords");

        jLabel4.setText("Uppercase Characters:");

        jLabel10.setText("Number of Characters");

        jLabel5.setText("Include Symbols:");

        numPasswords.setBackground(new java.awt.Color(255, 255, 255));
        numPasswords.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numPasswords.setText("1");
        numPasswords.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        numPasswords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPasswordsActionPerformed(evt);
            }
        });
        numPasswords.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numPasswordsKeyTyped(evt);
            }
        });

        numCharacters.setBackground(new java.awt.Color(255, 255, 255));
        numCharacters.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numCharacters.setText("8");
        numCharacters.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        numCharacters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numCharactersActionPerformed(evt);
            }
        });
        numCharacters.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numCharactersKeyTyped(evt);
            }
        });

        firstNoNumber.setText("( don't begin with a number or symbol )");
        firstNoNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNoNumberActionPerformed(evt);
            }
        });

        number.setSelected(true);
        number.setText("( e.g. 123456 )");
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });

        lowerCase.setSelected(true);
        lowerCase.setText("( e.g. abcdefgh )");
        lowerCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerCaseActionPerformed(evt);
            }
        });

        upperCase.setSelected(true);
        upperCase.setText("( e.g. ABCDEFGH )");
        upperCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperCaseActionPerformed(evt);
            }
        });

        symbol.setText("( e.g. ! \" ; # $ % & ' ( ) * + , - . / : < = > ? @ [ ] ^ _ { | } ~ ` )");
        symbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symbolActionPerformed(evt);
            }
        });

        genPassword.setText("Generate Password");
        genPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numPasswords, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(genPassword))
                    .addComponent(symbol)
                    .addComponent(firstNoNumber)
                    .addComponent(lowerCase)
                    .addComponent(number)
                    .addComponent(upperCase)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numPasswords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(genPassword)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lowerCase)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upperCase))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNoNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(symbol))))
                .addContainerGap())
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password/1111111111111.jpg"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(jTextArea1);

        inputText.setSelectedTextColor(new java.awt.Color(255, 0, 0));

        found.setSelectedTextColor(new java.awt.Color(255, 0, 0));

        jLabel7.setText("input suuggetions");

        jLabel8.setText("remove characters");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(found, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(5, 5, 5)
                        .addComponent(found, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numCharactersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCharactersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numCharactersActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_formKeyTyped

    private void numCharactersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numCharactersKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_numCharactersKeyTyped

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed

    }//GEN-LAST:event_numberActionPerformed

    private void lowerCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerCaseActionPerformed

    }//GEN-LAST:event_lowerCaseActionPerformed

    private void numPasswordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPasswordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numPasswordsActionPerformed

    private void numPasswordsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numPasswordsKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_numPasswordsKeyTyped

    private void genPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genPasswordActionPerformed
        /*
            symbols 33-47(15), 58-64(7), 91-96(6), 123-126(4)
            numbers 48-57(10)
            uppercase letters 65-90(26)
            lowercase letters 97-122(26)
            
         */
        if (number.isSelected() || upperCase.isSelected() || lowerCase.isSelected() || symbol.isSelected()) {
            jTextArea1.setText("");
            int fourNumber[] = new int[4];
            int lastNumber[];

            int num1 = Integer.parseInt(numPasswords.getText());
            int num2 = Integer.parseInt(numCharacters.getText());
            for (int j = 1; j <= num1; j++) {
                int counter1 = 0;
                String lastPs = "";
                for (int k = 1; k <= num2; k++) {

                    //don't use number or symbol as the first character
                    if (k == 1 && firstNoNumber.isSelected()) {
                        fourNumber = getCharcterNumber(false);
                    } else {
                        fourNumber = getCharcterNumber(true);
                    }
                    
                    //count number of assigned values in 'fourNumber' array
                    for (int i = 0; i < 4; i++) {
                        if (fourNumber[i] > 0) {
                            counter1++;
                        }
                    }
                    
                    //remove 0 values from 'fourNumber' array
                    lastNumber = new int[counter1];
                    for (int i = 0; i < 4; i++) {
                        if (fourNumber[i] > 0) {
                            --counter1;
                            lastNumber[counter1] = fourNumber[i];
                        }
                    }

                    char lastCharacter = (char) lastNumber[getRandomNumber(0, lastNumber.length - 1)];
                    lastPs = lastPs + lastCharacter;
                }
                
                if(inputText.getText()==lastPs){
                    found.setText("Found...");
                }
//                jTextArea1.setText(jTextArea1.getText() + (lastPs + "\n"));
            }

        }


    }//GEN-LAST:event_genPasswordActionPerformed

    private void upperCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperCaseActionPerformed

    }//GEN-LAST:event_upperCaseActionPerformed

    private void firstNoNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNoNumberActionPerformed

    }//GEN-LAST:event_firstNoNumberActionPerformed

    private void symbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symbolActionPerformed

    }//GEN-LAST:event_symbolActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PasswordGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordGenerator().setVisible(true);
            }
        });
    }

    // get a random number within a range
    public static int getRandomNumber(int min, int max) {

        /*
            symbols 33-47(15), 58-64(7), 91-96(6), 123-126(4)
            numbers 48-57(10)
            uppercase letters 65-90(26)
            lowercase letters 97-122(26)
            
         */
        Random rn = new Random();
        int minimum = min, maximum = max;
        int ranNum = rn.nextInt((maximum - minimum) + 1) + minimum;

        return ranNum;

    }

    // get four characters to a array
    public int[] getCharcterNumber(boolean numSym) {

        int fourCharNumber[] = new int[4];

        if (symbol.isSelected() && numSym) {
            int symRange = getRandomNumber(1, 4);
            switch (symRange) {
                case 1:
                    fourCharNumber[0] = getRandomNumber(33, 47);
                    break;
                case 2:
                    fourCharNumber[0] = getRandomNumber(58, 64);
                    break;
                case 3:
                    fourCharNumber[0] = getRandomNumber(91, 96);
                    break;
                default:
                    fourCharNumber[0] = getRandomNumber(123, 126);
                    break;
            }

        }
        if (number.isSelected() && numSym) {
            fourCharNumber[1] = getRandomNumber(48, 57);
        }
        if (upperCase.isSelected()) {
            fourCharNumber[2] = getRandomNumber(65, 90);
        }
        if (lowerCase.isSelected()) {
            fourCharNumber[3] = getRandomNumber(97, 122);
        }
        numSym=true;
        return fourCharNumber;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox firstNoNumber;
    private javax.swing.JTextField found;
    private javax.swing.JButton genPassword;
    private javax.swing.JTextField inputText;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JCheckBox lowerCase;
    private javax.swing.JTextField numCharacters;
    private javax.swing.JTextField numPasswords;
    private javax.swing.JCheckBox number;
    private javax.swing.JCheckBox symbol;
    private javax.swing.JCheckBox upperCase;
    // End of variables declaration//GEN-END:variables
}
