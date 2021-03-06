/* SPDX-License-Identifier: Apache 2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.informationview.server;


import org.odpi.openmetadata.accessservices.informationview.assets.DatabaseContextHandler;
import org.odpi.openmetadata.accessservices.informationview.registration.RegistrationHandler;
import org.odpi.openmetadata.accessservices.informationview.reports.DataViewHandler;
import org.odpi.openmetadata.accessservices.informationview.reports.ReportHandler;


/**
 * InformationViewServicesInstance caches references to OMRS objects for a specific server.
 * It is also responsible for registering itself in the instance map.
 */
public class InformationViewServicesInstance
{
    private ReportHandler reportHandler;
    private DataViewHandler dataViewHandler;
    private DatabaseContextHandler databaseContextHandler;
    private RegistrationHandler registrationHandler;
    private String                 serverName;


    /**
     * Set up the local repository connector that will service the REST Calls.
     *
     * @param reportHandler link to the repository responsible for servicing the REST calls.
     */
    public InformationViewServicesInstance(ReportHandler reportHandler,
                                           DataViewHandler  dataViewHandler,
                                           DatabaseContextHandler databaseContextHandler,
                                           RegistrationHandler registrationHandler,
                                           String        serverName)  {
        this.reportHandler = reportHandler;
        this.dataViewHandler = dataViewHandler;
        this.databaseContextHandler = databaseContextHandler;
        this.registrationHandler = registrationHandler;
        this.serverName    = serverName;

        InformationViewServicesInstanceMap.setNewInstanceForJVM(serverName, this);
    }


    /**
     * Return the report creator for this server.
     *
     * @return ReportCreator object
     */
    public ReportHandler getReportHandler()  {
        return this.reportHandler;
    }


    public DataViewHandler getDataViewHandler(){
            return this.dataViewHandler;
    }

    public DatabaseContextHandler getDatabaseContextHandler() {
        return databaseContextHandler;
    }

    public RegistrationHandler getRegistrationHandler(){return registrationHandler;}

    /**
     * Unregister this instance from the instance map.
     */
    public void shutdown() {
        InformationViewServicesInstanceMap.removeInstanceForJVM(serverName);
    }
}
