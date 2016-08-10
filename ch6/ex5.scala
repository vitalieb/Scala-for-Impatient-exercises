//5. Write a Scala application, using the App trait, that prints the command-line arguments in reverse
//  order, separated by spaces. For example, scala Reverse Hello World should print World Hello.

object CustomApplicaiton extends App {

  for (i<-args.indices.reverse){
    println(args(i))
  }

}