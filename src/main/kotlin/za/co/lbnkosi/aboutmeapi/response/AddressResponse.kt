package za.co.lbnkosi.aboutmeapi.response

import za.co.lbnkosi.aboutmeapi.enums.AddressType
import za.co.lbnkosi.aboutmeapi.models.Address
import za.co.lbnkosi.aboutmeapi.requests.AddressRequest

class AddressResponse(
    var alias: String,
    var street: String,
    var suburb: String,
    var city: String,
    var province: String,
    var postalCode: String,
    var addressType: AddressType
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