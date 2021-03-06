package com.sofakingforever.example.custom

import android.content.Context
import com.crashlytics.android.answers.InviteEvent
import com.sofakingforever.analytics.AnalyticsDispatcher
import com.sofakingforever.analytics.AnalyticsKit
import com.sofakingforever.analytics.events.*

/**
 * Look at any of the library's Dispatcher Implementations to learn how to implement one yourself
 */
class CustomDispatcher(override val init: Boolean) : AnalyticsDispatcher {

    override val dispatcherName: String = "CustomEmptyDispatcher"

    constructor() : this(true)



    override val kit: AnalyticsKit = CustomKit.instance

    override fun initDispatcher() {
        // call custom analytics initiation function
    }

    override fun trackContentView(contentView: ContentViewEvent) {
        // track content view
    }

    override fun trackCustomEvent(event: CustomEvent) {
        // track event
    }

    override fun setUserProperties(properties: SetUserProperties) {
        // set user properties
    }
}