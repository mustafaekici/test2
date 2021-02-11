import mytest

class CompositionRoot{

def Initialize(){

    //var m = new mytest()
      GroovyClassLoader groovyClassLoader = new GroovyClassLoader();

        // add "lib" to the classpath
      //  groovyClassLoader.addClasspath("lib");

        String groovyFile = "mytest.groovy";
        Class parsedClass = groovyClassLoader.parseClass(groovyFile);

}

}

// this method just to have nice access to create class by name
Object getProperty(String name){
    return this.getClass().getClassLoader().loadClass(name).newInstance();
}

return this