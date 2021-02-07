def getThingList() {
 // return ["thing","thin2","thing3"]
 def task = "python test.py".execute()
task.waitFor()
return task.text
//echo 'hello'
}