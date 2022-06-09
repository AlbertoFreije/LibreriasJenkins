#!/usr/bin/env groovy
def call() {
    def nombreXML = 'map.xml';
    def inputFile = input message: 'Upload file', parameters: [file(name: nombreXML)]
        writeFile(file: nombreXML, text: inputFile.readToString())
        echo fileExists(nombreXML).toString()
        def file = readFile nombreXML
        def xml = new XmlParser().parseText(file)
        //echo "${xml}"
        println(file)
        println(xml.name())
        //OWASPZAPReport[attributes={version=2.11.1, generated=Fri, 3 Jun 2022 12:02:03}
}