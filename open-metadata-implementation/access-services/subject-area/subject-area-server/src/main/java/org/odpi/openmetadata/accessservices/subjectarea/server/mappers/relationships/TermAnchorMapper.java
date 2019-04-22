/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.subjectarea.server.mappers.relationships;

import org.odpi.openmetadata.accessservices.subjectarea.ffdc.exceptions.InvalidParameterException;
import org.odpi.openmetadata.accessservices.subjectarea.properties.objects.graph.Line;
import org.odpi.openmetadata.accessservices.subjectarea.properties.relationships.TermAnchorRelationship;
import org.odpi.openmetadata.accessservices.subjectarea.server.mappers.ILineMapper;
import org.odpi.openmetadata.accessservices.subjectarea.utilities.OMRSAPIHelper;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.InstanceProperties;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Relationship;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.repositoryconnector.OMRSRepositoryHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Mapping methods to map between the termAnchor and the equivalent omrs Relationship.
 */
public class TermAnchorMapper extends LineMapper 
{
    private static final Logger log = LoggerFactory.getLogger( TermAnchorMapper.class);
    private static final String className = TermAnchorMapper.class.getName();
    public static final String TERM_ANCHOR = "TermAnchor";

    public TermAnchorMapper(OMRSAPIHelper omrsapiHelper) {
        super(omrsapiHelper);
    }

    /**
     * Get proxy1 guid.
     * The proxy has omrs type Glossary
     * @param line line
     * @return guid for entity proxy 1
     */
    @Override
    protected String getProxy1Guid(Line line)
    {
        TermAnchorRelationship termAnchor = (TermAnchorRelationship) line;
        return termAnchor.getGlossaryGuid();
    }

    /**
     * Get proxy2 guid
     * The proxy has omrs type GlossaryTerm
     * @param line for this Line
     * @return guid for entity proxy 2
     */
    @Override
    protected String getProxy2Guid(Line line)
    {
        TermAnchorRelationship termAnchor = (TermAnchorRelationship) line;
        return termAnchor.getTermGuid();
    }

    /**
     * Get the relationship type def guid.
     * @param relationship the relationship associated with the typedef whose guid is returned.
     * @return guid of the typedef
     */
    @Override
    protected String getRelationshipTypeDefGuid(Relationship relationship)
    {
        return repositoryHelper.getTypeDefByName(omrsapiHelper.getServiceName(), TERM_ANCHOR).getGUID();
    }
    @Override
    protected String getTypeName() {
        return  TERM_ANCHOR;
    }
    @Override
    protected Line getLineInstance() {
        return new TermAnchorRelationship();
    }
    @Override
    protected void setEnd1GuidInLine(Line line, String guid){
        TermAnchorRelationship termAnchorRelationship = (TermAnchorRelationship)line;
        termAnchorRelationship.setGlossaryGuid(guid);
    }
    @Override
    protected void setEnd2GuidInLine(Line line, String guid) {
        TermAnchorRelationship termAnchorRelationship = (TermAnchorRelationship)line;
        termAnchorRelationship.setTermGuid(guid);
    }
}
