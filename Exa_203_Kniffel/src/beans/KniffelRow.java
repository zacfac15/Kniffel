package beans;

public class KniffelRow
{

  private KniffelValue kv;
  private int punkte;
  private boolean wahl;

  public KniffelRow(KniffelValue kv, boolean wahl, int points)
  {
    this.kv = kv;
    this.punkte = points;
    this.wahl = wahl;
  }

  public KniffelValue getKv()
  {
    return kv;
  }

  public int getPunkte()
  {
    return punkte;
  }

  public boolean getWahl()
  {
    return wahl;
  }

  public void setPoints(int points)
  {
    this.punkte = points;
  }

}
