/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */

package org.odpi.openmetadata.adapters.repositoryservices.graphrepository.repositoryconnector;

import java.util.HashMap;
import java.util.Map;

public class GraphOMRSConstants {

    private GraphOMRSConstants() {
    }

    // Constants to distinguish between property keys for vertices and edges - saves on reindexing

    /*
     *  CORE PROPERTIES (all type categories)
     */

    // Short names for core properties

    public static final String PROPERTY_NAME_GUID                             = "guid";
    public static final String PROPERTY_NAME_TYPE_NAME                        = "typeName";
    public static final String PROPERTY_NAME_METADATACOLLECTION_ID            = "metadataCollectionId";
    public static final String PROPERTY_NAME_METADATACOLLECTION_NAME          = "metadataCollectionName";
    public static final String PROPERTY_NAME_VERSION                          = "version";
    public static final String PROPERTY_NAME_CREATED_BY                       = "createdBy";
    public static final String PROPERTY_NAME_CREATE_TIME                      = "createTime";
    public static final String PROPERTY_NAME_UPDATED_BY                       = "updatedBy";
    public static final String PROPERTY_NAME_UPDATE_TIME                      = "updateTime";
    public static final String PROPERTY_NAME_PROVENANCE_TYPE                  = "provenanceType";
    public static final String PROPERTY_NAME_STATUS                           = "status";
    public static final String PROPERTY_NAME_STATUS_ON_DELETE                 = "statusOnDelete";
    public static final String PROPERTY_NAME_MAINTAINED_BY                    = "maintainedBy";
    public static final String PROPERTY_NAME_INSTANCE_URL                     = "instanceURL";
    public static final String PROPERTY_NAME_INSTANCE_LICENSE                 = "instanceLicense";
    public static final String PROPERTY_NAME_CLASSIFICATION_NAME              = "classificationName";
    public static final String PROPERTY_NAME_CLASSIFICATION_ORIGIN            = "classificationOrigin";
    public static final String PROPERTY_NAME_CLASSIFICATION_ORIGIN_GUID       = "classificationOriginGUID";
    public static final String PROPERTY_NAME_ENTITY_IS_PROXY                  = "entityIsProxy";

    // Map of core property short name to type as stored in graph (not how they appear in Instances)

    public static final Map<String,String> corePropertyTypes = new HashMap<String,String>() {{
        put(PROPERTY_NAME_GUID,                           "java.lang.String");
        put(PROPERTY_NAME_TYPE_NAME,                      "java.lang.String");
        put(PROPERTY_NAME_METADATACOLLECTION_ID,          "java.lang.String");
        put(PROPERTY_NAME_METADATACOLLECTION_NAME,        "java.lang.String");
        put(PROPERTY_NAME_VERSION,                        "java.lang.Long");
        put(PROPERTY_NAME_CREATED_BY,                     "java.lang.String");
        put(PROPERTY_NAME_CREATE_TIME,                    "java.lang.Date");
        put(PROPERTY_NAME_UPDATED_BY,                     "java.lang.String");
        put(PROPERTY_NAME_UPDATE_TIME,                    "java.lang.Date");
        put(PROPERTY_NAME_PROVENANCE_TYPE,                "java.lang.Integer");    // enum stored by ordinal
        put(PROPERTY_NAME_STATUS,                         "java.lang.Integer");    // enum stored by ordinal
        put(PROPERTY_NAME_STATUS_ON_DELETE,               "java.lang.Integer");    // enum stored by ordinal
        put(PROPERTY_NAME_MAINTAINED_BY,                  "java.lang.String");     // list (of strings) stored in serialized form
        put(PROPERTY_NAME_INSTANCE_URL,                   "java.lang.String");
        put(PROPERTY_NAME_INSTANCE_LICENSE,               "java.lang.String");
        put(PROPERTY_NAME_CLASSIFICATION_NAME,            "java.lang.String");
        put(PROPERTY_NAME_CLASSIFICATION_ORIGIN,          "java.lang.Integer");    // enum stored by ordinal
        put(PROPERTY_NAME_CLASSIFICATION_ORIGIN_GUID,     "java.lang.String");
        put(PROPERTY_NAME_ENTITY_IS_PROXY,                "java.lang.Boolean");
    }};




    /*
     *  ENTITIES
     */

    public static final String PROPERTY_KEY_PREFIX_ENTITY                  = "ve";

    public static final String PROPERTY_KEY_ENTITY_GUID                    = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_GUID;
    public static final String PROPERTY_KEY_ENTITY_TYPE_NAME               = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_TYPE_NAME;
    public static final String PROPERTY_KEY_ENTITY_METADATACOLLECTION_ID   = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_METADATACOLLECTION_ID;
    public static final String PROPERTY_KEY_ENTITY_METADATACOLLECTION_NAME = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_METADATACOLLECTION_NAME;
    public static final String PROPERTY_KEY_ENTITY_VERSION                 = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_VERSION;
    public static final String PROPERTY_KEY_ENTITY_CREATED_BY              = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_CREATED_BY;
    public static final String PROPERTY_KEY_ENTITY_CREATE_TIME             = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_CREATE_TIME;
    public static final String PROPERTY_KEY_ENTITY_UPDATED_BY              = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_UPDATED_BY;
    public static final String PROPERTY_KEY_ENTITY_UPDATE_TIME             = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_UPDATE_TIME;
    public static final String PROPERTY_KEY_ENTITY_PROVENANCE_TYPE         = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_PROVENANCE_TYPE;
    public static final String PROPERTY_KEY_ENTITY_STATUS                  = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_STATUS;
    public static final String PROPERTY_KEY_ENTITY_STATUS_ON_DELETE        = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_STATUS_ON_DELETE;
    public static final String PROPERTY_KEY_ENTITY_MAINTAINED_BY           = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_MAINTAINED_BY;
    public static final String PROPERTY_KEY_ENTITY_INSTANCE_URL            = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_INSTANCE_URL;
    public static final String PROPERTY_KEY_ENTITY_INSTANCE_LICENSE        = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_INSTANCE_LICENSE;
    public static final String PROPERTY_KEY_ENTITY_IS_PROXY                = PROPERTY_KEY_PREFIX_ENTITY + PROPERTY_NAME_ENTITY_IS_PROXY;

    // Map of names to property key names
    public static final Map<String, String> corePropertiesEntity = new HashMap<String,String>() {{
        put(PROPERTY_NAME_GUID, PROPERTY_KEY_ENTITY_GUID );
        put(PROPERTY_NAME_TYPE_NAME, PROPERTY_KEY_ENTITY_TYPE_NAME);
        put(PROPERTY_NAME_METADATACOLLECTION_ID, PROPERTY_KEY_ENTITY_METADATACOLLECTION_ID);
        put(PROPERTY_NAME_METADATACOLLECTION_NAME, PROPERTY_KEY_ENTITY_METADATACOLLECTION_NAME);
        put(PROPERTY_NAME_VERSION, PROPERTY_KEY_ENTITY_VERSION);
        put(PROPERTY_NAME_CREATED_BY, PROPERTY_KEY_ENTITY_CREATED_BY);
        put(PROPERTY_NAME_CREATE_TIME, PROPERTY_KEY_ENTITY_CREATE_TIME);
        put(PROPERTY_NAME_UPDATED_BY, PROPERTY_KEY_ENTITY_UPDATED_BY);
        put(PROPERTY_NAME_UPDATE_TIME, PROPERTY_KEY_ENTITY_UPDATE_TIME);
        put(PROPERTY_NAME_PROVENANCE_TYPE, PROPERTY_KEY_ENTITY_PROVENANCE_TYPE);
        put(PROPERTY_NAME_STATUS, PROPERTY_KEY_ENTITY_STATUS);
        put(PROPERTY_NAME_STATUS_ON_DELETE, PROPERTY_KEY_ENTITY_STATUS_ON_DELETE);
        put(PROPERTY_NAME_MAINTAINED_BY, PROPERTY_KEY_ENTITY_MAINTAINED_BY);
        put(PROPERTY_NAME_INSTANCE_URL, PROPERTY_KEY_ENTITY_INSTANCE_URL);
        put(PROPERTY_NAME_INSTANCE_LICENSE, PROPERTY_KEY_ENTITY_INSTANCE_LICENSE);
        put(PROPERTY_NAME_ENTITY_IS_PROXY, PROPERTY_KEY_ENTITY_IS_PROXY);
    }};


    public static String getPropertyKeyEntity(String propertyName) {
        return PROPERTY_KEY_PREFIX_ENTITY + propertyName;
    }

    /*
     *  RELATIONSHIPS
     */

    public static final String PROPERTY_KEY_PREFIX_RELATIONSHIP                      = "er";


    public static final String PROPERTY_KEY_RELATIONSHIP_GUID                        = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_GUID;
    public static final String PROPERTY_KEY_RELATIONSHIP_TYPE_NAME                   = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_TYPE_NAME;
    public static final String PROPERTY_KEY_RELATIONSHIP_METADATACOLLECTION_ID       = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_METADATACOLLECTION_ID;
    public static final String PROPERTY_KEY_RELATIONSHIP_METADATACOLLECTION_NAME     = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_METADATACOLLECTION_NAME;
    public static final String PROPERTY_KEY_RELATIONSHIP_VERSION                     = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_VERSION;
    public static final String PROPERTY_KEY_RELATIONSHIP_CREATED_BY                  = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_CREATED_BY;
    public static final String PROPERTY_KEY_RELATIONSHIP_CREATE_TIME                 = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_CREATE_TIME;
    public static final String PROPERTY_KEY_RELATIONSHIP_UPDATED_BY                  = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_UPDATED_BY;
    public static final String PROPERTY_KEY_RELATIONSHIP_UPDATE_TIME                 = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_UPDATE_TIME;
    public static final String PROPERTY_KEY_RELATIONSHIP_PROVENANCE_TYPE             = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_PROVENANCE_TYPE;
    public static final String PROPERTY_KEY_RELATIONSHIP_STATUS                      = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_STATUS;
    public static final String PROPERTY_KEY_RELATIONSHIP_STATUS_ON_DELETE            = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_STATUS_ON_DELETE;
    public static final String PROPERTY_KEY_RELATIONSHIP_MAINTAINED_BY               = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_MAINTAINED_BY;
    public static final String PROPERTY_KEY_RELATIONSHIP_INSTANCE_URL                = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_INSTANCE_URL;
    public static final String PROPERTY_KEY_RELATIONSHIP_INSTANCE_LICENSE            = PROPERTY_KEY_PREFIX_RELATIONSHIP+PROPERTY_NAME_INSTANCE_LICENSE;

    // Map of names to property key names
    public static final Map<String, String> corePropertiesRelationship = new HashMap<String,String>() {{
        put(PROPERTY_NAME_GUID, PROPERTY_KEY_RELATIONSHIP_GUID);
        put(PROPERTY_NAME_TYPE_NAME, PROPERTY_KEY_RELATIONSHIP_TYPE_NAME);
        put(PROPERTY_NAME_METADATACOLLECTION_ID, PROPERTY_KEY_RELATIONSHIP_METADATACOLLECTION_ID);
        put(PROPERTY_NAME_METADATACOLLECTION_NAME, PROPERTY_KEY_RELATIONSHIP_METADATACOLLECTION_NAME);
        put(PROPERTY_NAME_VERSION, PROPERTY_KEY_RELATIONSHIP_VERSION);
        put(PROPERTY_NAME_CREATED_BY, PROPERTY_KEY_RELATIONSHIP_CREATED_BY);
        put(PROPERTY_NAME_CREATE_TIME, PROPERTY_KEY_RELATIONSHIP_CREATE_TIME);
        put(PROPERTY_NAME_UPDATED_BY, PROPERTY_KEY_RELATIONSHIP_UPDATED_BY);
        put(PROPERTY_NAME_UPDATE_TIME, PROPERTY_KEY_RELATIONSHIP_UPDATE_TIME);
        put(PROPERTY_NAME_PROVENANCE_TYPE, PROPERTY_KEY_RELATIONSHIP_PROVENANCE_TYPE);
        put(PROPERTY_NAME_STATUS, PROPERTY_KEY_RELATIONSHIP_STATUS);
        put(PROPERTY_NAME_STATUS_ON_DELETE, PROPERTY_KEY_RELATIONSHIP_STATUS_ON_DELETE);
        put(PROPERTY_NAME_MAINTAINED_BY, PROPERTY_KEY_RELATIONSHIP_MAINTAINED_BY);
        put(PROPERTY_NAME_INSTANCE_URL, PROPERTY_KEY_RELATIONSHIP_INSTANCE_URL);
        put(PROPERTY_NAME_INSTANCE_LICENSE, PROPERTY_KEY_RELATIONSHIP_INSTANCE_LICENSE);
    }};

    public static String getPropertyKeyRelationship(String propertyName) {
        return PROPERTY_KEY_PREFIX_RELATIONSHIP + propertyName;
    }


    /*
     *  CLASSIFICATIONS
     */

    public static final String PROPERTY_KEY_PREFIX_CLASSIFICATION                      = "vc";

    public static final String PROPERTY_KEY_CLASSIFICATION_TYPE_NAME                   = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_TYPE_NAME;
    public static final String PROPERTY_KEY_CLASSIFICATION_METADATACOLLECTION_ID       = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_METADATACOLLECTION_ID;
    public static final String PROPERTY_KEY_CLASSIFICATION_METADATACOLLECTION_NAME     = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_METADATACOLLECTION_NAME;
    public static final String PROPERTY_KEY_CLASSIFICATION_VERSION                     = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_VERSION;
    public static final String PROPERTY_KEY_CLASSIFICATION_CREATED_BY                  = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_CREATED_BY;
    public static final String PROPERTY_KEY_CLASSIFICATION_CREATE_TIME                 = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_CREATE_TIME;
    public static final String PROPERTY_KEY_CLASSIFICATION_UPDATED_BY                  = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_UPDATED_BY;
    public static final String PROPERTY_KEY_CLASSIFICATION_UPDATE_TIME                 = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_UPDATE_TIME;
    public static final String PROPERTY_KEY_CLASSIFICATION_PROVENANCE_TYPE             = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_PROVENANCE_TYPE;
    public static final String PROPERTY_KEY_CLASSIFICATION_STATUS                      = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_STATUS;
    public static final String PROPERTY_KEY_CLASSIFICATION_STATUS_ON_DELETE            = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_STATUS_ON_DELETE;
    public static final String PROPERTY_KEY_CLASSIFICATION_MAINTAINED_BY               = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_MAINTAINED_BY;
    public static final String PROPERTY_KEY_CLASSIFICATION_INSTANCE_LICENSE            = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_INSTANCE_LICENSE;
    public static final String PROPERTY_KEY_CLASSIFICATION_CLASSIFICATION_NAME         = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_CLASSIFICATION_NAME;
    public static final String PROPERTY_KEY_CLASSIFICATION_CLASSIFICATION_ORIGIN       = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_CLASSIFICATION_ORIGIN;
    public static final String PROPERTY_KEY_CLASSIFICATION_CLASSIFICATION_ORIGIN_GUID  = PROPERTY_KEY_PREFIX_CLASSIFICATION+PROPERTY_NAME_CLASSIFICATION_ORIGIN_GUID ;

    // Map of names to property key names
    public static final Map<String, String> corePropertiesClassification = new HashMap<String,String>() {{
        put(PROPERTY_NAME_TYPE_NAME, PROPERTY_KEY_CLASSIFICATION_TYPE_NAME);
        put(PROPERTY_NAME_METADATACOLLECTION_ID, PROPERTY_KEY_CLASSIFICATION_METADATACOLLECTION_ID);
        put(PROPERTY_NAME_METADATACOLLECTION_NAME, PROPERTY_KEY_CLASSIFICATION_METADATACOLLECTION_NAME);
        put(PROPERTY_NAME_VERSION, PROPERTY_KEY_CLASSIFICATION_VERSION);
        put(PROPERTY_NAME_CREATED_BY, PROPERTY_KEY_CLASSIFICATION_CREATED_BY);
        put(PROPERTY_NAME_CREATE_TIME, PROPERTY_KEY_CLASSIFICATION_CREATE_TIME);
        put(PROPERTY_NAME_UPDATED_BY, PROPERTY_KEY_CLASSIFICATION_UPDATED_BY);
        put(PROPERTY_NAME_UPDATE_TIME, PROPERTY_KEY_CLASSIFICATION_UPDATE_TIME);
        put(PROPERTY_NAME_PROVENANCE_TYPE, PROPERTY_KEY_CLASSIFICATION_PROVENANCE_TYPE);
        put(PROPERTY_NAME_STATUS, PROPERTY_KEY_CLASSIFICATION_STATUS);
        put(PROPERTY_NAME_STATUS_ON_DELETE, PROPERTY_KEY_CLASSIFICATION_STATUS_ON_DELETE);
        put(PROPERTY_NAME_MAINTAINED_BY, PROPERTY_KEY_CLASSIFICATION_MAINTAINED_BY);
        put(PROPERTY_NAME_INSTANCE_LICENSE, PROPERTY_KEY_CLASSIFICATION_INSTANCE_LICENSE);
        put(PROPERTY_NAME_CLASSIFICATION_NAME, PROPERTY_KEY_CLASSIFICATION_CLASSIFICATION_NAME);
        put(PROPERTY_NAME_CLASSIFICATION_ORIGIN, PROPERTY_KEY_CLASSIFICATION_CLASSIFICATION_ORIGIN);
        put(PROPERTY_NAME_CLASSIFICATION_ORIGIN_GUID, PROPERTY_KEY_CLASSIFICATION_CLASSIFICATION_ORIGIN_GUID);
    }};

    public static String getPropertyKeyClassification(String propertyName) {
        return PROPERTY_KEY_PREFIX_CLASSIFICATION + propertyName;
    }



    public enum ElementType {
        Vertex,
        Edge
    }

}
