/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * ���������ϵ����ö�� Generate date 2011-09-22 10:22:35
 *
 * @author kylin
 *
 * @model
 */
public class ObjectRelationTypeEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new ObjectRelationTypeEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected ObjectRelationTypeEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end ObjectRelationTypeEnum()

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
    public static ObjectRelationTypeEnum getEnum(String arg0) {
        return (ObjectRelationTypeEnum) enumValueMap.get(arg0);
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
     * ����������ϵ
     *
     * @model name="RELATED_OPERATION"
     */
    public static final ObjectRelationTypeEnum RELATED_OPERATION = new ObjectRelationTypeEnum("RELATED_OPERATION",
            "����������ϵ");

    /**
     * ��չ��ϵ
     *
     * @model name="EXTEND"
     */
    public static final ObjectRelationTypeEnum EXTEND = new ObjectRelationTypeEnum("EXTEND",
            "��չ��ϵ");

    /**
     * ӳ���ϵ
     *
     * @model name="MAPPED"
     */
    public static final ObjectRelationTypeEnum MAPPED = new ObjectRelationTypeEnum("MAPPED",
            "ӳ���ϵ");

    /**
     * ��Ϲ�ϵ
     *
     * @model name="COMPOUNDED"
     */
    public static final ObjectRelationTypeEnum COMPOUNDED = new ObjectRelationTypeEnum("COMPOUNDED",
            "��Ϲ�ϵ");

    /**
     * ������ϵ
     *
     * @model name="DEPENDED"
     */
    public static final ObjectRelationTypeEnum DEPENDED = new ObjectRelationTypeEnum("DEPENDED",
            "������ϵ");

    /**
     * ������ʾ��ϵ
     *
     * @model name="RELATED_VIEW"
     */
    public static final ObjectRelationTypeEnum RELATED_VIEW = new ObjectRelationTypeEnum("RELATED_VIEW",
            "������ʾ��ϵ");

    /**
     * ����
     *
     * @model name="REFERENCE"
     */
    public static final ObjectRelationTypeEnum REFERENCE = new ObjectRelationTypeEnum("REFERENCE",
            "����");
} // end ObjectRelationTypeEnum
