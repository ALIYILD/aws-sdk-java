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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ResetDistributionCache" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetDistributionCacheRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the distribution for which to reset cache.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     */
    private String distributionName;

    /**
     * <p>
     * The name of the distribution for which to reset cache.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * 
     * @param distributionName
     *        The name of the distribution for which to reset cache.</p>
     *        <p>
     *        Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     */

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
    }

    /**
     * <p>
     * The name of the distribution for which to reset cache.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * 
     * @return The name of the distribution for which to reset cache.</p>
     *         <p>
     *         Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     */

    public String getDistributionName() {
        return this.distributionName;
    }

    /**
     * <p>
     * The name of the distribution for which to reset cache.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * 
     * @param distributionName
     *        The name of the distribution for which to reset cache.</p>
     *        <p>
     *        Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDistributionCacheRequest withDistributionName(String distributionName) {
        setDistributionName(distributionName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDistributionName() != null)
            sb.append("DistributionName: ").append(getDistributionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetDistributionCacheRequest == false)
            return false;
        ResetDistributionCacheRequest other = (ResetDistributionCacheRequest) obj;
        if (other.getDistributionName() == null ^ this.getDistributionName() == null)
            return false;
        if (other.getDistributionName() != null && other.getDistributionName().equals(this.getDistributionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributionName() == null) ? 0 : getDistributionName().hashCode());
        return hashCode;
    }

    @Override
    public ResetDistributionCacheRequest clone() {
        return (ResetDistributionCacheRequest) super.clone();
    }

}
