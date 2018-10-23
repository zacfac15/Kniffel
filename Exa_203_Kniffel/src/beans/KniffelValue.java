package beans;

public enum KniffelValue
{
  NurEinser(1, "Nur Einser"),
  NurZweier(2, "Nur Zweier"),
  NurDreier(3, "Nur Dreier"),
  NurVierer(4, "Nur Vierer"),
  NurFünfer(5, "Nur Fünfer"),
  NurSechser(6, "Nur Sechser"),
  Pasch3(7, "Dreierpasch"),
  Pasch4(8, "Viererpasch"),
  FullHouse(25, "Full House"),
  kleineStraße(30, "kleine Straße"),
  großeStraße(40, "Große Straße"),
  Kniffel(50, "Kniffel");

  private int punkte;
  private String name;

  private KniffelValue(int punkte, String name)
  {
    this.punkte = punkte;
    this.name = name;
  }

  public int getPunkte()
  {
    return punkte;
  }

  public String getName()
  {
    return name;
  }

}
