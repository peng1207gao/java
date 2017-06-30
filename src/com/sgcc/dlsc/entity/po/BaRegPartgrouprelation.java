package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaRegPartgrouprelation的POJO类
 *
 * @author  zhangpei  [Mon May 26 17:52:55 CST 2014]
 * 
 */
public class BaRegPartgrouprelation implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
    /** 
     * 属性gengroupid
     */
    private String gengroupid;
	
    /** 
     * 属性sharepercent
     */
    private BigDecimal sharepercent;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性operatedate
     */
    private Date operatedate;
	
    /** 
     * 属性operator
     */
    private String operator;
	
    /** 
     * 属性extend1
     */
    private String extend1;
	
    /** 
     * 属性extend2
     */
    private String extend2;
	
    /** 
     * 属性businessid
     */
    private String businessid;
	
    /**
     * BaRegPartgrouprelation构造函数
     */
    public BaRegPartgrouprelation() {
        super();
    }  
	
    /**
     * BaRegPartgrouprelation完整的构造函数
     */  
    public BaRegPartgrouprelation(String guid,String participantid,String gengroupid,Date starteffectivedate){
        this.guid = guid;
        this.participantid = participantid;
        this.gengroupid = gengroupid;
        this.starteffectivedate = starteffectivedate;
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
     * 属性 participantid 的get方法
     * @return String
     */
    public String getParticipantid(){
        return participantid;
    }
	
    /**
     * 属性 participantid 的set方法
     * @return
     */
    public void setParticipantid(String participantid){
        this.participantid = participantid;
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
        this.gengroupid = gengroupid;
    } 
	
    /**
     * 属性 sharepercent 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSharepercent(){
        return sharepercent;
    }
	
    /**
     * 属性 sharepercent 的set方法
     * @return
     */
    public void setSharepercent(BigDecimal sharepercent){
        this.sharepercent = sharepercent;
    } 
	
    /**
     * 属性 starteffectivedate 的get方法
     * @return Date
     */
    public Date getStarteffectivedate(){
        return starteffectivedate;
    }
	
    /**
     * 属性 starteffectivedate 的set方法
     * @return
     */
    public void setStarteffectivedate(Date starteffectivedate){
        this.starteffectivedate = starteffectivedate;
    } 
	
    /**
     * 属性 endeffectivedate 的get方法
     * @return Date
     */
    public Date getEndeffectivedate(){
        return endeffectivedate;
    }
	
    /**
     * 属性 endeffectivedate 的set方法
     * @return
     */
    public void setEndeffectivedate(Date endeffectivedate){
        this.endeffectivedate = endeffectivedate;
    } 
	
    /**
     * 属性 updatetime 的get方法
     * @return Date
     */
    public Date getUpdatetime(){
        return updatetime;
    }
	
    /**
     * 属性 updatetime 的set方法
     * @return
     */
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
    } 
	
    /**
     * 属性 updatepersonid 的get方法
     * @return String
     */
    public String getUpdatepersonid(){
        return updatepersonid;
    }
	
    /**
     * 属性 updatepersonid 的set方法
     * @return
     */
    public void setUpdatepersonid(String updatepersonid){
        this.updatepersonid = updatepersonid;
    } 
	
    /**
     * 属性 operatedate 的get方法
     * @return Date
     */
    public Date getOperatedate(){
        return operatedate;
    }
	
    /**
     * 属性 operatedate 的set方法
     * @return
     */
    public void setOperatedate(Date operatedate){
        this.operatedate = operatedate;
    } 
	
    /**
     * 属性 operator 的get方法
     * @return String
     */
    public String getOperator(){
        return operator;
    }
	
    /**
     * 属性 operator 的set方法
     * @return
     */
    public void setOperator(String operator){
        this.operator = operator;
    } 
	
    /**
     * 属性 extend1 的get方法
     * @return String
     */
    public String getExtend1(){
        return extend1;
    }
	
    /**
     * 属性 extend1 的set方法
     * @return
     */
    public void setExtend1(String extend1){
        this.extend1 = extend1;
    } 
	
    /**
     * 属性 extend2 的get方法
     * @return String
     */
    public String getExtend2(){
        return extend2;
    }
	
    /**
     * 属性 extend2 的set方法
     * @return
     */
    public void setExtend2(String extend2){
        this.extend2 = extend2;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaRegPartgrouprelation))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaRegPartgrouprelation other = (BaRegPartgrouprelation) o;	        
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
            .append("participantid"+":"+getParticipantid())
            .append("gengroupid"+":"+getGengroupid())
            .append("sharepercent"+":"+getSharepercent())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("operatedate"+":"+getOperatedate())
            .append("operator"+":"+getOperator())
            .append("extend1"+":"+getExtend1())
            .append("extend2"+":"+getExtend2())
            .append("businessid"+":"+getBusinessid())
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