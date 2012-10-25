package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.loginregister())
  }

  def signup = Action {
    Ok(views.html.loginregister())
  }

  def signin = Action { request =>
    val body = request.body.asFormUrlEncoded
    println(body)
    val user = for (
      form <- body; // get form as map
      email <- form.get("loginEmail").map(_.head);
      password <- form.get("loginPassword").map(_.head)
    ) yield (email, password)
    println(user)
    Ok("thanks")
  }
}


