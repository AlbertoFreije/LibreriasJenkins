#!/usr/bin/env groovy
def call() {
    def nombreXML = 'map.xml';
    def inputFile = input message: 'Upload file', parameters: [file(name: nombreXML)]
        writeFile(file: nombreXML, text: inputFile.readToString())
        echo fileExists(nombreXML).toString()
        def file = readFile nombreXML
        //def xml = new XmlParser().parseText(file)
        def xml = new XmlSlurper().parseText(file)
        //echo "${xml}"
        print prettyPrint(toJson(xml))
        println(file)
        println(xml.name())
        println(xml.site.name)
        //OWASPZAPReport[attributes={version=2.11.1, generated=Fri, 3 Jun 2022 12:02:03}
}