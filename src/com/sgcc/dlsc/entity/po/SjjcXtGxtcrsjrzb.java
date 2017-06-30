package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcXtGxtcrsjrzb的POJO类
 *
 * @author  liang  [Sun Mar 16 15:35:07 CST 2014]
 * 
 */
public class SjjcXtGxtcrsjrzb implements Serializable{

    /** 
     * 属性objId
     */
    private String objId;
	
    /** 
     * 属性inTableName
     */
    private String inTableName;
	
    /** 
     * 属性inType
     */
    private String inType;
	
    /** 
     * 属性inDate
     */
    private Date inDate;
	
    /** 
     * 属性provincename
     */
    private String provincename;
	
    /** 
     * 属性areaname
     */
    private String areaname;
	
    /** 
     * 属性theyear
     */
    private String theyear;
	
    /** 
     * 属性themonth
     */
    private String themonth;
	
    /** 
     * 属性theday
     */
    private String theday;
	
    /** 
     * 属性thehour
     */
    private String thehour;
	
    /** 
     * 属性theminute
     */
    private String theminute;
	
    /** 
     * 属性thesecond
     */
    private String thesecond;
	
    /** 
     * 属性datavaluekey
     */
    private String datavaluekey;
	
    /** 
     * 属性dataStatus
     */
    private String dataStatus;
	
    /** 
     * 属性dataSourse
     */
    private BigDecimal dataSourse;
	
    /**
     * SjjcXtGxtcrsjrzb构造函数
     */
    public SjjcXtGxtcrsjrzb() {
        super();
    }  
	
    /**
     * SjjcXtGxtcrsjrzb完整的构造函数
     */  
    public SjjcXtGxtcrsjrzb(String objId,String inTableName,String inType,Date inDate,BigDecimal dataSourse){
        this.objId = objId;
        this.inTableName = inTableName;
        this.inType = inType;
        this.inDate = inDate;
        this.dataSourse = dataSourse;
    }
 
    /**
     * 属性 objId 的get方法
     * @return String
     */
    public String getObjId(){
        return objId;
    }
	
    /**
     * 属性 objId 的set方法
     * @return
     */
    public void setObjId(String objId){
        if(objId != null && objId.trim().length() == 0){
            this.objId = null;
        }else{
            this.objId = objId;
        }
    } 
	
    /**
     * 属性 inTableName 的get方法
     * @return String
     */
    public String getInTableName(){
        return inTableName;
    }
	
    /**
     * 属性 inTableName 的set方法
     * @return
     */
    public void setInTableName(String inTableName){
        this.inTableName = inTableName;
    } 
	
    /**
     * 属性 inType 的get方法
     * @return String
     */
    public String getInType(){
        return inType;
    }
	
    /**
     * 属性 inType 的set方法
     * @return
     */
    public void setInType(String inType){
        this.inType = inType;
    } 
	
    /**
     * 属性 inDate 的get方法
     * @return Date
     */
    public Date getInDate(){
        return inDate;
    }
	
    /**
     * 属性 inDate 的set方法
     * @return
     */
    public void setInDate(Date inDate){
        this.inDate = inDate;
    } 
	
    /**
     * 属性 provincename 的get方法
     * @return String
     */
    public String getProvincename(){
        return provincename;
    }
	
    /**
     * 属性 provincename 的set方法
     * @return
     */
    public void setProvincename(String provincename){
        this.provincename = provincename;
    } 
	
    /**
     * 属性 areaname 的get方法
     * @return String
     */
    public String getAreaname(){
        return areaname;
    }
	
    /**
     * 属性 areaname 的set方法
     * @return
     */
    public void setAreaname(String areaname){
        this.areaname = areaname;
    } 
	
    /**
     * 属性 theyear 的get方法
     * @return String
     */
    public String getTheyear(){
        return theyear;
    }
	
    /**
     * 属性 theyear 的set方法
     * @return
     */
    public void setTheyear(String theyear){
        this.theyear = theyear;
    } 
	
    /**
     * 属性 themonth 的get方法
     * @return String
     */
    public String getThemonth(){
        return themonth;
    }
	
    /**
     * 属性 themonth 的set方法
     * @return
     */
    public void setThemonth(String themonth){
        this.themonth = themonth;
    } 
	
    /**
     * 属性 theday 的get方法
     * @return String
     */
    public String getTheday(){
        return theday;
    }
	
    /**
     * 属性 theday 的set方法
     * @return
     */
    public void setTheday(String theday){
        this.theday = theday;
    } 
	
    /**
     * 属性 thehour 的get方法
     * @return String
     */
    public String getThehour(){
        return thehour;
    }
	
    /**
     * 属性 thehour 的set方法
     * @return
     */
    public void setThehour(String thehour){
        this.thehour = thehour;
    } 
	
    /**
     * 属性 theminute 的get方法
     * @return String
     */
    public String getTheminute(){
        return theminute;
    }
	
    /**
     * 属性 theminute 的set方法
     * @return
     */
    public void setTheminute(String theminute){
        this.theminute = theminute;
    } 
	
    /**
     * 属性 thesecond 的get方法
     * @return String
     */
    public String getThesecond(){
        return thesecond;
    }
	
    /**
     * 属性 thesecond 的set方法
     * @return
     */
    public void setThesecond(String thesecond){
        this.thesecond = thesecond;
    } 
	
    /**
     * 属性 datavaluekey 的get方法
     * @return String
     */
    public String getDatavaluekey(){
        return datavaluekey;
    }
	
    /**
     * 属性 datavaluekey 的set方法
     * @return
     */
    public void setDatavaluekey(String datavaluekey){
        this.datavaluekey = datavaluekey;
    } 
	
    /**
     * 属性 dataStatus 的get方法
     * @return String
     */
    public String getDataStatus(){
        return dataStatus;
    }
	
    /**
     * 属性 dataStatus 的set方法
     * @return
     */
    public void setDataStatus(String dataStatus){
        this.dataStatus = dataStatus;
    } 
	
    /**
     * 属性 dataSourse 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDataSourse(){
        return dataSourse;
    }
	
    /**
     * 属性 dataSourse 的set方法
     * @return
     */
    public void setDataSourse(BigDecimal dataSourse){
        this.dataSourse = dataSourse;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcXtGxtcrsjrzb))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcXtGxtcrsjrzb other = (SjjcXtGxtcrsjrzb) o;	        
	    return new EqualsBuilder()
            .append(this.getObjId(), other.getObjId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("objId"+":"+getObjId())
            .append("inTableName"+":"+getInTableName())
            .append("inType"+":"+getInType())
            .append("inDate"+":"+getInDate())
            .append("provincename"+":"+getProvincename())
            .append("areaname"+":"+getAreaname())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("theday"+":"+getTheday())
            .append("thehour"+":"+getThehour())
            .append("theminute"+":"+getTheminute())
            .append("thesecond"+":"+getThesecond())
            .append("datavaluekey"+":"+getDatavaluekey())
            .append("dataStatus"+":"+getDataStatus())
            .append("dataSourse"+":"+getDataSourse())
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