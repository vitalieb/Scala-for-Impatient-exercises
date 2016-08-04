//5. Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.

import scala.io.Source
import java.util.TreeMap
import scala.collection.JavaConversions.mapAsScalaMap

val wordsCount = new java.util.TreeMap[String, Int]
val arrayOfWords = Source.fromFile("D:\\Scala\\Scala-for-Impatient-exercises\\ch4\\resources\\myfile.txt", "UTF-8").mkString.split("\\W+")

arrayOfWords.foreach(word => wordsCount(word) = wordsCount.getOrElse(word,0)+1)
val x = scala.collection.immutable.SortedMap(wordsCount.toSeq:_*)
for ((k,v)<-x) printf("%15s \t %d\n",k,v)