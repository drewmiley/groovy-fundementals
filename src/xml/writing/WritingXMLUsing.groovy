package xml.writing

import groovy.xml.StreamingMarkupBuilder

def file = new File('../fells_loop.gpx')
def slurper = new XmlSlurper()
def gpx = slurper.parse(file)

def markupBuilder = new StreamingMarkupBuilder()

/*
     The markupBuilder is powerful utility which allows for the creation of an XML document using closures
 */
def xml = markupBuilder.bind{

    // route closure will act as a route parent element
    route{
        //reference an implicitly defined variable mkp to access advance features such as comments
        mkp.comment(gpx.name)

        //loop through each routepoint in the gpx document, creating a routepoint element in the new document.
        gpx.rte.rtept.each { point ->
            routepoint(timestamp: point.time.toString()){

                // create the latitude and longitude elements using the equivalent attributes within the gpx doc
                latitude(point.@lat)
                logitude(point.@lon)
            }
        }
    }

}

def outFile = new File('../fells_loop_output.xml')
outFile.write(xml.toString())