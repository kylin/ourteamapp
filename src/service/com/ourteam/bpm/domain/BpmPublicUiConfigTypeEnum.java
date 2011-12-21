/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-11 16:49:48
 *
 * @author kylin
 *
 * @model
 */
public class BpmPublicUiConfigTypeEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new BpmPublicUiConfigTypeEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected BpmPublicUiConfigTypeEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end BpmPublicUiConfigTypeEnum()

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
    public static BpmPublicUiConfigTypeEnum getEnum(String arg0) {
        return (BpmPublicUiConfigTypeEnum) enumValueMap.get(arg0);
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
     * @model name="UI_FORM_CONFIG"
     */
    public static final BpmPublicUiConfigTypeEnum UI_FORM_CONFIG = new BpmPublicUiConfigTypeEnum("UI_FORM_CONFIG",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="UI_LIST_CONFIG"
     */
    public static final BpmPublicUiConfigTypeEnum UI_LIST_CONFIG = new BpmPublicUiConfigTypeEnum("UI_LIST_CONFIG",
            "");
} // end BpmPublicUiConfigTypeEnum
