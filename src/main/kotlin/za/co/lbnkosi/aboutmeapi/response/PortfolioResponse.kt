package za.co.lbnkosi.aboutmeapi.response

import za.co.lbnkosi.aboutmeapi.models.Portfolio
import za.co.lbnkosi.aboutmeapi.response.AddressResponse.Companion.copyAddressToResponse
import za.co.lbnkosi.aboutmeapi.response.CompetencyResponse.Companion.copyCompetencyToResponse
import za.co.lbnkosi.aboutmeapi.response.ContactResponse.Companion.copyContactToResponse
import za.co.lbnkosi.aboutmeapi.response.EducationResponse.Companion.copyEducationToResponse
import za.co.lbnkosi.aboutmeapi.response.LanguageResponse.Companion.copyLanguageToResponse
import za.co.lbnkosi.aboutmeapi.response.ProjectResponse.Companion.copyProjectToResponse
import za.co.lbnkosi.aboutmeapi.response.SkillResponse.Companion.copySkillToResponse
import za.co.lbnkosi.aboutmeapi.response.SocialResponse.Companion.copySocialToResponse
import za.co.lbnkosi.aboutmeapi.response.UserResponse.Companion.copyUserToResponse
import za.co.lbnkosi.aboutmeapi.response.WorkResponse.Companion.copyWorkToResponse

class PortfolioResponse(
    var user: UserResponse,
    var contactList: ArrayList<ContactResponse>,
    var addressList: ArrayList<AddressResponse>,
    var workList: ArrayList<WorkResponse>,
    var educationList: ArrayList<EducationResponse>,
    var skillsList: ArrayList<SkillResponse>,
    var languageList: ArrayList<LanguageResponse>,
    var competencyList: ArrayList<CompetencyResponse>,
    var socialList: ArrayList<SocialResponse>,
    var projectList: ArrayList<ProjectResponse>
) {

    companion object {
        fun fromEntity(portfolio: Portfolio): PortfolioResponse {
            return PortfolioResponse(
                user = portfolio.user.copyUserToResponse(),
                contactList = portfolio.contactList.copyContactToResponse(),
                addressList = portfolio.addressList.copyAddressToResponse(),
                workList = portfolio.workList.copyWorkToResponse(),
                educationList = portfolio.educationList.copyEducationToResponse(),
                skillsList = portfolio.skillsList.copySkillToResponse(),
                languageList = portfolio.languageList.copyLanguageToResponse(),
                competencyList = portfolio.competencyList.copyCompetencyToResponse(),
                socialList = portfolio.socialList.copySocialToResponse(),
                projectList = portfolio.projectList.copyProjectToResponse()
            )
        }
    }
}