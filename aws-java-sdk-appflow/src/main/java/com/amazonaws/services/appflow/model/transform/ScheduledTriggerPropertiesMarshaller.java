/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScheduledTriggerPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScheduledTriggerPropertiesMarshaller {

    private static final MarshallingInfo<String> SCHEDULEEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduleExpression").build();
    private static final MarshallingInfo<String> DATAPULLMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataPullMode").build();
    private static final MarshallingInfo<java.util.Date> SCHEDULESTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduleStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> SCHEDULEENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduleEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("timezone").build();

    private static final ScheduledTriggerPropertiesMarshaller instance = new ScheduledTriggerPropertiesMarshaller();

    public static ScheduledTriggerPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScheduledTriggerProperties scheduledTriggerProperties, ProtocolMarshaller protocolMarshaller) {

        if (scheduledTriggerProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scheduledTriggerProperties.getScheduleExpression(), SCHEDULEEXPRESSION_BINDING);
            protocolMarshaller.marshall(scheduledTriggerProperties.getDataPullMode(), DATAPULLMODE_BINDING);
            protocolMarshaller.marshall(scheduledTriggerProperties.getScheduleStartTime(), SCHEDULESTARTTIME_BINDING);
            protocolMarshaller.marshall(scheduledTriggerProperties.getScheduleEndTime(), SCHEDULEENDTIME_BINDING);
            protocolMarshaller.marshall(scheduledTriggerProperties.getTimezone(), TIMEZONE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
