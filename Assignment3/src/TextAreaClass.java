/*
 * TextAreaClass.java
 *
 * Created on September 17, 2013, 9:12 PM
 */



/**
 *
 * @author  Prakhar
 */
import java.awt.*;
import java.awt.event.*;
import java.lang.String;
public class TextAreaClass extends javax.swing.JFrame {
    char textfieldarray[]=new char[30];
    char textareaarray[]=new char[500];
 char temparray[]=new char[30];
 int count=0;
 char ch=' ';
    
    /** Creates new form TextAreaClass */
    public TextAreaClass() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEXT AREA ASSIGNMENT");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18));
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("WRITE YOUR TEXT HERE");

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18));
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("SEARCH WORD:-");

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 14));
        jButton3.setText("CLEAR TEXT AREA");

        jButton5.setText("jButton5");

        jButton6.setFont(new java.awt.Font("Arial Black", 1, 14));
        jButton6.setForeground(new java.awt.Color(0, 0, 255));
        jButton6.setText("CLEAR TEXT FIELD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addGap(26, 26, 26)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(evt.getSource()==jButton1)
{
    String textarea=jTextArea1.getText();
    System.out.println(textarea);
    char textareaarray[]=textarea.toCharArray();
    
    String  textfield=jTextField1.getText();
    System.out.println(textfield);
    
    char textfieldarray[]=textfield.toCharArray();
    int len=textfield.length();
    System.out.println("THE LENGTH OF TEXTFIELD CONTENT IS: "+len);
   
    //LOGIC FOR COMPARISON
    try{
    for(int i=0;i<textarea.length();i++)
    {
        
        for(int j=0;j<textfield.length();j++)
        {
           
            if((textfieldarray[j]==textareaarray[i]) && (textareaarray[i]!=ch))
            {
                System.out.println("in the if:");
            count++;
        temparray[count-1]=textfieldarray[j];
        System.out.println("count="+count);
            if(count<=len)
            {
              System.out.println("STRING MATCHED.\nTHE MATCHED STRING IS:\n\n");
              for(int m=0;m<=len;m++)
              {System.out.println("HELLO YAAR");
                  System.out.print(textfieldarray[m]);
              }
            }//end inner if
            }//end of outer if
    }
}}catch(Exception e){}//end of outer for
    count=0;
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextAreaClass().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
}
