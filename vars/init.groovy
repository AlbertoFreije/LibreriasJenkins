#!/usr/bin/env groovy
def call() {
    def nombreXML = 'map.xml';
    def inputFile = input message: 'Upload file', parameters: [file(name: nombreXML)]
        writeFile(file: nombreXML, text: inputFile.readToString())
        echo fileExists(nombreXML).toString()
}