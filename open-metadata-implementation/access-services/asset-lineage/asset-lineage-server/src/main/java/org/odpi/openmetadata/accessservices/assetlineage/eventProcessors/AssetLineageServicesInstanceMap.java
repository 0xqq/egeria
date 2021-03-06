/* SPDX-License-Identifier: Apache 2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.assetlineage.eventProcessors;


import java.util.HashMap;
import java.util.Map;

/**
 * AssetLineageServicesInstanceMap provides the mapping for inbound REST requests to the appropriate instances
 * for the requested server.  The map is maintained in a static so it is scoped to the class loader.
 *
 * Instances of this class call the synchronized static methods to work with the map.
 */
public class AssetLineageServicesInstanceMap
{
    private static  Map<String, AssetLineageServicesInstance>   instanceMap = new HashMap<>();


    /**
     * Add a new server instance to the server map.
     *
     * @param serverName name of the server
     * @param instance instance object
     */
    static synchronized void  setNewInstanceForJVM(String                            serverName,
                                                   AssetLineageServicesInstance   instance)
    {
        instanceMap.put(serverName, instance);
    }


    /**
     * Return the instance for this server.
     *
     * @param serverName name of the server
     * @return OMRSRepositoryServicesInstance object
     */
    private static synchronized AssetLineageServicesInstance getInstanceForJVM(String    serverName)
    {
        AssetLineageServicesInstance   instance = instanceMap.get(serverName);

        return instance;
    }


    /**
     * Remove the instance for this server.
     *
     * @param serverName name of the server
     */
    static synchronized void removeInstanceForJVM(String   serverName)
    {
        instanceMap.remove(serverName);
    }


    /**
     * Constructor
     */
    public AssetLineageServicesInstanceMap()
    {
    }


    /**
     * Return the instance for this server.
     *
     * @param serverName name of the server
     * @return OMRSRepositoryServicesInstance object
     */
    public AssetLineageServicesInstance getInstance(String    serverName)
    {
        return AssetLineageServicesInstanceMap.getInstanceForJVM(serverName);
    }
}
