package za.co.lbnkosi.aboutmeapi.response

import za.co.lbnkosi.aboutmeapi.enums.Fluency
import za.co.lbnkosi.aboutmeapi.models.Language
import za.co.lbnkosi.aboutmeapi.requests.LanguageRequest

class LanguageResponse(
    var name: String,
    var writingFluency: Fluency,
    var speakingFluency: Fluency,
    var readingFluency: Fluency
) {
    companion object {
        fun ArrayList<Language>.copyLanguageToResponse(): ArrayList<LanguageResponse> {
            val languageList: ArrayList<LanguageResponse> = arrayListOf()
            this.forEach {
                languageList.add(
                    LanguageResponse(
                        name = it.name,
                        writingFluency = it.writingFluency,
                        speakingFluency = it.speakingFluency,
                        readingFluency = it.readingFluency
                    )
                )
            }
            return languageList
        }
    }
}