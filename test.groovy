def task = "python test.py".execute()
task.waitFor()
println task.text