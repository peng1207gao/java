package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DocxFrameconfig的POJO类
 *
 * @author  sss  [Mon Nov 18 09:16:42 CST 2013]
 * 
 */
public class DocxFrameconfig implements Serializable{

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
     * 属性funcname
     */
    private String funcname;
	
    /** 
     * 属性btnid
     */
    private String btnid;
	
    /** 
     * 属性docmodeid
     */
    private String docmodeid;
	
    /** 
     * 属性indexnum
     */
    private BigDecimal indexnum;
	
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
     * DocxFrameconfig构造函数
     */
    public DocxFrameconfig() {
        super();
    }  
	
    /**
     * DocxFrameconfig完整的构造函数
     */  
    public DocxFrameconfig(String guid,String marketId,String moduleid,String funcname,String docmodeid,BigDecimal indexnum){
        this.guid = guid;
        this.marketId = marketId;
        this.moduleid = moduleid;
        this.funcname = funcname;
        this.docmodeid = docmodeid;
        this.indexnum = indexnum;
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
     * 属性 funcname 的get方法
     * @return String
     */
    public String getFuncname(){
        return funcname;
    }
	
    /**
     * 属性 funcname 的set方法
     * @return
     */
    public void setFuncname(String funcname){
        this.funcname = funcname;
    } 
	
	
	
    /**
     * 属性 btnid 的get方法
     * @return String
     */
    public String getBtnid(){
        return btnid;
    }
	
    /**
     * 属性 btnid 的set方法
     * @return
     */
    public void setBtnid(String btnid){
        this.btnid = btnid;
    } 
	
	
	
    /**
     * 属性 docmodeid 的get方法
     * @return String
     */
    public String getDocmodeid(){
        return docmodeid;
    }
	
    /**
     * 属性 docmodeid 的set方法
     * @return
     */
    public void setDocmodeid(String docmodeid){
        this.docmodeid = docmodeid;
    } 
	
	
	
    /**
     * 属性 indexnum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIndexnum(){
        return indexnum;
    }
	
    /**
     * 属性 indexnum 的set方法
     * @return
     */
    public void setIndexnum(BigDecimal indexnum){
        this.indexnum = indexnum;
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
		
        if (o == null || !(o instanceof DocxFrameconfig))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DocxFrameconfig other = (DocxFrameconfig) o;	        
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
            .append("funcname"+":"+getFuncname())
            .append("btnid"+":"+getBtnid())
            .append("docmodeid"+":"+getDocmodeid())
            .append("indexnum"+":"+getIndexnum())
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