//import Another
//import bfolder

// class myclass {
//     def myclass(){
//        // println "ctor"
//     }
// }

// class CompositionRoot{

// def Initialize(){

//     //var m = new mytest()
//       ///GroovyClassLoader groovyClassLoader = new GroovyClassLoader();

//         // add "lib" to the classpath
//       //  groovyClassLoader.addClasspath("lib");

//       //  String groovyFile = "mytest.groovy";
//       //  Class parsedClass = groovyClassLoader.parseClass(groovyFile);

//      // def t = new AnotherClass()
//      //def m = new myclass()
      
//      //return getClass().protectionDomain.codeSource.location.path
// }

// def SayHello(){

// }

// }



import Base.BaseClass
def Run(){
  stage('some kind of stage 2') {
        echo "Hello from stage 1 with "
       

    }
    stage('second stage'){
            echo "and one from stage 2"
          
    }

}

return this