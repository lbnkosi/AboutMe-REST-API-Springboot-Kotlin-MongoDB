package za.co.lbnkosi.aboutmeapi.service

import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import za.co.lbnkosi.aboutmeapi.models.Language
import za.co.lbnkosi.aboutmeapi.repository.LanguageRepository
import za.co.lbnkosi.aboutmeapi.requests.LanguageRequest

@Service
class LanguageService(private val languageRepository: LanguageRepository) {

    fun createLanguage(languageRequest: LanguageRequest): Language {
        return languageRepository.save(
            Language(
                name = languageRequest.name,
                writingFluency = languageRequest.writingFluency,
                speakingFluency = languageRequest.speakingFluency,
                readingFluency = languageRequest.readingFluency,
                uid = languageRequest.uid
            )
        )
    }

    fun updateLanguage(languageRequest: LanguageRequest, id: ObjectId): Language {
        val language = languageRepository.findById(id.toString())
        return languageRepository.save(language.get().apply {
            this.id = languageRequest.id
            name = languageRequest.name
            writingFluency = languageRequest.writingFluency
            speakingFluency = languageRequest.speakingFluency
            readingFluency = languageRequest.readingFluency
            uid = languageRequest.uid
        })
    }

    fun findAll(uid: String): ArrayList<Language> {
        return ArrayList(languageRepository.findAll().filter { predicate -> predicate.uid == uid })
    }

}