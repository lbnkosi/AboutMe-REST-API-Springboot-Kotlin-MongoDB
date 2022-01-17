package za.co.lbnkosi.aboutmeapi.models

import za.co.lbnkosi.aboutmeapi.enums.Fluency

data class Language(
    var email: String = "",
    var name: String = "",
    var writingFluency: Fluency = Fluency.EXCELLENT,
    var speakingFluency: Fluency = Fluency.EXCELLENT,
    var readingFluency: Fluency = Fluency.EXCELLENT
)