package za.co.lbnkosi.aboutmeapi.requests

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.enums.AddressType

data class AddressRequest(
    var id: ObjectId? = null,
    var uid: String = "",
    var alias: String = "",
    var street: String = "",
    var suburb: String = "",
    var city: String = "",
    var province: String = "",
    var postalCode: String = "",
    var addressType: String = AddressType.HOME.toString()
)