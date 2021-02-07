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
						thing = new test()
						echo thing.foo()
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
			
