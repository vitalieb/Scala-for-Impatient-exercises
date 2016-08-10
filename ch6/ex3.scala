//3. Define an Origin object that extends java.awt.Point. Why is this not actually a good idea? (Have a
//  close look at the methods of the Point class.)

object Origin extends java.awt.Point {}

// Not a good idea since it has setXXX methods and in singleton since everybody shares, anyone can
// change value causing trouble (https://hhimanshu.github.io/2015/08/04/Scala-for-the-Impatient.html)
