/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-10-31 10:43:40
 *
 * @author kylin
 *
 * @model
 */
public class EmployeeStatusEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new EmployeeStatusEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected EmployeeStatusEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end EmployeeStatusEnum()

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
    public static EmployeeStatusEnum getEnum(String arg0) {
        return (EmployeeStatusEnum) enumValueMap.get(arg0);
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
     * @model name="DIMISSION"
     */
    public static final EmployeeStatusEnum DIMISSION = new EmployeeStatusEnum("dimission",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="INCUMBENCY"
     */
    public static final EmployeeStatusEnum INCUMBENCY = new EmployeeStatusEnum("incumbency",
            "");
} // end EmployeeStatusEnum
