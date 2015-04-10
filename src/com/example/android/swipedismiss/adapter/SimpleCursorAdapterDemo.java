/*
 * Copyright 1999-2004 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.example.android.swipedismiss.adapter;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts.People;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

/**
 * 类SimpleCursorAdapterDemo.java的实现描述：TODO 类实现描述 
 * @author xiayangyang 2015-3-13 下午3:12:53
 */
@SuppressWarnings("deprecation")
public class SimpleCursorAdapterDemo extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //获得一个指向系统通讯录数据库的Cursor对象获得数据来源
        Cursor cur = getContentResolver().query(People.CONTENT_URI, null, null, null, null);
        startManagingCursor(cur);
        //实例化列表适配器
        
        ListAdapter adapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1, cur, new String[] {People.NAME}, new int[] {android.R.id.text1});
        setListAdapter(adapter);
    }
}