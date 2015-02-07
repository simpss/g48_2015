package chicken

import grails.rest.Resource

@Resource(uri='/chicken', formats=['json'])
class Chicken {

    Date birthDate;


    static constraints = {

    }
}
