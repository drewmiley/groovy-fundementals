package xml.reading
@Grapes(
    @Grab(group = 'joda-time',module='joda-time',version='2.3')
)

import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

/*
   XMLSluper uses Lazy evaluation, which is best suited for large XML documents.
   Portitions of the document are loaded into memory just before they are read.
 */

def file = new File('../fells_loop.gpx')
def slurper = new XmlSlurper()
def gpx = slurper.parse(file)

/*
   ELEMENTS
 */
//access name and description elements using GPath dot notation
println "NAME: $gpx.name"
println "DESCRIPTION: $gpx.desc"

//if the element does not exist nothing is returned
println "UNKNOWN: $gpx.unknown"


/*
   ATTRIBUTES
 */
println "DOCUMENT VERSION: ${gpx.@version}"
println "DOCUMENT CREATOR: ${gpx.@creator}"

/*
   LOOPING
 */

/*
    Loop through each route point.
    rtept is a child element of rte. As a collection is returned, it is possible to iterate using a closure
  */
gpx.rte.rtept.each{
    println "LATITUDE POINT: ${it.@lat}"
    println "LONGITUDE POINT: ${it.@lon}"

    def printableTime = new DateTime(it.time.toString())
    def format = DateTimeFormat.forPattern('MM/dd/yyyy - hh:mm aa')

    println "TIMESTAMP: ${printableTime.toString(format)}\n"
}