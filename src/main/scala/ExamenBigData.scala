object ExamenBigData {

  def FonctionListe(maliste:List[String]) : List[String] = {
    val seq_filter: List[String] = maliste.filter(l => (l.charAt(l.length - 1) == 'n'))
      return seq_filter
    }

  def liste_double(): Unit = {

    val UrlListe1 = List(
      List("ecommercemag.fr"," "),
      List("https://www.journalducm.com/contact/","Payant"),
      List("https://www.zatsaz.com/",""),
      List("https://www.lerevenu.com",""),
      List("https://www.cadre-dirigfdeant-magazine.com/","payant"),
      List("https://www.silicon.fr/services/contact#annoncer/","Payant"),
      List("https://www.channelbiz.fr/nous-contacter/",""),
      List("https://www.itespresso.fr/",""),
      List("https://www.industrie-mag.com/article4.html","invite"),
      List("https://www.jesuisundev.com/article-invite/","invite"),
      List("https://www.numerama.com/",""))
    UrlListe1.foreach(l=>{println(l(0)+" "+l(1))})

    val UrlListe1_new = UrlListe1.map(l=>{
      if(l(0).contains("https://www."))
      { //println(l(0))s
        List(  l(0).substring(12), l(1))


      }
      else
      {
        List(l(0),l(1))
      }
    } )
    UrlListe1_new.foreach(l1=>{println(l1)})

  }










  def main(args: Array[String]): Unit = {
    val maliste = List("julien","Paul","jean","rac","trec","joel","ed","chris","Maurice") //liste de valeur text
    FonctionListe(maliste:List[String])
    liste_double()
  }
}
