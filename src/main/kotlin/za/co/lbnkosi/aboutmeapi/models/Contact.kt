package za.co.lbnkosi.aboutmeapi.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import za.co.lbnkosi.aboutmeapi.enums.ContactType

@Document("contact")
data class Contact(
    @Id var id: ObjectId? = null,
    var uid: String = "",
    var alias: String = "",
    var primaryNumber: String = "",
    var secondaryNumber: String = "",
    var email: String = "",
    var contactType: String = ContactType.MANAGER.toString()
)