package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * GkAssessmentindex的POJO类
 *
 * @author  Administrator  [Thu Aug 15 17:04:04 CST 2013]
 * 
 */
public class GkAssessmentindex implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性datatype
     */
    private BigDecimal datatype;
	
    /** 
     * 属性indexId
     */
    private String indexId;
	
    /** 
     * 属性indexName
     */
    private String indexName;
	
    /** 
     * 属性isassess
     */
    private String isassess;
	
    /** 
     * 属性value1
     */
    private BigDecimal value1;
	
    /** 
     * 属性value1name
     */
    private String value1name;
	
    /** 
     * 属性value1ins
     */
    private String value1ins;
	
    /** 
     * 属性value2
     */
    private BigDecimal value2;
	
    /** 
     * 属性value2name
     */
    private String value2name;
	
    /** 
     * 属性value2ins
     */
    private String value2ins;
	
    /** 
     * 属性value3
     */
    private BigDecimal value3;
	
    /** 
     * 属性value3name
     */
    private String value3name;
	
    /** 
     * 属性value3ins
     */
    private String value3ins;
	
    /** 
     * 属性value4
     */
    private BigDecimal value4;
	
    /** 
     * 属性value4name
     */
    private String value4name;
	
    /** 
     * 属性value4ins
     */
    private String value4ins;
	
    /** 
     * 属性backstr1
     */
    private String backstr1;
	
    /** 
     * 属性backstr2
     */
    private String backstr2;
	
    /** 
     * 属性backstr3
     */
    private String backstr3;
	
    /** 
     * 属性backstr4
     */
    private String backstr4;
	
    /** 
     * 属性backstr5
     */
    private String backstr5;
	
    /**
     * GkAssessmentindex构造函数
     */
    public GkAssessmentindex() {
        super();
    }  
	
    /**
     * GkAssessmentindex完整的构造函数
     */  
    public GkAssessmentindex(String guid,String marketcode){
        this.guid = guid;
        this.marketcode = marketcode;
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
     * 属性 marketcode 的get方法
     * @return String
     */
    public String getMarketcode(){
        return marketcode;
    }
	
    /**
     * 属性 marketcode 的set方法
     * @return
     */
    public void setMarketcode(String marketcode){
        this.marketcode = marketcode;
    } 
	
    /**
     * 属性 datatype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDatatype(){
        return datatype;
    }
	
    /**
     * 属性 datatype 的set方法
     * @return
     */
    public void setDatatype(BigDecimal datatype){
        this.datatype = datatype;
    } 
	
    /**
     * 属性 indexId 的get方法
     * @return String
     */
    public String getIndexId(){
        return indexId;
    }
	
    /**
     * 属性 indexId 的set方法
     * @return
     */
    public void setIndexId(String indexId){
        this.indexId = indexId;
    } 
	
    /**
     * 属性 indexName 的get方法
     * @return String
     */
    public String getIndexName(){
        return indexName;
    }
	
    /**
     * 属性 indexName 的set方法
     * @return
     */
    public void setIndexName(String indexName){
        this.indexName = indexName;
    } 
	
    /**
     * 属性 isassess 的get方法
     * @return String
     */
    public String getIsassess(){
        return isassess;
    }
	
    /**
     * 属性 isassess 的set方法
     * @return
     */
    public void setIsassess(String isassess){
        this.isassess = isassess;
    } 
	
    /**
     * 属性 value1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getValue1(){
        return value1;
    }
	
    /**
     * 属性 value1 的set方法
     * @return
     */
    public void setValue1(BigDecimal value1){
        this.value1 = value1;
    } 
	
    /**
     * 属性 value1name 的get方法
     * @return String
     */
    public String getValue1name(){
        return value1name;
    }
	
    /**
     * 属性 value1name 的set方法
     * @return
     */
    public void setValue1name(String value1name){
        this.value1name = value1name;
    } 
	
    /**
     * 属性 value1ins 的get方法
     * @return String
     */
    public String getValue1ins(){
        return value1ins;
    }
	
    /**
     * 属性 value1ins 的set方法
     * @return
     */
    public void setValue1ins(String value1ins){
        this.value1ins = value1ins;
    } 
	
    /**
     * 属性 value2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getValue2(){
        return value2;
    }
	
    /**
     * 属性 value2 的set方法
     * @return
     */
    public void setValue2(BigDecimal value2){
        this.value2 = value2;
    } 
	
    /**
     * 属性 value2name 的get方法
     * @return String
     */
    public String getValue2name(){
        return value2name;
    }
	
    /**
     * 属性 value2name 的set方法
     * @return
     */
    public void setValue2name(String value2name){
        this.value2name = value2name;
    } 
	
    /**
     * 属性 value2ins 的get方法
     * @return String
     */
    public String getValue2ins(){
        return value2ins;
    }
	
    /**
     * 属性 value2ins 的set方法
     * @return
     */
    public void setValue2ins(String value2ins){
        this.value2ins = value2ins;
    } 
	
    /**
     * 属性 value3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getValue3(){
        return value3;
    }
	
    /**
     * 属性 value3 的set方法
     * @return
     */
    public void setValue3(BigDecimal value3){
        this.value3 = value3;
    } 
	
    /**
     * 属性 value3name 的get方法
     * @return String
     */
    public String getValue3name(){
        return value3name;
    }
	
    /**
     * 属性 value3name 的set方法
     * @return
     */
    public void setValue3name(String value3name){
        this.value3name = value3name;
    } 
	
    /**
     * 属性 value3ins 的get方法
     * @return String
     */
    public String getValue3ins(){
        return value3ins;
    }
	
    /**
     * 属性 value3ins 的set方法
     * @return
     */
    public void setValue3ins(String value3ins){
        this.value3ins = value3ins;
    } 
	
    /**
     * 属性 value4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getValue4(){
        return value4;
    }
	
    /**
     * 属性 value4 的set方法
     * @return
     */
    public void setValue4(BigDecimal value4){
        this.value4 = value4;
    } 
	
    /**
     * 属性 value4name 的get方法
     * @return String
     */
    public String getValue4name(){
        return value4name;
    }
	
    /**
     * 属性 value4name 的set方法
     * @return
     */
    public void setValue4name(String value4name){
        this.value4name = value4name;
    } 
	
    /**
     * 属性 value4ins 的get方法
     * @return String
     */
    public String getValue4ins(){
        return value4ins;
    }
	
    /**
     * 属性 value4ins 的set方法
     * @return
     */
    public void setValue4ins(String value4ins){
        this.value4ins = value4ins;
    } 
	
    /**
     * 属性 backstr1 的get方法
     * @return String
     */
    public String getBackstr1(){
        return backstr1;
    }
	
    /**
     * 属性 backstr1 的set方法
     * @return
     */
    public void setBackstr1(String backstr1){
        this.backstr1 = backstr1;
    } 
	
    /**
     * 属性 backstr2 的get方法
     * @return String
     */
    public String getBackstr2(){
        return backstr2;
    }
	
    /**
     * 属性 backstr2 的set方法
     * @return
     */
    public void setBackstr2(String backstr2){
        this.backstr2 = backstr2;
    } 
	
    /**
     * 属性 backstr3 的get方法
     * @return String
     */
    public String getBackstr3(){
        return backstr3;
    }
	
    /**
     * 属性 backstr3 的set方法
     * @return
     */
    public void setBackstr3(String backstr3){
        this.backstr3 = backstr3;
    } 
	
    /**
     * 属性 backstr4 的get方法
     * @return String
     */
    public String getBackstr4(){
        return backstr4;
    }
	
    /**
     * 属性 backstr4 的set方法
     * @return
     */
    public void setBackstr4(String backstr4){
        this.backstr4 = backstr4;
    } 
	
    /**
     * 属性 backstr5 的get方法
     * @return String
     */
    public String getBackstr5(){
        return backstr5;
    }
	
    /**
     * 属性 backstr5 的set方法
     * @return
     */
    public void setBackstr5(String backstr5){
        this.backstr5 = backstr5;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof GkAssessmentindex))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        GkAssessmentindex other = (GkAssessmentindex) o;	        
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
            .append("marketcode"+":"+getMarketcode())
            .append("datatype"+":"+getDatatype())
            .append("indexId"+":"+getIndexId())
            .append("indexName"+":"+getIndexName())
            .append("isassess"+":"+getIsassess())
            .append("value1"+":"+getValue1())
            .append("value1name"+":"+getValue1name())
            .append("value1ins"+":"+getValue1ins())
            .append("value2"+":"+getValue2())
            .append("value2name"+":"+getValue2name())
            .append("value2ins"+":"+getValue2ins())
            .append("value3"+":"+getValue3())
            .append("value3name"+":"+getValue3name())
            .append("value3ins"+":"+getValue3ins())
            .append("value4"+":"+getValue4())
            .append("value4name"+":"+getValue4name())
            .append("value4ins"+":"+getValue4ins())
            .append("backstr1"+":"+getBackstr1())
            .append("backstr2"+":"+getBackstr2())
            .append("backstr3"+":"+getBackstr3())
            .append("backstr4"+":"+getBackstr4())
            .append("backstr5"+":"+getBackstr5())
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