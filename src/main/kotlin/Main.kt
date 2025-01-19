package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {
    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    val doc: Document = Jsoup.connect(url).get()
    val quotes: Elements = doc.select(".bzpNIu")
    var index = 1

    for (quote: Element in quotes) {
        println("$index. ${quote.text()}")
        index += 1
    }

//    println(tests)



}