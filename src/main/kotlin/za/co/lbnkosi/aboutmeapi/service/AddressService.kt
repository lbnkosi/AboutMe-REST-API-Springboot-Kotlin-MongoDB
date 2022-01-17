package za.co.lbnkosi.aboutmeapi.service

import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import za.co.lbnkosi.aboutmeapi.models.Address
import za.co.lbnkosi.aboutmeapi.repository.AddressRepository
import za.co.lbnkosi.aboutmeapi.requests.AddressRequest

@Service
class AddressService(private val addressRepository: AddressRepository) {

    fun createAddress(addressRequest: AddressRequest): Address {
        return addressRepository.save(
            Address(
                id = addressRequest.id,
                alias = addressRequest.alias,
                street = addressRequest.street,
                suburb = addressRequest.suburb,
                city = addressRequest.city,
                province = addressRequest.province,
                postalCode = addressRequest.province,
                addressType = addressRequest.addressType,
                uid = addressRequest.uid
            )
        )
    }

    fun updateAddress(addressRequest: AddressRequest, id: ObjectId?): Address {
        val address = addressRepository.findById(id.toString())
        return addressRepository.save(address.get().apply {
            this.id = addressRequest.id
            alias = addressRequest.alias
            street = addressRequest.street
            suburb = addressRequest.suburb
            city = addressRequest.city
            province = addressRequest.province
            postalCode = addressRequest.postalCode
            addressType = addressRequest.addressType
            uid = addressRequest.uid
        })
    }

    fun findAll(uid: String): ArrayList<Address> {
        return ArrayList(addressRepository.findAll().filter { predicate -> predicate.uid == uid })
    }

}