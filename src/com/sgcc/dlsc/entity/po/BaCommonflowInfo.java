package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaCommonflowInfo的POJO类
 *
 * @author  zhangpei  [Sat Feb 15 20:21:13 CST 2014]
 * 
 */
public class BaCommonflowInfo implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性businessid
     */
    private String businessid;
	
    /** 
     * 属性readurl
     */
    private String readurl;
	
    /** 
     * 属性editurl
     */
    private String editurl;
	
    /** 
     * 属性endfunction
     */
    private String endfunction;
	
    /** 
     * 属性superlinkname
     */
    private String superlinkname;
	
    /**
     * BaCommonflowInfo构造函数
     */
    public BaCommonflowInfo() {
        super();
    }  
	
    /**
     * BaCommonflowInfo完整的构造函数
     */  
    public BaCommonflowInfo(String guid){
        this.guid = guid;
    }
 
    /**
     * 属性 guid 的get方法
     * @return String
     */
    public String getGuid(){
        return guid;
    }
	
    /**
     * 属性 guid 的set方法
     * @return
     */
    public void setGuid(String guid){
        if(guid != null && guid.trim().length() == 0){
            this.guid = null;
        }else{
            this.guid = guid;
        }
    } 
	
    /**
     * 属性 businessid 的get方法
     * @return String
     */
    public String getBusinessid(){
        return businessid;
    }
	
    /**
     * 属性 businessid 的set方法
     * @return
     */
    public void setBusinessid(String businessid){
        this.businessid = businessid;
    } 
	
    /**
     * 属性 readurl 的get方法
     * @return String
     */
    public String getReadurl(){
        return readurl;
    }
	
    /**
     * 属性 readurl 的set方法
     * @return
     */
    public void setReadurl(String readurl){
        this.readurl = readurl;
    } 
	
    /**
     * 属性 editurl 的get方法
     * @return String
     */
    public String getEditurl(){
        return editurl;
    }
	
    /**
     * 属性 editurl 的set方法
     * @return
     */
    public void setEditurl(String editurl){
        this.editurl = editurl;
    } 
	
    /**
     * 属性 endfunction 的get方法
     * @return String
     */
    public String getEndfunction(){
        return endfunction;
    }
	
    /**
     * 属性 endfunction 的set方法
     * @return
     */
    public void setEndfunction(String endfunction){
        this.endfunction = endfunction;
    } 
	
    /**
     * 属性 superlinkname 的get方法
     * @return String
     */
    public String getSuperlinkname(){
        return superlinkname;
    }
	
    /**
     * 属性 superlinkname 的set方法
     * @return
     */
    public void setSuperlinkname(String superlinkname){
        this.superlinkname = superlinkname;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaCommonflowInfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaCommonflowInfo other = (BaCommonflowInfo) o;	        
	    return new EqualsBuilder()
            .append(this.getGuid(), other.getGuid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("guid"+":"+getGuid())
            .append("businessid"+":"+getBusinessid())
            .append("readurl"+":"+getReadurl())
            .append("editurl"+":"+getEditurl())
            .append("endfunction"+":"+getEndfunction())
            .append("superlinkname"+":"+getSuperlinkname())
            .toString(); 
			
    } 
   

    /**
     * hashcode方法
     * @return int
     * 
     */
    @Override
    public int hashCode(){
		return super.hashCode();
	}

}