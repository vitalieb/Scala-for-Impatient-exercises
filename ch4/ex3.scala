//3. Repeat the preceding exercise with an immutable map.

import scala.io.Source

val arrayOfWords = Source.fromFile("D:\\Scala\\Scala-for-Impatient-exercises\\ch4\\resources\\myfile.txt", "UTF-8").mkString.split("\\W+")
val wordCount = (for(w <- arrayOfWords.distinct) yield (w, arrayOfWords.count(_==w))).toMap

for ((k,v)<-wordCount) printf("%15s \t %d\n",k,v)