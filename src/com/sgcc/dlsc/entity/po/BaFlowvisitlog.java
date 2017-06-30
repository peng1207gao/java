package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaFlowvisitlog的POJO类
 *
 * @author  Administrator  [Fri Nov 08 08:49:43 CST 2013]
 * 
 */
public class BaFlowvisitlog implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性businessid
     */
    private String businessid;
	
    /** 
     * 属性processinstname
     */
    private String processinstname;
	
    /** 
     * 属性workitemid
     */
    private BigDecimal workitemid;
	
    /** 
     * 属性workitemname
     */
    private String workitemname;
	
    /** 
     * 属性processdefid
     */
    private String processdefid;
	
    /** 
     * 属性processchname
     */
    private String processchname;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性username
     */
    private String username;
	
    /** 
     * 属性userid
     */
    private String userid;
	
    /** 
     * 属性visittime
     */
    private String visittime;
	
    /** 
     * 属性note
     */
    private String note;
	
    /** 
     * 属性etc1
     */
    private String etc1;
	
    /** 
     * 属性etc2
     */
    private String etc2;
	
    /** 
     * 属性etc3
     */
    private String etc3;
	
    /**
     * BaFlowvisitlog构造函数
     */
    public BaFlowvisitlog() {
        super();
    }  
	
    /**
     * BaFlowvisitlog完整的构造函数
     */  
    public BaFlowvisitlog(String guid){
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
     * 属性 processinstname 的get方法
     * @return String
     */
    public String getProcessinstname(){
        return processinstname;
    }
	
    /**
     * 属性 processinstname 的set方法
     * @return
     */
    public void setProcessinstname(String processinstname){
        this.processinstname = processinstname;
    } 
	
	
	
    /**
     * 属性 workitemid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWorkitemid(){
        return workitemid;
    }
	
    /**
     * 属性 workitemid 的set方法
     * @return
     */
    public void setWorkitemid(BigDecimal workitemid){
        this.workitemid = workitemid;
    } 
	
	
	
    /**
     * 属性 workitemname 的get方法
     * @return String
     */
    public String getWorkitemname(){
        return workitemname;
    }
	
    /**
     * 属性 workitemname 的set方法
     * @return
     */
    public void setWorkitemname(String workitemname){
        this.workitemname = workitemname;
    } 
	
	
	
    /**
     * 属性 processdefid 的get方法
     * @return String
     */
    public String getProcessdefid(){
        return processdefid;
    }
	
    /**
     * 属性 processdefid 的set方法
     * @return
     */
    public void setProcessdefid(String processdefid){
        this.processdefid = processdefid;
    } 
	
	
	
    /**
     * 属性 processchname 的get方法
     * @return String
     */
    public String getProcesschname(){
        return processchname;
    }
	
    /**
     * 属性 processchname 的set方法
     * @return
     */
    public void setProcesschname(String processchname){
        this.processchname = processchname;
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
     * 属性 username 的get方法
     * @return String
     */
    public String getUsername(){
        return username;
    }
	
    /**
     * 属性 username 的set方法
     * @return
     */
    public void setUsername(String username){
        this.username = username;
    } 
	
	
	
    /**
     * 属性 userid 的get方法
     * @return String
     */
    public String getUserid(){
        return userid;
    }
	
    /**
     * 属性 userid 的set方法
     * @return
     */
    public void setUserid(String userid){
        this.userid = userid;
    } 
	
	
	
    /**
     * 属性 visittime 的get方法
     * @return String
     */
    public String getVisittime(){
        return visittime;
    }
	
    /**
     * 属性 visittime 的set方法
     * @return
     */
    public void setVisittime(String visittime){
        this.visittime = visittime;
    } 
	
	
	
    /**
     * 属性 note 的get方法
     * @return String
     */
    public String getNote(){
        return note;
    }
	
    /**
     * 属性 note 的set方法
     * @return
     */
    public void setNote(String note){
        this.note = note;
    } 
	
	
	
    /**
     * 属性 etc1 的get方法
     * @return String
     */
    public String getEtc1(){
        return etc1;
    }
	
    /**
     * 属性 etc1 的set方法
     * @return
     */
    public void setEtc1(String etc1){
        this.etc1 = etc1;
    } 
	
	
	
    /**
     * 属性 etc2 的get方法
     * @return String
     */
    public String getEtc2(){
        return etc2;
    }
	
    /**
     * 属性 etc2 的set方法
     * @return
     */
    public void setEtc2(String etc2){
        this.etc2 = etc2;
    } 
	
	
	
    /**
     * 属性 etc3 的get方法
     * @return String
     */
    public String getEtc3(){
        return etc3;
    }
	
    /**
     * 属性 etc3 的set方法
     * @return
     */
    public void setEtc3(String etc3){
        this.etc3 = etc3;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaFlowvisitlog))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaFlowvisitlog other = (BaFlowvisitlog) o;	        
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
            .append("processinstname"+":"+getProcessinstname())
            .append("workitemid"+":"+getWorkitemid())
            .append("workitemname"+":"+getWorkitemname())
            .append("processdefid"+":"+getProcessdefid())
            .append("processchname"+":"+getProcesschname())
            .append("marketid"+":"+getMarketid())
            .append("username"+":"+getUsername())
            .append("userid"+":"+getUserid())
            .append("visittime"+":"+getVisittime())
            .append("note"+":"+getNote())
            .append("etc1"+":"+getEtc1())
            .append("etc2"+":"+getEtc2())
            .append("etc3"+":"+getEtc3())
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