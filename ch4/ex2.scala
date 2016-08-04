//2. Write a program that reads words from a file. Use a mutable map to count how often each word
//  appears. To read the words, simply use a java.util.Scanner:
//  val in = new java.util.Scanner(new java.io.File("myfile.txt"))
//  while (in.hasNext()) process in.next()
//  Or look at Chapter 9 for a Scalaesque way.
//  At the end, print out all words and their counts.

import scala.io.Source

val wordsCount = new scala.collection.mutable.HashMap[String, Int]
val arrayOfWords = Source.fromFile("D:\\Scala\\Scala-for-Impatient-exercises\\ch4\\resources\\myfile.txt", "UTF-8").mkString.split("\\W+")

arrayOfWords.foreach(word => wordsCount(word) = wordsCount.getOrElse(word,0)+1)
val x = scala.collection.immutable.ListMap(wordsCount.toSeq.sortWith(_._2>_._2):_*)
for ((k,v)<-x) printf("%15s \t %d\n",k,v)