package za.co.lbnkosi.aboutmeapi.service

import org.springframework.stereotype.Service
import za.co.lbnkosi.aboutmeapi.models.dynamicContent.DynamicContent
import za.co.lbnkosi.aboutmeapi.models.dynamicContent.Link
import za.co.lbnkosi.aboutmeapi.repository.DynamicContentRepository
import za.co.lbnkosi.aboutmeapi.requests.DynamicContentRequest
import za.co.lbnkosi.aboutmeapi.requests.LinkRequest

@Service
class DynamicContentService(private val dynamicContentRepository: DynamicContentRepository) {

    fun createDynamicContent(request: DynamicContentRequest): DynamicContent {
        return dynamicContentRepository.save(
            DynamicContent(
                title = request.title,
                subtitle = request.subtitle,
                shouldShowAnimation = request.shouldShowAnimation,
                aboutApp = request.aboutApp,
                linkList = request.linkList.mapRequestToLink()
            )
        )
    }

    fun ArrayList<LinkRequest>.mapRequestToLink(): ArrayList<Link> {
        val newList = ArrayList<Link>()
        this.forEach {
            newList.add(
                Link(
                    alias = it.alias,
                    link = it.link
                )
            )
        }
        return newList
    }

    fun updateDynamicContent(request: DynamicContentRequest): DynamicContent {
        val dynamicContent = dynamicContentRepository.findAll().first()
        return dynamicContentRepository.save(dynamicContent.apply {
            id = id
            title = request.title
            subtitle = request.subtitle
            shouldShowAnimation = request.shouldShowAnimation
            aboutApp = request.aboutApp
            linkList = request.linkList.mapRequestToLink()
        })
    }

    fun findAll(): DynamicContent {
        return dynamicContentRepository.findAll().first()
    }

}