
def foo() {
def task = "python test.py".execute()
task.waitFor()
print task.text
//echo 'hello'
}
return this