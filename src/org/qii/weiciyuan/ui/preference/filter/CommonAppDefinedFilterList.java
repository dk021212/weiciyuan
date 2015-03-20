package org.qii.weiciyuan.ui.preference.filter;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * User: qii
 * Date: 13-6-17
 */
public class CommonAppDefinedFilterList {
    public static Set<String> getDefinedFilterKeywordAndUserList() {
        Set<String> result = new LinkedHashSet<String>();
        Collections.addAll(result, "ʮ������", "�ɹ�ѧ", "��ת�����й���", "������¼");
        Collections.addAll(result, "������Ů��", "����������", "��ţ��Ů��", "��ţ������",
                "˫����Ů��", "˫��������", "��з��Ů��", "��з������", "ʨ����Ů��", "ʨ��������",
                "��Ů��Ů��", "��Ů������", "�����Ů��", "���������", "Ħ����Ů��", "Ħ��������",
                "ˮƿ��Ů��", "ˮƿ������", "˫����Ů��", "˫��������", "��Ы��Ů��", "��Ы������",
                "������Ů��", "����������");
        Collections.addAll(result, "����Ů", "������", "��ţŮ", "��ţ��",
                "˫��Ů", "˫����", "��зŮ", "��з��", "ʨ��Ů", "ʨ����",
                "��ŮŮ", "��Ů��", "���Ů", "�����", "Ħ��Ů", "Ħ����",
                "ˮƿŮ", "ˮƿ��", "˫��Ů", "˫����", "��ЫŮ", "��Ы��",
                "����Ů", "������");
        return result;
    }

    public static Set<String> getDefinedFilterSourceList() {
        Set<String> result = new LinkedHashSet<String>();
        Collections.addAll(result, "ƤƤʱ���", "������", "������ǩ��");
        return result;
    }
}
