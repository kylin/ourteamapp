/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.document.dao;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * ÎÄµµ×´Ì¬ Generate date 2011-09-22 10:16:22
 *
 * @author kylin
 *
 * @model
 */
public class DocumentStatus extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new DocumentStatus object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected DocumentStatus(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end DocumentStatus()

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
    public static DocumentStatus getEnum(String arg0) {
        return (DocumentStatus) enumValueMap.get(arg0);
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
     * Ëø¶¨
     *
     * @model name="LOCKED"
     */
    public static final DocumentStatus LOCKED = new DocumentStatus("LOCKED",
            "Ëø¶¨");

    /**
     * ½âËø×´Ì¬
     *
     * @model name="UNLOCKED"
     */
    public static final DocumentStatus UNLOCKED = new DocumentStatus("UNLOCKED",
            "½âËø×´Ì¬");
} // end DocumentStatus
