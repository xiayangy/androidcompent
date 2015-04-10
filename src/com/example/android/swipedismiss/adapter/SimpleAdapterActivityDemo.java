/*
 * Copyright 1999-2004 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.example.android.swipedismiss.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import com.example.android.swipedismiss.R;

/**
 * 类SimpleAdapterActivityDemo.java的实现描述：TODO 类实现描述 
 * @author xiayangyang 2015-3-13 下午2:05:10
 */
public class SimpleAdapterActivityDemo extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.simple, new String[] { "title",  "img" }, new int[] { R.id.title, R.id.img });
        setListAdapter(adapter);
    }
    
    private List<Map<String, Object>> getData() {
        //map.put(参数名字,参数值)
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "摩托罗拉");
        map.put("img", R.drawable.ic_launcher);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "诺基亚");
        map.put("img", R.drawable.ic_launcher);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "三星");
        map.put("img", R.drawable.ic_launcher);
        list.add(map);
        return list;
        }  
    
}
