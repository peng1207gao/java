package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaLogPartmarketrelation的POJO类
 *
 * @author  xuhao  [Wed Feb 19 14:30:43 CST 2014]
 * 
 */
public class BaLogPartmarketrelation implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
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
     * 属性sheetid
     */
    private String sheetid;
	
    /** 
     * 属性cmd
     */
    private String cmd;
	
    /** 
     * 属性operator
     */
    private String operator;
	
    /** 
     * 属性operatingdescription
     */
    private String operatingdescription;
	
    /** 
     * 属性operatedate
     */
    private Date operatedate;
	
    /** 
     * 属性guid2
     */
    private String guid2;
	
    /** 
     * 属性extend1
     */
    private String extend1;
	
    /** 
     * 属性extend2
     */
    private String extend2;
	
    /**
     * BaLogPartmarketrelation构造函数
     */
    public BaLogPartmarketrelation() {
        super();
    }  
	
    /**
     * BaLogPartmarketrelation完整的构造函数
     */  
    public BaLogPartmarketrelation(String guid,String participantid,String marketid,Date starteffectivedate,String sheetid){
        this.guid = guid;
        this.participantid = participantid;
        this.marketid = marketid;
        this.starteffectivedate = starteffectivedate;
        this.sheetid = sheetid;
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
        this.guid = guid;
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
     * 属性 sheetid 的get方法
     * @return String
     */
    public String getSheetid(){
        return sheetid;
    }
	
    /**
     * 属性 sheetid 的set方法
     * @return
     */
    public void setSheetid(String sheetid){
        if(sheetid != null && sheetid.trim().length() == 0){
            this.sheetid = null;
        }else{
            this.sheetid = sheetid;
        }
    } 
	
    /**
     * 属性 cmd 的get方法
     * @return String
     */
    public String getCmd(){
        return cmd;
    }
	
    /**
     * 属性 cmd 的set方法
     * @return
     */
    public void setCmd(String cmd){
        this.cmd = cmd;
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
     * 属性 operatingdescription 的get方法
     * @return String
     */
    public String getOperatingdescription(){
        return operatingdescription;
    }
	
    /**
     * 属性 operatingdescription 的set方法
     * @return
     */
    public void setOperatingdescription(String operatingdescription){
        this.operatingdescription = operatingdescription;
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
     * 属性 guid2 的get方法
     * @return String
     */
    public String getGuid2(){
        return guid2;
    }
	
    /**
     * 属性 guid2 的set方法
     * @return
     */
    public void setGuid2(String guid2){
        this.guid2 = guid2;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaLogPartmarketrelation))
	        return false; 
			
        if(getSheetid() == null) 
	        return false;

        BaLogPartmarketrelation other = (BaLogPartmarketrelation) o;	        
	    return new EqualsBuilder()
            .append(this.getSheetid(), other.getSheetid())
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
            .append("marketid"+":"+getMarketid())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("sheetid"+":"+getSheetid())
            .append("cmd"+":"+getCmd())
            .append("operator"+":"+getOperator())
            .append("operatingdescription"+":"+getOperatingdescription())
            .append("operatedate"+":"+getOperatedate())
            .append("guid2"+":"+getGuid2())
            .append("extend1"+":"+getExtend1())
            .append("extend2"+":"+getExtend2())
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