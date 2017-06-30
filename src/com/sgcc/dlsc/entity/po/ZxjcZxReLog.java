package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * ZxjcZxReLog的POJO类
 *
 * @author  Administrator  [Wed Apr 23 10:25:00 CST 2014]
 * 
 */
public class ZxjcZxReLog implements Serializable{

    /** 
     * 属性menuid
     */
    private String menuid;
	
    /** 
     * 属性tableid
     */
    private String tableid;
	
    /** 
     * 属性countnum
     */
    private BigDecimal countnum;
	
    /**
     * ZxjcZxReLog构造函数
     */
    public ZxjcZxReLog() {
        super();
    }  
	
    /**
     * ZxjcZxReLog完整的构造函数
     */  
    public ZxjcZxReLog(String menuid){
        this.menuid = menuid;
    }
 
    /**
     * 属性 menuid 的get方法
     * @return String
     */
    public String getMenuid(){
        return menuid;
    }
	
    /**
     * 属性 menuid 的set方法
     * @return
     */
    public void setMenuid(String menuid){
        if(menuid != null && menuid.trim().length() == 0){
            this.menuid = null;
        }else{
            this.menuid = menuid;
        }
    } 
	
    /**
     * 属性 tableid 的get方法
     * @return String
     */
    public String getTableid(){
        return tableid;
    }
	
    /**
     * 属性 tableid 的set方法
     * @return
     */
    public void setTableid(String tableid){
        this.tableid = tableid;
    } 
	
    /**
     * 属性 countnum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCountnum(){
        return countnum;
    }
	
    /**
     * 属性 countnum 的set方法
     * @return
     */
    public void setCountnum(BigDecimal countnum){
        this.countnum = countnum;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof ZxjcZxReLog))
	        return false; 
			
        if(getMenuid() == null) 
	        return false;

        ZxjcZxReLog other = (ZxjcZxReLog) o;	        
	    return new EqualsBuilder()
            .append(this.getMenuid(), other.getMenuid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("menuid"+":"+getMenuid())
            .append("tableid"+":"+getTableid())
            .append("countnum"+":"+getCountnum())
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