/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 对象关联配置枚举对象 Generate date 2011-09-22 10:22:35
 *
 * @author kylin
 *
 * @model
 */
public class ObjectRelationConfigTypeEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new ObjectRelationConfigTypeEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected ObjectRelationConfigTypeEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end ObjectRelationConfigTypeEnum()

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
    public static ObjectRelationConfigTypeEnum getEnum(String arg0) {
        return (ObjectRelationConfigTypeEnum) enumValueMap.get(arg0);
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
     * 关联操作
     *
     * @model name="RELATED_OPERATION"
     */
    public static final ObjectRelationConfigTypeEnum RELATED_OPERATION = new ObjectRelationConfigTypeEnum("RELATED_OPERATION",
            "关联操作");

    /**
     * 关联显示
     *
     * @model name="RELATED_VIEW"
     */
    public static final ObjectRelationConfigTypeEnum RELATED_VIEW = new ObjectRelationConfigTypeEnum("RELATED_VIEW",
            "关联显示");
} // end ObjectRelationConfigTypeEnum
