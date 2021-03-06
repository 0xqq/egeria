/* SPDX-License-Identifier: Apache-2.0 */
package org.odpi.openmetadata.accessservices.assetlineage.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.EntityProxy;
@JsonAutoDetect(getterVisibility = PUBLIC_ONLY, setterVisibility = PUBLIC_ONLY, fieldVisibility = NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "class")
public class RelationshipEvent extends AssetLineageEvent {

    private GlossaryTerm glossaryTerm;
    private String typeDefName;
    private AssetContext assetContext;

    public GlossaryTerm getGlossaryTerm() {
        return glossaryTerm;
    }

    public void setGlossaryTerm(GlossaryTerm glossaryTerm) {
        this.glossaryTerm = glossaryTerm;
    }

    public String getTypeDefName() {
        return typeDefName;
    }

    public void setTypeDefName(String typeDefName) {
        this.typeDefName = typeDefName;
    }

    public AssetContext getAssetContext() {
        return assetContext;
    }

    public void setAssetContext(AssetContext assetContext) {
        this.assetContext = assetContext;
    }
}
