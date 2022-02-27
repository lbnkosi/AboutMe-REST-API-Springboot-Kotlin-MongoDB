package za.co.lbnkosi.aboutmeapi.models.dynamicContent

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id

data class DynamicContent(
    @Id var id: ObjectId? = null,
    var title: String = "",
    var subtitle: String = "",
    var shouldShowAnimation: Boolean = true,
    var aboutApp: String = "",
    var linkList: ArrayList<Link> = arrayListOf()
)