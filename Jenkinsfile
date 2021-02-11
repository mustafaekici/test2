gv = null
mytest = null
 

pipeline {
    agent any
		stages {
			stage("init"){
					steps{
						 
						script{
							gv = load "test.groovy"
							//mytest = load "AnotherClass.groovy"
							//def s = new AnotherClass()
							def m = load "CompositionRoot.groovy"
							def s  =m.getProperty('CompositionRoot')
							echo s.Initialize()
						}
					}
				}
				stage("build"){
				steps{
					echo 'building the app'
					}
				}
				stage("test"){
				steps{
					script{
						gv.foo()
					//	echo m.First
					}
					}
				}
				stage("deploy"){
				steps{
					 echo 'deploy the app'
					}
				}

				
		    
		}
		}
			
