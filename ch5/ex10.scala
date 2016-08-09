//10. Consider the class
//
//      class Employee(val name: String, var salary: Double) {
//        def this() {
//          this("John Q. Public", 0.0)
//        }
//      }
//
//    Rewrite it to use explicit fields and a default primary constructor.Which form do you
//    prefer ? Why ?

class Employee(val name: String = "John Q. Public", var salary: Double = 0.0) {}

val empl = new Employee()
empl.name
empl.salary

val empl2 = new Employee("John",45)
empl2.name
empl2.salary