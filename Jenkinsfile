gv = null
mytest = null
m=null

pipeline {
    agent any
		stages {
			stage("init"){
					steps{
						 
						script{
							//gv = load "test.groovy"
							//mytest = load "AnotherClass.groovy"
							//def s = new AnotherClass()
						    m = load "CompositionRoot.groovy"
						    def s  =m.getProperty('CompositionRoot')
						//	echo s.Initialize()
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
				echo 'deploy the app'
					}
				}
				stage("deploy"){
				steps{
					 echo 'deploy the app'
					}
				}

				
		    
		}
		}
			
