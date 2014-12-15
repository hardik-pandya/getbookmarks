// @SOURCE:/home/hardik/projects/getbookmarks/conf/routes
// @HASH:c45c9ce6dadeddc18506483fe279ad7851c479f2
// @DATE:Sun Dec 14 09:02:02 EST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Assets_at0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_StoryController_allStories1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/stories"))))
        

// @LINE:8
private[this] lazy val controllers_StoryController_submitStory2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/stories"))))
        

// @LINE:9
private[this] lazy val controllers_StoryController_getStory3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/stories/"),DynamicPart("storyId", """[^/]+""",true))))
        

// @LINE:12
private[this] lazy val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Assets.at(path:String = "/public", file:String = "/index.html")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/stories""","""controllers.StoryController.allStories()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/stories""","""controllers.StoryController.submitStory()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/stories/$storyId<[^/]+>""","""controllers.StoryController.getStory(storyId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Assets_at0(params) => {
   call(Param[String]("path", Right("/public")), Param[String]("file", Right("/index.html"))) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_StoryController_allStories1(params) => {
   call { 
        invokeHandler(controllers.StoryController.allStories(), HandlerDef(this, "controllers.StoryController", "allStories", Nil,"GET", """""", Routes.prefix + """api/v1/stories"""))
   }
}
        

// @LINE:8
case controllers_StoryController_submitStory2(params) => {
   call { 
        invokeHandler(controllers.StoryController.submitStory(), HandlerDef(this, "controllers.StoryController", "submitStory", Nil,"POST", """""", Routes.prefix + """api/v1/stories"""))
   }
}
        

// @LINE:9
case controllers_StoryController_getStory3(params) => {
   call(params.fromPath[String]("storyId", None)) { (storyId) =>
        invokeHandler(controllers.StoryController.getStory(storyId), HandlerDef(this, "controllers.StoryController", "getStory", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/v1/stories/$storyId<[^/]+>"""))
   }
}
        

// @LINE:12
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     