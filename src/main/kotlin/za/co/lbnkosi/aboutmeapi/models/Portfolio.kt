package za.co.lbnkosi.aboutmeapi.models

import za.co.lbnkosi.aboutmeapi.response.*

data class Portfolio(
    @Transient var user: UserResponse? = UserResponse(),
    @Transient var contacts: ArrayList<ContactResponse>? = arrayListOf(),
    @Transient var addresses: ArrayList<AddressResponse>? = arrayListOf(),
    @Transient var employmentHistory: ArrayList<WorkResponse>? = arrayListOf(),
    @Transient var education: ArrayList<EducationResponse>? = arrayListOf(),
    @Transient var skills: ArrayList<SkillResponse>? = arrayListOf(),
    @Transient var langauges: ArrayList<LanguageResponse>? = arrayListOf(),
    @Transient var competencies: ArrayList<CompetencyResponse>? = arrayListOf(),
    @Transient var socials: ArrayList<SocialResponse>? = arrayListOf(),
    @Transient var projects: ArrayList<ProjectResponse>? = arrayListOf()
)