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
							// def rootDir = pwd()
							// echo 'rootDir is ' + rootDir
						    // m = load "CompositionRoot.groovy"
							// m.Run()
						    // def s  =m.getProperty('CompositionRoot')
						    // s.Initialize()

							sh '''#!/bin/bash
                     sh "cd ${pwd()}"
                     "groovy ${pwd()}//main.groovy"
                '''
							
						}
					}
				}
				 
				
		    
		}
		}
			
