import scala.beans.BeanProperty

//5. Make a class Student with read-write JavaBeans properties name (of type String) and id (of type
//Long). What methods are generated? (Use javap to check.) Can you call the JavaBeans getters and
//setters in Scala Should you?

class Student {

  @BeanProperty
  var name: String = _
  @BeanProperty
  var id :Long = 0

}


val student1 = new Student
student1.setName("Ion")
student1.getName+" Ivanovi4"