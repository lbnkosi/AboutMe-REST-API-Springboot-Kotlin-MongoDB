package za.co.lbnkosi.aboutmeapi.response

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.enums.ContactType
import za.co.lbnkosi.aboutmeapi.models.Contact
import za.co.lbnkosi.aboutmeapi.requests.ContactRequest
import za.co.lbnkosi.aboutmeapi.response.AddressResponse.Companion.toRequest

class ContactResponse(
    var id: ObjectId?,
    var uid: String,
    var alias: String,
    var primaryNumber: String,
    var secondaryNumber: String,
    var email: String,
    var contactType: String
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
                id = this.id,
                uid = this.uid,
                alias = this.alias,
                primaryNumber = this.primaryNumber,
                secondaryNumber = this.secondaryNumber,
                email = this.email,
                contactType = this.contactType
            )
        }
    }
}