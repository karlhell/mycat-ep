/**
 * 
 */
package com.mycat.io.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.mycat.io.pojo.Item;
import com.mycat.io.service.SampleService;

/**
 * @author karlhell
 *
 */
@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public List<Item> getHelloMessage() {
        return createItem();
    }
    
    private List<Item> createItem(){
        List<Item> itemList = Lists.newArrayList();
        
        for(int i=1; i<=12; i++){
            Item item = new Item();
            item.setId(i+"");
            item.setImage("images/gallery/gallery-item"+i+".jpg");
            item.setTitle("商品"+i);
            itemList.add(item);
        }
        
        return itemList;
    }
    
}
