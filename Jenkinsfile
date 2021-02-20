gv = null
mytest = null
m=null

pipeline {
    agent any
		stages {
			stage("init"){
					steps{
						 
						script{
							echo 'init stage'
							//gv = load "test.groovy"
							//mytest = load "AnotherClass.groovy"
							//def s = new AnotherClass()
						    m = load "CompositionRoot.groovy"
							m.Run()
						    // def s  =m.getProperty('CompositionRoot')
						    // s.Initialize()
							
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
			
