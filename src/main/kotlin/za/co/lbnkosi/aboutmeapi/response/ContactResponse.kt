package za.co.lbnkosi.aboutmeapi.response

import za.co.lbnkosi.aboutmeapi.enums.ContactType
import za.co.lbnkosi.aboutmeapi.models.Contact
import za.co.lbnkosi.aboutmeapi.requests.ContactRequest

class ContactResponse(
    var alias: String,
    var primaryNumber: String,
    var secondaryNumber: String,
    var email: String,
    var contactType: ContactType
) {

    companion object {
        fun ArrayList<Contact>.copyContactToResponse(): ArrayList<ContactResponse> {
            val contactList: ArrayList<ContactResponse> = arrayListOf()
            this.forEach {
                contactList.add(it.toRequest())
            }
            return contactList
        }

        fun Contact.toRequest(): ContactResponse {
            return ContactResponse(
                alias = this.alias,
                primaryNumber = this.primaryNumber,
                secondaryNumber = this.secondaryNumber,
                email = this.email,
                contactType = this.contactType
            )
        }
    }
}