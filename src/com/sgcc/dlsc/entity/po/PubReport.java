package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubReport的POJO类
 *
 * @author  zhen  [Wed Dec 04 14:26:07 CST 2013]
 * 
 */
public class PubReport implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性moduleid
     */
    private String moduleid;
	
    /** 
     * 属性funcName
     */
    private String funcName;
	
    /** 
     * 属性funcType
     */
    private String funcType;
	
    /** 
     * 属性tabDate
     */
    private Date tabDate;
	
    /** 
     * 属性seqId
     */
    private String seqId;
	
    /** 
     * 属性seqName
     */
    private String seqName;
	
    /** 
     * 属性pubPersonid
     */
    private String pubPersonid;
	
    /** 
     * 属性pubDate
     */
    private Date pubDate;
	
    /** 
     * 属性version
     */
    private BigDecimal version;
	
    /** 
     * 属性effective
     */
    private BigDecimal effective;
	
    /** 
     * 属性bak1
     */
    private String bak1;
	
    /** 
     * 属性bak2
     */
    private String bak2;
	
    /** 
     * 属性bak3
     */
    private String bak3;
	
    /**
     * PubReport构造函数
     */
    public PubReport() {
        super();
    }  
	
    /**
     * PubReport完整的构造函数
     */  
    public PubReport(String guid,String marketId,String moduleid,String funcName,String funcType,Date tabDate){
        this.guid = guid;
        this.marketId = marketId;
        this.moduleid = moduleid;
        this.funcName = funcName;
        this.funcType = funcType;
        this.tabDate = tabDate;
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
     * 属性 moduleid 的get方法
     * @return String
     */
    public String getModuleid(){
        return moduleid;
    }
	
    /**
     * 属性 moduleid 的set方法
     * @return
     */
    public void setModuleid(String moduleid){
        this.moduleid = moduleid;
    } 
	
    /**
     * 属性 funcName 的get方法
     * @return String
     */
    public String getFuncName(){
        return funcName;
    }
	
    /**
     * 属性 funcName 的set方法
     * @return
     */
    public void setFuncName(String funcName){
        this.funcName = funcName;
    } 
	
    /**
     * 属性 funcType 的get方法
     * @return String
     */
    public String getFuncType(){
        return funcType;
    }
	
    /**
     * 属性 funcType 的set方法
     * @return
     */
    public void setFuncType(String funcType){
        this.funcType = funcType;
    } 
	
    /**
     * 属性 tabDate 的get方法
     * @return Date
     */
    public Date getTabDate(){
        return tabDate;
    }
	
    /**
     * 属性 tabDate 的set方法
     * @return
     */
    public void setTabDate(Date tabDate){
        this.tabDate = tabDate;
    } 
	
    /**
     * 属性 seqId 的get方法
     * @return String
     */
    public String getSeqId(){
        return seqId;
    }
	
    /**
     * 属性 seqId 的set方法
     * @return
     */
    public void setSeqId(String seqId){
        this.seqId = seqId;
    } 
	
    /**
     * 属性 seqName 的get方法
     * @return String
     */
    public String getSeqName(){
        return seqName;
    }
	
    /**
     * 属性 seqName 的set方法
     * @return
     */
    public void setSeqName(String seqName){
        this.seqName = seqName;
    } 
	
    /**
     * 属性 pubPersonid 的get方法
     * @return String
     */
    public String getPubPersonid(){
        return pubPersonid;
    }
	
    /**
     * 属性 pubPersonid 的set方法
     * @return
     */
    public void setPubPersonid(String pubPersonid){
        this.pubPersonid = pubPersonid;
    } 
	
    /**
     * 属性 pubDate 的get方法
     * @return Date
     */
    public Date getPubDate(){
        return pubDate;
    }
	
    /**
     * 属性 pubDate 的set方法
     * @return
     */
    public void setPubDate(Date pubDate){
        this.pubDate = pubDate;
    } 
	
    /**
     * 属性 version 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVersion(){
        return version;
    }
	
    /**
     * 属性 version 的set方法
     * @return
     */
    public void setVersion(BigDecimal version){
        this.version = version;
    } 
	
    /**
     * 属性 effective 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEffective(){
        return effective;
    }
	
    /**
     * 属性 effective 的set方法
     * @return
     */
    public void setEffective(BigDecimal effective){
        this.effective = effective;
    } 
	
    /**
     * 属性 bak1 的get方法
     * @return String
     */
    public String getBak1(){
        return bak1;
    }
	
    /**
     * 属性 bak1 的set方法
     * @return
     */
    public void setBak1(String bak1){
        this.bak1 = bak1;
    } 
	
    /**
     * 属性 bak2 的get方法
     * @return String
     */
    public String getBak2(){
        return bak2;
    }
	
    /**
     * 属性 bak2 的set方法
     * @return
     */
    public void setBak2(String bak2){
        this.bak2 = bak2;
    } 
	
    /**
     * 属性 bak3 的get方法
     * @return String
     */
    public String getBak3(){
        return bak3;
    }
	
    /**
     * 属性 bak3 的set方法
     * @return
     */
    public void setBak3(String bak3){
        this.bak3 = bak3;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PubReport))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubReport other = (PubReport) o;	        
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
            .append("marketId"+":"+getMarketId())
            .append("moduleid"+":"+getModuleid())
            .append("funcName"+":"+getFuncName())
            .append("funcType"+":"+getFuncType())
            .append("tabDate"+":"+getTabDate())
            .append("seqId"+":"+getSeqId())
            .append("seqName"+":"+getSeqName())
            .append("pubPersonid"+":"+getPubPersonid())
            .append("pubDate"+":"+getPubDate())
            .append("version"+":"+getVersion())
            .append("effective"+":"+getEffective())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
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