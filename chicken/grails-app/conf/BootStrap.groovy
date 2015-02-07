import chicken.Chicken
import chicken.EatingEntry

class BootStrap {

    def init = { servletContext ->
        Chicken chick = new Chicken(birthDate: new Date(1993, 03, 31)).save(flush: true, failOnError: true)
        Chicken chick2 = new Chicken(birthDate: new Date(2003, 02, 22)).save(flush: true, failOnError: true)

        EatingEntry chick1Eat = new EatingEntry(chicken: chick).save(flush: true, failOnError: true)
    }
    def destroy = {
    }
}
