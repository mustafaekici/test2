#!/usr/bin/env groovy
evaluate(new File("./BaseClass.groovy"))
class AnotherClass extends BaseClass {
  def AnotherClass() {
      println "child ctor"
  }
  // Does stuff
/*
  def CallBase(){
    super.SayHi()
  }*/
}

return this