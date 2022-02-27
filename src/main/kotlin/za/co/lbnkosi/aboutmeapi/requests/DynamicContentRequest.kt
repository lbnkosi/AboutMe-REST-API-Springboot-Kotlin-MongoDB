package za.co.lbnkosi.aboutmeapi.requests

import za.co.lbnkosi.aboutmeapi.models.dynamicContent.Link

data class DynamicContentRequest(
    var title: String = "",
    var subtitle: String = "",
    var shouldShowAnimation: Boolean = true,
    var aboutApp: String = "",
    var linkList: ArrayList<LinkRequest> = arrayListOf()
)
