// @SOURCE:/home/hardik/projects/getbookmarks/conf/routes
// @HASH:c45c9ce6dadeddc18506483fe279ad7851c479f2
// @DATE:Sun Dec 14 09:02:02 EST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:9
// @LINE:8
// @LINE:7
class ReverseStoryController {
    

// @LINE:9
def getStory(storyId:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/v1/stories/" + implicitly[PathBindable[String]].unbind("storyId", dynamicString(storyId)))
}
                                                

// @LINE:8
def submitStory(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/v1/stories")
}
                                                

// @LINE:7
def allStories(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/v1/stories")
}
                                                
    
}
                          

// @LINE:12
// @LINE:6
class ReverseAssets {
    

// @LINE:12
// @LINE:6
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:6
case (file) if file == "/index.html" => Call("GET", _prefix)
                                                        
// @LINE:12
case (file) if true => Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
   }
}
                                                
    
}
                          
}
                  


// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:9
// @LINE:8
// @LINE:7
class ReverseStoryController {
    

// @LINE:9
def getStory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StoryController.getStory",
   """
      function(storyId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/stories/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("storyId", encodeURIComponent(storyId))})
      }
   """
)
                        

// @LINE:8
def submitStory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StoryController.submitStory",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/stories"})
      }
   """
)
                        

// @LINE:7
def allStories : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StoryController.allStories",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/stories"})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:6
class ReverseAssets {
    

// @LINE:12
// @LINE:6
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (file == """ + implicitly[JavascriptLitteral[String]].to("/index.html") + """) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        
    
}
              
}
        


// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:9
// @LINE:8
// @LINE:7
class ReverseStoryController {
    

// @LINE:9
def getStory(storyId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StoryController.getStory(storyId), HandlerDef(this, "controllers.StoryController", "getStory", Seq(classOf[String]), "GET", """""", _prefix + """api/v1/stories/$storyId<[^/]+>""")
)
                      

// @LINE:8
def submitStory(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StoryController.submitStory(), HandlerDef(this, "controllers.StoryController", "submitStory", Seq(), "POST", """""", _prefix + """api/v1/stories""")
)
                      

// @LINE:7
def allStories(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StoryController.allStories(), HandlerDef(this, "controllers.StoryController", "allStories", Seq(), "GET", """""", _prefix + """api/v1/stories""")
)
                      
    
}
                          

// @LINE:12
// @LINE:6
class ReverseAssets {
    

// @LINE:6
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    