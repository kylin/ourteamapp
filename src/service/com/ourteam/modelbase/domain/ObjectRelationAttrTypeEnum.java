/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 对象关联属性类型枚举 Generate date 2011-09-22 10:22:35
 *
 * @author kylin
 *
 * @model
 */
public class ObjectRelationAttrTypeEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new ObjectRelationAttrTypeEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected ObjectRelationAttrTypeEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end ObjectRelationAttrTypeEnum()

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
    public static ObjectRelationAttrTypeEnum getEnum(String arg0) {
        return (ObjectRelationAttrTypeEnum) enumValueMap.get(arg0);
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
     * 映射
     *
     * @model name="MAPPED"
     */
    public static final ObjectRelationAttrTypeEnum MAPPED = new ObjectRelationAttrTypeEnum("MAPPED",
            "映射");

    /**
     * 关联
     *
     * @model name="RELATED"
     */
    public static final ObjectRelationAttrTypeEnum RELATED = new ObjectRelationAttrTypeEnum("RELATED",
            "关联");
} // end ObjectRelationAttrTypeEnum
