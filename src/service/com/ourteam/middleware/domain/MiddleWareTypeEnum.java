/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 中间件类型枚举 Generate date 2011-12-06 09:40:59
 *
 * @author kylin
 *
 * @model
 */
public class MiddleWareTypeEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new MiddleWareTypeEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected MiddleWareTypeEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end MiddleWareTypeEnum()

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
    public static MiddleWareTypeEnum getEnum(String arg0) {
        return (MiddleWareTypeEnum) enumValueMap.get(arg0);
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
     * @model name="APPLICATION_SERVER"
     */
    public static final MiddleWareTypeEnum APPLICATION_SERVER = new MiddleWareTypeEnum("APPLICATION_SERVER",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="CVS_SERVER"
     */
    public static final MiddleWareTypeEnum CVS_SERVER = new MiddleWareTypeEnum("CVS_SERVER",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="DATABASE_SERVER"
     */
    public static final MiddleWareTypeEnum DATABASE_SERVER = new MiddleWareTypeEnum("DATABASE_SERVER",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="SVN_SERVER"
     */
    public static final MiddleWareTypeEnum SVN_SERVER = new MiddleWareTypeEnum("SVN_SERVER",
            "");
} // end MiddleWareTypeEnum
