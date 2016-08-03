//9. Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs that are in
//  America. Strip off the "America/" prefix and sort the result.

java.util.TimeZone.getAvailableIDs.filter(_ startsWith "America/").map(_ stripPrefix "America/").sorted.foreach(println(_))