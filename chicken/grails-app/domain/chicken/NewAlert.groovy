package chicken

import grails.rest.Resource

@Resource(uri='/newAlert', formats=['json'])
class NewAlert {

    Date dateCreated

    static constraints = {
    }
}
