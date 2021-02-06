
def foo() {
def task = "python test.py".execute()
task.waitFor()
echo task.text
//echo 'hello'
}
return this