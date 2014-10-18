/**
 * Created by fabricesnajdermann on 18/10/14.
 */
object OthersSample extends App{


  val l = List(1, 3, 4, 5, 6, 8, 9)

  println(l.lift(1).map(i => i+10).getOrElse("no value found"))
  println(l.lift(5).map(i => i+10).getOrElse("no value found"))
  println(l.lift(7).map(i => i+10).getOrElse("no value found"))


}
