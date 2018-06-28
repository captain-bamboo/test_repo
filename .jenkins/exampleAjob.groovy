job('example-1') {
    scm {
        git {
            remote {
                name('remoteB')
                url('https://github.com/captain-bamboo/test_repo.git')
            }
        }
    }
    steps {
        shell('echo Hello World!')
    }
}