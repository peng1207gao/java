package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxJnjpCfb的POJO类
 *
 * @author  Administrator  [Mon Aug 12 10:22:38 CST 2013]
 * 
 */
public class TjfxJnjpCfb implements Serializable{

	private static final long serialVersionUID = 1L;
    /** 
     * 属性theyear
     */
    private String theyear;
	
    /** 
     * 属性themonth
     */
    private String themonth;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性projectid
     */
    private BigDecimal projectid;
	
    /** 
     * 属性dyjydl
     */
    private BigDecimal dyjydl;
	
    /** 
     * 属性dyjydltb
     */
    private BigDecimal dyjydltb;
	
    /** 
     * 属性dyjybm
     */
    private BigDecimal dyjybm;
	
    /** 
     * 属性dyjpco2
     */
    private BigDecimal dyjpco2;
	
    /** 
     * 属性dyjpso2
     */
    private BigDecimal dyjpso2;
	
    /** 
     * 属性ljjydl
     */
    private BigDecimal ljjydl;
	
    /** 
     * 属性ljjydltb
     */
    private BigDecimal ljjydltb;
	
    /** 
     * 属性ljjybm
     */
    private BigDecimal ljjybm;
	
    /** 
     * 属性ljjpco2
     */
    private BigDecimal ljjpco2;
	
    /** 
     * 属性ljjpso2
     */
    private BigDecimal ljjpso2;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /**
     * TjfxJnjpCfb构造函数
     */
    public TjfxJnjpCfb() {
        super();
    }  
	
    /**
     * TjfxJnjpCfb完整的构造函数
     */  
    public TjfxJnjpCfb(String theyear,String themonth,String marketid,BigDecimal projectid,String guid){
        this.theyear = theyear;
        this.themonth = themonth;
        this.marketid = marketid;
        this.projectid = projectid;
        this.guid = guid;
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
     * 属性 projectid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getProjectid(){
        return projectid;
    }
	
    /**
     * 属性 projectid 的set方法
     * @return
     */
    public void setProjectid(BigDecimal projectid){
        this.projectid = projectid;
    } 
	
    /**
     * 属性 dyjydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjydl(){
        return dyjydl;
    }
	
    /**
     * 属性 dyjydl 的set方法
     * @return
     */
    public void setDyjydl(BigDecimal dyjydl){
        this.dyjydl = dyjydl;
    } 
	
    /**
     * 属性 dyjydltb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjydltb(){
        return dyjydltb;
    }
	
    /**
     * 属性 dyjydltb 的set方法
     * @return
     */
    public void setDyjydltb(BigDecimal dyjydltb){
        this.dyjydltb = dyjydltb;
    } 
	
    /**
     * 属性 dyjybm 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjybm(){
        return dyjybm;
    }
	
    /**
     * 属性 dyjybm 的set方法
     * @return
     */
    public void setDyjybm(BigDecimal dyjybm){
        this.dyjybm = dyjybm;
    } 
	
    /**
     * 属性 dyjpco2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjpco2(){
        return dyjpco2;
    }
	
    /**
     * 属性 dyjpco2 的set方法
     * @return
     */
    public void setDyjpco2(BigDecimal dyjpco2){
        this.dyjpco2 = dyjpco2;
    } 
	
    /**
     * 属性 dyjpso2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjpso2(){
        return dyjpso2;
    }
	
    /**
     * 属性 dyjpso2 的set方法
     * @return
     */
    public void setDyjpso2(BigDecimal dyjpso2){
        this.dyjpso2 = dyjpso2;
    } 
	
    /**
     * 属性 ljjydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjydl(){
        return ljjydl;
    }
	
    /**
     * 属性 ljjydl 的set方法
     * @return
     */
    public void setLjjydl(BigDecimal ljjydl){
        this.ljjydl = ljjydl;
    } 
	
    /**
     * 属性 ljjydltb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjydltb(){
        return ljjydltb;
    }
	
    /**
     * 属性 ljjydltb 的set方法
     * @return
     */
    public void setLjjydltb(BigDecimal ljjydltb){
        this.ljjydltb = ljjydltb;
    } 
	
    /**
     * 属性 ljjybm 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjybm(){
        return ljjybm;
    }
	
    /**
     * 属性 ljjybm 的set方法
     * @return
     */
    public void setLjjybm(BigDecimal ljjybm){
        this.ljjybm = ljjybm;
    } 
	
    /**
     * 属性 ljjpco2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjpco2(){
        return ljjpco2;
    }
	
    /**
     * 属性 ljjpco2 的set方法
     * @return
     */
    public void setLjjpco2(BigDecimal ljjpco2){
        this.ljjpco2 = ljjpco2;
    } 
	
    /**
     * 属性 ljjpso2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjpso2(){
        return ljjpso2;
    }
	
    /**
     * 属性 ljjpso2 的set方法
     * @return
     */
    public void setLjjpso2(BigDecimal ljjpso2){
        this.ljjpso2 = ljjpso2;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjfxJnjpCfb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxJnjpCfb other = (TjfxJnjpCfb) o;	        
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
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("marketid"+":"+getMarketid())
            .append("projectid"+":"+getProjectid())
            .append("dyjydl"+":"+getDyjydl())
            .append("dyjydltb"+":"+getDyjydltb())
            .append("dyjybm"+":"+getDyjybm())
            .append("dyjpco2"+":"+getDyjpco2())
            .append("dyjpso2"+":"+getDyjpso2())
            .append("ljjydl"+":"+getLjjydl())
            .append("ljjydltb"+":"+getLjjydltb())
            .append("ljjybm"+":"+getLjjybm())
            .append("ljjpco2"+":"+getLjjpco2())
            .append("ljjpso2"+":"+getLjjpso2())
            .append("guid"+":"+getGuid())
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