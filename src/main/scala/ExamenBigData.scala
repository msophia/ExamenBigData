object ExamenBigData {

  def FonctionListe(maliste:List[String]) : List[String] = {
    val seq_filter: List[String] = maliste.filter(l => (l.charAt(l.length - 1) == 'n'))
      return seq_filter

    }



  def main(args: Array[String]): Unit = {
    val maliste = List("Mathematique","Natation","NAn","Anglais","Histoire","EPS") //liste de valeur text
    FonctionListe(maliste:List[String])
  }
}
