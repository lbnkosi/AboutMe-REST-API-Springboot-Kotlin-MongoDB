package za.co.lbnkosi.aboutmeapi.service

import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import za.co.lbnkosi.aboutmeapi.models.Address
import za.co.lbnkosi.aboutmeapi.models.Contact
import za.co.lbnkosi.aboutmeapi.models.User
import za.co.lbnkosi.aboutmeapi.models.Work
import za.co.lbnkosi.aboutmeapi.repository.WorkRepository
import za.co.lbnkosi.aboutmeapi.requests.AddressRequest
import za.co.lbnkosi.aboutmeapi.requests.ContactRequest
import za.co.lbnkosi.aboutmeapi.requests.UserRequest
import za.co.lbnkosi.aboutmeapi.requests.WorkRequest
import za.co.lbnkosi.aboutmeapi.response.AddressResponse
import za.co.lbnkosi.aboutmeapi.response.ContactResponse

@Service
class WorkService(private val workRepository: WorkRepository) {

    companion object {
        fun AddressRequest.toAddress(): Address {
            return Address(
                id = this.id,
                alias = this.alias,
                street = this.street,
                suburb = this.suburb,
                city = this.city,
                province = this.province,
                postalCode = this.postalCode,
                addressType = this.addressType
            )
        }

        fun ContactRequest.toContact(): Contact {
            return Contact(
                id = this.id,
                alias = this.alias,
                primaryNumber = this.primaryNumber,
                secondaryNumber = this.secondaryNumber,
                email = this.email,
                contactType = this.contactType
            )
        }
    }

    fun createWork(workRequest: WorkRequest): Work {
        return workRepository.save(
            Work(
                id = workRequest.id,
                alias = workRequest.alias,
                companyName = workRequest.companyName,
                position = workRequest.position,
                startDate = workRequest.startDate,
                endDate = workRequest.endDate,
                currentPosition = workRequest.currentPosition,
                logo = workRequest.logo,
                description = workRequest.description,
                workType = workRequest.workType,
                uid = workRequest.uid
            )
        )
    }

    fun updateWork(workRequest: WorkRequest, id: ObjectId): Work {
        val work = workRepository.findById(id.toString())
        return workRepository.save(work.get().apply {
            this.id = workRequest.id
            alias = workRequest.alias
            companyName = workRequest.companyName
            position = workRequest.position
            startDate = workRequest.startDate
            endDate = workRequest.endDate
            currentPosition = workRequest.currentPosition
            logo = workRequest.logo
            description = workRequest.description
            workType = workRequest.workType
            uid = workRequest.uid
        })
    }

    fun findAll(uid: String): ArrayList<Work> {
        return ArrayList(workRepository.findAll().filter { predicate -> predicate.uid == uid })
    }

}