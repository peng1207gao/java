package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DocxParamText的POJO类
 *
 * @author  sss  [Fri Nov 15 15:50:44 CST 2013]
 * 
 */
public class DocxParamText implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性tempparamid
     */
    private String tempparamid;
	
    /** 
     * 属性tempparamname
     */
    private String tempparamname;
	
    /** 
     * 属性tempparamsql
     */
    private String tempparamsql;
	
    /** 
     * 属性tempparamdesc
     */
    private String tempparamdesc;
	
    /** 
     * 属性createdate
     */
    private Date createdate;
	
    /** 
     * 属性creator
     */
    private String creator;
	
    /** 
     * 属性isdelete
     */
    private BigDecimal isdelete;
	
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
     * DocxParamText构造函数
     */
    public DocxParamText() {
        super();
    }  
	
    /**
     * DocxParamText完整的构造函数
     */  
    public DocxParamText(String marketid,String tempparamid,String tempparamname,BigDecimal isdelete){
        this.marketid = marketid;
        this.tempparamid = tempparamid;
        this.tempparamname = tempparamname;
        this.isdelete = isdelete;
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
     * 属性 tempparamid 的get方法
     * @return String
     */
    public String getTempparamid(){
        return tempparamid;
    }
	
    /**
     * 属性 tempparamid 的set方法
     * @return
     */
    public void setTempparamid(String tempparamid){
        if(tempparamid != null && tempparamid.trim().length() == 0){
            this.tempparamid = null;
        }else{
            this.tempparamid = tempparamid;
        }
    } 
	
	
	
    /**
     * 属性 tempparamname 的get方法
     * @return String
     */
    public String getTempparamname(){
        return tempparamname;
    }
	
    /**
     * 属性 tempparamname 的set方法
     * @return
     */
    public void setTempparamname(String tempparamname){
        this.tempparamname = tempparamname;
    } 
	
	
	
    /**
     * 属性 tempparamsql 的get方法
     * @return String
     */
    public String getTempparamsql(){
        return tempparamsql;
    }
	
    /**
     * 属性 tempparamsql 的set方法
     * @return
     */
    public void setTempparamsql(String tempparamsql){
        this.tempparamsql = tempparamsql;
    } 
	
	
	
    /**
     * 属性 tempparamdesc 的get方法
     * @return String
     */
    public String getTempparamdesc(){
        return tempparamdesc;
    }
	
    /**
     * 属性 tempparamdesc 的set方法
     * @return
     */
    public void setTempparamdesc(String tempparamdesc){
        this.tempparamdesc = tempparamdesc;
    } 
	
	
	
    /**
     * 属性 createdate 的get方法
     * @return Date
     */
    public Date getCreatedate(){
        return createdate;
    }
	
    /**
     * 属性 createdate 的set方法
     * @return
     */
    public void setCreatedate(Date createdate){
        this.createdate = createdate;
    } 
	
	
	
    /**
     * 属性 creator 的get方法
     * @return String
     */
    public String getCreator(){
        return creator;
    }
	
    /**
     * 属性 creator 的set方法
     * @return
     */
    public void setCreator(String creator){
        this.creator = creator;
    } 
	
	
	
    /**
     * 属性 isdelete 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdelete(){
        return isdelete;
    }
	
    /**
     * 属性 isdelete 的set方法
     * @return
     */
    public void setIsdelete(BigDecimal isdelete){
        this.isdelete = isdelete;
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
		
        if (o == null || !(o instanceof DocxParamText))
	        return false; 
			
        if(getTempparamid() == null) 
	        return false;

        DocxParamText other = (DocxParamText) o;	        
	    return new EqualsBuilder()
            .append(this.getTempparamid(), other.getTempparamid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("marketid"+":"+getMarketid())
            .append("tempparamid"+":"+getTempparamid())
            .append("tempparamname"+":"+getTempparamname())
            .append("tempparamsql"+":"+getTempparamsql())
            .append("tempparamdesc"+":"+getTempparamdesc())
            .append("createdate"+":"+getCreatedate())
            .append("creator"+":"+getCreator())
            .append("isdelete"+":"+getIsdelete())
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