package UI;

import beans.KniffelTableRenderer;
import beans.PunkteModel;
import beans.WuerfelModel;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class KniffelGUI extends javax.swing.JFrame
{

  private WuerfelModel wm = new WuerfelModel();
  private PunkteModel pm = new PunkteModel(wm);

  private String[] colnames =
  {
    "Spiel", "Wahl", "Punkte"
  };

  private int count = 0;
  private int sum = 0;
  private int sumUp = 0;
  private int sumDown = 0;
  private int zähler = 0;
  private int counter = 0;
  private int[] select = new int[12];

  public KniffelGUI()
  {
    initComponents();
    initTable();
    jWuerfel.setModel(wm);
    jWuerfel.setDefaultRenderer(ImageIcon.class, new KniffelTableRenderer());
    this.setTitle("Kniffel");
    this.setSize(275, 350);

  }

  private void initTable()
  {
    DefaultTableColumnModel dtcm = new DefaultTableColumnModel();
    int[] colWidth =
    {
      80, 80, 60
    };
    for (int i = 0; i < colnames.length; i++)
    {
      TableColumn tc = new TableColumn(i, colWidth[i]);
      tc.setHeaderValue(colnames[i]);
      tc.setResizable(false);
      dtcm.addColumn(tc);
    }
    jPunkte.setModel(pm);
    jPunkte.setColumnModel(dtcm);
    jPunkte.setShowGrid(true);

  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    panel1 = new javax.swing.JPanel();
    jWuerfel = new javax.swing.JTable();
    btWürfeln = new javax.swing.JButton();
    scrollpane2 = new javax.swing.JScrollPane();
    jPunkte = new javax.swing.JTable();
    jPanel1 = new javax.swing.JPanel();
    panel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    tfObereSumme = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    tfObererBonus = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    tfUntereSumme = new javax.swing.JTextField();
    lbGesammt = new javax.swing.JLabel();
    tfPunkteGesamt = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    jcKombi = new javax.swing.JComboBox<>();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new java.awt.GridLayout(3, 0));

    panel1.setLayout(new java.awt.GridLayout(2, 0));

    jWuerfel.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][]
      {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String []
      {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jWuerfel.setRowHeight(50);
    panel1.add(jWuerfel);

    btWürfeln.setText("würfeln");
    btWürfeln.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btWürfelnActionPerformed(evt);
      }
    });
    panel1.add(btWürfeln);

    getContentPane().add(panel1);

    jPunkte.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][]
      {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String []
      {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jPunkte.addMouseListener(new java.awt.event.MouseAdapter()
    {
      public void mouseClicked(java.awt.event.MouseEvent evt)
      {
        jPunkteMouseClicked(evt);
      }
    });
    scrollpane2.setViewportView(jPunkte);

    getContentPane().add(scrollpane2);

    jPanel1.setLayout(new java.awt.BorderLayout());

    panel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Punkte"));
    panel2.setLayout(new java.awt.GridLayout(4, 0));

    jLabel1.setText("Obere Summe:");
    panel2.add(jLabel1);
    panel2.add(tfObereSumme);

    jLabel2.setText("Oberer Bonus:");
    panel2.add(jLabel2);
    panel2.add(tfObererBonus);

    jLabel3.setText("Untere Summe:");
    panel2.add(jLabel3);
    panel2.add(tfUntereSumme);

    lbGesammt.setText("Gesammt-Punkte:");
    panel2.add(lbGesammt);
    panel2.add(tfPunkteGesamt);

    jPanel1.add(panel2, java.awt.BorderLayout.CENTER);

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Mögliche Kombinationen"));
    jPanel2.setLayout(new java.awt.GridLayout());

    jPanel2.add(jcKombi);

    jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

    getContentPane().add(jPanel1);

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btWürfelnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btWürfelnActionPerformed

      if (wm.isSelected() && wm.isOk())
      {
        count = 0;
        wm.allWhite();
      }

      count++;
      try
      {
        if (wm.isOk())
        {

          wm.loadIcons();
        }

        if (count == 3)
        {
          wm.allRed();
          count = 0;
          wm.setOk(false);
        }

      }
      catch (IOException ex)
      {
        ex.printStackTrace();
      }
    }//GEN-LAST:event_btWürfelnActionPerformed

    private void jPunkteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPunkteMouseClicked
      int[] wuerfel = wm.getWuerfelAugen();
      int selected = jPunkte.getSelectedRow();
      boolean ok = false;
      select[counter] = selected;
      counter++;

      Arrays.sort(select);
      for (int i = 0; i < select.length; i++)
      {
        if (select[i] == selected)
        {
          ok = true;
        }
        else
        {
          ok = false;
        }
      }
      if (ok = true)
      {

        pm.setSelectable(true);
        sum += pm.calculatePoints(selected, wuerfel);
        System.out.println("" + selected);
        if (selected > 5)
        {
          sumDown += pm.calcPointsSummeDown(selected, wuerfel);
          tfUntereSumme.setText("" + sumDown);
        }
        else
        {
          sumUp += pm.calcPointsSummeUp(selected, wuerfel);
          tfObereSumme.setText("" + sumUp);
        }
        if (sumUp >= 63)
        {
          tfObererBonus.setText("35");
          if (zähler == 0)
          {
            sum += 35;
            zähler = 1;
          }
        }
        wm.allRed();
        wm.setOk(true);
        tfPunkteGesamt.setText(sum + "");
      }
      else
      {
        System.out.println("Schon gewählt");
      }

    }//GEN-LAST:event_jPunkteMouseClicked

  public static void main(String args[])
  {

    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new KniffelGUI().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btWürfeln;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTable jPunkte;
  private javax.swing.JTable jWuerfel;
  private javax.swing.JComboBox<String> jcKombi;
  private javax.swing.JLabel lbGesammt;
  private javax.swing.JPanel panel1;
  private javax.swing.JPanel panel2;
  private javax.swing.JScrollPane scrollpane2;
  private javax.swing.JTextField tfObereSumme;
  private javax.swing.JTextField tfObererBonus;
  private javax.swing.JTextField tfPunkteGesamt;
  private javax.swing.JTextField tfUntereSumme;
  // End of variables declaration//GEN-END:variables
}
