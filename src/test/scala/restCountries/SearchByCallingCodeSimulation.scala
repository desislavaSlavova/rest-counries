package restCountries

import io.gatling.core.Predef._

/**
 * Created by os-desislava.slavova on 19/10/2015.
 */
class SearchByCallingCodeSimulation extends Simulation {
  val scn= scenario("Search by calling code simulation").feed(Actions.callingCodeFeeder).exec(Actions.searchByCallingCode())
  setUp(scn.inject(atOnceUsers(3)).protocols(Actions.httpConf))

}
