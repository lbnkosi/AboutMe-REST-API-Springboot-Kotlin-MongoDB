package za.co.lbnkosi.aboutmeapi.requests

import za.co.lbnkosi.aboutmeapi.enums.Fluency

data class LanguageRequest(
    var name: String = "",
    var writingFluency: Fluency = Fluency.EXCELLENT,
    var speakingFluency: Fluency = Fluency.EXCELLENT,
    var readingFluency: Fluency = Fluency.EXCELLENT
)