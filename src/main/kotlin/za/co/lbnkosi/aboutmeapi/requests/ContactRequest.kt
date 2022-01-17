package za.co.lbnkosi.aboutmeapi.requests

import za.co.lbnkosi.aboutmeapi.enums.ContactType

data class ContactRequest(
    var alias: String = "",
    var primaryNumber: String = "",
    var secondaryNumber: String = "",
    var email: String = "",
    var contactType: ContactType = ContactType.MANAGER
)