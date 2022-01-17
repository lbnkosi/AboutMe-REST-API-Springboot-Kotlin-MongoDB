package za.co.lbnkosi.aboutmeapi.models

import za.co.lbnkosi.aboutmeapi.enums.AddressType

data class Address(
    var email: String = "",
    var alias: String = "",
    var street: String = "",
    var suburb: String = "",
    var city: String = "",
    var province: String = "",
    var postalCode: String = "",
    var addressType: AddressType = AddressType.HOME
)