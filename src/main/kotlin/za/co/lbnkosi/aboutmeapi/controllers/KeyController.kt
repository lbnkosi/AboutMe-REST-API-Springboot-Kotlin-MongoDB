package za.co.lbnkosi.aboutmeapi.controllers

import za.co.lbnkosi.aboutmeapi.utils.Constants

object KeyController {

    fun String.isKeyValid(): Boolean {
        if (this == Constants.QA_API_KEY) {
            return true
        }
        if (this == Constants.LIVE_API_KEY) {
            return true
        }
        if (this == Constants.STANDARD_API_KEY) {
            return true
        }
        return false
    }

}