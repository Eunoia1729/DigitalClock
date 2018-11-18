/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6ix
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.NumberFormat;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.Border;

public class GUITimer extends JFrame implements ItemListener {

    JLabel jltime;
    JLabel jl;
    JComboBox<Integer> jcb;
    JButton jbt;
    JButton jbt2;
    NumberFormat format;

    public Timer timer;
    public long initial;
    public long ttime2;
    public String ttime;
    public long remaining;

    public GUITimer() {

        JPanel timePanel = new JPanel();
        timePanel.setForeground(Color.BLACK);
       timePanel.setBackground(Color.black);

        jltime = new JLabel("00:00");
        jltime.setForeground(new java.awt.Color(0, 255, 255));
        jltime.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        Border border = BorderFactory.createLineBorder(Color.white, 3, rootPaneCheckingEnabled);
        jltime.setBorder(border);
        //jltime.setForeground(Color.CYAN);
        jltime.setBackground(Color.black);
        jltime.setOpaque(true);
        jltime.setFont(new Font("DS-Digital", Font.BOLD, 96));

        timePanel.add(jltime);

        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.BLACK);
        jp1.setLayout(new FlowLayout());

        jl = new JLabel("TOTAL TIME (min):");
        jl.setForeground(Color.CYAN);
        jl.setFont(new Font ("DS-Digital", Font.BOLD, 8));
        jp1.add(jl);

        jcb = new JComboBox<Integer>();
        jcb.setBackground(Color.white);
         jl.setFont(new Font ("DS-Digital", Font.BOLD, 16));
        for (int i = 59; i > 0; i--) {
            jcb.addItem(Integer.valueOf(i));
        }
        jcb.setSelectedIndex(0);
        ttime = "59";
        jp1.add(jcb);

        jbt = new JButton("START");
         jl.setFont(new Font ("DS-Digital", Font.BOLD, 16));
       jbt.setBackground(Color.white);
        jp1.add(jbt);

        jbt2 = new JButton("RESET");
         jl.setFont(new Font ("DS-Digital", Font.BOLD, 16));
        jbt2.setBackground(Color.white);
        jp1.add(jbt2);
        

        getContentPane().add(jp1, BorderLayout.NORTH);
        getContentPane().add(timePanel, BorderLayout.CENTER);

        Event e = new Event();
        jbt.addActionListener(e);
        jbt2.addActionListener(e);

        jcb.addItemListener(this);

        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Timer");
        pack();
        setLocationByPlatform(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUITimer();
            }

        });
    }
Timeclass tc;
    // this method will run when user presses the start button
    void updateDisplay() {
        
        tc = new Timeclass(ttime);
        timer = new Timer(1000, tc);
        initial = System.currentTimeMillis();
        timer.start();
    }

    // code for what happens when user presses the start or reset button
    public class Event implements ActionListener {
       
        public void actionPerformed(ActionEvent e) {
            String bname = e.getActionCommand();
            if (bname.equals("START")) {
                if(timer!=null)timer.stop();
                timer =null;
                updateDisplay();
            }  else if( bname.equals("RESET") ){
                timer.stop();
                timer = null;
                jltime.setText(ttime+ ":00");
                
            }else{
                jltime.setText("00:00");
                timer.stop();
                
                remaining = convertTimer();
            }
        }
    }

    // code that is invoked by swing timer for every second passed
    public class Timeclass implements ActionListener {
         private String tt;

        public Timeclass(String t) {
            tt =t;
        }
        public void actionPerformed(ActionEvent e) {

            remaining = convertTime();
            long current = System.currentTimeMillis();
            long elapsed = current - initial;
            remaining -= elapsed;
            // initial = current;

            format = NumberFormat.getNumberInstance();
            format.setMinimumIntegerDigits(2);

            if (remaining < 0)
                remaining = (long) 0;
            int minutes = (int) (remaining / 60000);
            int seconds = (int) ((remaining % 60000) / 1000);
            jltime.setText(format.format(minutes) + ":"
                    + format.format(seconds));

            if (remaining == 0) {
                jltime.setText("Stop");
                timer.stop();
            }
        }
        
        public long convertTime() {

        ttime2 = Long.parseLong(tt);
        long converted = (ttime2 * 60000) + 1000;
        return converted;
    }
    }

    // get the number of minutes chosen by the user and activate convertTime
    // method
    public void itemStateChanged(ItemEvent ie) {

        ttime = (String) jcb.getSelectedItem().toString();
    }

    // first need to convert no. of minutes from string to long.
    // then need to convert that to milliseconds.
  public long convertTimer() {
        ttime = (String) jcb.getSelectedItem().toString();
        ttime2 = Long.parseLong(ttime);
        long converted = (ttime2 * 60000) + 1000;
        return converted;
    }
}
