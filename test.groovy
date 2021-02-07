
def foo() {
def task = "python test.py".execute()
task.waitFor()
return task.text
//echo 'hello'
}

 
