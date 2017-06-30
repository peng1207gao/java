package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SmsSend的POJO类
 *
 * @author  PETERZHANG  [Mon Nov 11 10:13:16 CST 2013]
 * 
 */
public class SmsSend implements Serializable{

    /** 
     * 属性id
     */
    private BigDecimal id;
	
    /** 
     * 属性orgaddr
     */
    private String orgaddr;
	
    /** 
     * 属性mobile
     */
    private String mobile;
	
    /** 
     * 属性content
     */
    private String content;
	
    /** 
     * 属性flag
     */
    private String flag;
	
    /**
     * SmsSend构造函数
     */
    public SmsSend() {
        super();
    }  
	
    /**
     * SmsSend完整的构造函数
     */  
    public SmsSend(BigDecimal id){
        this.id = id;
    }
 
    /**
     * 属性 id 的get方法
     * @return BigDecimal
     */
    public BigDecimal getId(){
        return id;
    }
	
    /**
     * 属性 id 的set方法
     * @return
     */
    public void setId(BigDecimal id){
        this.id = id;
    } 
	
    /**
     * 属性 orgaddr 的get方法
     * @return String
     */
    public String getOrgaddr(){
        return orgaddr;
    }
	
    /**
     * 属性 orgaddr 的set方法
     * @return
     */
    public void setOrgaddr(String orgaddr){
        this.orgaddr = orgaddr;
    } 
	
    /**
     * 属性 mobile 的get方法
     * @return String
     */
    public String getMobile(){
        return mobile;
    }
	
    /**
     * 属性 mobile 的set方法
     * @return
     */
    public void setMobile(String mobile){
        this.mobile = mobile;
    } 
	
    /**
     * 属性 content 的get方法
     * @return String
     */
    public String getContent(){
        return content;
    }
	
    /**
     * 属性 content 的set方法
     * @return
     */
    public void setContent(String content){
        this.content = content;
    } 
	
    /**
     * 属性 flag 的get方法
     * @return String
     */
    public String getFlag(){
        return flag;
    }
	
    /**
     * 属性 flag 的set方法
     * @return
     */
    public void setFlag(String flag){
        this.flag = flag;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SmsSend))
	        return false; 
			
        if(getId() == null) 
	        return false;

        SmsSend other = (SmsSend) o;	        
	    return new EqualsBuilder()
            .append(this.getId(), other.getId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("id"+":"+getId())
            .append("orgaddr"+":"+getOrgaddr())
            .append("mobile"+":"+getMobile())
            .append("content"+":"+getContent())
            .append("flag"+":"+getFlag())
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