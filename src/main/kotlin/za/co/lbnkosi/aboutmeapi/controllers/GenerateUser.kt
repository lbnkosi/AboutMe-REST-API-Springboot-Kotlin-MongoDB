package za.co.lbnkosi.aboutmeapi.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import za.co.lbnkosi.aboutmeapi.enums.*
import za.co.lbnkosi.aboutmeapi.models.Work
import za.co.lbnkosi.aboutmeapi.requests.*
import za.co.lbnkosi.aboutmeapi.response.AddressResponse.Companion.toRequest
import za.co.lbnkosi.aboutmeapi.response.ContactResponse.Companion.toRequest
import za.co.lbnkosi.aboutmeapi.utils.Constants

import java.util.*


object GenerateUser {
    
    fun generateUser(): UserRequest {
        return UserRequest().apply {
            id = null
            uid = Constants.FAKE_UID
            dateOfBirth = Date()
            gender = Gender.MALE.toString()
            name = "Lebogang"
            profileImage = ""
            resume = ""
            secondName = "Bongani"
            surname = "Nkosi"
            title = "Android Developer"
        }
    }

    fun generateAddress(): AddressRequest {
        return AddressRequest(
            id = null,
            uid = Constants.FAKE_UID,
            alias = "Home",
            street = "322 Whisken Avenue",
            suburb = "Crowthorne",
            city = "Midrand",
            province = "Gauteng",
            postalCode = "1684",
            addressType = AddressType.HOME.toString()
        )
    }

    fun generateCompetencies(): CompetencyRequest {
        return CompetencyRequest(
            id = null,
            uid = Constants.FAKE_UID,
            name = "SpringBoot",
            rating = 70,
            description = "Developing APIs using SpringBoot"
        )
    }

    fun generateContact(): ContactRequest {
        return ContactRequest(
            id = null,
            uid = Constants.FAKE_UID,
            alias = "My Contact Details",
            primaryNumber = "0670083283",
            secondaryNumber = "0824545419",
            email = "nkosilebogang95@gmail.com",
            contactType = ContactType.PERSONAL.toString()
        )
    }

    fun generateEducation(): EducationRequest{
        return EducationRequest(
            id = null,
            uid = Constants.FAKE_UID,
            alias = "UNISA",
            name = "University of South Africa",
            startDate = Date(),
            endDate = Date(),
            educationType = EducationType.DEGREE.toString(),
            enrolled = true,
            logo = ""
        )
    }

    fun generateLanguage(): LanguageRequest {
        return LanguageRequest(
            id = null,
            uid = Constants.FAKE_UID,
            name = "English",
            writingFluency = Fluency.EXCELLENT.toString(),
            speakingFluency = Fluency.EXCELLENT.toString(),
            readingFluency = Fluency.EXCELLENT.toString()
        )
    }

    fun generateProject():ProjectRequest {
        return ProjectRequest(
            id = null,
            uid = Constants.FAKE_UID,
            name = "SpringBoot Portfolio",
            platform = "REST API",
            downloadLink = "",
            githubLink = "",
            description = "SpringBoot App",
            image = ""
        )
    }

    fun generateSkill(): SkillRequest {
        return SkillRequest(
            id = null,
            uid = Constants.FAKE_UID,
            name = "Kotlin"
        )
    }

    fun generateSocial(): SocialRequest {
        return SocialRequest(
            id = null,
            uid = Constants.FAKE_UID,
            name = "LinkedIn",
            link = "https://www.linkedin.com",
            description = "LinkedIn Social Media"
        )
    }

    fun generateWork(): WorkRequest {
        return WorkRequest(
            id = null,
            uid = Constants.FAKE_UID,
            alias = "Second Office",
            companyName = "Tracker",
            position = "Android Developer",
            startDate = Date(),
            endDate = Date(),
            currentPosition = true,
            logo = "",
            description = "Working at Tracker as a consultant",
            workType = WorkType.PERMANENT.toString()
        )
    }

}