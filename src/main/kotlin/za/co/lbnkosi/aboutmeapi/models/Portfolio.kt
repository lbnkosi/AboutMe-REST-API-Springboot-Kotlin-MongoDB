package za.co.lbnkosi.aboutmeapi.models

data class Portfolio(
    @Transient var user: User = User(),
    @Transient var contacts: ArrayList<Contact>? = arrayListOf(),
    @Transient var addresses: ArrayList<Address>? = arrayListOf(),
    @Transient var employmentHistory: ArrayList<Work>? = arrayListOf(),
    @Transient var education: ArrayList<Education>? = arrayListOf(),
    @Transient var skills: ArrayList<Skill>? = arrayListOf(),
    @Transient var langauges: ArrayList<Language>? = arrayListOf(),
    @Transient var competencies: ArrayList<Competency>? = arrayListOf(),
    @Transient var socials: ArrayList<Social>? = arrayListOf(),
    @Transient var projects: ArrayList<Project>? = arrayListOf()
)