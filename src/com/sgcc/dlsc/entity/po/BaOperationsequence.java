package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaOperationsequence的POJO类
 *
 * @author  Administrator  [Wed Oct 23 15:15:29 CST 2013]
 * 
 */
public class BaOperationsequence implements Serializable{

    /** 
     * 属性sequenceid
     */
    private String sequenceid;
	
    /** 
     * 属性sequencename
     */
    private String sequencename;
	
    /** 
     * 属性modul
     */
    private String modul;
	
    /** 
     * 属性flowid
     */
    private String flowid;
	
    /** 
     * 属性operatetime
     */
    private Date operatetime;
	
    /** 
     * 属性operateuserid
     */
    private String operateuserid;
	
    /** 
     * 属性organcode
     */
    private String organcode;
	
    /** 
     * 属性edition
     */
    private String edition;
	
    /** 
     * 属性modulename
     */
    private String modulename;
	
    /**
     * BaOperationsequence构造函数
     */
    public BaOperationsequence() {
        super();
    }  
	
    /**
     * BaOperationsequence完整的构造函数
     */  
    public BaOperationsequence(String sequenceid){
        this.sequenceid = sequenceid;
    }
 
    /**
     * 属性 sequenceid 的get方法
     * @return String
     */
    public String getSequenceid(){
        return sequenceid;
    }
	
    /**
     * 属性 sequenceid 的set方法
     * @return
     */
    public void setSequenceid(String sequenceid){
        if(sequenceid != null && sequenceid.trim().length() == 0){
            this.sequenceid = null;
        }else{
            this.sequenceid = sequenceid;
        }
    } 
	
    /**
     * 属性 sequencename 的get方法
     * @return String
     */
    public String getSequencename(){
        return sequencename;
    }
	
    /**
     * 属性 sequencename 的set方法
     * @return
     */
    public void setSequencename(String sequencename){
        this.sequencename = sequencename;
    } 
	
    /**
     * 属性 modul 的get方法
     * @return String
     */
    public String getModul(){
        return modul;
    }
	
    /**
     * 属性 modul 的set方法
     * @return
     */
    public void setModul(String modul){
        this.modul = modul;
    } 
	
    /**
     * 属性 flowid 的get方法
     * @return String
     */
    public String getFlowid(){
        return flowid;
    }
	
    /**
     * 属性 flowid 的set方法
     * @return
     */
    public void setFlowid(String flowid){
        this.flowid = flowid;
    } 
	
    /**
     * 属性 operatetime 的get方法
     * @return Date
     */
    public Date getOperatetime(){
        return operatetime;
    }
	
    /**
     * 属性 operatetime 的set方法
     * @return
     */
    public void setOperatetime(Date operatetime){
        this.operatetime = operatetime;
    } 
	
    /**
     * 属性 operateuserid 的get方法
     * @return String
     */
    public String getOperateuserid(){
        return operateuserid;
    }
	
    /**
     * 属性 operateuserid 的set方法
     * @return
     */
    public void setOperateuserid(String operateuserid){
        this.operateuserid = operateuserid;
    } 
	
    /**
     * 属性 organcode 的get方法
     * @return String
     */
    public String getOrgancode(){
        return organcode;
    }
	
    /**
     * 属性 organcode 的set方法
     * @return
     */
    public void setOrgancode(String organcode){
        this.organcode = organcode;
    } 
	
    /**
     * 属性 edition 的get方法
     * @return String
     */
    public String getEdition(){
        return edition;
    }
	
    /**
     * 属性 edition 的set方法
     * @return
     */
    public void setEdition(String edition){
        this.edition = edition;
    } 
	
    /**
     * 属性 modulename 的get方法
     * @return String
     */
    public String getModulename(){
        return modulename;
    }
	
    /**
     * 属性 modulename 的set方法
     * @return
     */
    public void setModulename(String modulename){
        this.modulename = modulename;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaOperationsequence))
	        return false; 
			
        if(getSequenceid() == null) 
	        return false;

        BaOperationsequence other = (BaOperationsequence) o;	        
	    return new EqualsBuilder()
            .append(this.getSequenceid(), other.getSequenceid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("sequenceid"+":"+getSequenceid())
            .append("sequencename"+":"+getSequencename())
            .append("modul"+":"+getModul())
            .append("flowid"+":"+getFlowid())
            .append("operatetime"+":"+getOperatetime())
            .append("operateuserid"+":"+getOperateuserid())
            .append("organcode"+":"+getOrgancode())
            .append("edition"+":"+getEdition())
            .append("modulename"+":"+getModulename())
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