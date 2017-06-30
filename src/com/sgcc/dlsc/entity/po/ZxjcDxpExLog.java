package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * ZxjcDxpExLog的POJO类
 *
 * @author  Administrator  [Wed Apr 23 10:23:50 CST 2014]
 * 
 */
public class ZxjcDxpExLog implements Serializable{

    /** 
     * 属性objId
     */
    private String objId = "sys_guid()";
	
    /** 
     * 属性callId
     */
    private String callId;
	
    /** 
     * 属性callName
     */
    private String callName;
	
    /** 
     * 属性ywTableId
     */
    private String ywTableId;
	
    /** 
     * 属性zxTableId
     */
    private String zxTableId;
	
    /** 
     * 属性dcTableId
     */
    private String dcTableId;
	
    /** 
     * 属性exType
     */
    private String exType;
	
    /** 
     * 属性callType
     */
    private String callType;
	
    /** 
     * 属性dxpYearCol
     */
    private String dxpYearCol;
	
    /** 
     * 属性dxpMonthCol
     */
    private String dxpMonthCol;
	
    /** 
     * 属性dxpDayCol
     */
    private String dxpDayCol;
	
    /** 
     * 属性dxpDeptCol
     */
    private String dxpDeptCol;
	
    /** 
     * 属性marketIdS
     */
    private String marketIdS;
	
    /** 
     * 属性marketIdT
     */
    private String marketIdT;
	
    /** 
     * 属性dxpTableNumber
     */
    private BigDecimal dxpTableNumber;
	
    /** 
     * 属性keyColumnName
     */
    private String keyColumnName;
	
    /** 
     * 属性isSuc
     */
    private String isSuc;
	
    /** 
     * 属性exTime
     */
    private String exTime;
	
    /** 
     * 属性exUserid
     */
    private String exUserid;
	
    /** 
     * 属性exUsername
     */
    private String exUsername;
	
    /** 
     * 属性failInfo
     */
    private String failInfo;
	
    /** 
     * 属性sqlText
     */
    private String sqlText;
	
    /** 
     * 属性exTimelong
     */
    private BigDecimal exTimelong;
	
    /** 
     * 属性exTimelongFb
     */
    private String exTimelongFb;
	
    /** 
     * 属性exYearValue
     */
    private String exYearValue;
	
    /** 
     * 属性exMonthValue
     */
    private String exMonthValue;
	
    /** 
     * 属性exDayValue
     */
    private String exDayValue;
	
    /** 
     * 属性exDeptValue
     */
    private String exDeptValue;
	
    /** 
     * 属性configObjId
     */
    private String configObjId;
	
    /** 
     * 属性exXmltext
     */
    private String exXmltext;
	
    /** 
     * 属性exNumber
     */
    private BigDecimal exNumber;
	
    /** 
     * 属性isAutoToYw
     */
    private String isAutoToYw;
	
    /**
     * ZxjcDxpExLog构造函数
     */
    public ZxjcDxpExLog() {
        super();
    }  
	
    /**
     * ZxjcDxpExLog完整的构造函数
     */  
    public ZxjcDxpExLog(String objId){
        this.objId = objId;
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
     * 属性 callId 的get方法
     * @return String
     */
    public String getCallId(){
        return callId;
    }
	
    /**
     * 属性 callId 的set方法
     * @return
     */
    public void setCallId(String callId){
        this.callId = callId;
    } 
	
    /**
     * 属性 callName 的get方法
     * @return String
     */
    public String getCallName(){
        return callName;
    }
	
    /**
     * 属性 callName 的set方法
     * @return
     */
    public void setCallName(String callName){
        this.callName = callName;
    } 
	
    /**
     * 属性 ywTableId 的get方法
     * @return String
     */
    public String getYwTableId(){
        return ywTableId;
    }
	
    /**
     * 属性 ywTableId 的set方法
     * @return
     */
    public void setYwTableId(String ywTableId){
        this.ywTableId = ywTableId;
    } 
	
    /**
     * 属性 zxTableId 的get方法
     * @return String
     */
    public String getZxTableId(){
        return zxTableId;
    }
	
    /**
     * 属性 zxTableId 的set方法
     * @return
     */
    public void setZxTableId(String zxTableId){
        this.zxTableId = zxTableId;
    } 
	
    /**
     * 属性 dcTableId 的get方法
     * @return String
     */
    public String getDcTableId(){
        return dcTableId;
    }
	
    /**
     * 属性 dcTableId 的set方法
     * @return
     */
    public void setDcTableId(String dcTableId){
        this.dcTableId = dcTableId;
    } 
	
    /**
     * 属性 exType 的get方法
     * @return String
     */
    public String getExType(){
        return exType;
    }
	
    /**
     * 属性 exType 的set方法
     * @return
     */
    public void setExType(String exType){
        this.exType = exType;
    } 
	
    /**
     * 属性 callType 的get方法
     * @return String
     */
    public String getCallType(){
        return callType;
    }
	
    /**
     * 属性 callType 的set方法
     * @return
     */
    public void setCallType(String callType){
        this.callType = callType;
    } 
	
    /**
     * 属性 dxpYearCol 的get方法
     * @return String
     */
    public String getDxpYearCol(){
        return dxpYearCol;
    }
	
    /**
     * 属性 dxpYearCol 的set方法
     * @return
     */
    public void setDxpYearCol(String dxpYearCol){
        this.dxpYearCol = dxpYearCol;
    } 
	
    /**
     * 属性 dxpMonthCol 的get方法
     * @return String
     */
    public String getDxpMonthCol(){
        return dxpMonthCol;
    }
	
    /**
     * 属性 dxpMonthCol 的set方法
     * @return
     */
    public void setDxpMonthCol(String dxpMonthCol){
        this.dxpMonthCol = dxpMonthCol;
    } 
	
    /**
     * 属性 dxpDayCol 的get方法
     * @return String
     */
    public String getDxpDayCol(){
        return dxpDayCol;
    }
	
    /**
     * 属性 dxpDayCol 的set方法
     * @return
     */
    public void setDxpDayCol(String dxpDayCol){
        this.dxpDayCol = dxpDayCol;
    } 
	
    /**
     * 属性 dxpDeptCol 的get方法
     * @return String
     */
    public String getDxpDeptCol(){
        return dxpDeptCol;
    }
	
    /**
     * 属性 dxpDeptCol 的set方法
     * @return
     */
    public void setDxpDeptCol(String dxpDeptCol){
        this.dxpDeptCol = dxpDeptCol;
    } 
	
    /**
     * 属性 marketIdS 的get方法
     * @return String
     */
    public String getMarketIdS(){
        return marketIdS;
    }
	
    /**
     * 属性 marketIdS 的set方法
     * @return
     */
    public void setMarketIdS(String marketIdS){
        this.marketIdS = marketIdS;
    } 
	
    /**
     * 属性 marketIdT 的get方法
     * @return String
     */
    public String getMarketIdT(){
        return marketIdT;
    }
	
    /**
     * 属性 marketIdT 的set方法
     * @return
     */
    public void setMarketIdT(String marketIdT){
        this.marketIdT = marketIdT;
    } 
	
    /**
     * 属性 dxpTableNumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDxpTableNumber(){
        return dxpTableNumber;
    }
	
    /**
     * 属性 dxpTableNumber 的set方法
     * @return
     */
    public void setDxpTableNumber(BigDecimal dxpTableNumber){
        this.dxpTableNumber = dxpTableNumber;
    } 
	
    /**
     * 属性 keyColumnName 的get方法
     * @return String
     */
    public String getKeyColumnName(){
        return keyColumnName;
    }
	
    /**
     * 属性 keyColumnName 的set方法
     * @return
     */
    public void setKeyColumnName(String keyColumnName){
        this.keyColumnName = keyColumnName;
    } 
	
    /**
     * 属性 isSuc 的get方法
     * @return String
     */
    public String getIsSuc(){
        return isSuc;
    }
	
    /**
     * 属性 isSuc 的set方法
     * @return
     */
    public void setIsSuc(String isSuc){
        this.isSuc = isSuc;
    } 
	
    /**
     * 属性 exTime 的get方法
     * @return Date
     */
    public String getExTime(){
        return exTime;
    }
	
    /**
     * 属性 exTime 的set方法
     * @return
     */
    public void setExTime(String exTime){
        this.exTime = exTime;
    } 
	
    /**
     * 属性 exUserid 的get方法
     * @return String
     */
    public String getExUserid(){
        return exUserid;
    }
	
    /**
     * 属性 exUserid 的set方法
     * @return
     */
    public void setExUserid(String exUserid){
        this.exUserid = exUserid;
    } 
	
    /**
     * 属性 exUsername 的get方法
     * @return String
     */
    public String getExUsername(){
        return exUsername;
    }
	
    /**
     * 属性 exUsername 的set方法
     * @return
     */
    public void setExUsername(String exUsername){
        this.exUsername = exUsername;
    } 
	
    /**
     * 属性 failInfo 的get方法
     * @return String
     */
    public String getFailInfo(){
        return failInfo;
    }
	
    /**
     * 属性 failInfo 的set方法
     * @return
     */
    public void setFailInfo(String failInfo){
        this.failInfo = failInfo;
    } 
	
    /**
     * 属性 sqlText 的get方法
     * @return String
     */
    public String getSqlText(){
        return sqlText;
    }
	
    /**
     * 属性 sqlText 的set方法
     * @return
     */
    public void setSqlText(String sqlText){
        this.sqlText = sqlText;
    } 
	
    /**
     * 属性 exTimelong 的get方法
     * @return BigDecimal
     */
    public BigDecimal getExTimelong(){
        return exTimelong;
    }
	
    /**
     * 属性 exTimelong 的set方法
     * @return
     */
    public void setExTimelong(BigDecimal exTimelong){
        this.exTimelong = exTimelong;
    } 
	
    /**
     * 属性 exTimelongFb 的get方法
     * @return String
     */
    public String getExTimelongFb(){
        return exTimelongFb;
    }
	
    /**
     * 属性 exTimelongFb 的set方法
     * @return
     */
    public void setExTimelongFb(String exTimelongFb){
        this.exTimelongFb = exTimelongFb;
    } 
	
    /**
     * 属性 exYearValue 的get方法
     * @return String
     */
    public String getExYearValue(){
        return exYearValue;
    }
	
    /**
     * 属性 exYearValue 的set方法
     * @return
     */
    public void setExYearValue(String exYearValue){
        this.exYearValue = exYearValue;
    } 
	
    /**
     * 属性 exMonthValue 的get方法
     * @return String
     */
    public String getExMonthValue(){
        return exMonthValue;
    }
	
    /**
     * 属性 exMonthValue 的set方法
     * @return
     */
    public void setExMonthValue(String exMonthValue){
        this.exMonthValue = exMonthValue;
    } 
	
    /**
     * 属性 exDayValue 的get方法
     * @return String
     */
    public String getExDayValue(){
        return exDayValue;
    }
	
    /**
     * 属性 exDayValue 的set方法
     * @return
     */
    public void setExDayValue(String exDayValue){
        this.exDayValue = exDayValue;
    } 
	
    /**
     * 属性 exDeptValue 的get方法
     * @return String
     */
    public String getExDeptValue(){
        return exDeptValue;
    }
	
    /**
     * 属性 exDeptValue 的set方法
     * @return
     */
    public void setExDeptValue(String exDeptValue){
        this.exDeptValue = exDeptValue;
    } 
	
    /**
     * 属性 configObjId 的get方法
     * @return String
     */
    public String getConfigObjId(){
        return configObjId;
    }
	
    /**
     * 属性 configObjId 的set方法
     * @return
     */
    public void setConfigObjId(String configObjId){
        this.configObjId = configObjId;
    } 
	
    /**
     * 属性 exXmltext 的get方法
     * @return String
     */
    public String getExXmltext(){
        return exXmltext;
    }
	
    /**
     * 属性 exXmltext 的set方法
     * @return
     */
    public void setExXmltext(String exXmltext){
        this.exXmltext = exXmltext;
    } 
	
    /**
     * 属性 exNumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getExNumber(){
        return exNumber;
    }
	
    /**
     * 属性 exNumber 的set方法
     * @return
     */
    public void setExNumber(BigDecimal exNumber){
        this.exNumber = exNumber;
    } 
	
    /**
     * 属性 isAutoToYw 的get方法
     * @return String
     */
    public String getIsAutoToYw(){
        return isAutoToYw;
    }
	
    /**
     * 属性 isAutoToYw 的set方法
     * @return
     */
    public void setIsAutoToYw(String isAutoToYw){
        this.isAutoToYw = isAutoToYw;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof ZxjcDxpExLog))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        ZxjcDxpExLog other = (ZxjcDxpExLog) o;	        
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
            .append("callId"+":"+getCallId())
            .append("callName"+":"+getCallName())
            .append("ywTableId"+":"+getYwTableId())
            .append("zxTableId"+":"+getZxTableId())
            .append("dcTableId"+":"+getDcTableId())
            .append("exType"+":"+getExType())
            .append("callType"+":"+getCallType())
            .append("dxpYearCol"+":"+getDxpYearCol())
            .append("dxpMonthCol"+":"+getDxpMonthCol())
            .append("dxpDayCol"+":"+getDxpDayCol())
            .append("dxpDeptCol"+":"+getDxpDeptCol())
            .append("marketIdS"+":"+getMarketIdS())
            .append("marketIdT"+":"+getMarketIdT())
            .append("dxpTableNumber"+":"+getDxpTableNumber())
            .append("keyColumnName"+":"+getKeyColumnName())
            .append("isSuc"+":"+getIsSuc())
            .append("exTime"+":"+getExTime())
            .append("exUserid"+":"+getExUserid())
            .append("exUsername"+":"+getExUsername())
            .append("failInfo"+":"+getFailInfo())
            .append("sqlText"+":"+getSqlText())
            .append("exTimelong"+":"+getExTimelong())
            .append("exTimelongFb"+":"+getExTimelongFb())
            .append("exYearValue"+":"+getExYearValue())
            .append("exMonthValue"+":"+getExMonthValue())
            .append("exDayValue"+":"+getExDayValue())
            .append("exDeptValue"+":"+getExDeptValue())
            .append("configObjId"+":"+getConfigObjId())
            .append("exXmltext"+":"+getExXmltext())
            .append("exNumber"+":"+getExNumber())
            .append("isAutoToYw"+":"+getIsAutoToYw())
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