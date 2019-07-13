package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
    val support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
  }

  Supporter.city //What does this print ? 
  /*cette méthode va afficher la chaine Paris*/
  Supporter.support //What does this print and why ? How to fix it ? 
  /*
  cette méthode va générer une erreur à cause de la s devant la chaine "Ici c'est $city !" 
  Aprés enlever s la méthode va retourner Ici c'est Paris.
  */
}
