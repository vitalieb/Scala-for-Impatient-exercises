//   7. Print a table of all Java properties, like this:
//      java.runtime.name | Java(TM) SE Runtime Environment
//      sun.boot.library.path | /home/apps/jdk1.6.0_21/jre/lib/i386
//      java.vm.version | 17.0-b16
//      java.vm.vendor | Sun Microsystems Inc.
//      java.vendor.url | http://java.sun.com/
//      path.separator | :
//      java.vm.name | Java HotSpot(TM) Server VM

import scala.collection.JavaConversions.propertiesAsScalaMap
val props: scala.collection.Map[String, String] = System.getProperties
val x = props.keys.toArray.sortWith(_.length>_.length)

val format = "%"+x(0).length+"s \t | %s\n"
for((k,v)<-props){
  printf(format,k,v)
}