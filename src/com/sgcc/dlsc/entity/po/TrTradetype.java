package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradetype的POJO类
 *
 * @author  Administrator  [Tue Jul 30 15:05:19 CST 2013]
 * 
 */
public class TrTradetype implements Serializable{

    /** 
     * 属性tradetypeId
     */
    private String tradetypeId;
	
    /** 
     * 属性subTradetypeId
     */
    private String subTradetypeId;
	
    /** 
     * 属性tradetypeCode
     */
    private String tradetypeCode;
	
    /** 
     * 属性tradetypeName
     */
    private String tradetypeName;
	
    /** 
     * 属性tradetypeShortName
     */
    private String tradetypeShortName;
	
    /** 
     * 属性tradetypeMode
     */
    private BigDecimal tradetypeMode;
	
    /** 
     * 属性beginDate
     */
    private Date beginDate;
	
    /** 
     * 属性exitDate
     */
    private Date exitDate;
	
    /** 
     * 属性regDate
     */
    private Date regDate;
	
    /** 
     * 属性createPerson
     */
    private String createPerson;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性note
     */
    private String note;
	
    /**
     * TrTradetype构造函数
     */
    public TrTradetype() {
        super();
    }  
	
    /**
     * TrTradetype完整的构造函数
     */  
    public TrTradetype(String tradetypeId){
        this.tradetypeId = tradetypeId;
    }
 
    /**
     * 属性 tradetypeId 的get方法
     * @return String
     */
    public String getTradetypeId(){
        return tradetypeId;
    }
	
    /**
     * 属性 tradetypeId 的set方法
     * @return
     */
    public void setTradetypeId(String tradetypeId){
        if(tradetypeId != null && tradetypeId.trim().length() == 0){
            this.tradetypeId = null;
        }else{
            this.tradetypeId = tradetypeId;
        }
    } 
	
    /**
     * 属性 subTradetypeId 的get方法
     * @return String
     */
    public String getSubTradetypeId(){
        return subTradetypeId;
    }
	
    /**
     * 属性 subTradetypeId 的set方法
     * @return
     */
    public void setSubTradetypeId(String subTradetypeId){
        this.subTradetypeId = subTradetypeId;
    } 
	
    /**
     * 属性 tradetypeCode 的get方法
     * @return String
     */
    public String getTradetypeCode(){
        return tradetypeCode;
    }
	
    /**
     * 属性 tradetypeCode 的set方法
     * @return
     */
    public void setTradetypeCode(String tradetypeCode){
        this.tradetypeCode = tradetypeCode;
    } 
	
    /**
     * 属性 tradetypeName 的get方法
     * @return String
     */
    public String getTradetypeName(){
        return tradetypeName;
    }
	
    /**
     * 属性 tradetypeName 的set方法
     * @return
     */
    public void setTradetypeName(String tradetypeName){
        this.tradetypeName = tradetypeName;
    } 
	
    /**
     * 属性 tradetypeShortName 的get方法
     * @return String
     */
    public String getTradetypeShortName(){
        return tradetypeShortName;
    }
	
    /**
     * 属性 tradetypeShortName 的set方法
     * @return
     */
    public void setTradetypeShortName(String tradetypeShortName){
        this.tradetypeShortName = tradetypeShortName;
    } 
	
    /**
     * 属性 tradetypeMode 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradetypeMode(){
        return tradetypeMode;
    }
	
    /**
     * 属性 tradetypeMode 的set方法
     * @return
     */
    public void setTradetypeMode(BigDecimal tradetypeMode){
        this.tradetypeMode = tradetypeMode;
    } 
	
    /**
     * 属性 beginDate 的get方法
     * @return Date
     */
    public Date getBeginDate(){
        return beginDate;
    }
	
    /**
     * 属性 beginDate 的set方法
     * @return
     */
    public void setBeginDate(Date beginDate){
        this.beginDate = beginDate;
    } 
	
    /**
     * 属性 exitDate 的get方法
     * @return Date
     */
    public Date getExitDate(){
        return exitDate;
    }
	
    /**
     * 属性 exitDate 的set方法
     * @return
     */
    public void setExitDate(Date exitDate){
        this.exitDate = exitDate;
    } 
	
    /**
     * 属性 regDate 的get方法
     * @return Date
     */
    public Date getRegDate(){
        return regDate;
    }
	
    /**
     * 属性 regDate 的set方法
     * @return
     */
    public void setRegDate(Date regDate){
        this.regDate = regDate;
    } 
	
    /**
     * 属性 createPerson 的get方法
     * @return String
     */
    public String getCreatePerson(){
        return createPerson;
    }
	
    /**
     * 属性 createPerson 的set方法
     * @return
     */
    public void setCreatePerson(String createPerson){
        this.createPerson = createPerson;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTradetype))
	        return false; 
			
        if(getTradetypeId() == null) 
	        return false;

        TrTradetype other = (TrTradetype) o;	        
	    return new EqualsBuilder()
            .append(this.getTradetypeId(), other.getTradetypeId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("tradetypeId"+":"+getTradetypeId())
            .append("subTradetypeId"+":"+getSubTradetypeId())
            .append("tradetypeCode"+":"+getTradetypeCode())
            .append("tradetypeName"+":"+getTradetypeName())
            .append("tradetypeShortName"+":"+getTradetypeShortName())
            .append("tradetypeMode"+":"+getTradetypeMode())
            .append("beginDate"+":"+getBeginDate())
            .append("exitDate"+":"+getExitDate())
            .append("regDate"+":"+getRegDate())
            .append("createPerson"+":"+getCreatePerson())
            .append("marketId"+":"+getMarketId())
            .append("note"+":"+getNote())
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