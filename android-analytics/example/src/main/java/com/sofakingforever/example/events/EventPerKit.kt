package com.sofakingforever.example.events

import com.sofakingforever.analytics.AnalyticsKit
import com.sofakingforever.analytics.events.CustomEvent
import com.sofakingforever.analytics.kits.answers.AnswersKit
import com.sofakingforever.analytics.kits.firebase.FirebaseKit

class EventPerKit(private val whatever: Boolean) : CustomEvent {
    override fun getEventName(kit: AnalyticsKit): String = when (kit) {
        is FirebaseKit -> "Event #42 - Firebase"
        is AnswersKit -> "Event #42 - Answers"
        else -> "Event #42"
    }


    override fun getParameters(kit: AnalyticsKit): MutableMap<String, Any> {
        val parameters = super.getParameters(kit)

        when (kit) {
            // override only for firebase
            is FirebaseKit -> {
                parameters["firebaseParam"] = whatever
            }
            else -> {
                parameters["generalParam"] = whatever
            }
        }


        return parameters
    }

}
