def call(String name = 'value'){
    echo "Building java project & ${name}"
    sh '''
      mvn clean ${name}
    '''
}
