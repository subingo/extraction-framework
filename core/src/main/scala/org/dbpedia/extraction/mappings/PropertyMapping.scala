package org.dbpedia.extraction.mappings

import org.dbpedia.extraction.wikiparser.TemplateNode
import org.dbpedia.extraction.destinations.Graph

/**
 * Base type of all mappings which map one or more properties of a specific class
 */
trait PropertyMapping
{
    def extract(node : TemplateNode, subjectUri : String, context : PageContext) : Graph
}
