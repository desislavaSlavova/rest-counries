package restCountries


import io.gatling.core.Predef._


/**
 * Created by os-desislava.slavova on 14/10/2015.
 */
class GetAllTheCountriesSimulation extends Simulation{
  val scn = scenario("Get All the Countries").exec(Actions.getAllTheCountries())
  setUp(scn.inject(atOnceUsers(3)).protocols(Actions.httpConf))
}
