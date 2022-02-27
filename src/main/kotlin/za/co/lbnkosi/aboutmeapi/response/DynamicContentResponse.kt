package za.co.lbnkosi.aboutmeapi.response

import za.co.lbnkosi.aboutmeapi.models.dynamicContent.DynamicContent
import za.co.lbnkosi.aboutmeapi.models.dynamicContent.Link

class DynamicContentResponse(
    var title: String = "",
    var subtitle: String = "",
    var shouldShowAnimation: Boolean = true,
    var aboutApp: String = "",
    var linkList: ArrayList<LinkResponse> = arrayListOf()
) {

    companion object {
        fun DynamicContent.copyLinkToResponse(): DynamicContentResponse {
            val dynamicContentResponse = DynamicContentResponse()
            dynamicContentResponse.title = this.title
            dynamicContentResponse.subtitle = this.subtitle
            dynamicContentResponse.shouldShowAnimation = this.shouldShowAnimation
            dynamicContentResponse.aboutApp = this.aboutApp
            dynamicContentResponse.linkList = this.linkList.copyResponseToLink()
            return dynamicContentResponse
        }

        private fun ArrayList<Link>.copyResponseToLink(): ArrayList<LinkResponse> {
            val newList = ArrayList<LinkResponse>()
            this.forEach {
                newList.add(
                    LinkResponse(
                        alias = it.alias,
                        link = it.link
                    )
                )
            }
            return newList
        }
    }

}