package za.co.lbnkosi.aboutmeapi.models

import za.co.lbnkosi.aboutmeapi.enums.ContactType

data class Contact(
    var alias: String = "",
    var primaryNumber: String = "",
    var secondaryNumber: String = "",
    var email: String = "",
    var contactType: ContactType = ContactType.MANAGER
)