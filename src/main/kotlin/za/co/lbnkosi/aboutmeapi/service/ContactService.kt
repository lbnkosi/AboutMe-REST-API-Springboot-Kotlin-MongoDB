package za.co.lbnkosi.aboutmeapi.service

import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import za.co.lbnkosi.aboutmeapi.models.Contact
import za.co.lbnkosi.aboutmeapi.repository.ContactRepository
import za.co.lbnkosi.aboutmeapi.requests.ContactRequest

@Service
class ContactService(private val contactRepository: ContactRepository) {

    fun createContact(contactRequest: ContactRequest): Contact {
        return contactRepository.save(
            Contact(
                alias = contactRequest.alias,
                primaryNumber = contactRequest.primaryNumber,
                secondaryNumber = contactRequest.secondaryNumber,
                email = contactRequest.email,
                contactType = contactRequest.contactType,
                uid = contactRequest.uid
            )
        )
    }

    fun updateContact(contactRequest: ContactRequest, id: ObjectId): Contact {
        val contact = contactRepository.findById(id.toString())
        return contactRepository.save(contact.get().apply {
            this.id = contactRequest.id
            alias = contactRequest.alias
            primaryNumber = contactRequest.primaryNumber
            secondaryNumber = contactRequest.secondaryNumber
            email = contactRequest.email
            contactType = contactRequest.contactType
            uid = contactRequest.uid
        })
    }

    fun findAll(uid: String): ArrayList<Contact> {
        return ArrayList(contactRepository.findAll().filter { predicate -> predicate.uid == uid })
    }

}