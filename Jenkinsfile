def gv
pipeline {
    agent any
		stages {
				stage("build"){
				steps{
					echo 'building the app'
					}
				}
				stage("test"){
				steps{
					script{
						gv.foo()
					}
					}
				}
				stage("deploy"){
				steps{
					echo 'building the app'
					}
				}

				stage("init"){
					steps{
						echo 'groovytest'
						script{
							gv = load "test.groovy"
							 
						}
					}
				}
		    
		}
		}
			
