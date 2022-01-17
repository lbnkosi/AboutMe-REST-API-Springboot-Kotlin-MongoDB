package za.co.lbnkosi.aboutmeapi.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import za.co.lbnkosi.aboutmeapi.enums.AddressType

@Document("address")
data class Address(
    @Id var id: ObjectId? = null,
    var uid: String = "",
    var alias: String = "",
    var street: String = "",
    var suburb: String = "",
    var city: String = "",
    var province: String = "",
    var postalCode: String = "",
    var addressType: String = AddressType.HOME.toString()
)