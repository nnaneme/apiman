/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.overlord.apiman.dt.api.beans.services;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.jboss.errai.common.client.api.annotations.Portable;

/**
 * Models a plan+version that is available for use with a particular Service.  This
 * makes the Plan available when forming a Contract between an app and a Service.
 *
 * @author eric.wittmann@redhat.com
 */
@Portable
@Embeddable
public class ServicePlanBean implements Serializable {

    private static final long serialVersionUID = 7972763768594076697L;
    
    @Column(nullable=false)
    private String planId;
    @Column(nullable=false)
    private String version;
    
    /**
     * Constructor.
     */
    public ServicePlanBean() {
    }

    /**
     * @return the planId
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * @param planId the planId to set
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((planId == null) ? 0 : planId.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ServicePlanBean other = (ServicePlanBean) obj;
        if (planId == null) {
            if (other.planId != null)
                return false;
        } else if (!planId.equals(other.planId))
            return false;
        return true;
    }
    
    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return planId + "(" + version + ")"; //$NON-NLS-1$ //$NON-NLS-2$
    }

}
