package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * GkDatama的POJO类
 *
 * @author  Administrator  [Thu Aug 15 10:32:14 CST 2013]
 * 
 */
public class GkDatama implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性tabDate
     */
    private Date tabDate;
	
    /** 
     * 属性url
     */
    private String url;
	
    /** 
     * 属性datatype
     */
    private BigDecimal datatype;
	
    /** 
     * 属性ispass
     */
    private BigDecimal ispass;
	
    /** 
     * 属性maDate
     */
    private Date maDate;
	
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
     * GkDatama构造函数
     */
    public GkDatama() {
        super();
    }  
	
    /**
     * GkDatama完整的构造函数
     */  
    public GkDatama(String guid,String marketcode,Date tabDate){
        this.guid = guid;
        this.marketcode = marketcode;
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
     * 属性 url 的get方法
     * @return String
     */
    public String getUrl(){
        return url;
    }
	
    /**
     * 属性 url 的set方法
     * @return
     */
    public void setUrl(String url){
        this.url = url;
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
     * 属性 ispass 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIspass(){
        return ispass;
    }
	
    /**
     * 属性 ispass 的set方法
     * @return
     */
    public void setIspass(BigDecimal ispass){
        this.ispass = ispass;
    } 
	
    /**
     * 属性 maDate 的get方法
     * @return Date
     */
    public Date getMaDate(){
        return maDate;
    }
	
    /**
     * 属性 maDate 的set方法
     * @return
     */
    public void setMaDate(Date maDate){
        this.maDate = maDate;
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
		
        if (o == null || !(o instanceof GkDatama))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        GkDatama other = (GkDatama) o;	        
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
            .append("tabDate"+":"+getTabDate())
            .append("url"+":"+getUrl())
            .append("datatype"+":"+getDatatype())
            .append("ispass"+":"+getIspass())
            .append("maDate"+":"+getMaDate())
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