#!/usr/bin/env groovy
import TEST2.BaseClass
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