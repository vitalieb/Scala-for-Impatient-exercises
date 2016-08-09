//7. Write a class Person with a primary constructor that accepts a string containing a first name, a
//space, and a last name, such as new Person("Fred Smith"). Supply read-only properties firstName and
//  lastName. Should the primary constructor parameter be a var, a val, or a plain parameter? Why?

class Person(fullName: String) {
  val (firstName, lastName) = fullName.split(" ") match {
    case Array(x: String, y: String) => (x + " from 2", y)
    case Array(x: String, y: String, _*) => (x + " from 3", y)
    case _ => (null, null)
  }
}

val person2 = new Person("Ion Placinta")
person2.firstName
person2.lastName

val person1 = new Person("Ion Placinta Abracadabra")
person1.firstName
person1.lastName

