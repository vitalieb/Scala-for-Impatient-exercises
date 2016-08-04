//1. Set up a map of prices for a number of gizmos that you covet. Then produce a second map with
//the same keys and the prices at a 10 percent discount.

val originalMap:Map[String,Double] = Map("Gizmo1" -> 1, "Gizmo2" -> 20, "Gizmo3" -> 30, "Gizmo4" -> 40)

val newMap = for((k,v)<-originalMap) yield (k,v*0.9)
