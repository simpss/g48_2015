package chicken

import grails.rest.*

@Resource(uri='/eatingEntry', formats=['json'])
class EatingEntry {

    Date dateCreated

    static belongsTo = [chicken : Chicken]

    static constraiDAnts = {
    }
}
