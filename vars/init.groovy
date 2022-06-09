#!/usr/bin/env groovy
def call() {
    def nombreXML = 'map.xml';
    def inputFile = input message: 'Upload file', parameters: [file(name: nombreXML)]
        writeFile(file: nombreXML, text: inputFile.readToString())
        echo fileExists(nombreXML).toString()
        def file = readFile "owasp-quick-scan-report.xml"
        def xml = new XmlParser().parseText(file)
        //echo "${xml}"
        println(xml.value.site.attributes.name)
}