package restCountries

import io.gatling.core.Predef._

/**
 * Created by os-desislava.slavova on 14/10/2015.
 */
class GetByCountryCodes extends Simulation {
 val scn=scenario("Get By Country Codes").exec(Actions.getByCountryCodes())
  setUp(scn.inject(atOnceUsers(2)).protocols(Actions.httpConf))
}
