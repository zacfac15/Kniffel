package beans;

import java.util.Arrays;

public class CalcPoints
{

  public static int calculatePoints(int[] wuerfel, KniffelValue auswahl)
  {
    switch (auswahl)
    {
      case NurEinser:
        return getZahlen(wuerfel, 1);
      case NurZweier:
        return getZahlen(wuerfel, 2);
      case NurDreier:
        return getZahlen(wuerfel, 3);
      case NurVierer:
        return getZahlen(wuerfel, 4);
      case NurFünfer:
        return getZahlen(wuerfel, 5);
      case NurSechser:
        return getZahlen(wuerfel, 6);
      case Pasch3:
        return getPasch(wuerfel);
      case Pasch4:
        return getPasch(wuerfel);
      case kleineStraße:
        return getStrasseKlein(wuerfel);
      case großeStraße:
        return getStrasseGross(wuerfel);
      case FullHouse:
        return getFullHouse(wuerfel);
      case Kniffel:
        return getKniffel(wuerfel);
    }

    return 0;
  }

  public static int getZahlen(int[] wuerfel, int z)
  {

    int punkte = 0;
    for (int i = 0; i < 5; i++)
    {
      if (z == wuerfel[i])
      {
        punkte += wuerfel[i];
      }
    }

    return punkte;
  }

  public static int getPasch(int[] wuerfel)
  {
    KniffelValue kv = null;

    int[] augenzahl = new int[6];
    int sum = 0;

    for (int i = 0; i < wuerfel.length; i++)
    {
      if (wuerfel[i] == 1)
      {
        augenzahl[0]++;
      }
      else if (wuerfel[i] == 2)
      {
        augenzahl[1]++;
      }
      else if (wuerfel[i] == 3)
      {
        augenzahl[2]++;
      }
      else if (wuerfel[i] == 4)
      {
        augenzahl[3]++;
      }
      if (wuerfel[i] == 5)
      {
        augenzahl[4]++;
      }
      if (wuerfel[i] == 6)
      {
        augenzahl[5]++;
      }
    }

    if ((augenzahl[0] >= 3 && augenzahl[0] <= 4) || (augenzahl[1] >= 3 && augenzahl[1] <= 4) || (augenzahl[2] >= 3 && augenzahl[0] <= 4) || (augenzahl[3] >= 3 && augenzahl[0] <= 4)
            || (augenzahl[4] >= 3 && augenzahl[0] <= 4) || (augenzahl[5] >= 3 && augenzahl[0] <= 4))
    {
      sum += augenzahl[0] * 1;
      sum += augenzahl[1] * 2;
      sum += augenzahl[2] * 3;
      sum += augenzahl[3] * 4;
      sum += augenzahl[4] * 5;
      sum += augenzahl[5] * 6;
    }
    else
    {
      sum = 0;
    }

    return sum;
  }

  public static int getKniffel(int[] wuerfel)
  {
    int z = wuerfel[0];

    for (int i = 0; i < 5; i++)
    {
      if (z != wuerfel[i])
      {
        return 0;
      }
    }
    return 50;
  }

  public static int getStrasseKlein(int[] wuerfel)
  {
    String str = "";
    Arrays.sort(wuerfel);

    for (int i = 0; i < 5; i++)
    {
      str += wuerfel[i];
    }

    if (str.contains("1234") || str.contains("2345") || str.contains("3456"))
    {
      return 30;
    }
    else
    {
      return 0;
    }

  }

  public static int getStrasseGross(int[] wuerfel)
  {
    String str = "";

    Arrays.sort(wuerfel);

    for (int i = 0; i < 5; i++)
    {
      str += wuerfel[i];
    }

    if (str.contains("12345") || str.contains("23456"))
    {
      return 40;
    }
    else
    {
      return 0;
    }

  }

  public static int getFullHouse(int[] wuerfel)
  {
    int first = wuerfel[0];
    int last = wuerfel[4];
    Arrays.sort(wuerfel);

    for (int i = 0; i < 5; i++)
    {
      if (wuerfel[i] != first && wuerfel[i] != last)
      {
        return 0;
      }
      if (wuerfel[i] != last && wuerfel[i] != first)
      {
        return 0;
      }
    }
    return 25;

  }
}
