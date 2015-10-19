package restCountries

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

/**
 * Created by os-desislava.slavova on 14/10/2015.
 */
object Actions {
  val httpConf=http.baseURL("https://restcountries-v1.p.mashape.com")
  val sentHeaders = Map("Accept" -> "application/json","X-Mashape-Key" -> "MDFfil2uifmsh7f2JYJlGxiSMiMyp1iL5uDjsnIyJYHDmRmnbU" )
  //val countryCodeFeeder =Array(Map("countrycode" -> "ru", "countrycode" -> "uk")).random //csv("data/countrycode.csv").circular

  def getAllTheCountries() : ChainBuilder={
    exec(http("get all the countries")
      .get("/all")
      .headers(sentHeaders)
      .check(status.is(200)))

  }

  def  getByCountryCode() : ChainBuilder={
    //feed(countryCodeFeeder)
    exec(http("get by country code")
      .get("/alpha/ru")

      .headers(sentHeaders)
      .check(status.is(200)))

  }

  def getByCountryCodes() : ChainBuilder={
    exec(http("get by country codes")
    .get("/alpha/?codes=co%3Bnor")
    .headers(sentHeaders)
    .check(status.is(200)))

  }

  def getByCountryCodeName(): ChainBuilder = {
    exec(http("get by country name")
    .get("/name/norge")
    .headers(sentHeaders)
    .check(status.is(200)))
  }



}
