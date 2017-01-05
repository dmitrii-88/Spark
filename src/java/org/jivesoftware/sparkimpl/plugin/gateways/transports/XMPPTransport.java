/**
 * Copyright (C) 2004-2011 Jive Software. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jivesoftware.sparkimpl.plugin.gateways.transports;

import org.jivesoftware.resource.Res;
import org.jivesoftware.resource.SparkRes;

import javax.swing.Icon;

/**
 */
public class XMPPTransport implements Transport {

    private String serviceName;

    public XMPPTransport(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTitle() {
        return Res.getString("title.xmpp.registration");
    }

    public String getInstructions() {
        return Res.getString("message.enter.xmpp");
    }

    public Icon getIcon() {
        return SparkRes.getImageIcon(SparkRes.XMPP_TRANSPORT_ACTIVE_IMAGE);
    }

    public Icon getInactiveIcon() {
        return SparkRes.getImageIcon(SparkRes.XMPP_TRANSPORT_INACTIVE_IMAGE);
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getName() {
        return "XMPP";
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Boolean requiresUsername() {
        return true;
    }

    public Boolean requiresPassword() {
        return true;
    }

    public Boolean requiresNickname() {
        return false;
    }
    
}
