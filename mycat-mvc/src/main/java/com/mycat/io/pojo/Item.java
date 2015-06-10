/**
 * 
 */
package com.mycat.io.pojo;

import java.io.Serializable;

/**
 * @author karlhell
 *
 */
public class Item implements Serializable {
    private static final long serialVersionUID = 3390950377637934916L;
    
    private String id;
    private String image;
    private String title;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}
