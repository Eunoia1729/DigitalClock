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
                    //.setBorder(new LineBorder(clock.getProperties().getBorderColor(),5));
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
        java.awt.GridBagConstraints gridBagConstraints;

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
        timeZoneCombo = new javax.swing.JComboBox<>();

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
        dateLabel.setText("      January 01,2018");

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
                .addComponent(stopwatchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(alarmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(timerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BtnPanelLayout.setVerticalGroup(
            BtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(BtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stopwatchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alarmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
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

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(amLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timeFormatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(toggleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(toggleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeFormatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = -273;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 62, 11, 10);
        getContentPane().add(mainPanel, gridBagConstraints);

        timeZoneCombo.setFont(new java.awt.Font("MS UI Gothic", 1, 11)); // NOI18N
        timeZoneCombo.setForeground(new java.awt.Color(0, 255, 255));
        timeZoneCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IST", "GMT", "MIT", "Singapore", "Europe/London", "Iceland", "Portugal", "America/Los_Angeles", "Australia/Adelaide", "Hongkong", "PRC", "Canada/Pacific", "Japan", "Africa/Johannesburg", "Asia/Qatar", "Etc/GMT+12", "Etc/GMT+11", "Pacific/Apia", "Pacific/Midway", "Pacific/Niue", "Pacific/Pago_Pago", "Pacific/Samoa", "US/Samoa", "America/Adak", "America/Atka", "Etc/GMT+10", "HST", "Pacific/Fakaofo", "Pacific/Honolulu", "Pacific/Johnston", "Pacific/Rarotonga", "Pacific/Tahiti", "SystemV/HST10", "US/Aleutian", "US/Hawaii", "Pacific/Marquesas", "AST", "America/Anchorage", "America/Juneau", "America/Nome", "America/Yakutat", "Etc/GMT+9", "Pacific/Gambier", "SystemV/YST9", "SystemV/YST9YDT", "US/Alaska", "America/Dawson", "America/Ensenada", "America/Tijuana", "America/Vancouver", "America/Whitehorse", "Canada/Yukon", "Etc/GMT+8", "Mexico/BajaNorte", "PST", "PST8PDT", "Pacific/Pitcairn", "SystemV/PST8", "SystemV/PST8PDT", "US/Pacific", "US/Pacific-New", "America/Boise", "America/Cambridge_Bay", "America/Chihuahua", "America/Dawson_Creek", "America/Denver", "America/Edmonton", "America/Hermosillo", "America/Inuvik", "America/Mazatlan", "America/Phoenix", "America/Shiprock", "America/Yellowknife", "Canada/Mountain", "Etc/GMT+7", "MST", "MST7MDT", "Mexico/BajaSur", "Navajo", "PNT", "SystemV/MST7", "SystemV/MST7MDT", "US/Arizona", "US/Mountain", "America/Belize", "America/Cancun", "America/Chicago", "America/Costa_Rica", "America/El_Salvador", "America/Guatemala", "America/Managua", "America/Menominee", "America/Merida", "America/Mexico_City", "America/Monterrey", "America/North_Dakota/Center", "America/Rainy_River", "America/Rankin_Inlet", "America/Regina", "America/Swift_Current", "America/Tegucigalpa", "America/Winnipeg", "CST", "CST6CDT", "Canada/Central", "Canada/East-Saskatchewan", "Canada/Saskatchewan", "Chile/EasterIsland", "Etc/GMT+6", "Mexico/General", "Pacific/Easter", "Pacific/Galapagos", "SystemV/CST6", "SystemV/CST6CDT", "US/Central", "America/Bogota", "America/Cayman", "America/Detroit", "America/Eirunepe", "America/Fort_Wayne", "America/Grand_Turk", "America/Guayaquil", "America/Havana", "America/Indiana/Indianapolis", "America/Indiana/Knox", "America/Indiana/Marengo", "America/Indiana/Vevay", "America/Indianapolis", "America/Iqaluit", "America/Jamaica", "America/Kentucky/Louisville", "America/Kentucky/Monticello", "America/Knox_IN", "America/Lima", "America/Louisville", "America/Montreal", "America/Nassau", "America/New_York", "America/Nipigon", "America/Panama", "America/Pangnirtung", "America/Port-au-Prince", "America/Porto_Acre", "America/Rio_Branco", "America/Thunder_Bay", "America/Toronto", "Brazil/Acre", "Canada/Eastern", "Cuba", "EST", "EST5EDT", "Etc/GMT+5", "IET", "Jamaica", "SystemV/EST5", "SystemV/EST5EDT", "US/East-Indiana", "US/Eastern", "US/Indiana-Starke", "US/Michigan", "America/Anguilla", "America/Antigua", "America/Aruba", "America/Asuncion", "America/Barbados", "America/Boa_Vista", "America/Campo_Grande", "America/Caracas", "America/Cuiaba", "America/Curacao", "America/Dominica", "America/Glace_Bay", "America/Goose_Bay", "America/Grenada", "America/Guadeloupe", "America/Guyana", "America/Halifax", "America/La_Paz", "America/Manaus", "America/Martinique", "America/Montserrat", "America/Port_of_Spain", "America/Porto_Velho", "America/Puerto_Rico", "America/Santiago", "America/Santo_Domingo", "America/St_Kitts", "America/St_Lucia", "America/St_Thomas", "America/St_Vincent", "America/Thule", "America/Tortola", "America/Virgin", "Antarctica/Palmer", "Atlantic/Bermuda", "Atlantic/Stanley", "Brazil/West", "Canada/Atlantic", "Chile/Continental", "Etc/GMT+4", "PRT", "SystemV/AST4", "SystemV/AST4ADT", "America/St_Johns", "CNT", "Canada/Newfoundland", "AGT", "America/Araguaina", "America/Bahia", "America/Belem", "America/Buenos_Aires", "America/Catamarca", "America/Cayenne", "America/Cordoba", "America/Fortaleza", "America/Godthab", "America/Jujuy", "America/Maceio", "America/Mendoza", "America/Miquelon", "America/Montevideo", "America/Paramaribo", "America/Recife", "America/Rosario", "America/Sao_Paulo", "Antarctica/Rothera", "BET", "Brazil/East", "Etc/GMT+3", "America/Noronha", "Atlantic/South_Georgia", "Brazil/DeNoronha", "Etc/GMT+2", "America/Scoresbysund", "Atlantic/Azores", "Atlantic/Cape_Verde", "Etc/GMT+1", "Africa/Abidjan", "Africa/Accra", "Africa/Bamako", "Africa/Banjul", "Africa/Bissau", "Africa/Casablanca", "Africa/Conakry", "Africa/Dakar", "Africa/El_Aaiun", "Africa/Freetown", "Africa/Lome", "Africa/Monrovia", "Africa/Nouakchott", "Africa/Ouagadougou", "Africa/Sao_Tome", "Africa/Timbuktu", "America/Danmarkshavn", "Atlantic/Canary", "Atlantic/Faeroe", "Atlantic/Madeira", "Atlantic/Reykjavik", "Atlantic/St_Helena", "Eire", "Etc/GMT", "Etc/GMT+0", "Etc/GMT-0", "Etc/GMT0", "Etc/Greenwich", "Etc/UCT", "Etc/UTC", "Etc/Universal", "Etc/Zulu", "Europe/Belfast", "Europe/Dublin", "Europe/Lisbon", "GB", "GB-Eire", "GMT0", "Greenwich", "UCT", "UTC", "Universal", "WET", "Zulu", "Africa/Algiers", "Africa/Bangui", "Africa/Brazzaville", "Africa/Ceuta", "Africa/Douala", "Africa/Kinshasa", "Africa/Lagos", "Africa/Libreville", "Africa/Luanda", "Africa/Malabo", "Africa/Ndjamena", "Africa/Niamey", "Africa/Porto-Novo", "Africa/Tunis", "Africa/Windhoek", "Arctic/Longyearbyen", "Atlantic/Jan_Mayen", "CET", "ECT", "Etc/GMT-1", "Europe/Amsterdam", "Europe/Andorra", "Europe/Belgrade", "Europe/Berlin", "Europe/Bratislava", "Europe/Brussels", "Europe/Budapest", "Europe/Copenhagen", "Europe/Gibraltar", "Europe/Ljubljana", "Europe/Luxembourg", "Europe/Madrid", "Europe/Malta", "Europe/Monaco", "Europe/Oslo", "Europe/Paris", "Europe/Prague", "Europe/Rome", "Europe/San_Marino", "Europe/Sarajevo", "Europe/Skopje", "Europe/Stockholm", "Europe/Tirane", "Europe/Vaduz", "Europe/Vatican", "Europe/Vienna", "Europe/Warsaw", "Europe/Zagreb", "Europe/Zurich", "MET", "Poland", "ART", "Africa/Blantyre", "Africa/Bujumbura", "Africa/Cairo", "Africa/Gaborone", "Africa/Harare", "Africa/Kigali", "Africa/Lubumbashi", "Africa/Lusaka", "Africa/Maputo", "Africa/Maseru", "Africa/Mbabane", "Africa/Tripoli", "Asia/Amman", "Asia/Beirut", "Asia/Damascus", "Asia/Gaza", "Asia/Istanbul", "Asia/Jerusalem", "Asia/Nicosia", "Asia/Tel_Aviv", "CAT", "EET", "Egypt", "Etc/GMT-2", "Europe/Athens", "Europe/Bucharest", "Europe/Chisinau", "Europe/Helsinki", "Europe/Istanbul", "Europe/Kaliningrad", "Europe/Kiev", "Europe/Minsk", "Europe/Nicosia", "Europe/Riga", "Europe/Simferopol", "Europe/Sofia", "Europe/Tallinn", "Europe/Tiraspol", "Europe/Uzhgorod", "Europe/Vilnius", "Europe/Zaporozhye", "Israel", "Libya", "Turkey", "Africa/Addis_Ababa", "Africa/Asmera", "Africa/Dar_es_Salaam", "Africa/Djibouti", "Africa/Kampala", "Africa/Khartoum", "Africa/Mogadishu", "Africa/Nairobi", "Antarctica/Syowa", "Asia/Aden", "Asia/Baghdad", "Asia/Bahrain", "Asia/Kuwait", "Asia/Riyadh", "EAT", "Etc/GMT-3", "Europe/Moscow", "Indian/Antananarivo", "Indian/Comoro", "Indian/Mayotte", "W-SU", "Asia/Riyadh87", "Asia/Riyadh88", "Asia/Riyadh89", "Mideast/Riyadh87", "Mideast/Riyadh88", "Mideast/Riyadh89", "Asia/Tehran", "Iran", "Asia/Aqtau", "Asia/Baku", "Asia/Dubai", "Asia/Muscat", "Asia/Oral", "Asia/Tbilisi", "Asia/Yerevan", "Etc/GMT-4", "Europe/Samara", "Indian/Mahe", "Indian/Mauritius", "Indian/Reunion", "NET", "Asia/Kabul", "Asia/Aqtobe", "Asia/Ashgabat", "Asia/Ashkhabad", "Asia/Bishkek", "Asia/Dushanbe", "Asia/Karachi", "Asia/Samarkand", "Asia/Tashkent", "Asia/Yekaterinburg", "Etc/GMT-5", "Indian/Kerguelen", "Indian/Maldives", "PLT", "Asia/Calcutta", "Asia/Katmandu", "Antarctica/Mawson", "Antarctica/Vostok", "Asia/Almaty", "Asia/Colombo", "Asia/Dacca", "Asia/Dhaka", "Asia/Novosibirsk", "Asia/Omsk", "Asia/Qyzylorda", "Asia/Thimbu", "Asia/Thimphu", "BST", "Etc/GMT-6", "Indian/Chagos", "Asia/Rangoon", "Indian/Cocos", "Antarctica/Davis", "Asia/Bangkok", "Asia/Hovd", "Asia/Jakarta", "Asia/Krasnoyarsk", "Asia/Phnom_Penh", "Asia/Pontianak", "Asia/Saigon", "Asia/Vientiane", "Etc/GMT-7", "Indian/Christmas", "VST", "Antarctica/Casey", "Asia/Brunei", "Asia/Chongqing", "Asia/Chungking", "Asia/Harbin", "Asia/Hong_Kong", "Asia/Irkutsk", "Asia/Kashgar", "Asia/Kuala_Lumpur", "Asia/Kuching", "Asia/Macao", "Asia/Macau", "Asia/Makassar", "Asia/Manila", "Asia/Shanghai", "Asia/Singapore", "Asia/Taipei", "Asia/Ujung_Pandang", "Asia/Ulaanbaatar", "Asia/Ulan_Bator", "Asia/Urumqi", "Australia/Perth", "Australia/West", "CTT", "Etc/GMT-8", "Asia/Choibalsan", "Asia/Dili", "Asia/Jayapura", "Asia/Pyongyang", "Asia/Seoul", "Asia/Tokyo", "Asia/Yakutsk", "Etc/GMT-9", "JST", "Pacific/Palau", "ROK", "ACT", "Australia/Broken_Hill", "Australia/Darwin", "Australia/North", "Australia/South", "Australia/Yancowinna", "AET", "Antarctica/DumontDUrville", "Asia/Sakhalin", "Asia/Vladivostok", "Australia/ACT", "Australia/Brisbane", "Australia/Canberra", "Australia/Hobart", "Australia/Lindeman", "Australia/Melbourne", "Australia/NSW", "Australia/Queensland", "Australia/Sydney", "Australia/Tasmania", "Australia/Victoria", "Etc/GMT-10", "Pacific/Guam", "Pacific/Port_Moresby", "Pacific/Saipan", "Pacific/Truk", "Pacific/Yap", "Australia/LHI", "Australia/Lord_Howe", "Asia/Magadan", "Etc/GMT-11", "Pacific/Efate", "Pacific/Guadalcanal", "Pacific/Kosrae", "Pacific/Noumea", "Pacific/Ponape", "SST", "Pacific/Norfolk", "Antarctica/McMurdo", "Antarctica/South_Pole", "Asia/Anadyr", "Asia/Kamchatka", "Etc/GMT-12", "Kwajalein", "NST", "NZ", "Pacific/Auckland", "Pacific/Fiji", "Pacific/Funafuti", "Pacific/Kwajalein", "Pacific/Majuro", "Pacific/Nauru", "Pacific/Tarawa", "Pacific/Wake", "Pacific/Wallis", "NZ-CHAT", "Pacific/Chatham", "Etc/GMT-13", "Pacific/Enderbury", "Pacific/Tongatapu", "Etc/GMT-14", "Pacific/Kiritimati" }));
        timeZoneCombo.setBorder(null);
        timeZoneCombo.setOpaque(false);
        //timeZoneCombo.setBackground(new Color(0,0,0,0));
        timeZoneCombo.setForeground(new Color(0, 255, 255));
        timeZoneCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTimeZone(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -67;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(timeZoneCombo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectTimeZone(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTimeZone

        timeZone=timeZoneCombo.getSelectedItem().toString();
        timeFormatLabel.setText(timeZone);
        //System.out.println(timeZone);
    }//GEN-LAST:event_selectTimeZone

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
    private javax.swing.JComboBox<String> timeZoneCombo;
    private javax.swing.JButton timerBtn;
    private javax.swing.JToggleButton toggleBtn;
    // End of variables declaration//GEN-END:variables
}
