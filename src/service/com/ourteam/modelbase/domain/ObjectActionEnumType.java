/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * ������ö������ Generate date 2011-09-22 10:22:33
 *
 * @author kylin
 *
 * @model
 */
public class ObjectActionEnumType extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new ObjectActionEnumType object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected ObjectActionEnumType(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end ObjectActionEnumType()

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
    public static ObjectActionEnumType getEnum(String arg0) {
        return (ObjectActionEnumType) enumValueMap.get(arg0);
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
     * ����
     *
     * @model name="CREATE"
     */
    public static final ObjectActionEnumType CREATE = new ObjectActionEnumType("create",
            "����");

    /**
     * ɾ��
     *
     * @model name="DELETE"
     */
    public static final ObjectActionEnumType DELETE = new ObjectActionEnumType("delete",
            "ɾ��");

    /**
     * �޸�
     *
     * @model name="UPDATE"
     */
    public static final ObjectActionEnumType UPDATE = new ObjectActionEnumType("update",
            "�޸�");

    /**
     * ��ѯ
     *
     * @model name="QUERY"
     */
    public static final ObjectActionEnumType QUERY = new ObjectActionEnumType("query",
            "��ѯ");
} // end ObjectActionEnumType