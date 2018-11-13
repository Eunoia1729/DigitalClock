import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
/**
 *
 * @author 6ix
 */
public class MainClass extends javax.swing.JFrame {

    /**
     * Creates new form MainClass
     */
    private Clock clock = new Clock();
    private String timeZone="IST";
    public MainClass() {
        initComponents();
        new Thread(){
            public void run(){    
                while(true){
                    timeLabel.setText(clock.getTime(timeZone).toString());
                    String day=clock.getDay();
                    dateLabel.setText(day);
                    timeLabel.setBackground(clock.getProperties().getBgColor());
                    timeLabel.setForeground(clock.getProperties().getTextColor());
                    timeLabel.setBorder(new LineBorder(clock.getProperties().getBorderColor(),3));
                    timeLabel.setFont(clock.getProperties().getFont());
                }
            }
        }.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        timeZoneCombo = new javax.swing.JComboBox<>();
        dateLabel = new javax.swing.JLabel();
        generateStopwatch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settingsicon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("AnjaliOldLipi", 1, 48)); // NOI18N
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText(":00:00");

        timeZoneCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IST", "GMT", "MIT", "Singapore", "Europe/London", "Iceland", "Portugal", "America/Los_Angeles", "Australia/Adelaide", "Hongkong", "PRC", "Canada/Pacific", "Japan", "Africa/Johannesburg", "Asia/Qatar", "Etc/GMT+12", "Etc/GMT+11", "Pacific/Apia", "Pacific/Midway", "Pacific/Niue", "Pacific/Pago_Pago", "Pacific/Samoa", "US/Samoa", "America/Adak", "America/Atka", "Etc/GMT+10", "HST", "Pacific/Fakaofo", "Pacific/Honolulu", "Pacific/Johnston", "Pacific/Rarotonga", "Pacific/Tahiti", "SystemV/HST10", "US/Aleutian", "US/Hawaii", "Pacific/Marquesas", "AST", "America/Anchorage", "America/Juneau", "America/Nome", "America/Yakutat", "Etc/GMT+9", "Pacific/Gambier", "SystemV/YST9", "SystemV/YST9YDT", "US/Alaska", "America/Dawson", "America/Ensenada", "America/Tijuana", "America/Vancouver", "America/Whitehorse", "Canada/Yukon", "Etc/GMT+8", "Mexico/BajaNorte", "PST", "PST8PDT", "Pacific/Pitcairn", "SystemV/PST8", "SystemV/PST8PDT", "US/Pacific", "US/Pacific-New", "America/Boise", "America/Cambridge_Bay", "America/Chihuahua", "America/Dawson_Creek", "America/Denver", "America/Edmonton", "America/Hermosillo", "America/Inuvik", "America/Mazatlan", "America/Phoenix", "America/Shiprock", "America/Yellowknife", "Canada/Mountain", "Etc/GMT+7", "MST", "MST7MDT", "Mexico/BajaSur", "Navajo", "PNT", "SystemV/MST7", "SystemV/MST7MDT", "US/Arizona", "US/Mountain", "America/Belize", "America/Cancun", "America/Chicago", "America/Costa_Rica", "America/El_Salvador", "America/Guatemala", "America/Managua", "America/Menominee", "America/Merida", "America/Mexico_City", "America/Monterrey", "America/North_Dakota/Center", "America/Rainy_River", "America/Rankin_Inlet", "America/Regina", "America/Swift_Current", "America/Tegucigalpa", "America/Winnipeg", "CST", "CST6CDT", "Canada/Central", "Canada/East-Saskatchewan", "Canada/Saskatchewan", "Chile/EasterIsland", "Etc/GMT+6", "Mexico/General", "Pacific/Easter", "Pacific/Galapagos", "SystemV/CST6", "SystemV/CST6CDT", "US/Central", "America/Bogota", "America/Cayman", "America/Detroit", "America/Eirunepe", "America/Fort_Wayne", "America/Grand_Turk", "America/Guayaquil", "America/Havana", "America/Indiana/Indianapolis", "America/Indiana/Knox", "America/Indiana/Marengo", "America/Indiana/Vevay", "America/Indianapolis", "America/Iqaluit", "America/Jamaica", "America/Kentucky/Louisville", "America/Kentucky/Monticello", "America/Knox_IN", "America/Lima", "America/Louisville", "America/Montreal", "America/Nassau", "America/New_York", "America/Nipigon", "America/Panama", "America/Pangnirtung", "America/Port-au-Prince", "America/Porto_Acre", "America/Rio_Branco", "America/Thunder_Bay", "America/Toronto", "Brazil/Acre", "Canada/Eastern", "Cuba", "EST", "EST5EDT", "Etc/GMT+5", "IET", "Jamaica", "SystemV/EST5", "SystemV/EST5EDT", "US/East-Indiana", "US/Eastern", "US/Indiana-Starke", "US/Michigan", "America/Anguilla", "America/Antigua", "America/Aruba", "America/Asuncion", "America/Barbados", "America/Boa_Vista", "America/Campo_Grande", "America/Caracas", "America/Cuiaba", "America/Curacao", "America/Dominica", "America/Glace_Bay", "America/Goose_Bay", "America/Grenada", "America/Guadeloupe", "America/Guyana", "America/Halifax", "America/La_Paz", "America/Manaus", "America/Martinique", "America/Montserrat", "America/Port_of_Spain", "America/Porto_Velho", "America/Puerto_Rico", "America/Santiago", "America/Santo_Domingo", "America/St_Kitts", "America/St_Lucia", "America/St_Thomas", "America/St_Vincent", "America/Thule", "America/Tortola", "America/Virgin", "Antarctica/Palmer", "Atlantic/Bermuda", "Atlantic/Stanley", "Brazil/West", "Canada/Atlantic", "Chile/Continental", "Etc/GMT+4", "PRT", "SystemV/AST4", "SystemV/AST4ADT", "America/St_Johns", "CNT", "Canada/Newfoundland", "AGT", "America/Araguaina", "America/Bahia", "America/Belem", "America/Buenos_Aires", "America/Catamarca", "America/Cayenne", "America/Cordoba", "America/Fortaleza", "America/Godthab", "America/Jujuy", "America/Maceio", "America/Mendoza", "America/Miquelon", "America/Montevideo", "America/Paramaribo", "America/Recife", "America/Rosario", "America/Sao_Paulo", "Antarctica/Rothera", "BET", "Brazil/East", "Etc/GMT+3", "America/Noronha", "Atlantic/South_Georgia", "Brazil/DeNoronha", "Etc/GMT+2", "America/Scoresbysund", "Atlantic/Azores", "Atlantic/Cape_Verde", "Etc/GMT+1", "Africa/Abidjan", "Africa/Accra", "Africa/Bamako", "Africa/Banjul", "Africa/Bissau", "Africa/Casablanca", "Africa/Conakry", "Africa/Dakar", "Africa/El_Aaiun", "Africa/Freetown", "Africa/Lome", "Africa/Monrovia", "Africa/Nouakchott", "Africa/Ouagadougou", "Africa/Sao_Tome", "Africa/Timbuktu", "America/Danmarkshavn", "Atlantic/Canary", "Atlantic/Faeroe", "Atlantic/Madeira", "Atlantic/Reykjavik", "Atlantic/St_Helena", "Eire", "Etc/GMT", "Etc/GMT+0", "Etc/GMT-0", "Etc/GMT0", "Etc/Greenwich", "Etc/UCT", "Etc/UTC", "Etc/Universal", "Etc/Zulu", "Europe/Belfast", "Europe/Dublin", "Europe/Lisbon", "GB", "GB-Eire", "GMT0", "Greenwich", "UCT", "UTC", "Universal", "WET", "Zulu", "Africa/Algiers", "Africa/Bangui", "Africa/Brazzaville", "Africa/Ceuta", "Africa/Douala", "Africa/Kinshasa", "Africa/Lagos", "Africa/Libreville", "Africa/Luanda", "Africa/Malabo", "Africa/Ndjamena", "Africa/Niamey", "Africa/Porto-Novo", "Africa/Tunis", "Africa/Windhoek", "Arctic/Longyearbyen", "Atlantic/Jan_Mayen", "CET", "ECT", "Etc/GMT-1", "Europe/Amsterdam", "Europe/Andorra", "Europe/Belgrade", "Europe/Berlin", "Europe/Bratislava", "Europe/Brussels", "Europe/Budapest", "Europe/Copenhagen", "Europe/Gibraltar", "Europe/Ljubljana", "Europe/Luxembourg", "Europe/Madrid", "Europe/Malta", "Europe/Monaco", "Europe/Oslo", "Europe/Paris", "Europe/Prague", "Europe/Rome", "Europe/San_Marino", "Europe/Sarajevo", "Europe/Skopje", "Europe/Stockholm", "Europe/Tirane", "Europe/Vaduz", "Europe/Vatican", "Europe/Vienna", "Europe/Warsaw", "Europe/Zagreb", "Europe/Zurich", "MET", "Poland", "ART", "Africa/Blantyre", "Africa/Bujumbura", "Africa/Cairo", "Africa/Gaborone", "Africa/Harare", "Africa/Kigali", "Africa/Lubumbashi", "Africa/Lusaka", "Africa/Maputo", "Africa/Maseru", "Africa/Mbabane", "Africa/Tripoli", "Asia/Amman", "Asia/Beirut", "Asia/Damascus", "Asia/Gaza", "Asia/Istanbul", "Asia/Jerusalem", "Asia/Nicosia", "Asia/Tel_Aviv", "CAT", "EET", "Egypt", "Etc/GMT-2", "Europe/Athens", "Europe/Bucharest", "Europe/Chisinau", "Europe/Helsinki", "Europe/Istanbul", "Europe/Kaliningrad", "Europe/Kiev", "Europe/Minsk", "Europe/Nicosia", "Europe/Riga", "Europe/Simferopol", "Europe/Sofia", "Europe/Tallinn", "Europe/Tiraspol", "Europe/Uzhgorod", "Europe/Vilnius", "Europe/Zaporozhye", "Israel", "Libya", "Turkey", "Africa/Addis_Ababa", "Africa/Asmera", "Africa/Dar_es_Salaam", "Africa/Djibouti", "Africa/Kampala", "Africa/Khartoum", "Africa/Mogadishu", "Africa/Nairobi", "Antarctica/Syowa", "Asia/Aden", "Asia/Baghdad", "Asia/Bahrain", "Asia/Kuwait", "Asia/Riyadh", "EAT", "Etc/GMT-3", "Europe/Moscow", "Indian/Antananarivo", "Indian/Comoro", "Indian/Mayotte", "W-SU", "Asia/Riyadh87", "Asia/Riyadh88", "Asia/Riyadh89", "Mideast/Riyadh87", "Mideast/Riyadh88", "Mideast/Riyadh89", "Asia/Tehran", "Iran", "Asia/Aqtau", "Asia/Baku", "Asia/Dubai", "Asia/Muscat", "Asia/Oral", "Asia/Tbilisi", "Asia/Yerevan", "Etc/GMT-4", "Europe/Samara", "Indian/Mahe", "Indian/Mauritius", "Indian/Reunion", "NET", "Asia/Kabul", "Asia/Aqtobe", "Asia/Ashgabat", "Asia/Ashkhabad", "Asia/Bishkek", "Asia/Dushanbe", "Asia/Karachi", "Asia/Samarkand", "Asia/Tashkent", "Asia/Yekaterinburg", "Etc/GMT-5", "Indian/Kerguelen", "Indian/Maldives", "PLT", "Asia/Calcutta", "Asia/Katmandu", "Antarctica/Mawson", "Antarctica/Vostok", "Asia/Almaty", "Asia/Colombo", "Asia/Dacca", "Asia/Dhaka", "Asia/Novosibirsk", "Asia/Omsk", "Asia/Qyzylorda", "Asia/Thimbu", "Asia/Thimphu", "BST", "Etc/GMT-6", "Indian/Chagos", "Asia/Rangoon", "Indian/Cocos", "Antarctica/Davis", "Asia/Bangkok", "Asia/Hovd", "Asia/Jakarta", "Asia/Krasnoyarsk", "Asia/Phnom_Penh", "Asia/Pontianak", "Asia/Saigon", "Asia/Vientiane", "Etc/GMT-7", "Indian/Christmas", "VST", "Antarctica/Casey", "Asia/Brunei", "Asia/Chongqing", "Asia/Chungking", "Asia/Harbin", "Asia/Hong_Kong", "Asia/Irkutsk", "Asia/Kashgar", "Asia/Kuala_Lumpur", "Asia/Kuching", "Asia/Macao", "Asia/Macau", "Asia/Makassar", "Asia/Manila", "Asia/Shanghai", "Asia/Singapore", "Asia/Taipei", "Asia/Ujung_Pandang", "Asia/Ulaanbaatar", "Asia/Ulan_Bator", "Asia/Urumqi", "Australia/Perth", "Australia/West", "CTT", "Etc/GMT-8", "Asia/Choibalsan", "Asia/Dili", "Asia/Jayapura", "Asia/Pyongyang", "Asia/Seoul", "Asia/Tokyo", "Asia/Yakutsk", "Etc/GMT-9", "JST", "Pacific/Palau", "ROK", "ACT", "Australia/Broken_Hill", "Australia/Darwin", "Australia/North", "Australia/South", "Australia/Yancowinna", "AET", "Antarctica/DumontDUrville", "Asia/Sakhalin", "Asia/Vladivostok", "Australia/ACT", "Australia/Brisbane", "Australia/Canberra", "Australia/Hobart", "Australia/Lindeman", "Australia/Melbourne", "Australia/NSW", "Australia/Queensland", "Australia/Sydney", "Australia/Tasmania", "Australia/Victoria", "Etc/GMT-10", "Pacific/Guam", "Pacific/Port_Moresby", "Pacific/Saipan", "Pacific/Truk", "Pacific/Yap", "Australia/LHI", "Australia/Lord_Howe", "Asia/Magadan", "Etc/GMT-11", "Pacific/Efate", "Pacific/Guadalcanal", "Pacific/Kosrae", "Pacific/Noumea", "Pacific/Ponape", "SST", "Pacific/Norfolk", "Antarctica/McMurdo", "Antarctica/South_Pole", "Asia/Anadyr", "Asia/Kamchatka", "Etc/GMT-12", "Kwajalein", "NST", "NZ", "Pacific/Auckland", "Pacific/Fiji", "Pacific/Funafuti", "Pacific/Kwajalein", "Pacific/Majuro", "Pacific/Nauru", "Pacific/Tarawa", "Pacific/Wake", "Pacific/Wallis", "NZ-CHAT", "Pacific/Chatham", "Etc/GMT-13", "Pacific/Enderbury", "Pacific/Tongatapu", "Etc/GMT-14", "Pacific/Kiritimati" }));
        timeZoneCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTimeZone(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("MV Boli", 2, 18)); // NOI18N

        generateStopwatch.setText("STOPWATCH");
        generateStopwatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateStopwatchActionPerformed(evt);
            }
        });

        jButton2.setText("ALARM");

        jButton3.setText("TIMER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 207, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timeZoneCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(generateStopwatch, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeZoneCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generateStopwatch, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );

        jButton2.getAccessibleContext().setAccessibleName("alarmButton");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectTimeZone(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTimeZone
        // TODO add your handling code here:
        timeZone=timeZoneCombo.getSelectedItem().toString();
        
        //System.out.println(timeZone);
    }//GEN-LAST:event_selectTimeZone

    private void generateStopwatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateStopwatchActionPerformed
        // TODO add your handling code here:
        stopwatch watch=new stopwatch();
        //watch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        watch.setVisible(true);
    }//GEN-LAST:event_generateStopwatchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JDialog settingsDialog = new Settings(clock);
        settingsDialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        GUITimer timer=new GUITimer();
        timer.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton generateStopwatch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JComboBox<String> timeZoneCombo;
    // End of variables declaration//GEN-END:variables
}
