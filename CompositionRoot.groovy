//import Another
//import bfolder
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

class CompositionRoot{

def Initialize(){

    //var m = new mytest()
      ///GroovyClassLoader groovyClassLoader = new GroovyClassLoader();

        // add "lib" to the classpath
      //  groovyClassLoader.addClasspath("lib");

      //  String groovyFile = "mytest.groovy";
      //  Class parsedClass = groovyClassLoader.parseClass(groovyFile);

     // def t = new AnotherClass()
     def m = new myclass()
      
     //return getClass().protectionDomain.codeSource.location.path
}

}

// this method just to have nice access to create class by name
Object getProperty(String name){
    return this.getClass().getClassLoader().loadClass(name).newInstance();
}

return this