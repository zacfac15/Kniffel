package beans;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class KniffelTableRenderer extends DefaultTableCellRenderer
{

  @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
  {
    ImageIcon img = (ImageIcon) value;
    setBackground(Color.white);
    setHorizontalAlignment(CENTER);
    if (hasFocus && !img.getDescription().equals("start"))
    {
      setBackground(Color.red);
      img.setDescription("red");
    }
    if (img.getDescription().equals("red"))
    {
      setBackground(Color.red);
    }

    setIcon(img);
    return this;
  }

}
