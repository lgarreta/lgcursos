library(jsonlite)
library(httpuv)
library(httr)

# 1. Find OAuth settings for github:
#    http://developer.github.com/v3/oauth/
#    Can be github, linkedin etc depending on application
oauth_endpoints("github")

# 2. To make your own application, register at
#    https://github.com/settings/developers. Use any URL for the homepage URL
#    (http://github.com is fine) and  http://localhost:1410 as the callback url
#
#    Replace your key and secret below.
myapp <- oauth_app(appname = "Coursera",
				   key = "9579999fd554f65d47f7",
				   secret = "26ce25874bd2700be71aff2f0965e3285c59097e")

# 3. Get OAuth credentials
github_token <- oauth2.0_token(oauth_endpoints("github"), myapp)

# 4. Use API
gtoken <- config(token = github_token)
req <- GET("https://api.github.com/users/jtleek/repos", gtoken)
stop_for_status(req) # Take action on http error

# Extract content from a request
json1 = content(req)

# Convert to a data.frame
gitDF = jsonlite::fromJSON(jsonlite::toJSON(json1))
gitDF

# Subset data.frame
gitDF[gitDF$full_name == "jtleek/datasharing", "created_at"] 

