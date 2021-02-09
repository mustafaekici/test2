def gv
pipeline {
    agent any
		stages {
			stage("init"){
					steps{
						 
						script{
							gv = load "test.groovy"
							 
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
						def m  = gv.foo()
						echo m.First
					}
					}
				}
				stage("deploy"){
				steps{
					echo 'building the app'
					}
				}

				
		    
		}
		}
			
