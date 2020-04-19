
package javaapplication1;


public class jogo extends javax.swing.JFrame {
public boolean  joga=true;
public boolean jogb=true;
public int contpos = 0;
public int k=0, i = 0;
int op;
public String linha1, linha2, linha3, coluna1, coluna2, coluna3, diagonal1, diagonal2;

String[][] posvetor = new String[3][3];


    public jogo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnreiniciar = new javax.swing.JButton();
        txtvisor = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn1.setBackground(new java.awt.Color(0, 153, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn1.setFocusCycleRoot(true);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 153, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn2.setFocusCycleRoot(true);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 153, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn3.setFocusCycleRoot(true);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 153, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn4.setFocusCycleRoot(true);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 153, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn5.setFocusCycleRoot(true);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 153, 255));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn6.setFocusCycleRoot(true);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 153, 255));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn7.setFocusCycleRoot(true);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 153, 255));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn8.setFocusCycleRoot(true);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 153, 255));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn9.setFocusCycleRoot(true);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnreiniciar.setBackground(new java.awt.Color(0, 102, 153));
        btnreiniciar.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnreiniciar.setText("Reset");
        btnreiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreiniciarActionPerformed(evt);
            }
        });

        txtvisor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtvisor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtvisor, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnreiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(txtvisor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnreiniciar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void verificaJogadordavez(){
        if(joga==true&&jogb==true){
            this.op=1;
            joga=false;
            jogb=true;
            txtvisor.setText("Vez do Player bolinha");
        }else if(joga&&jogb==false){
            this.op=1;
            joga=false;
            jogb=true;
            txtvisor.setText("Vez do Player bolinha");
        }else{
            this.op=2;
            joga=true;
            jogb=false;
            txtvisor.setText("Vez do Player X");
        }
    }
    public void Limpaposicoes(){
        for(i=0; i<3;i++){
            for(k=0; k<3; k++){
                posvetor[i][k]="";
            }
        }
    }
    public void desativaB(){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
    public void verificapos(){
        contpos=0;
        for(i=0; i<3;i++){
            for(k=0; k<3; k++){
                if(posvetor[i][k]=="x"| posvetor[i][k] =="o"){
                    contpos+=1;
                }
            }
        }
    }
    public void VerificaVencedor(){
        linha1=posvetor[0][0]+posvetor[0][1]+posvetor[0][2];
        linha2=posvetor[1][0]+posvetor[1][1]+posvetor[1][2];
        linha3=posvetor[2][0]+posvetor[2][1]+posvetor[2][2];
        
        coluna1=posvetor[0][0]+posvetor[1][0]+posvetor[2][0];
        coluna2=posvetor[0][1]+posvetor[1][1]+posvetor[2][1];
        coluna3=posvetor[0][2]+posvetor[1][2]+posvetor[2][2];
        
        diagonal1=posvetor[0][0]+posvetor[1][1]+posvetor[2][2];
        diagonal2=posvetor[0][2]+posvetor[1][1]+posvetor[2][0];
        
        if(linha1.equals("xxx")|linha2.equals("xxx")| linha3.equals("xxx")
        | coluna1.equals("xxx")| coluna2.equals("xxx")| coluna3.equals("xxx")|
           diagonal1.equals("xxx") | diagonal2.equals("xxx")){
            txtvisor.setText("PlayerX venceu!");
            desativaB();
        }
        else if(linha1.equals("ooo")|linha2.equals("ooo")| linha3.equals("ooo")
        | coluna1.equals("ooo")| coluna2.equals("ooo")| coluna3.equals("ooo")|
           diagonal1.equals("ooo") | diagonal2.equals("ooo")){
            txtvisor.setText("Player bolinha venceu!");
            desativaB();
        }else if(contpos==9){
            txtvisor.setText("Deu velha!");
        }
    }
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        //botao1
        verificaJogadordavez();
        if(op==1){
        btn1.setText("X");
        posvetor[0][0] = "x";
        }else{
        btn1.setText("O");
        posvetor[0][0] = "o";
        }
        btn1.setEnabled(false);
        verificapos();
        VerificaVencedor();       
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        //botao4
        verificaJogadordavez();
        if(op==1){
            btn4.setText("X");
            posvetor[1][0] = "x";
        }else{
            btn4.setText("O");
            posvetor[1][0] = "o";
        }
        btn4.setEnabled(false);
        verificapos();
        VerificaVencedor();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        //botao7
        verificaJogadordavez();
        if(op==1){
            btn7.setText("X");
            posvetor[2][0] = "x";
        }else{
            btn7.setText("O");
            posvetor[2][0] = "o";
        }
        btn7.setEnabled(false);
        verificapos();
        VerificaVencedor();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnreiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreiniciarActionPerformed
        //Reset
        btn1.setText("");
        btn1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        btn9.setEnabled(true);
        Limpaposicoes();
        txtvisor.setText("");
        joga=true;
        jogb=true;
    }//GEN-LAST:event_btnreiniciarActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        //botao2
        verificaJogadordavez();
        if(op==1){
            btn2.setText("X");
            posvetor[0][1] = "x";
        }else{
            btn2.setText("O");
            posvetor[0][1] = "o";
        }
        btn2.setEnabled(false);
        verificapos();
        VerificaVencedor();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        //botao3
        verificaJogadordavez();
        if(op==1){
            btn3.setText("X");
            posvetor[0][2] = "x";
        }else{
            btn3.setText("O");
            posvetor[0][2]= "o";
        }
        btn3.setEnabled(false);
        verificapos();
        VerificaVencedor();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        //botao5
        verificaJogadordavez();
        if(op==1){
            btn5.setText("X");
            posvetor[1][1] = "x";
        }else{
            btn5.setText("O");
            posvetor[1][1] = "o";
        }
        btn5.setEnabled(false);
        verificapos();
        VerificaVencedor();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       //botao6
        verificaJogadordavez();
        if(op==1){
            btn6.setText("X");
            posvetor[1][2] = "x";
        }else{
            btn6.setText("O");
            posvetor[1][2] = "o";
        }
        btn6.setEnabled(false);
        verificapos();
        VerificaVencedor();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        //botao8
        verificaJogadordavez();
        if(op==1){
            btn8.setText("X");
            posvetor[2][1] = "x";
        }else{
            btn8.setText("O");
            posvetor[2][1] = "o";
        }
        btn8.setEnabled(false);
        verificapos();
        VerificaVencedor();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        //botao9
        verificaJogadordavez();
        if(op==1){
            btn9.setText("X");
            posvetor[2][2] = "x";
        }else{
            btn9.setText("O");
            posvetor[2][2] = "o";
        }
        btn9.setEnabled(false);
        verificapos();
        VerificaVencedor();
    }//GEN-LAST:event_btn9ActionPerformed

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
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnreiniciar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JTextField txtvisor;
    // End of variables declaration//GEN-END:variables
}
