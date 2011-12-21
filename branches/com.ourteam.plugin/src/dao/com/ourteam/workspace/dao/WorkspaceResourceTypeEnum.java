/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:17:25
 *
 * @author kylin
 *
 * @model
 */
public class WorkspaceResourceTypeEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new WorkspaceResourceTypeEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected WorkspaceResourceTypeEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end WorkspaceResourceTypeEnum()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getDesc() {
        return desc;
    } // end getDesc()

    /**
     * DOCUMENT ME!
     */
    private static Map enumValueMap = new HashMap();

    /**
     * DOCUMENT ME!
     *
     * @param arg0 DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static WorkspaceResourceTypeEnum getEnum(String arg0) {
        return (WorkspaceResourceTypeEnum) enumValueMap.get(arg0);
    } // end getEnum()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static Collection getEnumList() {
        return enumValueMap.values();
    } // end getEnumList()

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="SOURCE_CODE"
     */
    public static final WorkspaceResourceTypeEnum SOURCE_CODE = new WorkspaceResourceTypeEnum("SOURCE_CODE",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="DEPEND_LIBARY"
     */
    public static final WorkspaceResourceTypeEnum DEPEND_LIBARY = new WorkspaceResourceTypeEnum("DEPEND_LIBARY",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="FLOAD"
     */
    public static final WorkspaceResourceTypeEnum FLOAD = new WorkspaceResourceTypeEnum("FLOAD",
            "");
} // end WorkspaceResourceTypeEnum
