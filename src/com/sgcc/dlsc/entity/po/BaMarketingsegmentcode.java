package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaMarketingsegmentcode的POJO类
 *
 * @author  longshine  [Wed Mar 26 10:39:39 CST 2014]
 * 
 */
public class BaMarketingsegmentcode implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性category1
     */
    private String category1;
	
    /** 
     * 属性category2
     */
    private String category2;
	
    /** 
     * 属性category3
     */
    private String category3;
	
    /** 
     * 属性category4
     */
    private String category4;
	
    /** 
     * 属性standardcode
     */
    private String standardcode;
	
    /** 
     * 属性codename
     */
    private String codename;
	
    /** 
     * 属性parentcode
     */
    private String parentcode;
	
    /** 
     * 属性isLightorheavy
     */
    private BigDecimal isLightorheavy;
	
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
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性orderno
     */
    private BigDecimal orderno;
	
    /**
     * BaMarketingsegmentcode构造函数
     */
    public BaMarketingsegmentcode() {
        super();
    }  
	
    /**
     * BaMarketingsegmentcode完整的构造函数
     */  
    public BaMarketingsegmentcode(String guid,String standardcode,String codename){
        this.guid = guid;
        this.standardcode = standardcode;
        this.codename = codename;
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
     * 属性 category1 的get方法
     * @return String
     */
    public String getCategory1(){
        return category1;
    }
	
    /**
     * 属性 category1 的set方法
     * @return
     */
    public void setCategory1(String category1){
        this.category1 = category1;
    } 
	
	
	
    /**
     * 属性 category2 的get方法
     * @return String
     */
    public String getCategory2(){
        return category2;
    }
	
    /**
     * 属性 category2 的set方法
     * @return
     */
    public void setCategory2(String category2){
        this.category2 = category2;
    } 
	
	
	
    /**
     * 属性 category3 的get方法
     * @return String
     */
    public String getCategory3(){
        return category3;
    }
	
    /**
     * 属性 category3 的set方法
     * @return
     */
    public void setCategory3(String category3){
        this.category3 = category3;
    } 
	
	
	
    /**
     * 属性 category4 的get方法
     * @return String
     */
    public String getCategory4(){
        return category4;
    }
	
    /**
     * 属性 category4 的set方法
     * @return
     */
    public void setCategory4(String category4){
        this.category4 = category4;
    } 
	
	
	
    /**
     * 属性 standardcode 的get方法
     * @return String
     */
    public String getStandardcode(){
        return standardcode;
    }
	
    /**
     * 属性 standardcode 的set方法
     * @return
     */
    public void setStandardcode(String standardcode){
        this.standardcode = standardcode;
    } 
	
	
	
    /**
     * 属性 codename 的get方法
     * @return String
     */
    public String getCodename(){
        return codename;
    }
	
    /**
     * 属性 codename 的set方法
     * @return
     */
    public void setCodename(String codename){
        this.codename = codename;
    } 
	
	
	
    /**
     * 属性 parentcode 的get方法
     * @return String
     */
    public String getParentcode(){
        return parentcode;
    }
	
    /**
     * 属性 parentcode 的set方法
     * @return
     */
    public void setParentcode(String parentcode){
        this.parentcode = parentcode;
    } 
	
	
	
    /**
     * 属性 isLightorheavy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsLightorheavy(){
        return isLightorheavy;
    }
	
    /**
     * 属性 isLightorheavy 的set方法
     * @return
     */
    public void setIsLightorheavy(BigDecimal isLightorheavy){
        this.isLightorheavy = isLightorheavy;
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
     * 属性 orderno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOrderno(){
        return orderno;
    }
	
    /**
     * 属性 orderno 的set方法
     * @return
     */
    public void setOrderno(BigDecimal orderno){
        this.orderno = orderno;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaMarketingsegmentcode))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaMarketingsegmentcode other = (BaMarketingsegmentcode) o;	        
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
            .append("category1"+":"+getCategory1())
            .append("category2"+":"+getCategory2())
            .append("category3"+":"+getCategory3())
            .append("category4"+":"+getCategory4())
            .append("standardcode"+":"+getStandardcode())
            .append("codename"+":"+getCodename())
            .append("parentcode"+":"+getParentcode())
            .append("isLightorheavy"+":"+getIsLightorheavy())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("updatetime"+":"+getUpdatetime())
            .append("marketid"+":"+getMarketid())
            .append("orderno"+":"+getOrderno())
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