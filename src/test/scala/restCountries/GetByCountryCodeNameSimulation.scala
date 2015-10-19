package restCountries

import io.gatling.core.Predef._

/**
 * Created by os-desislava.slavova on 15/10/2015.
 */
class GetByCountryCodeNameSimulation extends Simulation{
val scn=scenario("Get By Country Code Name").exec(Actions.getByCountryCodeName())
  setUp(scn.inject(atOnceUsers(3)).protocols(Actions.httpConf))
}
