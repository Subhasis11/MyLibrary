def newGit(repo){
	git "https://github.com/Subhasis11/${repo}.git"
}

def newMaven()
{
    sh 'mvn package'
}
