package beans;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

public class PunkteModel extends AbstractTableModel
{

  private LinkedList<KniffelRow> list = new LinkedList<>();
  private KniffelValue kv;
  private LinkedList<Integer> würfelList;
  private boolean selected;

  
  public PunkteModel(WuerfelModel model)
  {

    for (KniffelValue kv : kv.values())
    {
      list.add(new KniffelRow(kv, false, 0));
    }

  }

  @Override
  public int getRowCount()
  {
    return list.size();
  }

  @Override
  public int getColumnCount()
  {
    return 3;
  }

  public int calculatePoints(int row, int[] würfel)
  {
    int points = 0;
    if (selected)
    {
      points = CalcPoints.calculatePoints(würfel, list.get(row).getKv());

      list.set(row, new KniffelRow(list.get(row).getKv(), true, points));
      this.fireTableDataChanged();
    }
    return points;
  }
  
  public int calcPointsSummeUp(int row, int[] würfel)
  {
    int points = 0;
    if (selected)
    {
      points = CalcPoints.calculatePoints(würfel, list.get(row).getKv());

      list.set(row, new KniffelRow(list.get(row).getKv(), true, points));
      this.fireTableDataChanged();
    }
    return points;
  }
  
  public int calcPointsSummeDown(int row, int[] würfel)
  {
    int points = 0;
    if (selected)
    {
      points = CalcPoints.calculatePoints(würfel, list.get(row).getKv());

      list.set(row, new KniffelRow(list.get(row).getKv(), true, points));
      this.fireTableDataChanged();
    }
    return points;
  }

  public boolean isSelectable()
  {
    return selected;
  }

  public void setSelectable(boolean isSelectable)
  {
    this.selected = isSelectable;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    KniffelRow kniffel = list.get(rowIndex);
    switch (columnIndex)
    {
      case 0:
        return kniffel.getKv();
      case 1:
        return kniffel.getWahl();
      case 2:
        return kniffel.getPunkte();
      default:
        return "ERROR";
    }
  }

  @Override
  public Class<?> getColumnClass(int columnIndex)
  {
    return getValueAt(0, columnIndex).getClass();

  }

  @Override
  public boolean isCellEditable(int rowIndex, int columnIndex)
  {
    return true;
  }

}
