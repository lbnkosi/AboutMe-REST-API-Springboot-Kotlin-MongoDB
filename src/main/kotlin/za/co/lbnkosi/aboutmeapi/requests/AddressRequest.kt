package za.co.lbnkosi.aboutmeapi.requests

import za.co.lbnkosi.aboutmeapi.enums.AddressType

data class AddressRequest(
    var alias: String = "",
    var street: String = "",
    var suburb: String = "",
    var city: String = "",
    var province: String = "",
    var postalCode: String = "",
    var addressType: AddressType = AddressType.HOME
)