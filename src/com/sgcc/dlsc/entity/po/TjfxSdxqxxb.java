package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxSdxqxxb的POJO类
 *
 * @author  GZHASUS  [Wed Jul 23 08:58:57 CST 2014]
 * 
 */
public class TjfxSdxqxxb implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性xqkssj
     */
    private Date xqkssj;
	
    /** 
     * 属性xqjssj
     */
    private Date xqjssj;
	
    /** 
     * 属性xqmc
     */
    private String xqmc;
	
    /** 
     * 属性remark
     */
    private String remark;
	
    /**
     * TjfxSdxqxxb构造函数
     */
    public TjfxSdxqxxb() {
        super();
    }  
	
    /**
     * TjfxSdxqxxb完整的构造函数
     */  
    public TjfxSdxqxxb(String guid){
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
     * 属性 xqkssj 的get方法
     * @return Date
     */
    public Date getXqkssj(){
        return xqkssj;
    }
	
    /**
     * 属性 xqkssj 的set方法
     * @return
     */
    public void setXqkssj(Date xqkssj){
        this.xqkssj = xqkssj;
    } 
	
    /**
     * 属性 xqjssj 的get方法
     * @return Date
     */
    public Date getXqjssj(){
        return xqjssj;
    }
	
    /**
     * 属性 xqjssj 的set方法
     * @return
     */
    public void setXqjssj(Date xqjssj){
        this.xqjssj = xqjssj;
    } 
	
    /**
     * 属性 xqmc 的get方法
     * @return String
     */
    public String getXqmc(){
        return xqmc;
    }
	
    /**
     * 属性 xqmc 的set方法
     * @return
     */
    public void setXqmc(String xqmc){
        this.xqmc = xqmc;
    } 
	
    /**
     * 属性 remark 的get方法
     * @return String
     */
    public String getRemark(){
        return remark;
    }
	
    /**
     * 属性 remark 的set方法
     * @return
     */
    public void setRemark(String remark){
        this.remark = remark;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjfxSdxqxxb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxSdxqxxb other = (TjfxSdxqxxb) o;	        
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
            .append("xqkssj"+":"+getXqkssj())
            .append("xqjssj"+":"+getXqjssj())
            .append("xqmc"+":"+getXqmc())
            .append("remark"+":"+getRemark())
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