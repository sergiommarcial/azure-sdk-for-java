// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;

/** Event data for Microsoft.Devices.DeviceConnected event. */
@Fluent
public final class IotHubDeviceConnectedEventData extends DeviceConnectionStateEventProperties {
    /** {@inheritDoc} */
    @Override
    public IotHubDeviceConnectedEventData setDeviceId(String deviceId) {
        super.setDeviceId(deviceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotHubDeviceConnectedEventData setModuleId(String moduleId) {
        super.setModuleId(moduleId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotHubDeviceConnectedEventData setHubName(String hubName) {
        super.setHubName(hubName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotHubDeviceConnectedEventData setDeviceConnectionStateEventInfo(
            DeviceConnectionStateEventInfo deviceConnectionStateEventInfo) {
        super.setDeviceConnectionStateEventInfo(deviceConnectionStateEventInfo);
        return this;
    }
}
