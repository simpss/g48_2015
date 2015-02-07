package chicken

import grails.rest.*

@Resource(uri='/eatingEntry', formats=['json'])
class EatingEntry {
    static belongsTo = [chicken : Chicken]

    static constraiDAnts = {
    }
}
