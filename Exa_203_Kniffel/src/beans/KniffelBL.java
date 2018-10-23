package beans;

public class KniffelBL
{

  private String title;
  private boolean wahl;
  private int points;

  public KniffelBL(String title, boolean wahl, int points)
  {
    this.title = title;
    this.wahl = wahl;
    this.points = points;
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public boolean isWahl()
  {
    return wahl;
  }

  public void setWahl(boolean wahl)
  {
    this.wahl = wahl;
  }

  public int getPoints()
  {
    return points;
  }

  public void setPoints(int points)
  {
    this.points = points;
  }

}
