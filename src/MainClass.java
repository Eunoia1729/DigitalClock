import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.GraphicsEnvironment;
import java.io.*;
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener; 
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.Transparency;
/**
 *
 * @author 6ix
 */
import java.awt.Color;
import java.awt.event.ItemEvent;

public class MainClass extends javax.swing.JFrame implements ItemListener{

    /**
     * Creates new form MainClass
     */
    private int timeFormat;
    private Clock clock = new Clock();
    private alarmClock alarmC = new alarmClock();
    private String timeZone="IST";
    public MainClass() {
        getContentPane().setBackground(Color.black);
       // getContentPane().setBorder(new LineBorder(clock.getProperties().getBorderColor(),5));
        int i = 0;
        initComponents();
        toggleBtn.setOpaque(false);
        toggleBtn.setContentAreaFilled(false);
        toggleBtn.setBorderPainted(false);
        setAction();
        new Thread(){
            public void run(){
                while(true){
                    if(timeFormat==1)
                    {
                    timeLabel.setText(clock.getTime(timeZone).toString());
                    amLabel.setText(clock.getTime(timeZone).getAM());
                    }
                    else
                    {
                    timeLabel.setText(clock.getTime(timeZone).toggle());
                    amLabel.setText("");
                    }
                    String day=clock.getDay();
                    dateLabel.setText(day);
                    timeLabel.setBackground(clock.getProperties().getBgColor());
                    timeLabel.setForeground(clock.getProperties().getTextColor());
                    mainPanel.setBorder(new LineBorder(clock.getProperties().getBorderColor(),5));
                    timeLabel.setFont(clock.getProperties().getFont());
                    dateLabel.setForeground(clock.getProperties().getTextColor());
                    dateLabel.setFont(new Font(clock.getProperties().getFont().getFamily(),0,30));
                    alarmC.checkAlarm(clock.getTime(timeZone), day);
                }
            }
        }.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        settingsBtn = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        BtnPanel = new javax.swing.JPanel();
        stopwatchBtn = new javax.swing.JButton();
        alarmBtn = new javax.swing.JButton();
        timerBtn = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        amLabel = new javax.swing.JLabel();
        toggleBtn = new javax.swing.JToggleButton();
        timeFormatLabel = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        mainPanel.setOpaque(false);

        settingsBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        settingsBtn.setForeground(new java.awt.Color(0, 255, 255));
        settingsBtn.setText("Settings");
        settingsBtn.setOpaque(false);
        settingsBtn.setContentAreaFilled(false);
        settingsBtn.setBorderPainted(false);
        settingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsBtnActionPerformed(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 255, 255));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("Date here");

        BtnPanel.setOpaque(false);

        stopwatchBtn.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        stopwatchBtn.setForeground(new java.awt.Color(0, 255, 255));
        stopwatchBtn.setText("STOPWATCH");
        stopwatchBtn.setOpaque(false);
        stopwatchBtn.setContentAreaFilled(false);
        stopwatchBtn.setBorderPainted(false);
        stopwatchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopwatchBtnActionPerformed(evt);
            }
        });

        alarmBtn.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        alarmBtn.setForeground(new java.awt.Color(0, 255, 255));
        alarmBtn.setText("ALARM");
        alarmBtn.setOpaque(false);
        alarmBtn.setContentAreaFilled(false);
        alarmBtn.setBorderPainted(false);
        alarmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarmBtnActionPerformed(evt);
            }
        });

        timerBtn.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        timerBtn.setForeground(new java.awt.Color(0, 255, 255));
        timerBtn.setText("TIMER");
        timerBtn.setOpaque(false);
        timerBtn.setContentAreaFilled(false);
        timerBtn.setBorderPainted(false);
        timerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BtnPanelLayout = new javax.swing.GroupLayout(BtnPanel);
        BtnPanel.setLayout(BtnPanelLayout);
        BtnPanelLayout.setHorizontalGroup(
            BtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alarmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(stopwatchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(timerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnPanelLayout.setVerticalGroup(
            BtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(BtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stopwatchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alarmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        alarmBtn.getAccessibleContext().setAccessibleName("");

        timeLabel.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(0, 255, 255));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("00:00:00");
        timeLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        timeLabel.setMaximumSize(new java.awt.Dimension(212, 100));
        timeLabel.setMinimumSize(new java.awt.Dimension(212, 100));

        amLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amLabel.setForeground(new java.awt.Color(0, 255, 255));
        amLabel.setText("AM/PM");

        toggleBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        toggleBtn.setForeground(new java.awt.Color(0, 255, 255));
        toggleBtn.setText("24 hr/12 hr");
        toggleBtn.setOpaque(false);
        toggleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtnActionPerformed(evt);
            }
        });

        timeFormatLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timeFormatLabel.setForeground(new java.awt.Color(0, 255, 255));
        timeFormatLabel.setText("IST");
        timeFormatLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeFormatLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(toggleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(timeFormatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(amLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toggleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeFormatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stopwatchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopwatchBtnActionPerformed
        // TODO add your handling code here:
        stopwatch watch=new stopwatch();
        //watch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        watch.setVisible(true);
    }//GEN-LAST:event_stopwatchBtnActionPerformed

    public JLabel getAmlabel()
    {
        return amLabel;
    }
            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void settingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsBtnActionPerformed
        JDialog settingsDialog = new Settings(clock);
        settingsDialog.setVisible(true);
    }//GEN-LAST:event_settingsBtnActionPerformed

    private void timerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerBtnActionPerformed
        new GUITimer().setVisible(true);
    }//GEN-LAST:event_timerBtnActionPerformed

    private void alarmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmBtnActionPerformed
        alarmC.setVisible(true);
    }//GEN-LAST:event_alarmBtnActionPerformed

    private void toggleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtnActionPerformed
      
    }//GEN-LAST:event_toggleBtnActionPerformed

    private void timeFormatLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeFormatLabelMouseClicked
        TimeZoneDialog timeZoneDialog = new TimeZoneDialog(this, rootPaneCheckingEnabled,this);
        timeZoneDialog.setVisible(true);
    }//GEN-LAST:event_timeFormatLabelMouseClicked

     private void setAction() {  
       toggleBtn.addItemListener(this);   
    }  
    
    public void itemStateChanged(ItemEvent eve) {  
        if (toggleBtn.isSelected())  
        {
            timeFormat=0;
        }
        else
        {   
            timeFormat=1;
        }
        
    }  

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        timeFormatLabel.setText(timeZone);
    }

    public String getTimeZone() {
        return timeZone;
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
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnPanel;
    private javax.swing.JButton alarmBtn;
    private javax.swing.JLabel amLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton settingsBtn;
    private javax.swing.JButton stopwatchBtn;
    private javax.swing.JLabel timeFormatLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JButton timerBtn;
    private javax.swing.JToggleButton toggleBtn;
    // End of variables declaration//GEN-END:variables
}
