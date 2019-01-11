package Conference;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ConferenceBooking extends javax.swing.JFrame {
    
    public Conference a, b, c, d;
    public HashMap <String,Conference> schedule;
    DefaultListModel list;
    Conference conf;

    public ConferenceBooking() {
        initComponents();
        a = new Conference("Android Studio Essentials","Learn Android Studio, the latest technology in Android App Development","android.PNG");
        b = new Conference("Techniques in Game Development","Industry leaders gather for a roundtable of the latest gaming trends","game.PNG");
        c = new Conference("Introducing HTML","A beginning course on web development with HTML","html.PNG");
        d = new Conference("Java Advanced Concepts","Take your Java skills to the next level with Object Oriented fundamentals","java.PNG");
        schedule = new HashMap<String,Conference>();
        schedule.put("Android",a);
        schedule.put("Gaming",b);
        schedule.put("HTML",c);
        schedule.put("Java",d);
        list = new DefaultListModel();
        lstguest.setModel(list);
        openFile();
        update("Android");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblimage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnandroid = new javax.swing.JButton();
        btnhtml = new javax.swing.JButton();
        btnjava = new javax.swing.JButton();
        btngaming = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbldescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstguest = new javax.swing.JList<>();
        btnsave = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnenroll = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnandroid.setText("Android");
        btnandroid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnandroidActionPerformed(evt);
            }
        });

        btnhtml.setText("HTML");
        btnhtml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhtmlActionPerformed(evt);
            }
        });

        btnjava.setText("Java");
        btnjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjavaActionPerformed(evt);
            }
        });

        btngaming.setText("Gaming");
        btngaming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngamingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnandroid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnhtml)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnjava)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btngaming)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnandroid)
                    .addComponent(btnhtml)
                    .addComponent(btnjava)
                    .addComponent(btngaming))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbldescription.setText("Description goes here");

        jScrollPane1.setViewportView(lstguest);

        btnsave.setText("Save and Exit");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbldescription, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbldescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsave)))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnenroll.setText("Enroll Guest");
        btnenroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenrollActionPerformed(evt);
            }
        });

        btnremove.setText("Remove Guest");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnenroll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnremove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnenroll)
                    .addComponent(btnremove))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblname.setBackground(new java.awt.Color(102, 102, 102));
        lblname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblname.setText("Conference name goes here");
        lblname.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 122, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnenrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenrollActionPerformed
        GuestForm form = new GuestForm(this, true);
        form.setVisible(true);
        if(form.getSignal().equals("ok")){
            Guest g = form.getGuest();
            if(conf.signup(g))
                list.addElement(g);
            else
                JOptionPane.showMessageDialog(this, "Guest is already enrolled");
        }
    }//GEN-LAST:event_btnenrollActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        int loc = lstguest.getSelectedIndex();
        if (loc==-1){
            JOptionPane.showMessageDialog(this, "You need to select a person to remove");
            return;
        }
        String info = list.getElementAt(loc).toString();
        Guest g = new Guest(info);
        conf.remove(g);
        list.removeElementAt(loc);
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnandroidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnandroidActionPerformed
        update("Android");
    }//GEN-LAST:event_btnandroidActionPerformed

    private void btnhtmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhtmlActionPerformed
        update("HTML");
    }//GEN-LAST:event_btnhtmlActionPerformed

    private void btnjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjavaActionPerformed
        update("Java");
    }//GEN-LAST:event_btnjavaActionPerformed

    private void btngamingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngamingActionPerformed
        update("Gaming");
    }//GEN-LAST:event_btngamingActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        FileWriter fw;
        try{
            fw = new FileWriter("Conference.txt");
            PrintWriter p = new PrintWriter(fw);
            Conference a = schedule.get("Android");
            Conference b = schedule.get("Gaming");
            Conference c = schedule.get("HTML");
            Conference d = schedule.get("Java");
            a.save(p, "Android");
            b.save(p, "Gaming");
            c.save(p, "HTML");
            d.save(p, "Java");
            p.close();
        }catch(Exception e){
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(this, "Conference Data Saved");
        System.exit(0);
    }//GEN-LAST:event_btnsaveActionPerformed

    public void update(String key){
        list.clear();
        conf = schedule.get(key);
        Iterator it = conf.getPeople().iterator();
        while(it.hasNext())
            list.addElement(it.next());
        lblname.setText(conf.getName());
        lbldescription.setText("<html>" + conf.getDescription() + "</html>");
        lblimage.setIcon(conf.getImage());
    }
    
    public void openFile(){
        try{
            FileReader f = new FileReader("Conference.txt");
            BufferedReader b = new BufferedReader(f);
            String key, data;
            Guest g;
            while(true){
                key = b.readLine();
                if(key==null) break;
                data = b.readLine();
                g = new Guest(data);
                schedule.get(key).signup(g);
            }
            b.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(ConferenceBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConferenceBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConferenceBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConferenceBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConferenceBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnandroid;
    private javax.swing.JButton btnenroll;
    private javax.swing.JButton btngaming;
    private javax.swing.JButton btnhtml;
    private javax.swing.JButton btnjava;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldescription;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblname;
    private javax.swing.JList<String> lstguest;
    // End of variables declaration//GEN-END:variables
}
