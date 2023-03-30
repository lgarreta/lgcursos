urlstring = "https://scholar.google.com/citations?user=w2oFuQEAAAAJ&hl=en"
con = url ("https://scholar.google.com/citations?user=w2oFuQEAAAAJ&hl=en")
html = readLines (con)
close (con)
length (html[1])

library (XML)
url = "https://scholar.google.com/citations?user=HI-I6C0AAAAJ&HL=en"
html = htmlTreeParse (url, useInternalNodes=T)
html

xpathSApply (html, "//title", xmlValue)

xpathSApply (html, "//td[@id='']", xmlValue)

library(httr)
h2 = GET (url)
c2 = content (h2, as="text")
ph = htmlParse (c2, asText=T)
xpathSApply (ph, "//title", xmlValue)

