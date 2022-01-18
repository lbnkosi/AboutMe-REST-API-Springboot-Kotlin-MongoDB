package za.co.lbnkosi.aboutmeapi

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.MongoTemplate

@Configuration
class SimpleMongoConfig {
    @Bean
    fun mongo(): MongoClient {
        val connectionString = ConnectionString("yourconfig")
        val mongoClientSettings = MongoClientSettings.builder().applyConnectionString(connectionString).build()
        return MongoClients.create(mongoClientSettings)
    }

    @Bean
    @Throws(Exception::class)
    fun mongoTemplate(): MongoTemplate {
        return MongoTemplate(mongo(), "aboutmedb")
    }
}