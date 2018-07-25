/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the time based backup schedule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ScheduleKind")
@JsonTypeName("TimeBased")
public class TimeBasedBackupScheduleDescription extends BackupScheduleDescription {
    /**
     * Describes the frequency with which to run the time based backup
     * schedule.
     * . Possible values include: 'Invalid', 'Daily', 'Weekly'.
     */
    @JsonProperty(value = "ScheduleFrequencyType", required = true)
    private BackupScheduleFrequencyType scheduleFrequencyType;

    /**
     * List of days of a week when to trigger the periodic backup. This is
     * valid only when the backup schedule frequency type is weekly.
     */
    @JsonProperty(value = "RunDays")
    private List<DayOfWeek> runDays;

    /**
     * Represents the list of exact time during the day in ISO8601 format. Like
     * '19:00:00' will represent '7PM' during the day. Date specified along
     * with time will be ignored.
     */
    @JsonProperty(value = "RunTimes", required = true)
    private List<DateTime> runTimes;

    /**
     * Get describes the frequency with which to run the time based backup schedule.
     . Possible values include: 'Invalid', 'Daily', 'Weekly'.
     *
     * @return the scheduleFrequencyType value
     */
    public BackupScheduleFrequencyType scheduleFrequencyType() {
        return this.scheduleFrequencyType;
    }

    /**
     * Set describes the frequency with which to run the time based backup schedule.
     . Possible values include: 'Invalid', 'Daily', 'Weekly'.
     *
     * @param scheduleFrequencyType the scheduleFrequencyType value to set
     * @return the TimeBasedBackupScheduleDescription object itself.
     */
    public TimeBasedBackupScheduleDescription withScheduleFrequencyType(BackupScheduleFrequencyType scheduleFrequencyType) {
        this.scheduleFrequencyType = scheduleFrequencyType;
        return this;
    }

    /**
     * Get list of days of a week when to trigger the periodic backup. This is valid only when the backup schedule frequency type is weekly.
     *
     * @return the runDays value
     */
    public List<DayOfWeek> runDays() {
        return this.runDays;
    }

    /**
     * Set list of days of a week when to trigger the periodic backup. This is valid only when the backup schedule frequency type is weekly.
     *
     * @param runDays the runDays value to set
     * @return the TimeBasedBackupScheduleDescription object itself.
     */
    public TimeBasedBackupScheduleDescription withRunDays(List<DayOfWeek> runDays) {
        this.runDays = runDays;
        return this;
    }

    /**
     * Get represents the list of exact time during the day in ISO8601 format. Like '19:00:00' will represent '7PM' during the day. Date specified along with time will be ignored.
     *
     * @return the runTimes value
     */
    public List<DateTime> runTimes() {
        return this.runTimes;
    }

    /**
     * Set represents the list of exact time during the day in ISO8601 format. Like '19:00:00' will represent '7PM' during the day. Date specified along with time will be ignored.
     *
     * @param runTimes the runTimes value to set
     * @return the TimeBasedBackupScheduleDescription object itself.
     */
    public TimeBasedBackupScheduleDescription withRunTimes(List<DateTime> runTimes) {
        this.runTimes = runTimes;
        return this;
    }

}
