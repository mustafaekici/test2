gv = null
mytest = null
import Base.*

pipeline {
    agent any
		stages {
			stage("init"){
					steps{
						 
						script{
							gv = load "test.groovy"
							//mytest = load "AnotherClass.groovy"
							def s = new AnotherClass()
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
			
