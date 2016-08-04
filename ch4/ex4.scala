//4. Repeat the preceding exercise with a sorted map, so that the words are printed in sorted order.

import scala.io.Source

val wordsCount = new scala.collection.mutable.HashMap[String, Int]
val arrayOfWords = Source.fromFile("D:\\Scala\\Scala-for-Impatient-exercises\\ch4\\resources\\myfile.txt", "UTF-8").mkString.split("\\W+")

arrayOfWords.foreach(word => wordsCount(word) = wordsCount.getOrElse(word,0)+1)
val x = scala.collection.immutable.ListMap(wordsCount.toSeq.sortBy(_._2):_*)
for ((k,v)<-x) printf("%15s \t %d\n",k,v)