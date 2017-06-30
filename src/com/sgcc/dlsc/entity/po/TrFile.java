package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrFile的POJO类
 *
 * @author  sss  [Mon Dec 02 14:24:33 CST 2013]
 * 
 */
public class TrFile implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性fileTitle
     */
    private String fileTitle;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性fileId
     */
    private String fileId;
	
    /** 
     * 属性fileInfo
     */
    private byte[] fileInfo;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性upTime
     */
    private Timestamp upTime;
	
    /** 
     * 属性marketIds
     */
    private String marketIds;
	
    /** 
     * 属性publishDx
     */
    private BigDecimal publishDx;
	
    /** 
     * 属性backField1
     */
    private BigDecimal backField1;
	
    /** 
     * 属性backField2
     */
    private BigDecimal backField2;
	
    /** 
     * 属性backField3
     */
    private String backField3;
	
    /** 
     * 属性backField4
     */
    private String backField4;
	
    /** 
     * 属性backField5
     */
    private String backField5;
	
    /** 
     * 属性backField6
     */
    private byte[] backField6;
	
    /**
     * TrFile构造函数
     */
    public TrFile() {
        super();
    }  
	
    /**
     * TrFile完整的构造函数
     */  
    public TrFile(String guid,String fileTitle,BigDecimal tradeseqId,Timestamp upTime){
        this.guid = guid;
        this.fileTitle = fileTitle;
        this.tradeseqId = tradeseqId;
        this.upTime = upTime;
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
     * 属性 fileTitle 的get方法
     * @return String
     */
    public String getFileTitle(){
        return fileTitle;
    }
	
    /**
     * 属性 fileTitle 的set方法
     * @return
     */
    public void setFileTitle(String fileTitle){
        this.fileTitle = fileTitle;
    } 
	
	
	
    /**
     * 属性 tradeseqId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradeseqId(){
        return tradeseqId;
    }
	
    /**
     * 属性 tradeseqId 的set方法
     * @return
     */
    public void setTradeseqId(BigDecimal tradeseqId){
        this.tradeseqId = tradeseqId;
    } 
	
	
	
    /**
     * 属性 fileId 的get方法
     * @return String
     */
    public String getFileId(){
        return fileId;
    }
	
    /**
     * 属性 fileId 的set方法
     * @return
     */
    public void setFileId(String fileId){
        this.fileId = fileId;
    } 
	
	
	
    /**
     * 属性 fileInfo 的get方法
     * @return byte[]
     */
    public byte[] getFileInfo(){
        return fileInfo;
    }
	
    /**
     * 属性 fileInfo 的set方法
     * @return
     */
    public void setFileInfo(byte[] fileInfo){
        this.fileInfo = fileInfo;
    } 
	
	
	
    /**
     * 属性 marketId 的get方法
     * @return String
     */
    public String getMarketId(){
        return marketId;
    }
	
    /**
     * 属性 marketId 的set方法
     * @return
     */
    public void setMarketId(String marketId){
        this.marketId = marketId;
    } 
	
	
	
    /**
     * 属性 upTime 的get方法
     * @return Date
     */
    public Timestamp getUpTime(){
        return upTime;
    }
	
    /**
     * 属性 upTime 的set方法
     * @return
     */
    public void setUpTime(Timestamp upTime){
        this.upTime = upTime;
    } 
	
	
	
    /**
     * 属性 marketIds 的get方法
     * @return String
     */
    public String getMarketIds(){
        return marketIds;
    }
	
    /**
     * 属性 marketIds 的set方法
     * @return
     */
    public void setMarketIds(String marketIds){
        this.marketIds = marketIds;
    } 
	
	
	
    /**
     * 属性 publishDx 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPublishDx(){
        return publishDx;
    }
	
    /**
     * 属性 publishDx 的set方法
     * @return
     */
    public void setPublishDx(BigDecimal publishDx){
        this.publishDx = publishDx;
    } 
	
	
	
    /**
     * 属性 backField1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackField1(){
        return backField1;
    }
	
    /**
     * 属性 backField1 的set方法
     * @return
     */
    public void setBackField1(BigDecimal backField1){
        this.backField1 = backField1;
    } 
	
	
	
    /**
     * 属性 backField2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackField2(){
        return backField2;
    }
	
    /**
     * 属性 backField2 的set方法
     * @return
     */
    public void setBackField2(BigDecimal backField2){
        this.backField2 = backField2;
    } 
	
	
	
    /**
     * 属性 backField3 的get方法
     * @return String
     */
    public String getBackField3(){
        return backField3;
    }
	
    /**
     * 属性 backField3 的set方法
     * @return
     */
    public void setBackField3(String backField3){
        this.backField3 = backField3;
    } 
	
	
	
    /**
     * 属性 backField4 的get方法
     * @return String
     */
    public String getBackField4(){
        return backField4;
    }
	
    /**
     * 属性 backField4 的set方法
     * @return
     */
    public void setBackField4(String backField4){
        this.backField4 = backField4;
    } 
	
	
	
    /**
     * 属性 backField5 的get方法
     * @return String
     */
    public String getBackField5(){
        return backField5;
    }
	
    /**
     * 属性 backField5 的set方法
     * @return
     */
    public void setBackField5(String backField5){
        this.backField5 = backField5;
    } 
	
	
	
    /**
     * 属性 backField6 的get方法
     * @return byte[]
     */
    public byte[] getBackField6(){
        return backField6;
    }
	
    /**
     * 属性 backField6 的set方法
     * @return
     */
    public void setBackField6(byte[] backField6){
        this.backField6 = backField6;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrFile))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrFile other = (TrFile) o;	        
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
            .append("fileTitle"+":"+getFileTitle())
            .append("tradeseqId"+":"+getTradeseqId())
            .append("fileId"+":"+getFileId())
            .append("fileInfo"+":"+getFileInfo())
            .append("marketId"+":"+getMarketId())
            .append("upTime"+":"+getUpTime())
            .append("marketIds"+":"+getMarketIds())
            .append("publishDx"+":"+getPublishDx())
            .append("backField1"+":"+getBackField1())
            .append("backField2"+":"+getBackField2())
            .append("backField3"+":"+getBackField3())
            .append("backField4"+":"+getBackField4())
            .append("backField5"+":"+getBackField5())
            .append("backField6"+":"+getBackField6())
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