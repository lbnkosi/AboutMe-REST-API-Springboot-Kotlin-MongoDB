package za.co.lbnkosi.aboutmeapi.requests

data class PortfolioRequest(
    var user: UserRequest = UserRequest(),
    var contactList: ArrayList<ContactRequest> = arrayListOf(),
    var addressList: ArrayList<AddressRequest> = arrayListOf(),
    var workList: ArrayList<WorkRequest> = arrayListOf(),
    var educationList: ArrayList<EducationRequest> = arrayListOf(),
    var skillsList: ArrayList<SkillRequest> = arrayListOf(),
    var languageList: ArrayList<LanguageRequest> = arrayListOf(),
    var competencyList: ArrayList<CompetencyRequest> = arrayListOf(),
    var socialList: ArrayList<SocialRequest> = arrayListOf(),
    var projectList: ArrayList<ProjectRequest> = arrayListOf()
)