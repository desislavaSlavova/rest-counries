package restCountries

import io.gatling.core.Predef._

/**
 * Created by os-desislava.slavova on 14/10/2015.
 */
class GetByCountryCodeSimulation extends Simulation {
val scn=scenario("Get By Country Code").exec(Actions.getByCountryCode())

  setUp(scn.inject(atOnceUsers(4)).protocols(Actions.httpConf))
}
