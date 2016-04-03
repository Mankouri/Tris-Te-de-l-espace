import java.util.Vector;
import java.io.*;
import java.util.StringTokenizer;



public class HighScore {

  private Vector HighScore_courant = null;
  private String[] LesNoms;
  private int[][] LesComparaisons;
  private String Fichier = "";
  private String Delimiteur = "::@-@::";
  private String etat = "Normal";
  /**
   * Le nombre de lignes maximum dans l'highScore
   */
  public int nb_max;




  public HighScore(String[] Noms, int[][] Comparaisons, int nb_max, String Fichier, String Delim) {
    LesNoms = Noms;
    LesComparaisons = Comparaisons;
    HighScore_courant = new Vector();
    this.nb_max = nb_max;
    this.Fichier = Fichier;
    this.Delimiteur = Delim;
    Charge();
  }


  public HighScore(String[] Noms, int[][] Comparaisons, String Fichier, String Delim){
    this(Noms,Comparaisons, 20, Fichier, Delim);
  }


  public HighScore(String[] Noms, int[][] Comparaisons){
    this(Noms,Comparaisons, 20, "highScore.txt", "::@-@::");
  }


  public HighScore(String[] Noms, int[][] Comparaisons, int nb_max){
    this(Noms,Comparaisons, nb_max, "highScore.txt", "::@-@::");
  }


  public int addLigne(Comparable[] ligne){
    int place = -1;
    int num_comparaison = 0;
    for(int i=0;i<HighScore_courant.size();i++){
      if(num_comparaison > 0){
        for(int j=0;j<num_comparaison;j++){
          if (ligne[LesComparaisons[j][0]].compareTo( ( (Comparable[])
              HighScore_courant.get(i))[LesComparaisons[j][0]]) != 0) {
            place = i;
            j = num_comparaison;
            i = HighScore_courant.size(); // on va sortir
          }
        }
      }
      if(place != -1)
        continue;
      if (ligne[LesComparaisons[num_comparaison][0]].compareTo( ( (Comparable[])
          HighScore_courant.get(i))[LesComparaisons[num_comparaison][0]]) == 0) {
        num_comparaison++;
        if(num_comparaison == LesComparaisons.length){
          place = i;
          i = HighScore_courant.size(); // on va sortir
        }else
          i--;
      }
      else
      if (LesComparaisons[num_comparaison][1] == 0) { // en ordre décroissant
        if (ligne[LesComparaisons[num_comparaison][0]].compareTo( ( (Comparable[])
            HighScore_courant.get(i))[LesComparaisons[num_comparaison][0]]) > 0) {
          place = i;
          i = HighScore_courant.size(); // on va sortir
        }
      }
      else { // en ordre croissant
        if (ligne[LesComparaisons[num_comparaison][0]].compareTo( ( (Comparable[])
            HighScore_courant.get(i))[LesComparaisons[num_comparaison][0]]) < 0) {
          place = i;
          i = HighScore_courant.size(); // on va sortir
        }
      }
    }
    if(place == -1){
        place = HighScore_courant.size();
    }

    HighScore_courant.add(place, ligne);
    while(HighScore_courant.size() > nb_max)
      HighScore_courant.remove(HighScore_courant.size()-1);
    if(place >= HighScore_courant.size())
      place = -1;

    if(place != -1 && etat == "Normal")
      Enregistre();
    return place;
  }
 
  public Comparable[] getLigne(int num_ligne){
    if(num_ligne <= HighScore_courant.size())
      return (Comparable[])HighScore_courant.get(num_ligne);
    return null;
  }
 
  public int getColumnNumber(){
    return LesNoms.length;
  }
 
  public String getColumnName(int num){
    if(num < LesNoms.length)
      return LesNoms[num];
    return "";
  }
  
  public int getNbLines(){
    return HighScore_courant.size();
  }
 
  public void Charge(){
    if(Fichier.equals(""))
      HighScore_courant.removeAllElements();
    etat = "charge";
    BufferedReader in = null;
    try {
      in = new BufferedReader(new FileReader(Fichier));
      String les_classes = in.readLine();
      StringTokenizer stringTokenizer1 = new StringTokenizer(les_classes,Delimiteur,false);

      if(stringTokenizer1.countTokens() != this.LesNoms.length)
        throw new Exception("Le fichier highscore n'est pas bien formé !");
      String[] classes = new String[this.LesNoms.length];
      int i = 0;
      while(stringTokenizer1.hasMoreTokens())
      {
        classes[i] = stringTokenizer1.nextToken();
        i++;
      }

      while (in.ready()) {
        String ligne = in.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(ligne,Delimiteur,false);

        if(stringTokenizer.countTokens() != this.LesNoms.length)
          throw new Exception("Le fichier highscore n'est pas bien formé !");

        Comparable[] ligne_hs = new Comparable[this.LesNoms.length];
        i = 0;
        while(stringTokenizer.hasMoreTokens())
        {
          ligne_hs[i] = (Comparable)Class.forName(classes[i]).getConstructor(new Class[]{new String().getClass()}).newInstance(new Object[]{new String(stringTokenizer.nextToken())});
          i++;
        }
        addLigne(ligne_hs);
      }
      in.close();
    }
    catch (Exception ex1) {
      HighScore_courant.removeAllElements();
      try {
        in.close();
      }
      catch (Exception ex) {
      }
    }
    etat = "Normal";
  }


  public void Enregistre(){
    if(Fichier.equals(""))
      return;
    etat = "Enregistre";
    BufferedWriter out = null;
    try {
      out = new BufferedWriter(new FileWriter(Fichier));
      if(HighScore_courant.size() > 0)
      {
        Comparable[] Valeurs = (Comparable[])HighScore_courant.get(0);
        for (int i = 0; i < Valeurs.length; i++) {
          out.write(Delimiteur+Valeurs[i].getClass().getName());
        }
        out.newLine();
      }
      for(int i=0;i<HighScore_courant.size();i++){
        Comparable[] Valeurs = (Comparable[])HighScore_courant.get(i);
        String ligne = "";

        for(int j=0;j<Valeurs.length;j++)
          ligne += Delimiteur + Valeurs[j].toString();
        out.write(ligne);
        out.newLine();
      }
      out.close();
    }
    catch (Exception ex1) {
      ex1.printStackTrace();
      HighScore_courant.removeAllElements();
      try {
        out.close();
      }
      catch (IOException ex) {
        ex.printStackTrace();
      }
    }
    etat = "Normal";
  }

}