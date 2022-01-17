package za.co.lbnkosi.aboutmeapi.requests

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.enums.ContactType

data class ContactRequest(
    var id: ObjectId? = null,
    var uid: String = "",
    var alias: String = "",
    var primaryNumber: String = "",
    var secondaryNumber: String = "",
    var email: String = "",
    var contactType: String = ContactType.MANAGER.toString()
)