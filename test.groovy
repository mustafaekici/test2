
import groovy.transform.Field
@Field public First = null

def foo() {
def task = "python test.py".execute()
task.waitFor()
First task.text
//echo 'hello'
}
return this
 
