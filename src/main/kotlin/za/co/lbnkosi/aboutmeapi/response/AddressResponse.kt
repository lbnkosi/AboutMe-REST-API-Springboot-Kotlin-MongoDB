package za.co.lbnkosi.aboutmeapi.response

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.enums.AddressType
import za.co.lbnkosi.aboutmeapi.models.Address
import za.co.lbnkosi.aboutmeapi.requests.AddressRequest

class AddressResponse(
    var id: String?,
    var uid: String,
    var alias: String,
    var street: String,
    var suburb: String,
    var city: String,
    var province: String,
    var postalCode: String,
    var addressType: String
) {
    companion object {

        fun ArrayList<Address>.copyAddressToResponse(): ArrayList<AddressResponse> {
            val addressList: ArrayList<AddressResponse> = arrayListOf()
            this.forEach {
                addressList.add(it.toRequest())
            }
            return addressList
        }

        fun Address.toRequest(): AddressResponse {
            return AddressResponse(
                id = this.id?.toHexString(),
                uid = this.uid,
                alias = this.alias,
                street = this.street,
                suburb = this.suburb,
                city = this.city,
                province = this.province,
                postalCode = this.postalCode,
                addressType = this.addressType
            )
        }
    }
}