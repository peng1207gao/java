package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubSupersel的POJO类
 *
 * @author  duwein  [Tue Jan 21 16:34:14 CST 2014]
 * 
 */
public class PubSupersel implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性pageid
     */
    private String pageid;
	
    /** 
     * 属性paramid
     */
    private String paramid;
	
    /** 
     * 属性paramname
     */
    private String paramname;
	
    /** 
     * 属性issql
     */
    private BigDecimal issql;
	
    /** 
     * 属性sql
     */
    private String sql;
	
    /** 
     * 属性type
     */
    private BigDecimal type;
	
    /** 
     * 属性shortname
     */
    private String shortname;
	
    /**
     * PubSupersel构造函数
     */
    public PubSupersel() {
        super();
    }  
	
    /**
     * PubSupersel完整的构造函数
     */  
    public PubSupersel(String guid){
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
     * 属性 pageid 的get方法
     * @return String
     */
    public String getPageid(){
        return pageid;
    }
	
    /**
     * 属性 pageid 的set方法
     * @return
     */
    public void setPageid(String pageid){
        this.pageid = pageid;
    } 
	
    /**
     * 属性 paramid 的get方法
     * @return String
     */
    public String getParamid(){
        return paramid;
    }
	
    /**
     * 属性 paramid 的set方法
     * @return
     */
    public void setParamid(String paramid){
        this.paramid = paramid;
    } 
	
    /**
     * 属性 paramname 的get方法
     * @return String
     */
    public String getParamname(){
        return paramname;
    }
	
    /**
     * 属性 paramname 的set方法
     * @return
     */
    public void setParamname(String paramname){
        this.paramname = paramname;
    } 
	
    /**
     * 属性 issql 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIssql(){
        return issql;
    }
	
    /**
     * 属性 issql 的set方法
     * @return
     */
    public void setIssql(BigDecimal issql){
        this.issql = issql;
    } 
	
    /**
     * 属性 sql 的get方法
     * @return String
     */
    public String getSql(){
        return sql;
    }
	
    /**
     * 属性 sql 的set方法
     * @return
     */
    public void setSql(String sql){
        this.sql = sql;
    } 
	
    /**
     * 属性 type 的get方法
     * @return BigDecimal
     */
    public BigDecimal getType(){
        return type;
    }
	
    /**
     * 属性 type 的set方法
     * @return
     */
    public void setType(BigDecimal type){
        this.type = type;
    } 
	
    /**
     * 属性 shortname 的get方法
     * @return String
     */
    public String getShortname(){
        return shortname;
    }
	
    /**
     * 属性 shortname 的set方法
     * @return
     */
    public void setShortname(String shortname){
        this.shortname = shortname;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PubSupersel))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubSupersel other = (PubSupersel) o;	        
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
            .append("pageid"+":"+getPageid())
            .append("paramid"+":"+getParamid())
            .append("paramname"+":"+getParamname())
            .append("issql"+":"+getIssql())
            .append("sql"+":"+getSql())
            .append("type"+":"+getType())
            .append("shortname"+":"+getShortname())
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