package beans;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

public class WuerfelModel extends AbstractTableModel
{

  private LinkedList<ImageIcon> list = new LinkedList<>();
  private String PATH_NAME = System.getProperty("user.dir") + File.separator + "src" + File.separator + "res" + File.separator;
  private Random rand = new Random();
  public boolean ok;

  private int[] wuerfelAugen = new int[5];

  public WuerfelModel()
  {
    try
    {
      ok = true;
      loadStartIcons();
    }
    catch (IOException ex)
    {
      ex.printStackTrace();
    }
  }

  public int[] getWuerfelAugen()
  {
    return wuerfelAugen;
  }

  @Override
  public int getRowCount()
  {
    return 1;
  }

  @Override
  public int getColumnCount()
  {
    return 5;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    return list.get(columnIndex);
  }

  public void loadIcons() throws IOException
  {
    for (int i = 0; i < 5; i++)
    {
      int num = rand.nextInt(6) + 1;

      Image img = ImageIO.read(new File(PATH_NAME + "Alea_" + num + ".png"));
      img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
      ImageIcon imgIcon = new ImageIcon(img);
      imgIcon.setDescription("white");
      if (!list.get(i).getDescription().equals("red"))
      {
        list.set(i, imgIcon);
        wuerfelAugen[i] = num;
      }

    }

    this.fireTableDataChanged();
  }

  public boolean isOk()
  {
    return ok;
  }

  public void setOk(boolean ok)
  {
    this.ok = ok;
  }

  public boolean isSelected()
  {
    for (int i = 0; i < 5; i++)
    {

      if (list.get(i).getDescription().equals("white"))
      {

        return false;
      }
    }
    return true;
  }

  public void allWhite()
  {
    for (int i = 0; i < 5; i++)
    {
      list.get(i).setDescription("white");

    }

    this.fireTableDataChanged();
  }

  public void allRed()
  {
    for (int i = 0; i < 5; i++)
    {
      list.get(i).setDescription("red");
    }

    this.fireTableDataChanged();

  }
  
  public void loadStartIcons() throws IOException
  {
    list.clear();
    Image img = ImageIO.read(new File(PATH_NAME + "wuerfel.jpg"));
    img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    ImageIcon imgIcon = new ImageIcon(img);
    imgIcon.setDescription("start");

    for (int i = 1; i < 6; i++)
    {
      list.add(imgIcon);
    }
    this.fireTableDataChanged();
  }

  @Override
  public Class<?> getColumnClass(int columnIndex)
  {
    return ImageIcon.class;
  }

}
