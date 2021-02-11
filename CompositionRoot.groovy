import test2.*

class CompositionRoot{

def Initialize(){

    var m = new AnotherClass()
    

}

}

// this method just to have nice access to create class by name
Object getProperty(String name){
    return this.getClass().getClassLoader().loadClass(name).newInstance();
}

return this