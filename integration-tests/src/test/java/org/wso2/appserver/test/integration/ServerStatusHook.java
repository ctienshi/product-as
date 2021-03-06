/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.appserver.test.integration;

/**
 * Implementing this interface allows an object to get the Application Server startup events for the integration
 * testing. The implemented fully qualified name of the class should added to the testng.xml file with parameter
 * name <strong>server-status-hook</strong>.
 */
public interface ServerStatusHook {

    /**
     * This method get called before the server startup.
     *
     * @throws Exception When error occurred inside the implemented method.
     */
    void beforeServerStart() throws Exception;

    /**
     * This method get called after the server startup.
     *
     * @throws Exception When error occurred inside the implemented method.
     */
    void afterServerStart() throws Exception;

    /**
     * This method get called before the server shutdown process.
     *
     * @throws Exception When error occurred inside the implemented method.
     */
    void beforeServerShutdown() throws Exception;

    /**
     * This method get called after server shutdown.
     *
     * @throws Exception When error occurred inside the implemented method.
     */
    void afterServerShutdown() throws Exception;
}
