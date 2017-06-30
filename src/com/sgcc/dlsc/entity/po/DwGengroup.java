package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwGengroup的POJO类
 *
 * @author  eveliy  [Tue Mar 11 18:58:05 CST 2014]
 * 
 */
public class DwGengroup implements Serializable{

    /** 
     * 属性gengroupid
     */
    private String gengroupid;
	
    /** 
     * 属性gengroupname
     */
    private String gengroupname;
	
    /** 
     * 属性gengroupdescr
     */
    private String gengroupdescr;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * DwGengroup构造函数
     */
    public DwGengroup() {
        super();
    }  
	
    /**
     * DwGengroup完整的构造函数
     */  
    public DwGengroup(String gengroupid,String gengroupname){
        this.gengroupid = gengroupid;
        this.gengroupname = gengroupname;
    }
 
    /**
     * 属性 gengroupid 的get方法
     * @return String
     */
    public String getGengroupid(){
        return gengroupid;
    }
	
    /**
     * 属性 gengroupid 的set方法
     * @return
     */
    public void setGengroupid(String gengroupid){
        if(gengroupid != null && gengroupid.trim().length() == 0){
            this.gengroupid = null;
        }else{
            this.gengroupid = gengroupid;
        }
    } 
	
    /**
     * 属性 gengroupname 的get方法
     * @return String
     */
    public String getGengroupname(){
        return gengroupname;
    }
	
    /**
     * 属性 gengroupname 的set方法
     * @return
     */
    public void setGengroupname(String gengroupname){
        this.gengroupname = gengroupname;
    } 
	
    /**
     * 属性 gengroupdescr 的get方法
     * @return String
     */
    public String getGengroupdescr(){
        return gengroupdescr;
    }
	
    /**
     * 属性 gengroupdescr 的set方法
     * @return
     */
    public void setGengroupdescr(String gengroupdescr){
        this.gengroupdescr = gengroupdescr;
    } 
	
    /**
     * 属性 marketid 的get方法
     * @return String
     */
    public String getMarketid(){
        return marketid;
    }
	
    /**
     * 属性 marketid 的set方法
     * @return
     */
    public void setMarketid(String marketid){
        this.marketid = marketid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwGengroup))
	        return false; 
			
        if(getGengroupid() == null) 
	        return false;

        DwGengroup other = (DwGengroup) o;	        
	    return new EqualsBuilder()
            .append(this.getGengroupid(), other.getGengroupid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("gengroupid"+":"+getGengroupid())
            .append("gengroupname"+":"+getGengroupname())
            .append("gengroupdescr"+":"+getGengroupdescr())
            .append("marketid"+":"+getMarketid())
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