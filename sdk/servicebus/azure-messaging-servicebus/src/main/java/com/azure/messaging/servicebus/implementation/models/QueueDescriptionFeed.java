// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/** The QueueDescriptionFeed model. */
@JacksonXmlRootElement(localName = "feed", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class QueueDescriptionFeed {
    /*
     * URL of the list queues query.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The entity type for the feed.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * Datetime of the query.
     */
    @JsonProperty(value = "updated")
    private OffsetDateTime updated;

    /*
     * Links to paginated response.
     */
    @JsonProperty("link")
    private List<ResponseLink> link = new ArrayList<>();

    /*
     * Queue entries.
     */
    @JsonProperty("entry")
    private List<QueueDescriptionEntry> entry = new ArrayList<>();

    /**
     * Get the id property: URL of the list queues query.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: URL of the list queues query.
     *
     * @param id the id value to set.
     * @return the QueueDescriptionFeed object itself.
     */
    public QueueDescriptionFeed setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the title property: The entity type for the feed.
     *
     * @return the title value.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set the title property: The entity type for the feed.
     *
     * @param title the title value to set.
     * @return the QueueDescriptionFeed object itself.
     */
    public QueueDescriptionFeed setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the updated property: Datetime of the query.
     *
     * @return the updated value.
     */
    public OffsetDateTime getUpdated() {
        return this.updated;
    }

    /**
     * Set the updated property: Datetime of the query.
     *
     * @param updated the updated value to set.
     * @return the QueueDescriptionFeed object itself.
     */
    public QueueDescriptionFeed setUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    /**
     * Get the link property: Links to paginated response.
     *
     * @return the link value.
     */
    public List<ResponseLink> getLink() {
        return this.link;
    }

    /**
     * Set the link property: Links to paginated response.
     *
     * @param link the link value to set.
     * @return the QueueDescriptionFeed object itself.
     */
    public QueueDescriptionFeed setLink(List<ResponseLink> link) {
        this.link = link;
        return this;
    }

    /**
     * Get the entry property: Queue entries.
     *
     * @return the entry value.
     */
    public List<QueueDescriptionEntry> getEntry() {
        return this.entry;
    }

    /**
     * Set the entry property: Queue entries.
     *
     * @param entry the entry value to set.
     * @return the QueueDescriptionFeed object itself.
     */
    public QueueDescriptionFeed setEntry(List<QueueDescriptionEntry> entry) {
        this.entry = entry;
        return this;
    }
}
